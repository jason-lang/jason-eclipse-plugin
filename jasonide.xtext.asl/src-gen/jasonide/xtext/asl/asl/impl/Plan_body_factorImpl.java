/**
 */
package jasonide.xtext.asl.asl.impl;

import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.Body_formula;
import jasonide.xtext.asl.asl.Plan_body_factor;
import jasonide.xtext.asl.asl.StmtFOR;
import jasonide.xtext.asl.asl.StmtIF;
import jasonide.xtext.asl.asl.StmtWHILE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan body factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_body_factorImpl#getStmtIF <em>Stmt IF</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_body_factorImpl#getStmtFOR <em>Stmt FOR</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_body_factorImpl#getStmtWHILE <em>Stmt WHILE</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_body_factorImpl#getBody_formula <em>Body formula</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_body_factorImpl#getPlan_body_factor <em>Plan body factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Plan_body_factorImpl extends MinimalEObjectImpl.Container implements Plan_body_factor
{
  /**
   * The cached value of the '{@link #getStmtIF() <em>Stmt IF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtIF()
   * @generated
   * @ordered
   */
  protected StmtIF stmtIF;

  /**
   * The cached value of the '{@link #getStmtFOR() <em>Stmt FOR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtFOR()
   * @generated
   * @ordered
   */
  protected StmtFOR stmtFOR;

  /**
   * The cached value of the '{@link #getStmtWHILE() <em>Stmt WHILE</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtWHILE()
   * @generated
   * @ordered
   */
  protected StmtWHILE stmtWHILE;

  /**
   * The cached value of the '{@link #getBody_formula() <em>Body formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody_formula()
   * @generated
   * @ordered
   */
  protected Body_formula body_formula;

  /**
   * The cached value of the '{@link #getPlan_body_factor() <em>Plan body factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlan_body_factor()
   * @generated
   * @ordered
   */
  protected Plan_body_factor plan_body_factor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Plan_body_factorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AslPackage.Literals.PLAN_BODY_FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StmtIF getStmtIF()
  {
    return stmtIF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtIF(StmtIF newStmtIF, NotificationChain msgs)
  {
    StmtIF oldStmtIF = stmtIF;
    stmtIF = newStmtIF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_IF, oldStmtIF, newStmtIF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmtIF(StmtIF newStmtIF)
  {
    if (newStmtIF != stmtIF)
    {
      NotificationChain msgs = null;
      if (stmtIF != null)
        msgs = ((InternalEObject)stmtIF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_IF, null, msgs);
      if (newStmtIF != null)
        msgs = ((InternalEObject)newStmtIF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_IF, null, msgs);
      msgs = basicSetStmtIF(newStmtIF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_IF, newStmtIF, newStmtIF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StmtFOR getStmtFOR()
  {
    return stmtFOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtFOR(StmtFOR newStmtFOR, NotificationChain msgs)
  {
    StmtFOR oldStmtFOR = stmtFOR;
    stmtFOR = newStmtFOR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_FOR, oldStmtFOR, newStmtFOR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmtFOR(StmtFOR newStmtFOR)
  {
    if (newStmtFOR != stmtFOR)
    {
      NotificationChain msgs = null;
      if (stmtFOR != null)
        msgs = ((InternalEObject)stmtFOR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_FOR, null, msgs);
      if (newStmtFOR != null)
        msgs = ((InternalEObject)newStmtFOR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_FOR, null, msgs);
      msgs = basicSetStmtFOR(newStmtFOR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_FOR, newStmtFOR, newStmtFOR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StmtWHILE getStmtWHILE()
  {
    return stmtWHILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtWHILE(StmtWHILE newStmtWHILE, NotificationChain msgs)
  {
    StmtWHILE oldStmtWHILE = stmtWHILE;
    stmtWHILE = newStmtWHILE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_WHILE, oldStmtWHILE, newStmtWHILE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmtWHILE(StmtWHILE newStmtWHILE)
  {
    if (newStmtWHILE != stmtWHILE)
    {
      NotificationChain msgs = null;
      if (stmtWHILE != null)
        msgs = ((InternalEObject)stmtWHILE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_WHILE, null, msgs);
      if (newStmtWHILE != null)
        msgs = ((InternalEObject)newStmtWHILE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__STMT_WHILE, null, msgs);
      msgs = basicSetStmtWHILE(newStmtWHILE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__STMT_WHILE, newStmtWHILE, newStmtWHILE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body_formula getBody_formula()
  {
    return body_formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody_formula(Body_formula newBody_formula, NotificationChain msgs)
  {
    Body_formula oldBody_formula = body_formula;
    body_formula = newBody_formula;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA, oldBody_formula, newBody_formula);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody_formula(Body_formula newBody_formula)
  {
    if (newBody_formula != body_formula)
    {
      NotificationChain msgs = null;
      if (body_formula != null)
        msgs = ((InternalEObject)body_formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA, null, msgs);
      if (newBody_formula != null)
        msgs = ((InternalEObject)newBody_formula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA, null, msgs);
      msgs = basicSetBody_formula(newBody_formula, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA, newBody_formula, newBody_formula));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan_body_factor getPlan_body_factor()
  {
    return plan_body_factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlan_body_factor(Plan_body_factor newPlan_body_factor, NotificationChain msgs)
  {
    Plan_body_factor oldPlan_body_factor = plan_body_factor;
    plan_body_factor = newPlan_body_factor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR, oldPlan_body_factor, newPlan_body_factor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlan_body_factor(Plan_body_factor newPlan_body_factor)
  {
    if (newPlan_body_factor != plan_body_factor)
    {
      NotificationChain msgs = null;
      if (plan_body_factor != null)
        msgs = ((InternalEObject)plan_body_factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR, null, msgs);
      if (newPlan_body_factor != null)
        msgs = ((InternalEObject)newPlan_body_factor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR, null, msgs);
      msgs = basicSetPlan_body_factor(newPlan_body_factor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR, newPlan_body_factor, newPlan_body_factor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AslPackage.PLAN_BODY_FACTOR__STMT_IF:
        return basicSetStmtIF(null, msgs);
      case AslPackage.PLAN_BODY_FACTOR__STMT_FOR:
        return basicSetStmtFOR(null, msgs);
      case AslPackage.PLAN_BODY_FACTOR__STMT_WHILE:
        return basicSetStmtWHILE(null, msgs);
      case AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA:
        return basicSetBody_formula(null, msgs);
      case AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR:
        return basicSetPlan_body_factor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AslPackage.PLAN_BODY_FACTOR__STMT_IF:
        return getStmtIF();
      case AslPackage.PLAN_BODY_FACTOR__STMT_FOR:
        return getStmtFOR();
      case AslPackage.PLAN_BODY_FACTOR__STMT_WHILE:
        return getStmtWHILE();
      case AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA:
        return getBody_formula();
      case AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR:
        return getPlan_body_factor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AslPackage.PLAN_BODY_FACTOR__STMT_IF:
        setStmtIF((StmtIF)newValue);
        return;
      case AslPackage.PLAN_BODY_FACTOR__STMT_FOR:
        setStmtFOR((StmtFOR)newValue);
        return;
      case AslPackage.PLAN_BODY_FACTOR__STMT_WHILE:
        setStmtWHILE((StmtWHILE)newValue);
        return;
      case AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA:
        setBody_formula((Body_formula)newValue);
        return;
      case AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR:
        setPlan_body_factor((Plan_body_factor)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AslPackage.PLAN_BODY_FACTOR__STMT_IF:
        setStmtIF((StmtIF)null);
        return;
      case AslPackage.PLAN_BODY_FACTOR__STMT_FOR:
        setStmtFOR((StmtFOR)null);
        return;
      case AslPackage.PLAN_BODY_FACTOR__STMT_WHILE:
        setStmtWHILE((StmtWHILE)null);
        return;
      case AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA:
        setBody_formula((Body_formula)null);
        return;
      case AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR:
        setPlan_body_factor((Plan_body_factor)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AslPackage.PLAN_BODY_FACTOR__STMT_IF:
        return stmtIF != null;
      case AslPackage.PLAN_BODY_FACTOR__STMT_FOR:
        return stmtFOR != null;
      case AslPackage.PLAN_BODY_FACTOR__STMT_WHILE:
        return stmtWHILE != null;
      case AslPackage.PLAN_BODY_FACTOR__BODY_FORMULA:
        return body_formula != null;
      case AslPackage.PLAN_BODY_FACTOR__PLAN_BODY_FACTOR:
        return plan_body_factor != null;
    }
    return super.eIsSet(featureID);
  }

} //Plan_body_factorImpl
