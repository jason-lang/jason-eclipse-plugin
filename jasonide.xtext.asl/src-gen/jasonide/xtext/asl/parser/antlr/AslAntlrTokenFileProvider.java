/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.asl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("jasonide/xtext/asl/parser/antlr/internal/InternalAsl.tokens");
	}
}
