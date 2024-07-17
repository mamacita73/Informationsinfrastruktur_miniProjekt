/**
 */
package projektStudenten.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projektStudenten.Course;
import projektStudenten.CourseSet;
import projektStudenten.ProjektStudentenFactory;
import projektStudenten.ProjektStudentenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projektStudenten.impl.CourseImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link projektStudenten.impl.CourseImpl#getAllPrereqs <em>All Prereqs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllPrereqs() <em>All Prereqs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllPrereqs()
	 * @generated
	 * @ordered
	 */
	protected CourseSet allPrereqs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektStudentenPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.COURSE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSet getAllPrereqs() {
		if (allPrereqs == null) {
			allPrereqs = new CourseSetImpl();
		}
		return allPrereqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllPrereqs(CourseSet newAllPrereqs, NotificationChain msgs) {
		CourseSet oldAllPrereqs = allPrereqs;
		allPrereqs = newAllPrereqs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.COURSE__ALL_PREREQS, oldAllPrereqs, newAllPrereqs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllPrereqs(CourseSet newAllPrereqs) {
		if (newAllPrereqs != allPrereqs) {
			NotificationChain msgs = null;
			if (allPrereqs != null)
				msgs = ((InternalEObject)allPrereqs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.COURSE__ALL_PREREQS, null, msgs);
			if (newAllPrereqs != null)
				msgs = ((InternalEObject)newAllPrereqs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjektStudentenPackage.COURSE__ALL_PREREQS, null, msgs);
			msgs = basicSetAllPrereqs(newAllPrereqs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektStudentenPackage.COURSE__ALL_PREREQS, newAllPrereqs, newAllPrereqs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElective() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @author nadja
	 */
	@Override
	public CourseSet allPrereqs() {
		if(allPrereqs == null) {
			allPrereqs = ProjektStudentenFactory.eINSTANCE.createCourseSet();
		}
		return allPrereqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjektStudentenPackage.COURSE__ALL_PREREQS:
				return basicSetAllPrereqs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjektStudentenPackage.COURSE__TITLE:
				return getTitle();
			case ProjektStudentenPackage.COURSE__ALL_PREREQS:
				return getAllPrereqs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjektStudentenPackage.COURSE__TITLE:
				setTitle((String)newValue);
				return;
			case ProjektStudentenPackage.COURSE__ALL_PREREQS:
				setAllPrereqs((CourseSet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjektStudentenPackage.COURSE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ProjektStudentenPackage.COURSE__ALL_PREREQS:
				setAllPrereqs((CourseSet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjektStudentenPackage.COURSE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ProjektStudentenPackage.COURSE__ALL_PREREQS:
				return allPrereqs != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProjektStudentenPackage.COURSE___IS_ELECTIVE:
				return isElective();
			case ProjektStudentenPackage.COURSE___ALL_PREREQS:
				return allPrereqs();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return getTitle();
		/*
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
		*/
	}

} //CourseImpl
