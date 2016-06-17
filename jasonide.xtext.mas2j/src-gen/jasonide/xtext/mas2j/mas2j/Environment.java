/**
 */
package jasonide.xtext.mas2j.mas2j;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jasonide.xtext.mas2j.mas2j.Environment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link jasonide.xtext.mas2j.mas2j.Environment#getEnvironmentLocus <em>Environment Locus</em>}</li>
 * </ul>
 * </p>
 *
 * @see jasonide.xtext.mas2j.mas2j.Mas2jPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference.
   * @see #setEnvironment(ClsDef)
   * @see jasonide.xtext.mas2j.mas2j.Mas2jPackage#getEnvironment_Environment()
   * @model containment="true"
   * @generated
   */
  ClsDef getEnvironment();

  /**
   * Sets the value of the '{@link jasonide.xtext.mas2j.mas2j.Environment#getEnvironment <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment</em>' containment reference.
   * @see #getEnvironment()
   * @generated
   */
  void setEnvironment(ClsDef value);

  /**
   * Returns the value of the '<em><b>Environment Locus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment Locus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment Locus</em>' attribute.
   * @see #setEnvironmentLocus(String)
   * @see jasonide.xtext.mas2j.mas2j.Mas2jPackage#getEnvironment_EnvironmentLocus()
   * @model
   * @generated
   */
  String getEnvironmentLocus();

  /**
   * Sets the value of the '{@link jasonide.xtext.mas2j.mas2j.Environment#getEnvironmentLocus <em>Environment Locus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment Locus</em>' attribute.
   * @see #getEnvironmentLocus()
   * @generated
   */
  void setEnvironmentLocus(String value);

} // Environment
