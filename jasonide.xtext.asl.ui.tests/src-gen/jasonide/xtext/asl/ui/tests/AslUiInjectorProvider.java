/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.asl.ui.tests;

import com.google.inject.Injector;
import jasonide.xtext.asl.ui.internal.AslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AslActivator.getInstance().getInjector("jasonide.xtext.asl.Asl");
	}

}