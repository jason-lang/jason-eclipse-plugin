/**
 */
package jasonide.xtext.asl.asl.impl;

import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.Literal;
import jasonide.xtext.asl.asl.Pred;
import jasonide.xtext.asl.asl.Var;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getVar <em>Var</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getTk_neg <em>Tk neg</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getTk_true <em>Tk true</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.impl.LiteralImpl#getTk_false <em>Tk false</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends MinimalEObjectImpl.Container implements Literal
{
  /**
   * The default value of the '{@link #getAtom() <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected static final String ATOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected String atom = ATOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Var var;

  /**
   * The default value of the '{@link #getTk_neg() <em>Tk neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_neg()
   * @generated
   * @ordered
   */
  protected static final String TK_NEG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTk_neg() <em>Tk neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_neg()
   * @generated
   * @ordered
   */
  protected String tk_neg = TK_NEG_EDEFAULT;

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
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected Var var2;

  /**
   * The default value of the '{@link #getTk_true() <em>Tk true</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_true()
   * @generated
   * @ordered
   */
  protected static final String TK_TRUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTk_true() <em>Tk true</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_true()
   * @generated
   * @ordered
   */
  protected String tk_true = TK_TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getTk_false() <em>Tk false</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_false()
   * @generated
   * @ordered
   */
  protected static final String TK_FALSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTk_false() <em>Tk false</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTk_false()
   * @generated
   * @ordered
   */
  protected String tk_false = TK_FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
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
    return AslPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtom()
  {
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom(String newAtom)
  {
    String oldAtom = atom;
    atom = newAtom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__ATOM, oldAtom, atom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Var newVar, NotificationChain msgs)
  {
    Var oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Var newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTk_neg()
  {
    return tk_neg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTk_neg(String newTk_neg)
  {
    String oldTk_neg = tk_neg;
    tk_neg = newTk_neg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__TK_NEG, oldTk_neg, tk_neg));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__PRED, oldPred, newPred);
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
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__PRED, newPred, newPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar2(Var newVar2, NotificationChain msgs)
  {
    Var oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__VAR2, oldVar2, newVar2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(Var newVar2)
  {
    if (newVar2 != var2)
    {
      NotificationChain msgs = null;
      if (var2 != null)
        msgs = ((InternalEObject)var2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__VAR2, null, msgs);
      if (newVar2 != null)
        msgs = ((InternalEObject)newVar2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AslPackage.LITERAL__VAR2, null, msgs);
      msgs = basicSetVar2(newVar2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__VAR2, newVar2, newVar2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTk_true()
  {
    return tk_true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTk_true(String newTk_true)
  {
    String oldTk_true = tk_true;
    tk_true = newTk_true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__TK_TRUE, oldTk_true, tk_true));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTk_false()
  {
    return tk_false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTk_false(String newTk_false)
  {
    String oldTk_false = tk_false;
    tk_false = newTk_false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AslPackage.LITERAL__TK_FALSE, oldTk_false, tk_false));
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
      case AslPackage.LITERAL__VAR:
        return basicSetVar(null, msgs);
      case AslPackage.LITERAL__PRED:
        return basicSetPred(null, msgs);
      case AslPackage.LITERAL__VAR2:
        return basicSetVar2(null, msgs);
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
      case AslPackage.LITERAL__ATOM:
        return getAtom();
      case AslPackage.LITERAL__VAR:
        return getVar();
      case AslPackage.LITERAL__TK_NEG:
        return getTk_neg();
      case AslPackage.LITERAL__PRED:
        return getPred();
      case AslPackage.LITERAL__VAR2:
        return getVar2();
      case AslPackage.LITERAL__TK_TRUE:
        return getTk_true();
      case AslPackage.LITERAL__TK_FALSE:
        return getTk_false();
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
      case AslPackage.LITERAL__ATOM:
        setAtom((String)newValue);
        return;
      case AslPackage.LITERAL__VAR:
        setVar((Var)newValue);
        return;
      case AslPackage.LITERAL__TK_NEG:
        setTk_neg((String)newValue);
        return;
      case AslPackage.LITERAL__PRED:
        setPred((Pred)newValue);
        return;
      case AslPackage.LITERAL__VAR2:
        setVar2((Var)newValue);
        return;
      case AslPackage.LITERAL__TK_TRUE:
        setTk_true((String)newValue);
        return;
      case AslPackage.LITERAL__TK_FALSE:
        setTk_false((String)newValue);
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
      case AslPackage.LITERAL__ATOM:
        setAtom(ATOM_EDEFAULT);
        return;
      case AslPackage.LITERAL__VAR:
        setVar((Var)null);
        return;
      case AslPackage.LITERAL__TK_NEG:
        setTk_neg(TK_NEG_EDEFAULT);
        return;
      case AslPackage.LITERAL__PRED:
        setPred((Pred)null);
        return;
      case AslPackage.LITERAL__VAR2:
        setVar2((Var)null);
        return;
      case AslPackage.LITERAL__TK_TRUE:
        setTk_true(TK_TRUE_EDEFAULT);
        return;
      case AslPackage.LITERAL__TK_FALSE:
        setTk_false(TK_FALSE_EDEFAULT);
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
      case AslPackage.LITERAL__ATOM:
        return ATOM_EDEFAULT == null ? atom != null : !ATOM_EDEFAULT.equals(atom);
      case AslPackage.LITERAL__VAR:
        return var != null;
      case AslPackage.LITERAL__TK_NEG:
        return TK_NEG_EDEFAULT == null ? tk_neg != null : !TK_NEG_EDEFAULT.equals(tk_neg);
      case AslPackage.LITERAL__PRED:
        return pred != null;
      case AslPackage.LITERAL__VAR2:
        return var2 != null;
      case AslPackage.LITERAL__TK_TRUE:
        return TK_TRUE_EDEFAULT == null ? tk_true != null : !TK_TRUE_EDEFAULT.equals(tk_true);
      case AslPackage.LITERAL__TK_FALSE:
        return TK_FALSE_EDEFAULT == null ? tk_false != null : !TK_FALSE_EDEFAULT.equals(tk_false);
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
    result.append(" (atom: ");
    result.append(atom);
    result.append(", tk_neg: ");
    result.append(tk_neg);
    result.append(", tk_true: ");
    result.append(tk_true);
    result.append(", tk_false: ");
    result.append(tk_false);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
