/**
 */
package jasonide.xtext.asl.asl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan body term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_term#getPlan_body_factor <em>Plan body factor</em>}</li>
 *   <li>{@link jasonide.xtext.asl.asl.Plan_body_term#getPlan_body_term <em>Plan body term</em>}</li>
 * </ul>
 * </p>
 *
 * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_term()
 * @model
 * @generated
 */
public interface Plan_body_term extends EObject
{
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
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_term_Plan_body_factor()
   * @model containment="true"
   * @generated
   */
  Plan_body_factor getPlan_body_factor();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_term#getPlan_body_factor <em>Plan body factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan body factor</em>' containment reference.
   * @see #getPlan_body_factor()
   * @generated
   */
  void setPlan_body_factor(Plan_body_factor value);

  /**
   * Returns the value of the '<em><b>Plan body term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan body term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan body term</em>' containment reference.
   * @see #setPlan_body_term(Plan_body_term)
   * @see jasonide.xtext.asl.asl.AslPackage#getPlan_body_term_Plan_body_term()
   * @model containment="true"
   * @generated
   */
  Plan_body_term getPlan_body_term();

  /**
   * Sets the value of the '{@link jasonide.xtext.asl.asl.Plan_body_term#getPlan_body_term <em>Plan body term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan body term</em>' containment reference.
   * @see #getPlan_body_term()
   * @generated
   */
  void setPlan_body_term(Plan_body_term value);

} // Plan_body_term
