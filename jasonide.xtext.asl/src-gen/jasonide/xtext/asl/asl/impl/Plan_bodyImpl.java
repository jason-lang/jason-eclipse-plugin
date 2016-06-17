/**
 */
package jasonide.xtext.asl.asl.impl;

import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.Plan_body;
import jasonide.xtext.asl.asl.Plan_body_term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_bodyImpl#getPlan_body_term <em>Plan body term</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_bodyImpl#getPlan_body <em>Plan body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Plan_bodyImpl extends MinimalEObjectImpl.Container implements Plan_body
{
  /**
   * The cached value of the '{@link #getPlan_body_term() <em>Plan body term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlan_body_term()
   * @generated
   * @ordered
   */
  protected Plan_body_term plan_body_term;

  /**
   * The cached value of the '{@link #getPlan_body() <em>Plan body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlan_body()
   * @generated
   * @ordered
   */
  protected Plan_body plan_body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Plan_bodyImpl()
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
    return AslPackage.Literals.PLAN_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan_body_term getPlan_body_term()
  {
    return plan_body_term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlan_body_term(Plan_body_term newPlan_body_term, NotificationChain msgs)
  {
    Plan_body_term oldPlan_body_term = plan_body_term;
    plan_body_term = newPlan_body_term;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY__PLAN_BODY_TERM, oldPlan_body_term, newPlan_body_term);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlan_body_term(Plan_body_term newPlan_body_term)
  {
    if (newPlan_body_term != plan_body_term)
    {
      NotificationChain msgs = null;
      if (plan_body_term != null)
        msgs = ((InternalEObject)plan_body_term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY__PLAN_BODY_TERM, null, msgs);
      if (newPlan_body_term != null)
        msgs = ((InternalEObject)newPlan_body_term).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY__PLAN_BODY_TERM, null, msgs);
      msgs = basicSetPlan_body_term(newPlan_body_term, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY__PLAN_BODY_TERM, newPlan_body_term, newPlan_body_term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan_body getPlan_body()
  {
    return plan_body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlan_body(Plan_body newPlan_body, NotificationChain msgs)
  {
    Plan_body oldPlan_body = plan_body;
    plan_body = newPlan_body;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY__PLAN_BODY, oldPlan_body, newPlan_body);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlan_body(Plan_body newPlan_body)
  {
    if (newPlan_body != plan_body)
    {
      NotificationChain msgs = null;
      if (plan_body != null)
        msgs = ((InternalEObject)plan_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY__PLAN_BODY, null, msgs);
      if (newPlan_body != null)
        msgs = ((InternalEObject)newPlan_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_BODY__PLAN_BODY, null, msgs);
      msgs = basicSetPlan_body(newPlan_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_BODY__PLAN_BODY, newPlan_body, newPlan_body));
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
      case AslPackage.PLAN_BODY__PLAN_BODY_TERM:
        return basicSetPlan_body_term(null, msgs);
      case AslPackage.PLAN_BODY__PLAN_BODY:
        return basicSetPlan_body(null, msgs);
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
      case AslPackage.PLAN_BODY__PLAN_BODY_TERM:
        return getPlan_body_term();
      case AslPackage.PLAN_BODY__PLAN_BODY:
        return getPlan_body();
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
      case AslPackage.PLAN_BODY__PLAN_BODY_TERM:
        setPlan_body_term((Plan_body_term)newValue);
        return;
      case AslPackage.PLAN_BODY__PLAN_BODY:
        setPlan_body((Plan_body)newValue);
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
      case AslPackage.PLAN_BODY__PLAN_BODY_TERM:
        setPlan_body_term((Plan_body_term)null);
        return;
      case AslPackage.PLAN_BODY__PLAN_BODY:
        setPlan_body((Plan_body)null);
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
      case AslPackage.PLAN_BODY__PLAN_BODY_TERM:
        return plan_body_term != null;
      case AslPackage.PLAN_BODY__PLAN_BODY:
        return plan_body != null;
    }
    return super.eIsSet(featureID);
  }

} //Plan_bodyImpl
