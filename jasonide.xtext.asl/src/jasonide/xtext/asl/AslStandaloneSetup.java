/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.asl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AslStandaloneSetup extends AslStandaloneSetupGenerated {

	public static void doSetup() {
		new AslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}