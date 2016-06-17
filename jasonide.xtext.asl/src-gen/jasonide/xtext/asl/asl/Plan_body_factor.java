/**
 */
package jasonide.xtext.asl.asl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan body factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtIF <em>Stmt IF</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtFOR <em>Stmt FOR</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtWHILE <em>Stmt WHILE</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_factor#getBody_formula <em>Body formula</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_factor#getPlan_body_factor <em>Plan body factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor()
 * @model
 * @generated
 */
public interface Plan_body_factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmt IF</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt IF</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt IF</em>' containment reference.
   * @see #setStmtIF(StmtIF)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor_StmtIF()
   * @model containment="true"
   * @generated
   */
  StmtIF getStmtIF();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtIF <em>Stmt IF</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt IF</em>' containment reference.
   * @see #getStmtIF()
   * @generated
   */
  void setStmtIF(StmtIF value);

  /**
   * Returns the value of the '<em><b>Stmt FOR</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt FOR</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt FOR</em>' containment reference.
   * @see #setStmtFOR(StmtFOR)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor_StmtFOR()
   * @model containment="true"
   * @generated
   */
  StmtFOR getStmtFOR();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtFOR <em>Stmt FOR</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt FOR</em>' containment reference.
   * @see #getStmtFOR()
   * @generated
   */
  void setStmtFOR(StmtFOR value);

  /**
   * Returns the value of the '<em><b>Stmt WHILE</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt WHILE</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt WHILE</em>' containment reference.
   * @see #setStmtWHILE(StmtWHILE)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor_StmtWHILE()
   * @model containment="true"
   * @generated
   */
  StmtWHILE getStmtWHILE();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_factor#getStmtWHILE <em>Stmt WHILE</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt WHILE</em>' containment reference.
   * @see #getStmtWHILE()
   * @generated
   */
  void setStmtWHILE(StmtWHILE value);

  /**
   * Returns the value of the '<em><b>Body formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body formula</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body formula</em>' containment reference.
   * @see #setBody_formula(Body_formula)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor_Body_formula()
   * @model containment="true"
   * @generated
   */
  Body_formula getBody_formula();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_factor#getBody_formula <em>Body formula</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body formula</em>' containment reference.
   * @see #getBody_formula()
   * @generated
   */
  void setBody_formula(Body_formula value);

  /**
   * Returns the value of the '<em><b>Plan body factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan body factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan body factor</em>' containment reference.
   * @see #setPlan_body_factor(Plan_body_factor)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_factor_Plan_body_factor()
   * @model containment="true"
   * @generated
   */
  Plan_body_factor getPlan_body_factor();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_factor#getPlan_body_factor <em>Plan body factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan body factor</em>' containment reference.
   * @see #getPlan_body_factor()
   * @generated
   */
  void setPlan_body_factor(Plan_body_factor value);

} // Plan_body_factor