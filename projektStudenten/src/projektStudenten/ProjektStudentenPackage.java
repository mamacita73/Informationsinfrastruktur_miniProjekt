/**
 */
package projektStudenten;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projektStudenten.ProjektStudentenFactory
 * @model kind="package"
 * @generated
 */
public interface ProjektStudentenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projektStudenten";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projektStudenten";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projektStudenten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjektStudentenPackage eINSTANCE = projektStudenten.impl.ProjektStudentenPackageImpl.init();

	/**
	 * The meta object id for the '{@link projektStudenten.impl.ServiceFacadeImpl <em>Service Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.ServiceFacadeImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getServiceFacade()
	 * @generated
	 */
	int SERVICE_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__STUDENTS = 1;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__PROGRAMS = 2;

	/**
	 * The feature id for the '<em><b>All Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__ALL_COURSES = 3;

	/**
	 * The number of structural features of the '<em>Service Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.ResultImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.StudentImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Completed Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COMPLETED_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Transcript</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TRANSCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Enrolled Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_COURSES = 5;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Can Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___CAN_COMPLETE__COURSE = 0;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.ProgramImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REQUIRED = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Enrolled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ENROLLED = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.CourseSetImpl <em>Course Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.CourseSetImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getCourseSet()
	 * @generated
	 */
	int COURSE_SET = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Course Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>All Prereqs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET___ALL_PREREQS = 0;

	/**
	 * The number of operations of the '<em>Course Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.CourseImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>All Prereqs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ALL_PREREQS = 1;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___IS_ELECTIVE = 0;

	/**
	 * The operation id for the '<em>All Prereqs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___ALL_PREREQS = 1;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.AdvancedImpl <em>Advanced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.AdvancedImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getAdvanced()
	 * @generated
	 */
	int ADVANCED = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED__TITLE = COURSE__TITLE;

	/**
	 * The feature id for the '<em><b>All Prereqs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED__ALL_PREREQS = COURSE__ALL_PREREQS;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED__COURSE = COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Advanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_FEATURE_COUNT = COURSE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED___IS_ELECTIVE = COURSE___IS_ELECTIVE;

	/**
	 * The operation id for the '<em>All Prereqs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED___ALL_PREREQS = COURSE___ALL_PREREQS;

	/**
	 * The number of operations of the '<em>Advanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projektStudenten.impl.IntroductoryImpl <em>Introductory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.impl.IntroductoryImpl
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getIntroductory()
	 * @generated
	 */
	int INTRODUCTORY = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY__TITLE = COURSE__TITLE;

	/**
	 * The feature id for the '<em><b>All Prereqs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY__ALL_PREREQS = COURSE__ALL_PREREQS;

	/**
	 * The number of structural features of the '<em>Introductory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY_FEATURE_COUNT = COURSE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY___IS_ELECTIVE = COURSE___IS_ELECTIVE;

	/**
	 * The operation id for the '<em>All Prereqs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY___ALL_PREREQS = COURSE___ALL_PREREQS;

	/**
	 * The number of operations of the '<em>Introductory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projektStudenten.Grade <em>Grade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.Grade
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 8;

	/**
	 * The meta object id for the '{@link projektStudenten.Semester <em>Semester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projektStudenten.Semester
	 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 9;


	/**
	 * Returns the meta object for class '{@link projektStudenten.ServiceFacade <em>Service Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Facade</em>'.
	 * @see projektStudenten.ServiceFacade
	 * @generated
	 */
	EClass getServiceFacade();

	/**
	 * Returns the meta object for the containment reference list '{@link projektStudenten.ServiceFacade#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see projektStudenten.ServiceFacade#getResults()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link projektStudenten.ServiceFacade#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see projektStudenten.ServiceFacade#getStudents()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link projektStudenten.ServiceFacade#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see projektStudenten.ServiceFacade#getPrograms()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link projektStudenten.ServiceFacade#getAllCourses <em>All Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Courses</em>'.
	 * @see projektStudenten.ServiceFacade#getAllCourses()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_AllCourses();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see projektStudenten.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link projektStudenten.Result#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see projektStudenten.Result#getKey()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Key();

	/**
	 * Returns the meta object for the attribute '{@link projektStudenten.Result#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projektStudenten.Result#getValue()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Value();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see projektStudenten.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the containment reference list '{@link projektStudenten.Student#getCompletedCourses <em>Completed Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Completed Courses</em>'.
	 * @see projektStudenten.Student#getCompletedCourses()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_CompletedCourses();

	/**
	 * Returns the meta object for the attribute '{@link projektStudenten.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projektStudenten.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the reference list '{@link projektStudenten.Student#getTranscript <em>Transcript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transcript</em>'.
	 * @see projektStudenten.Student#getTranscript()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Transcript();

	/**
	 * Returns the meta object for the reference '{@link projektStudenten.Student#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see projektStudenten.Student#getProgram()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Program();

	/**
	 * Returns the meta object for the attribute '{@link projektStudenten.Student#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see projektStudenten.Student#getSemester()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Semester();

	/**
	 * Returns the meta object for the reference list '{@link projektStudenten.Student#getEnrolledCourses <em>Enrolled Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled Courses</em>'.
	 * @see projektStudenten.Student#getEnrolledCourses()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_EnrolledCourses();

	/**
	 * Returns the meta object for the '{@link projektStudenten.Student#canComplete(projektStudenten.Course) <em>Can Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Complete</em>' operation.
	 * @see projektStudenten.Student#canComplete(projektStudenten.Course)
	 * @generated
	 */
	EOperation getStudent__CanComplete__Course();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see projektStudenten.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference '{@link projektStudenten.Program#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see projektStudenten.Program#getRequired()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Required();

	/**
	 * Returns the meta object for the containment reference '{@link projektStudenten.Program#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Courses</em>'.
	 * @see projektStudenten.Program#getCourses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Courses();

	/**
	 * Returns the meta object for the reference list '{@link projektStudenten.Program#getEnrolled <em>Enrolled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled</em>'.
	 * @see projektStudenten.Program#getEnrolled()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Enrolled();

	/**
	 * Returns the meta object for the attribute '{@link projektStudenten.Program#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see projektStudenten.Program#getLabel()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Label();

	/**
	 * Returns the meta object for class '{@link projektStudenten.CourseSet <em>Course Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Set</em>'.
	 * @see projektStudenten.CourseSet
	 * @generated
	 */
	EClass getCourseSet();

	/**
	 * Returns the meta object for the reference list '{@link projektStudenten.CourseSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see projektStudenten.CourseSet#getElements()
	 * @see #getCourseSet()
	 * @generated
	 */
	EReference getCourseSet_Elements();

	/**
	 * Returns the meta object for the '{@link projektStudenten.CourseSet#allPrereqs() <em>All Prereqs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Prereqs</em>' operation.
	 * @see projektStudenten.CourseSet#allPrereqs()
	 * @generated
	 */
	EOperation getCourseSet__AllPrereqs();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see projektStudenten.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link projektStudenten.Course#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see projektStudenten.Course#getTitle()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Title();

	/**
	 * Returns the meta object for the containment reference '{@link projektStudenten.Course#getAllPrereqs <em>All Prereqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Prereqs</em>'.
	 * @see projektStudenten.Course#getAllPrereqs()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_AllPrereqs();

	/**
	 * Returns the meta object for the '{@link projektStudenten.Course#isElective() <em>Is Elective</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Elective</em>' operation.
	 * @see projektStudenten.Course#isElective()
	 * @generated
	 */
	EOperation getCourse__IsElective();

	/**
	 * Returns the meta object for the '{@link projektStudenten.Course#allPrereqs() <em>All Prereqs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Prereqs</em>' operation.
	 * @see projektStudenten.Course#allPrereqs()
	 * @generated
	 */
	EOperation getCourse__AllPrereqs();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Advanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advanced</em>'.
	 * @see projektStudenten.Advanced
	 * @generated
	 */
	EClass getAdvanced();

	/**
	 * Returns the meta object for the reference list '{@link projektStudenten.Advanced#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see projektStudenten.Advanced#getCourse()
	 * @see #getAdvanced()
	 * @generated
	 */
	EReference getAdvanced_Course();

	/**
	 * Returns the meta object for class '{@link projektStudenten.Introductory <em>Introductory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introductory</em>'.
	 * @see projektStudenten.Introductory
	 * @generated
	 */
	EClass getIntroductory();

	/**
	 * Returns the meta object for enum '{@link projektStudenten.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grade</em>'.
	 * @see projektStudenten.Grade
	 * @generated
	 */
	EEnum getGrade();

	/**
	 * Returns the meta object for enum '{@link projektStudenten.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester</em>'.
	 * @see projektStudenten.Semester
	 * @generated
	 */
	EEnum getSemester();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjektStudentenFactory getProjektStudentenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projektStudenten.impl.ServiceFacadeImpl <em>Service Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.ServiceFacadeImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getServiceFacade()
		 * @generated
		 */
		EClass SERVICE_FACADE = eINSTANCE.getServiceFacade();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__RESULTS = eINSTANCE.getServiceFacade_Results();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__STUDENTS = eINSTANCE.getServiceFacade_Students();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__PROGRAMS = eINSTANCE.getServiceFacade_Programs();

		/**
		 * The meta object literal for the '<em><b>All Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__ALL_COURSES = eINSTANCE.getServiceFacade_AllCourses();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.ResultImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__KEY = eINSTANCE.getResult_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__VALUE = eINSTANCE.getResult_Value();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.StudentImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Completed Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COMPLETED_COURSES = eINSTANCE.getStudent_CompletedCourses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Transcript</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__TRANSCRIPT = eINSTANCE.getStudent_Transcript();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__PROGRAM = eINSTANCE.getStudent_Program();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__SEMESTER = eINSTANCE.getStudent_Semester();

		/**
		 * The meta object literal for the '<em><b>Enrolled Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ENROLLED_COURSES = eINSTANCE.getStudent_EnrolledCourses();

		/**
		 * The meta object literal for the '<em><b>Can Complete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___CAN_COMPLETE__COURSE = eINSTANCE.getStudent__CanComplete__Course();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.ProgramImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__REQUIRED = eINSTANCE.getProgram_Required();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__COURSES = eINSTANCE.getProgram_Courses();

		/**
		 * The meta object literal for the '<em><b>Enrolled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ENROLLED = eINSTANCE.getProgram_Enrolled();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__LABEL = eINSTANCE.getProgram_Label();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.CourseSetImpl <em>Course Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.CourseSetImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getCourseSet()
		 * @generated
		 */
		EClass COURSE_SET = eINSTANCE.getCourseSet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SET__ELEMENTS = eINSTANCE.getCourseSet_Elements();

		/**
		 * The meta object literal for the '<em><b>All Prereqs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_SET___ALL_PREREQS = eINSTANCE.getCourseSet__AllPrereqs();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.CourseImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TITLE = eINSTANCE.getCourse_Title();

		/**
		 * The meta object literal for the '<em><b>All Prereqs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ALL_PREREQS = eINSTANCE.getCourse_AllPrereqs();

		/**
		 * The meta object literal for the '<em><b>Is Elective</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___IS_ELECTIVE = eINSTANCE.getCourse__IsElective();

		/**
		 * The meta object literal for the '<em><b>All Prereqs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___ALL_PREREQS = eINSTANCE.getCourse__AllPrereqs();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.AdvancedImpl <em>Advanced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.AdvancedImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getAdvanced()
		 * @generated
		 */
		EClass ADVANCED = eINSTANCE.getAdvanced();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVANCED__COURSE = eINSTANCE.getAdvanced_Course();

		/**
		 * The meta object literal for the '{@link projektStudenten.impl.IntroductoryImpl <em>Introductory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.impl.IntroductoryImpl
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getIntroductory()
		 * @generated
		 */
		EClass INTRODUCTORY = eINSTANCE.getIntroductory();

		/**
		 * The meta object literal for the '{@link projektStudenten.Grade <em>Grade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.Grade
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getGrade()
		 * @generated
		 */
		EEnum GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '{@link projektStudenten.Semester <em>Semester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projektStudenten.Semester
		 * @see projektStudenten.impl.ProjektStudentenPackageImpl#getSemester()
		 * @generated
		 */
		EEnum SEMESTER = eINSTANCE.getSemester();

	}

} //ProjektStudentenPackage
