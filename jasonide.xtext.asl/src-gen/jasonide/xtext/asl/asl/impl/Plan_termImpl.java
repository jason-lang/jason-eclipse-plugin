/**
 */
package jasonide.xtext.asl.asl.impl;

import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.Literal;
import jasonide.xtext.asl.asl.Log_expr;
import jasonide.xtext.asl.asl.Plan_body;
import jasonide.xtext.asl.asl.Plan_term;
import jasonide.xtext.asl.asl.Pred;
import jasonide.xtext.asl.asl.Trigger;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getTk_label_at <em>Tk label at</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getLog_expr <em>Log expr</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getLog_expr2 <em>Log expr2</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.Plan_termImpl#getPlan_body <em>Plan body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Plan_termImpl extends MinimalEObjectImpl.Container implements Plan_term
{
  /**
   * The default value of the '{@link #getTk_label_at() <em>Tk label at</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_label_at()
   * @generated
   * @ordered
   */
  protected static final String TK_LABEL_AT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTk_label_at() <em>Tk label at</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_label_at()
   * @generated
   * @ordered
   */
  protected String tk_label_at = TK_LABEL_AT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected Pred pred;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected Trigger trigger;

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
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Literal literal;

  /**
   * The cached value of the '{@link #getLog_expr2() <em>Log expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLog_expr2()
   * @generated
   * @ordered
   */
  protected Log_expr log_expr2;

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
  protected Plan_termImpl()
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
    return AslPackage.Literals.PLAN_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTk_label_at()
  {
    return tk_label_at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTk_label_at(String newTk_label_at)
  {
    String oldTk_label_at = tk_label_at;
    tk_label_at = newTk_label_at;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__TK_LABEL_AT, oldTk_label_at, tk_label_at));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pred getPred()
  {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPred(Pred newPred, NotificationChain msgs)
  {
    Pred oldPred = pred;
    pred = newPred;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__PRED, oldPred, newPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(Pred newPred)
  {
    if (newPred != pred)
    {
      NotificationChain msgs = null;
      if (pred != null)
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__PRED, newPred, newPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs)
  {
    Trigger oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(Trigger newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__TRIGGER, newTrigger, newTrigger));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LOG_EXPR, oldLog_expr, newLog_expr);
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
        msgs = ((InternalEObject)log_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LOG_EXPR, null, msgs);
      if (newLog_expr != null)
        msgs = ((InternalEObject)newLog_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LOG_EXPR, null, msgs);
      msgs = basicSetLog_expr(newLog_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LOG_EXPR, newLog_expr, newLog_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs)
  {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Log_expr getLog_expr2()
  {
    return log_expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLog_expr2(Log_expr newLog_expr2, NotificationChain msgs)
  {
    Log_expr oldLog_expr2 = log_expr2;
    log_expr2 = newLog_expr2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LOG_EXPR2, oldLog_expr2, newLog_expr2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLog_expr2(Log_expr newLog_expr2)
  {
    if (newLog_expr2 != log_expr2)
    {
      NotificationChain msgs = null;
      if (log_expr2 != null)
        msgs = ((InternalEObject)log_expr2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LOG_EXPR2, null, msgs);
      if (newLog_expr2 != null)
        msgs = ((InternalEObject)newLog_expr2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__LOG_EXPR2, null, msgs);
      msgs = basicSetLog_expr2(newLog_expr2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__LOG_EXPR2, newLog_expr2, newLog_expr2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__PLAN_BODY, oldPlan_body, newPlan_body);
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
        msgs = ((InternalEObject)plan_body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__PLAN_BODY, null, msgs);
      if (newPlan_body != null)
        msgs = ((InternalEObject)newPlan_body).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.PLAN_TERM__PLAN_BODY, null, msgs);
      msgs = basicSetPlan_body(newPlan_body, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.PLAN_TERM__PLAN_BODY, newPlan_body, newPlan_body));
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
      case AslPackage.PLAN_TERM__PRED:
        return basicSetPred(null, msgs);
      case AslPackage.PLAN_TERM__TRIGGER:
        return basicSetTrigger(null, msgs);
      case AslPackage.PLAN_TERM__LOG_EXPR:
        return basicSetLog_expr(null, msgs);
      case AslPackage.PLAN_TERM__LITERAL:
        return basicSetLiteral(null, msgs);
      case AslPackage.PLAN_TERM__LOG_EXPR2:
        return basicSetLog_expr2(null, msgs);
      case AslPackage.PLAN_TERM__PLAN_BODY:
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
      case AslPackage.PLAN_TERM__TK_LABEL_AT:
        return getTk_label_at();
      case AslPackage.PLAN_TERM__PRED:
        return getPred();
      case AslPackage.PLAN_TERM__TRIGGER:
        return getTrigger();
      case AslPackage.PLAN_TERM__LOG_EXPR:
        return getLog_expr();
      case AslPackage.PLAN_TERM__LITERAL:
        return getLiteral();
      case AslPackage.PLAN_TERM__LOG_EXPR2:
        return getLog_expr2();
      case AslPackage.PLAN_TERM__PLAN_BODY:
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
      case AslPackage.PLAN_TERM__TK_LABEL_AT:
        setTk_label_at((String)newValue);
        return;
      case AslPackage.PLAN_TERM__PRED:
        setPred((Pred)newValue);
        return;
      case AslPackage.PLAN_TERM__TRIGGER:
        setTrigger((Trigger)newValue);
        return;
      case AslPackage.PLAN_TERM__LOG_EXPR:
        setLog_expr((Log_expr)newValue);
        return;
      case AslPackage.PLAN_TERM__LITERAL:
        setLiteral((Literal)newValue);
        return;
      case AslPackage.PLAN_TERM__LOG_EXPR2:
        setLog_expr2((Log_expr)newValue);
        return;
      case AslPackage.PLAN_TERM__PLAN_BODY:
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
      case AslPackage.PLAN_TERM__TK_LABEL_AT:
        setTk_label_at(TK_LABEL_AT_EDEFAULT);
        return;
      case AslPackage.PLAN_TERM__PRED:
        setPred((Pred)null);
        return;
      case AslPackage.PLAN_TERM__TRIGGER:
        setTrigger((Trigger)null);
        return;
      case AslPackage.PLAN_TERM__LOG_EXPR:
        setLog_expr((Log_expr)null);
        return;
      case AslPackage.PLAN_TERM__LITERAL:
        setLiteral((Literal)null);
        return;
      case AslPackage.PLAN_TERM__LOG_EXPR2:
        setLog_expr2((Log_expr)null);
        return;
      case AslPackage.PLAN_TERM__PLAN_BODY:
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
      case AslPackage.PLAN_TERM__TK_LABEL_AT:
        return TK_LABEL_AT_EDEFAULT == null ? tk_label_at != null : !TK_LABEL_AT_EDEFAULT.equals(tk_label_at);
      case AslPackage.PLAN_TERM__PRED:
        return pred != null;
      case AslPackage.PLAN_TERM__TRIGGER:
        return trigger != null;
      case AslPackage.PLAN_TERM__LOG_EXPR:
        return log_expr != null;
      case AslPackage.PLAN_TERM__LITERAL:
        return literal != null;
      case AslPackage.PLAN_TERM__LOG_EXPR2:
        return log_expr2 != null;
      case AslPackage.PLAN_TERM__PLAN_BODY:
        return plan_body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tk_label_at: ");
    result.append(tk_label_at);
    result.append(')');
    return result.toString();
  }

} //Plan_termImpl
