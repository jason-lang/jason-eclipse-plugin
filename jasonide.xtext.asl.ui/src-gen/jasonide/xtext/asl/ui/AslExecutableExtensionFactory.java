/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.asl.ui;

import com.google.inject.Injector;
import jasonide.xtext.asl.ui.internal.AslActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AslActivator activator = AslActivator.getInstance();
		return activator != null ? activator.getInjector(AslActivator.JASONIDE_XTEXT_ASL_ASL) : null;
	}

}
