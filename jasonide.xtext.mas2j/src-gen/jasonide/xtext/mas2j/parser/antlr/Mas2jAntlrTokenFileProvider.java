/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.mas2j.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Mas2jAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("jasonide/xtext/mas2j/parser/antlr/internal/InternalMas2j.tokens");
	}
}