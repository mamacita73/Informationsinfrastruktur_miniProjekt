package gui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projektStudenten.Course;
import projektStudenten.Grade;
import projektStudenten.Program;
import projektStudenten.ProjektStudentenFactory;
import projektStudenten.ProjektStudentenPackage;
import projektStudenten.Result;
import projektStudenten.ServiceFacade;
import projektStudenten.Student;

public class Service {
    private ProjektStudentenFactory factory;
    private ServiceFacade serviceFacade;
    private Resource resource;

    // Konstruktor der Service-Klasse
    public Service() {
        factory = ProjektStudentenFactory.eINSTANCE;
        serviceFacade = factory.createServiceFacade();
        initializeResource();
    }

    // Initialisierung der Ressource
    private void initializeResource() {
        // Modell initialisieren
        ProjektStudentenPackage.eINSTANCE.eClass();
        
        // Paket registrieren
        EPackage.Registry.INSTANCE.put(ProjektStudentenPackage.eNS_URI, ProjektStudentenPackage.eINSTANCE);
        
        // XMI-Ressourcenfabrik für die .xmi-Erweiterung registrieren
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        // Neue Ressourcensammlung erhalten
        ResourceSet resSet = new ResourceSetImpl();
        
        // Ressource erstellen
        resource = resSet.createResource(URI.createURI("students/students.xmi"));
        
        // Ressource laden, falls vorhanden
        try {
            resource.load(Collections.EMPTY_MAP);
            serviceFacade = (ServiceFacade) resource.getContents().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // Falls die Datei nicht existiert oder leer ist, eine neue ServiceFacade erstellen
            serviceFacade = factory.createServiceFacade();
            resource.getContents().add(serviceFacade);
        }
    }
    
    // Methode zum Speichern des Modells
    public void saveModel() {
        // Modell speichern
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Methode zum Laden aller Programme
    public EList<Program> getAllPrograms() {
        return serviceFacade.getPrograms();
    }

    // Methode zum Laden aller Kurse
    public EList<Course> getAllCourses() {
        return serviceFacade.getAllCourses();
    }

    // Methode zum Laden aller Studenten
    public EList<Student> getAllStudents() {
        return serviceFacade.getStudents();
    }

    // Methode zum Erstellen eines neuen Programms
    public void createProgram(String programName) {
        Program program = factory.createProgram();
        program.setLabel(programName);
        serviceFacade.getPrograms().add(program);
        saveModel();
    }

    // Methode zum Erstellen eines neuen Studenten
    public void createStudent(String studentName) {
        Student student = factory.createStudent();
        student.setName(studentName);
        serviceFacade.getStudents().add(student);
        saveModel();
    }

    // Methode zum Erstellen eines neuen EInführungskurses und 
    // Zuweisung zu einem Studiengang
    public void createIntroductoryCourse(String courseName, String programName) {
        Course course = factory.createIntroductory();
        course.setTitle(courseName);
        Program program = getProgramByName(programName);
        if (program != null) {
            if (program.getCourses() == null) {
                program.setCourses(factory.createCourseSet());
            }
            program.getCourses().getElements().add(course);
        }
        serviceFacade.getAllCourses().add(course);
        saveModel();
    }

    // Methode zum Erstellen eines neuen Fortgeschrittenenkurses und 
    // Zuweisung zu einem Studiengang
    public void createAdvancedCourse(String courseName, String programName, String prerequisiteName) {
        Course course = factory.createAdvanced();
        course.setTitle(courseName);
        Program program = getProgramByName(programName);
        Course prerequisite = getCourseByName(prerequisiteName);
        if (program != null) {
            if (program.getCourses() == null) {
                program.setCourses(factory.createCourseSet());
            }
            program.getCourses().getElements().add(course);

        }
        if (prerequisite != null) {
            if (course.getAllPrereqs() == null) {
                course.setAllPrereqs(factory.createCourseSet());
            }
            course.getAllPrereqs().getElements().add(prerequisite);
        }
        serviceFacade.getAllCourses().add(course);
        saveModel();
    }
    
    // Methode zum Speichern einer Note für einen Studenten in einem Kurs
    public void assignProgramToStudent(String studentName, String programName) {
        Student student = getStudentByName(studentName);
        Program program = getProgramByName(programName);
        if (student != null && program != null) {
            student.setProgram(program);
            saveModel();
        }
    }

    public void saveGrade(String studentName, String courseName, String gradeValue) {
        Student student = getStudentByName(studentName);
        Course course = getCourseByName(courseName);
        Grade grade = Grade.get(gradeValue);
        if (student != null && course != null && grade != null) {
            Result result = factory.createResult();
            result.setValue(grade);
            result.setKey(course);
            student.getTranscript().add(result);
            serviceFacade.getResults().add(result);
        }
        saveModel();
    }

    // Hilfsmethode zum Abrufen eines Studiengangs anhand des Names
    private Program getProgramByName(String name) {
        return serviceFacade.getPrograms().stream().filter(p -> p.getLabel().equals(name)).findFirst().orElse(null);
    }
    // Hilfsmethode zum Abrufen eines Kurses anhand des Titels
    private Course getCourseByName(String name) {
        return serviceFacade.getAllCourses().stream().filter(c -> c.getTitle().equals(name)).findFirst().orElse(null);
    }
    // Hilfsmethode zum Abrufen eines Studenten anhand des Names
    private Student getStudentByName(String name) {
        return serviceFacade.getStudents().stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    }
}
