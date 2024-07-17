package gui;

import javax.swing.*;

import gui.Service;
import projektStudenten.Course;
import projektStudenten.Grade;
import projektStudenten.Program;
import projektStudenten.Student;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
	private JFrame frame;
	private JTextField programNameField;
	private JTextField courseNameField;
	private JTextField studentNameField;
	private JComboBox<String> programComboBox;
	private JComboBox<String> studentComboBox;
	private JComboBox<String> courseComboBox;
	private JComboBox<String> prerequisiteComboBox;
	private JComboBox<String> assignProgramComboBox;
	private JComboBox<String> assignCourseComboBox;
	private JComboBox<String> gradeComboBox;
	private JComboBox<String> gradeStudentComboBox;

	private Service service;

	// Konstruktor der UI-Klasse
	public UI() {
		service = new Service();
		initialize();
		loadPrograms();
		loadStudents();
		loadCourses();
	}

	// Initialisierung der Benutzeroberfläche
	private void initialize() {
		frame = new JFrame("Kursverwaltung");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JPanel mainPanel = new JPanel(new GridLayout(0, 3, 10, 10));
		frame.add(mainPanel, BorderLayout.NORTH);

		// Abschnitt "Neuen Studiengang anlegen"
		mainPanel.add(new JLabel("Neuen Studiengang anlegen")).setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel("Studiengang:"));
		programNameField = new JTextField();
		mainPanel.add(programNameField);

		JButton createProgramButton = new JButton("STUDIENGANG ERSTELLEN");
		mainPanel.add(createProgramButton);
		createProgramButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createProgram();
			}
		});

		// Abschnitt "Neuen Studenten anlegen"
		mainPanel.add(new JLabel("Neuen Studenten anlegen")).setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel("Studentenname:"));
		studentNameField = new JTextField();
		mainPanel.add(studentNameField);

		JButton createStudentButton = new JButton("STUDENT ERSTELLEN");
		mainPanel.add(createStudentButton);
		createStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createStudent();
			}
		});

		// Abschnitt "Neuen Kurs anlegen"
		mainPanel.add(new JLabel("Neuen Kurs anlegen")).setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel("Kursname:"));
		courseNameField = new JTextField();
		mainPanel.add(courseNameField);
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel("Voraussetzung (falls Fortgeschritten)"));
		prerequisiteComboBox = new JComboBox<>();
		prerequisiteComboBox.addItem("Vorkurs wählen");
		mainPanel.add(prerequisiteComboBox);
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(""));
		programComboBox = new JComboBox<>();
		programComboBox.addItem("Studiengang wählen");
		mainPanel.add(programComboBox);

		JButton createCourseButton = new JButton("KURS ERSTELLEN");
		mainPanel.add(createCourseButton);
		createCourseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createCourse();
			}
		});
		
		// Abschnitt "Studiengangzuordnung für Studenten"
		mainPanel.add(new JLabel("Studiengangszuordnung für Studenten")).setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(""));
		studentComboBox = new JComboBox<>();
		studentComboBox.addItem("Student wählen");
		mainPanel.add(studentComboBox);
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(""));
		assignProgramComboBox = new JComboBox<>();
		assignProgramComboBox.addItem("Studiengang wählen");
		mainPanel.add(assignProgramComboBox);

		JButton assignProgramButton = new JButton("STUDIENGANG ZUWEISEN");
		mainPanel.add(assignProgramButton);
		assignProgramButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assignProgramToStudent();
			}
		});

		// Abschnitt "Note eintragen"
		mainPanel.add(new JLabel("Note eintragen")).setFont(new Font("Arial", Font.BOLD, 16));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(" "));
		gradeStudentComboBox = new JComboBox<String>();
		gradeStudentComboBox.addItem("Studenten wählen");
		mainPanel.add(gradeStudentComboBox);
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(""));
		courseComboBox = new JComboBox<String>();
		courseComboBox.addItem("Kurs wählen");
		mainPanel.add(courseComboBox);
		mainPanel.add(new JLabel(""));

		mainPanel.add(new JLabel(""));
		gradeComboBox = new JComboBox<>();
		gradeComboBox.addItem("Note wählen");
		for (Grade grade : Grade.values()) {
			gradeComboBox.addItem(grade.getName());
		}
		mainPanel.add(gradeComboBox);
		JButton saveGradeButton = new JButton("NOTE SPEICHERN");
		mainPanel.add(saveGradeButton);
		saveGradeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveGrade();
			}
		});
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));
		mainPanel.add(new JLabel(""));

		frame.pack();
		frame.setVisible(true);
	}

	// Studiengänge laden und in die ComboBox einfügen
	private void loadPrograms() {
		for (Program program : service.getAllPrograms()) {
			programComboBox.addItem(program.getLabel());
			assignProgramComboBox.addItem(program.getLabel());
		}
	}

	// Studenten laden und in die ComboBox einfügen
	private void loadStudents() {
		for (Student student : service.getAllStudents()) {
			studentComboBox.addItem(student.getName());
			gradeStudentComboBox.addItem(student.getName());
		}
	}

	// Kurse laden und in die ComboBox einfügen
	private void loadCourses() {
		for (Course course : service.getAllCourses()) {
			courseComboBox.addItem(course.getTitle());
			prerequisiteComboBox.addItem(course.getTitle());
		}
	}

	// Studiengang erstellen
	private void createProgram() {
		String programName = programNameField.getText();
		service.createProgram(programName);
		programComboBox.addItem(programName);
		assignProgramComboBox.addItem(programName);

		programNameField.setText(""); // Textfeld leeren
		programComboBox.setSelectedIndex(0); // ComboBox Auswahl zurücksetzen
		assignProgramComboBox.setSelectedIndex(0);
	}

	// Kurs erstellen
	private void createCourse() {
		String courseName = courseNameField.getText();
		String programName = (String) programComboBox.getSelectedItem();
		String prerequisiteName = (String) prerequisiteComboBox.getSelectedItem();

		if (prerequisiteName == null || prerequisiteName.isEmpty() || prerequisiteName.equals("Vorkurs wählen")) {
			service.createIntroductoryCourse(courseName, programName);
		} else {
			service.createAdvancedCourse(courseName, programName, prerequisiteName);
		}
		prerequisiteComboBox.addItem(courseName);
		courseComboBox.addItem(courseName);

		courseNameField.setText("");
		programNameField.setText("");
		prerequisiteComboBox.setSelectedIndex(0);
		courseComboBox.setSelectedIndex(0);
		programComboBox.setSelectedIndex(0);
	}

	// Student erstellen
	private void createStudent() {
		String studentName = studentNameField.getText();
		service.createStudent(studentName);
		studentComboBox.addItem(studentName);
		gradeStudentComboBox.addItem(studentName);

		studentNameField.setText("");
		studentComboBox.setSelectedIndex(0);
	}

	// Studiengang einem Studenten zuweisen
	private void assignProgramToStudent() {
		String studentName = (String) studentComboBox.getSelectedItem();
		String programName = (String) assignProgramComboBox.getSelectedItem();
		service.assignProgramToStudent(studentName, programName);
		System.out.println(studentName + " studiert " + programName);
	}

	// Note für einen Studenten in einem Kurs speichern
	private void saveGrade() {
		String studentName = (String) gradeStudentComboBox.getSelectedItem();
		String courseName = (String) courseComboBox.getSelectedItem();
		String gradeValue = (String) gradeComboBox.getSelectedItem();
		service.saveGrade(studentName, courseName, gradeValue);
		System.out.println("note " + gradeValue + " in " + courseName + " von " + studentName);
	}

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					System.out.println("du solltest mich sehen");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
