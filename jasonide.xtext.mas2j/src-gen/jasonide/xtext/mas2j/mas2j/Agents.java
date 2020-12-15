/**
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.mas2j.mas2j;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jasonide.xtext.mas2j.mas2j.Agents#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see jasonide.xtext.mas2j.mas2j.Mas2jPackage#getAgents()
 * @model
 * @generated
 */
public interface Agents extends EObject
{
  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link jasonide.xtext.mas2j.mas2j.Agent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see jasonide.xtext.mas2j.mas2j.Mas2jPackage#getAgents_Agents()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgents();

} // Agents
