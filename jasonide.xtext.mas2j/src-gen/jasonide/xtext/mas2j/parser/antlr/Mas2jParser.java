/*
 * generated by Xtext 2.23.0
 */
package jasonide.xtext.mas2j.parser.antlr;

import com.google.inject.Inject;
import jasonide.xtext.mas2j.parser.antlr.internal.InternalMas2jParser;
import jasonide.xtext.mas2j.services.Mas2jGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Mas2jParser extends AbstractAntlrParser {

	@Inject
	private Mas2jGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
	}
	

	@Override
	protected InternalMas2jParser createParser(XtextTokenStream stream) {
		return new InternalMas2jParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Mas2jModel";
	}

	public Mas2jGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Mas2jGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}