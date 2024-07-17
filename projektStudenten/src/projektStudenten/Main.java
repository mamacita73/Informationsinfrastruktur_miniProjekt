package projektStudenten;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projektStudenten.*;

public class Main {
	public static void main(String[] args) {
        // Modell initialisieren
        ProjektStudentenPackage.eINSTANCE.eClass();
        ProjektStudentenFactory factory = ProjektStudentenFactory.eINSTANCE;
        
        //ServiceFacade erstellen
        ServiceFacade serviceFacade = factory.createServiceFacade();

        //Programm erstellen
        Program program = factory.createProgram();
        program.setLabel("Informatik");
     
        //Kurse erstellen
        Course math1 = factory.createIntroductory();
        math1.setTitle("Mathematik 1");
        serviceFacade.getAllCourses().add(math1);
        
        Course math2 = factory.createIntroductory();
        math2.setTitle("Mathematik 2");
        serviceFacade.getAllCourses().add(math2);

        Course math3 = factory.createAdvanced();
        math3.setTitle("Mathematik 3");
        serviceFacade.getAllCourses().add(math3);
        
        Course gpm = factory.createAdvanced();
        gpm.setTitle("Geschäftsprozessmodellierung");
        serviceFacade.getAllCourses().add(gpm);
        
        //Voraussetzungen setzen
        math2.allPrereqs().getElements().add(math1);
        math3.allPrereqs().getElements().add(math2);
        gpm.allPrereqs().getElements().add(math3);
        
        //CourseSet für bestandene Kurse erstellen und hinzufügen
        CourseSet completedCourses = factory.createCourseSet();
        completedCourses.getElements().add(math1);
        completedCourses.getElements().add(math2);
        completedCourses.getElements().add(math3);
        completedCourses.getElements().add(gpm);
               
        // Studenten erstellen
        Student student1 = factory.createStudent();
        student1.setName("Ray Graf");
        student1.setSemester(Semester.ONE);
        student1.setProgram(program);
        student1.getCompletedCourses().add(completedCourses);
        
        Student student2 = factory.createStudent();
        student2.setName("Mike Tyson");
        student2.setSemester(Semester.ONE);
        student2.setProgram(program);
        student2.getCompletedCourses().add(completedCourses);
        
        // ServiceFacade konfigurieren
        serviceFacade.getStudents().add(student1);
        serviceFacade.getStudents().add(student2);
        serviceFacade.getPrograms().add(program);


        //XMI-Resource Factory registrieren
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        //Resource Set und Resource erstellen
        ResourceSet resSet = new ResourceSetImpl();
        URI uri = URI.createURI("students/students.xmi");
        Resource resource = resSet.createResource(uri);
        
        //Überprüfen, ob die Resource erfolgreich erstellt wurde
        if (resource == null) {
            System.err.println("Die Resource konnte nicht erstellt werden.");
            return;
        } else {
        	System.out.println("Resource wurde erstellt!");
        }
        resource.getContents().add(serviceFacade);

        //Resource speichern
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
     // Modell laden
        //loadModel("students/students.xmi");
         
        //Anzahl der eingeschriebenen Studenten prüfen Ü6c)
        System.out.println("Anzahl der eingeschriebenen Studenten: " + program.getEnrolled().size());
    }
	
	public static void loadModel(String filePath) {
        //Modell initialisieren
        ProjektStudentenPackage.eINSTANCE.eClass();
        
        //XMI-Resource Factory registrieren
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        //Resource Set erstellen
        ResourceSet resSet = new ResourceSetImpl();

        //Resource laden
        URI uri = URI.createFileURI(filePath);
        Resource resource = resSet.getResource(uri, true);

        //Überprüfen, ob die Resource erfolgreich geladen wurde
        try {
            resource.load(Collections.EMPTY_MAP);
            ServiceFacade serviceFacade = (ServiceFacade) resource.getContents().get(0);
            
            //Geladene Daten ausgeben
            System.out.println("Geladene Studenten:");
            for (Student student : serviceFacade.getStudents()) {
                System.out.println("Name: " + student.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}