/**
 */
package jasonide.xtext.asl.asl;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getTk_label_at <em>Tk label at</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getPred <em>Pred</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getLog_expr <em>Log expr</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getLog_expr2 <em>Log expr2</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_term#getPlan_body <em>Plan body</em>}</li>
 * </ul>
 * </p>
 *
 * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term()
 * @model
 * @generated
 */
public interface Plan_term extends EObject
{
  /**
   * Returns the value of the '<em><b>Tk label at</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tk label at</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tk label at</em>' attribute.
   * @see #setTk_label_at(String)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Tk_label_at()
   * @model
   * @generated
   */
  String getTk_label_at();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getTk_label_at <em>Tk label at</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tk label at</em>' attribute.
   * @see #getTk_label_at()
   * @generated
   */
  void setTk_label_at(String value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(Pred)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Pred()
   * @model containment="true"
   * @generated
   */
  Pred getPred();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(Pred value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Trigger)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Trigger()
   * @model containment="true"
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

  /**
   * Returns the value of the '<em><b>Log expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Log expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log expr</em>' containment reference.
   * @see #setLog_expr(Log_expr)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Log_expr()
   * @model containment="true"
   * @generated
   */
  Log_expr getLog_expr();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getLog_expr <em>Log expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log expr</em>' containment reference.
   * @see #getLog_expr()
   * @generated
   */
  void setLog_expr(Log_expr value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

  /**
   * Returns the value of the '<em><b>Log expr2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Log expr2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log expr2</em>' containment reference.
   * @see #setLog_expr2(Log_expr)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Log_expr2()
   * @model containment="true"
   * @generated
   */
  Log_expr getLog_expr2();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getLog_expr2 <em>Log expr2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log expr2</em>' containment reference.
   * @see #getLog_expr2()
   * @generated
   */
  void setLog_expr2(Log_expr value);

  /**
   * Returns the value of the '<em><b>Plan body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan body</em>' containment reference.
   * @see #setPlan_body(Plan_body)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_term_Plan_body()
   * @model containment="true"
   * @generated
   */
  Plan_body getPlan_body();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_term#getPlan_body <em>Plan body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan body</em>' containment reference.
   * @see #getPlan_body()
   * @generated
   */
  void setPlan_body(Plan_body value);

} // Plan_term
