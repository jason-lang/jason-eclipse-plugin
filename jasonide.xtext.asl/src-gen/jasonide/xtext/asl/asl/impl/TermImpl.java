/**
 */
package jasonide.xtext.asl.asl.impl;

import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.List;
import jasonide.xtext.asl.asl.Log_expr;
import jasonide.xtext.asl.asl.Plan_term;
import jasonide.xtext.asl.asl.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.impl.TermImpl#getList <em>List</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.TermImpl#getPlan_term <em>Plan term</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.TermImpl#getLog_expr <em>Log expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
{
  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected List list;

  /**
   * The cached value of the '{@link #getPlan_term() <em>Plan term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlan_term()
   * @generated
   * @ordered
   */
  protected Plan_term plan_term;

  /**
   * The cached value of the '{@link #getLog_expr() <em>Log expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLog_expr()
   * @generated
   * @ordered
   */
  protected Log_expr log_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return AslPackage.Literals.TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(List newList, NotificationChain msgs)
  {
    List oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.TERM__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(List newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.TERM__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan_term getPlan_term()
  {
    return plan_term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlan_term(Plan_term newPlan_term, NotificationChain msgs)
  {
    Plan_term oldPlan_term = plan_term;
    plan_term = newPlan_term;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.TERM__PLAN_TERM, oldPlan_term, newPlan_term);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlan_term(Plan_term newPlan_term)
  {
    if (newPlan_term != plan_term)
    {
      NotificationChain msgs = null;
      if (plan_term != null)
        msgs = ((InternalEObject)plan_term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__PLAN_TERM, null, msgs);
      if (newPlan_term != null)
        msgs = ((InternalEObject)newPlan_term).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__PLAN_TERM, null, msgs);
      msgs = basicSetPlan_term(newPlan_term, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.TERM__PLAN_TERM, newPlan_term, newPlan_term));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Log_expr getLog_expr()
  {
    return log_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLog_expr(Log_expr newLog_expr, NotificationChain msgs)
  {
    Log_expr oldLog_expr = log_expr;
    log_expr = newLog_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.TERM__LOG_EXPR, oldLog_expr, newLog_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLog_expr(Log_expr newLog_expr)
  {
    if (newLog_expr != log_expr)
    {
      NotificationChain msgs = null;
      if (log_expr != null)
        msgs = ((InternalEObject)log_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__LOG_EXPR, null, msgs);
      if (newLog_expr != null)
        msgs = ((InternalEObject)newLog_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.TERM__LOG_EXPR, null, msgs);
      msgs = basicSetLog_expr(newLog_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.TERM__LOG_EXPR, newLog_expr, newLog_expr));
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
      case AslPackage.TERM__LIST:
        return basicSetList(null, msgs);
      case AslPackage.TERM__PLAN_TERM:
        return basicSetPlan_term(null, msgs);
      case AslPackage.TERM__LOG_EXPR:
        return basicSetLog_expr(null, msgs);
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
      case AslPackage.TERM__LIST:
        return getList();
      case AslPackage.TERM__PLAN_TERM:
        return getPlan_term();
      case AslPackage.TERM__LOG_EXPR:
        return getLog_expr();
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
      case AslPackage.TERM__LIST:
        setList((List)newValue);
        return;
      case AslPackage.TERM__PLAN_TERM:
        setPlan_term((Plan_term)newValue);
        return;
      case AslPackage.TERM__LOG_EXPR:
        setLog_expr((Log_expr)newValue);
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
      case AslPackage.TERM__LIST:
        setList((List)null);
        return;
      case AslPackage.TERM__PLAN_TERM:
        setPlan_term((Plan_term)null);
        return;
      case AslPackage.TERM__LOG_EXPR:
        setLog_expr((Log_expr)null);
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
      case AslPackage.TERM__LIST:
        return list != null;
      case AslPackage.TERM__PLAN_TERM:
        return plan_term != null;
      case AslPackage.TERM__LOG_EXPR:
        return log_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //TermImpl
