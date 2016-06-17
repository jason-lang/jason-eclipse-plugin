/*
* generated by Xtext
*/
package jasonide.xtext.asl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import jasonide.xtext.asl.services.AslGrammarAccess;

public class AslParser extends AbstractContentAssistParser {
	
	@Inject
	private AslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected jasonide.xtext.asl.ui.contentassist.antlr.internal.InternalAslParser createParser() {
		jasonide.xtext.asl.ui.contentassist.antlr.internal.InternalAslParser result = new jasonide.xtext.asl.ui.contentassist.antlr.internal.InternalAslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDirectiveAccess().getAlternatives_1(), "rule__Directive__Alternatives_1");
					put(grammarAccess.getTriggerAccess().getAlternatives_1(), "rule__Trigger__Alternatives_1");
					put(grammarAccess.getTriggerSymbolAccess().getAlternatives_0(), "rule__TriggerSymbol__Alternatives_0");
					put(grammarAccess.getTriggerSymbolAccess().getAlternatives_1(), "rule__TriggerSymbol__Alternatives_1");
					put(grammarAccess.getPlan_body_factorAccess().getAlternatives_0(), "rule__Plan_body_factor__Alternatives_0");
					put(grammarAccess.getBody_formulaAccess().getAlternatives_0(), "rule__Body_formula__Alternatives_0");
					put(grammarAccess.getBody_formulaAccess().getAlternatives_0_3_1(), "rule__Body_formula__Alternatives_0_3_1");
					put(grammarAccess.getBody_formulaAccess().getAlternatives_1(), "rule__Body_formula__Alternatives_1");
					put(grammarAccess.getPlan_termAccess().getAlternatives_2_3(), "rule__Plan_term__Alternatives_2_3");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives_0_0_0(), "rule__Literal__Alternatives_0_0_0");
					put(grammarAccess.getLiteralAccess().getAlternatives_0_2(), "rule__Literal__Alternatives_0_2");
					put(grammarAccess.getPredAccess().getAlternatives_0(), "rule__Pred__Alternatives_0");
					put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
					put(grammarAccess.getListAccess().getAlternatives_2_2_1(), "rule__List__Alternatives_2_2_1");
					put(grammarAccess.getTerm_in_listAccess().getAlternatives(), "rule__Term_in_list__Alternatives");
					put(grammarAccess.getLog_expr_factorAccess().getAlternatives(), "rule__Log_expr_factor__Alternatives");
					put(grammarAccess.getRel_exprAccess().getAlternatives_0(), "rule__Rel_expr__Alternatives_0");
					put(grammarAccess.getRel_exprAccess().getAlternatives_1_1(), "rule__Rel_expr__Alternatives_1_1");
					put(grammarAccess.getTK_REL_OPAccess().getAlternatives(), "rule__TK_REL_OP__Alternatives");
					put(grammarAccess.getTK_SUB_ADDAccess().getAlternatives(), "rule__TK_SUB_ADD__Alternatives");
					put(grammarAccess.getArithm_expr_trmAccess().getAlternatives_1_0(), "rule__Arithm_expr_trm__Alternatives_1_0");
					put(grammarAccess.getTK_MUL_DIVAccess().getAlternatives(), "rule__TK_MUL_DIV__Alternatives");
					put(grammarAccess.getArithm_expr_simpleAccess().getAlternatives(), "rule__Arithm_expr_simple__Alternatives");
					put(grammarAccess.getVarAccess().getAlternatives_0(), "rule__Var__Alternatives_0");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getAgentAccess().getGroup(), "rule__Agent__Group__0");
					put(grammarAccess.getAgentAccess().getGroup_1(), "rule__Agent__Group_1__0");
					put(grammarAccess.getAgentAccess().getGroup_2(), "rule__Agent__Group_2__0");
					put(grammarAccess.getAgentAccess().getGroup_3(), "rule__Agent__Group_3__0");
					put(grammarAccess.getDirectiveAccess().getGroup(), "rule__Directive__Group__0");
					put(grammarAccess.getDirectiveAccess().getGroup_1_0(), "rule__Directive__Group_1_0__0");
					put(grammarAccess.getDirectiveAccess().getGroup_1_1(), "rule__Directive__Group_1_1__0");
					put(grammarAccess.getBeliefAccess().getGroup(), "rule__Belief__Group__0");
					put(grammarAccess.getBeliefAccess().getGroup_1(), "rule__Belief__Group_1__0");
					put(grammarAccess.getInitial_goalAccess().getGroup(), "rule__Initial_goal__Group__0");
					put(grammarAccess.getPlanAccess().getGroup(), "rule__Plan__Group__0");
					put(grammarAccess.getPlanAccess().getGroup_0(), "rule__Plan__Group_0__0");
					put(grammarAccess.getPlanAccess().getGroup_2(), "rule__Plan__Group_2__0");
					put(grammarAccess.getPlanAccess().getGroup_3(), "rule__Plan__Group_3__0");
					put(grammarAccess.getTriggerAccess().getGroup(), "rule__Trigger__Group__0");
					put(grammarAccess.getTriggerSymbolAccess().getGroup(), "rule__TriggerSymbol__Group__0");
					put(grammarAccess.getPlan_bodyAccess().getGroup(), "rule__Plan_body__Group__0");
					put(grammarAccess.getPlan_body_termAccess().getGroup(), "rule__Plan_body_term__Group__0");
					put(grammarAccess.getPlan_body_termAccess().getGroup_1(), "rule__Plan_body_term__Group_1__0");
					put(grammarAccess.getPlan_body_factorAccess().getGroup(), "rule__Plan_body_factor__Group__0");
					put(grammarAccess.getPlan_body_factorAccess().getGroup_1(), "rule__Plan_body_factor__Group_1__0");
					put(grammarAccess.getStmtIFAccess().getGroup(), "rule__StmtIF__Group__0");
					put(grammarAccess.getStmtIFAccess().getGroup_5(), "rule__StmtIF__Group_5__0");
					put(grammarAccess.getStmtFORAccess().getGroup(), "rule__StmtFOR__Group__0");
					put(grammarAccess.getStmtWHILEAccess().getGroup(), "rule__StmtWHILE__Group__0");
					put(grammarAccess.getBody_formulaAccess().getGroup(), "rule__Body_formula__Group__0");
					put(grammarAccess.getBody_formulaAccess().getGroup_0_3(), "rule__Body_formula__Group_0_3__0");
					put(grammarAccess.getBody_formulaAccess().getGroup_0_4(), "rule__Body_formula__Group_0_4__0");
					put(grammarAccess.getPlan_termAccess().getGroup(), "rule__Plan_term__Group__0");
					put(grammarAccess.getPlan_termAccess().getGroup_2(), "rule__Plan_term__Group_2__0");
					put(grammarAccess.getPlan_termAccess().getGroup_2_0(), "rule__Plan_term__Group_2_0__0");
					put(grammarAccess.getPlan_termAccess().getGroup_2_2(), "rule__Plan_term__Group_2_2__0");
					put(grammarAccess.getPlan_termAccess().getGroup_3(), "rule__Plan_term__Group_3__0");
					put(grammarAccess.getLiteralAccess().getGroup_0(), "rule__Literal__Group_0__0");
					put(grammarAccess.getLiteralAccess().getGroup_0_0(), "rule__Literal__Group_0_0__0");
					put(grammarAccess.getPredAccess().getGroup(), "rule__Pred__Group__0");
					put(grammarAccess.getPredAccess().getGroup_1(), "rule__Pred__Group_1__0");
					put(grammarAccess.getTermsAccess().getGroup(), "rule__Terms__Group__0");
					put(grammarAccess.getTermsAccess().getGroup_1(), "rule__Terms__Group_1__0");
					put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
					put(grammarAccess.getListAccess().getGroup_2(), "rule__List__Group_2__0");
					put(grammarAccess.getListAccess().getGroup_2_1(), "rule__List__Group_2_1__0");
					put(grammarAccess.getListAccess().getGroup_2_2(), "rule__List__Group_2_2__0");
					put(grammarAccess.getLog_exprAccess().getGroup(), "rule__Log_expr__Group__0");
					put(grammarAccess.getLog_exprAccess().getGroup_1(), "rule__Log_expr__Group_1__0");
					put(grammarAccess.getLog_expr_trmAccess().getGroup(), "rule__Log_expr_trm__Group__0");
					put(grammarAccess.getLog_expr_trmAccess().getGroup_1(), "rule__Log_expr_trm__Group_1__0");
					put(grammarAccess.getLog_expr_factorAccess().getGroup_0(), "rule__Log_expr_factor__Group_0__0");
					put(grammarAccess.getRel_exprAccess().getGroup(), "rule__Rel_expr__Group__0");
					put(grammarAccess.getRel_exprAccess().getGroup_1(), "rule__Rel_expr__Group_1__0");
					put(grammarAccess.getTK_REL_OPAccess().getGroup_6(), "rule__TK_REL_OP__Group_6__0");
					put(grammarAccess.getTK_REL_OPAccess().getGroup_6_1(), "rule__TK_REL_OP__Group_6_1__0");
					put(grammarAccess.getArithm_exprAccess().getGroup(), "rule__Arithm_expr__Group__0");
					put(grammarAccess.getArithm_exprAccess().getGroup_1(), "rule__Arithm_expr__Group_1__0");
					put(grammarAccess.getArithm_expr_trmAccess().getGroup(), "rule__Arithm_expr_trm__Group__0");
					put(grammarAccess.getArithm_expr_trmAccess().getGroup_1(), "rule__Arithm_expr_trm__Group_1__0");
					put(grammarAccess.getArithm_expr_factorAccess().getGroup(), "rule__Arithm_expr_factor__Group__0");
					put(grammarAccess.getArithm_expr_factorAccess().getGroup_1(), "rule__Arithm_expr_factor__Group_1__0");
					put(grammarAccess.getArithm_expr_simpleAccess().getGroup_1(), "rule__Arithm_expr_simple__Group_1__0");
					put(grammarAccess.getArithm_expr_simpleAccess().getGroup_2(), "rule__Arithm_expr_simple__Group_2__0");
					put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_0(), "rule__Number__Group_0__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getJASON_ATOMAccess().getGroup(), "rule__JASON_ATOM__Group__0");
					put(grammarAccess.getJASON_ATOM_HEADAccess().getGroup(), "rule__JASON_ATOM_HEAD__Group__0");
					put(grammarAccess.getJASON_ATOM_TAILAccess().getGroup(), "rule__JASON_ATOM_TAIL__Group__0");
					put(grammarAccess.getAgentAccess().getDirectiveAssignment_0(), "rule__Agent__DirectiveAssignment_0");
					put(grammarAccess.getAgentAccess().getBeliefAssignment_1_0(), "rule__Agent__BeliefAssignment_1_0");
					put(grammarAccess.getAgentAccess().getDirectiveAssignment_1_1(), "rule__Agent__DirectiveAssignment_1_1");
					put(grammarAccess.getAgentAccess().getInitial_goalAssignment_2_0(), "rule__Agent__Initial_goalAssignment_2_0");
					put(grammarAccess.getAgentAccess().getDirectiveAssignment_2_1(), "rule__Agent__DirectiveAssignment_2_1");
					put(grammarAccess.getAgentAccess().getPlanAssignment_3_0(), "rule__Agent__PlanAssignment_3_0");
					put(grammarAccess.getAgentAccess().getBeliefAssignment_3_1(), "rule__Agent__BeliefAssignment_3_1");
					put(grammarAccess.getAgentAccess().getDirectiveAssignment_3_2(), "rule__Agent__DirectiveAssignment_3_2");
					put(grammarAccess.getDirectiveAccess().getTk_beginAssignment_1_0_0(), "rule__Directive__Tk_beginAssignment_1_0_0");
					put(grammarAccess.getDirectiveAccess().getPredAssignment_1_0_1(), "rule__Directive__PredAssignment_1_0_1");
					put(grammarAccess.getDirectiveAccess().getAgentAssignment_1_0_3(), "rule__Directive__AgentAssignment_1_0_3");
					put(grammarAccess.getDirectiveAccess().getPred2Assignment_1_1_0(), "rule__Directive__Pred2Assignment_1_1_0");
					put(grammarAccess.getBeliefAccess().getLiteralAssignment_0(), "rule__Belief__LiteralAssignment_0");
					put(grammarAccess.getBeliefAccess().getLog_exprAssignment_1_1(), "rule__Belief__Log_exprAssignment_1_1");
					put(grammarAccess.getInitial_goalAccess().getLiteralAssignment_1(), "rule__Initial_goal__LiteralAssignment_1");
					put(grammarAccess.getPlanAccess().getTk_label_atAssignment_0_0(), "rule__Plan__Tk_label_atAssignment_0_0");
					put(grammarAccess.getPlanAccess().getPredAssignment_0_1(), "rule__Plan__PredAssignment_0_1");
					put(grammarAccess.getPlanAccess().getTriggerAssignment_1(), "rule__Plan__TriggerAssignment_1");
					put(grammarAccess.getPlanAccess().getLog_exprAssignment_2_1(), "rule__Plan__Log_exprAssignment_2_1");
					put(grammarAccess.getPlanAccess().getPlan_bodyAssignment_3_1(), "rule__Plan__Plan_bodyAssignment_3_1");
					put(grammarAccess.getTriggerAccess().getTriggerAssignment_0(), "rule__Trigger__TriggerAssignment_0");
					put(grammarAccess.getTriggerAccess().getLiteralAssignment_1_0(), "rule__Trigger__LiteralAssignment_1_0");
					put(grammarAccess.getTriggerAccess().getVarAssignment_1_1(), "rule__Trigger__VarAssignment_1_1");
					put(grammarAccess.getPlan_bodyAccess().getPlan_body_termAssignment_0(), "rule__Plan_body__Plan_body_termAssignment_0");
					put(grammarAccess.getPlan_bodyAccess().getPlan_bodyAssignment_2(), "rule__Plan_body__Plan_bodyAssignment_2");
					put(grammarAccess.getPlan_body_termAccess().getPlan_body_factorAssignment_0(), "rule__Plan_body_term__Plan_body_factorAssignment_0");
					put(grammarAccess.getPlan_body_termAccess().getPlan_body_termAssignment_1_1(), "rule__Plan_body_term__Plan_body_termAssignment_1_1");
					put(grammarAccess.getPlan_body_factorAccess().getStmtIFAssignment_0_0(), "rule__Plan_body_factor__StmtIFAssignment_0_0");
					put(grammarAccess.getPlan_body_factorAccess().getStmtFORAssignment_0_1(), "rule__Plan_body_factor__StmtFORAssignment_0_1");
					put(grammarAccess.getPlan_body_factorAccess().getStmtWHILEAssignment_0_2(), "rule__Plan_body_factor__StmtWHILEAssignment_0_2");
					put(grammarAccess.getPlan_body_factorAccess().getBody_formulaAssignment_0_3(), "rule__Plan_body_factor__Body_formulaAssignment_0_3");
					put(grammarAccess.getPlan_body_factorAccess().getPlan_body_factorAssignment_1_1(), "rule__Plan_body_factor__Plan_body_factorAssignment_1_1");
					put(grammarAccess.getStmtIFAccess().getTk_ifAssignment_0(), "rule__StmtIF__Tk_ifAssignment_0");
					put(grammarAccess.getStmtIFAccess().getLog_exprAssignment_2(), "rule__StmtIF__Log_exprAssignment_2");
					put(grammarAccess.getStmtIFAccess().getPlan_termAssignment_4(), "rule__StmtIF__Plan_termAssignment_4");
					put(grammarAccess.getStmtIFAccess().getTk_elseAssignment_5_0(), "rule__StmtIF__Tk_elseAssignment_5_0");
					put(grammarAccess.getStmtIFAccess().getPlan_term2Assignment_5_1(), "rule__StmtIF__Plan_term2Assignment_5_1");
					put(grammarAccess.getStmtFORAccess().getTk_forAssignment_0(), "rule__StmtFOR__Tk_forAssignment_0");
					put(grammarAccess.getStmtFORAccess().getLog_exprAssignment_2(), "rule__StmtFOR__Log_exprAssignment_2");
					put(grammarAccess.getStmtFORAccess().getPlan_termAssignment_4(), "rule__StmtFOR__Plan_termAssignment_4");
					put(grammarAccess.getStmtWHILEAccess().getTk_whileAssignment_0(), "rule__StmtWHILE__Tk_whileAssignment_0");
					put(grammarAccess.getStmtWHILEAccess().getLog_exprAssignment_2(), "rule__StmtWHILE__Log_exprAssignment_2");
					put(grammarAccess.getStmtWHILEAccess().getPlan_termAssignment_4(), "rule__StmtWHILE__Plan_termAssignment_4");
					put(grammarAccess.getBody_formulaAccess().getPlan_termAssignment_1_0(), "rule__Body_formula__Plan_termAssignment_1_0");
					put(grammarAccess.getBody_formulaAccess().getLog_exprAssignment_1_1(), "rule__Body_formula__Log_exprAssignment_1_1");
					put(grammarAccess.getPlan_termAccess().getTk_label_atAssignment_2_0_0(), "rule__Plan_term__Tk_label_atAssignment_2_0_0");
					put(grammarAccess.getPlan_termAccess().getPredAssignment_2_0_1(), "rule__Plan_term__PredAssignment_2_0_1");
					put(grammarAccess.getPlan_termAccess().getTriggerAssignment_2_1(), "rule__Plan_term__TriggerAssignment_2_1");
					put(grammarAccess.getPlan_termAccess().getLog_exprAssignment_2_2_1(), "rule__Plan_term__Log_exprAssignment_2_2_1");
					put(grammarAccess.getPlan_termAccess().getLiteralAssignment_3_0(), "rule__Plan_term__LiteralAssignment_3_0");
					put(grammarAccess.getPlan_termAccess().getLog_expr2Assignment_3_2(), "rule__Plan_term__Log_expr2Assignment_3_2");
					put(grammarAccess.getPlan_termAccess().getPlan_bodyAssignment_4(), "rule__Plan_term__Plan_bodyAssignment_4");
					put(grammarAccess.getLiteralAccess().getAtomAssignment_0_0_0_0(), "rule__Literal__AtomAssignment_0_0_0_0");
					put(grammarAccess.getLiteralAccess().getVarAssignment_0_0_0_1(), "rule__Literal__VarAssignment_0_0_0_1");
					put(grammarAccess.getLiteralAccess().getTk_negAssignment_0_1(), "rule__Literal__Tk_negAssignment_0_1");
					put(grammarAccess.getLiteralAccess().getPredAssignment_0_2_0(), "rule__Literal__PredAssignment_0_2_0");
					put(grammarAccess.getLiteralAccess().getVar2Assignment_0_2_1(), "rule__Literal__Var2Assignment_0_2_1");
					put(grammarAccess.getLiteralAccess().getTk_trueAssignment_1(), "rule__Literal__Tk_trueAssignment_1");
					put(grammarAccess.getLiteralAccess().getTk_falseAssignment_2(), "rule__Literal__Tk_falseAssignment_2");
					put(grammarAccess.getPredAccess().getAtomAssignment_0_0(), "rule__Pred__AtomAssignment_0_0");
					put(grammarAccess.getPredAccess().getTk_beginAssignment_0_1(), "rule__Pred__Tk_beginAssignment_0_1");
					put(grammarAccess.getPredAccess().getTk_endAssignment_0_2(), "rule__Pred__Tk_endAssignment_0_2");
					put(grammarAccess.getPredAccess().getTermsAssignment_1_1(), "rule__Pred__TermsAssignment_1_1");
					put(grammarAccess.getPredAccess().getPlan_termAssignment_2(), "rule__Pred__Plan_termAssignment_2");
					put(grammarAccess.getPredAccess().getListAssignment_3(), "rule__Pred__ListAssignment_3");
					put(grammarAccess.getTermsAccess().getTermAssignment_0(), "rule__Terms__TermAssignment_0");
					put(grammarAccess.getTermsAccess().getTermAssignment_1_1(), "rule__Terms__TermAssignment_1_1");
					put(grammarAccess.getTermAccess().getListAssignment_0(), "rule__Term__ListAssignment_0");
					put(grammarAccess.getTermAccess().getPlan_termAssignment_1(), "rule__Term__Plan_termAssignment_1");
					put(grammarAccess.getTermAccess().getLog_exprAssignment_2(), "rule__Term__Log_exprAssignment_2");
					put(grammarAccess.getListAccess().getTerm_in_listAssignment_2_0(), "rule__List__Term_in_listAssignment_2_0");
					put(grammarAccess.getListAccess().getTerm_in_listAssignment_2_1_1(), "rule__List__Term_in_listAssignment_2_1_1");
					put(grammarAccess.getListAccess().getVarAssignment_2_2_1_0(), "rule__List__VarAssignment_2_2_1_0");
					put(grammarAccess.getListAccess().getUnnamedvarAssignment_2_2_1_1(), "rule__List__UnnamedvarAssignment_2_2_1_1");
					put(grammarAccess.getListAccess().getListAssignment_2_2_1_2(), "rule__List__ListAssignment_2_2_1_2");
					put(grammarAccess.getTerm_in_listAccess().getListAssignment_0(), "rule__Term_in_list__ListAssignment_0");
					put(grammarAccess.getTerm_in_listAccess().getArithm_exprAssignment_1(), "rule__Term_in_list__Arithm_exprAssignment_1");
					put(grammarAccess.getTerm_in_listAccess().getStringAssignment_2(), "rule__Term_in_list__StringAssignment_2");
					put(grammarAccess.getTerm_in_listAccess().getPlan_termAssignment_3(), "rule__Term_in_list__Plan_termAssignment_3");
					put(grammarAccess.getLog_exprAccess().getLog_expr_trmAssignment_0(), "rule__Log_expr__Log_expr_trmAssignment_0");
					put(grammarAccess.getLog_exprAccess().getLog_exprAssignment_1_1(), "rule__Log_expr__Log_exprAssignment_1_1");
					put(grammarAccess.getLog_expr_trmAccess().getLog_expr_factorAssignment_0(), "rule__Log_expr_trm__Log_expr_factorAssignment_0");
					put(grammarAccess.getLog_expr_trmAccess().getLog_expr_trmAssignment_1_1(), "rule__Log_expr_trm__Log_expr_trmAssignment_1_1");
					put(grammarAccess.getLog_expr_factorAccess().getTk_notAssignment_0_0(), "rule__Log_expr_factor__Tk_notAssignment_0_0");
					put(grammarAccess.getLog_expr_factorAccess().getLog_expr_factorAssignment_0_1(), "rule__Log_expr_factor__Log_expr_factorAssignment_0_1");
					put(grammarAccess.getLog_expr_factorAccess().getRel_exprAssignment_1(), "rule__Log_expr_factor__Rel_exprAssignment_1");
					put(grammarAccess.getRel_exprAccess().getArithm_expAssignment_0_0(), "rule__Rel_expr__Arithm_expAssignment_0_0");
					put(grammarAccess.getRel_exprAccess().getStringAssignment_0_1(), "rule__Rel_expr__StringAssignment_0_1");
					put(grammarAccess.getRel_exprAccess().getRelOpAssignment_1_0(), "rule__Rel_expr__RelOpAssignment_1_0");
					put(grammarAccess.getRel_exprAccess().getArithm_exprAssignment_1_1_0(), "rule__Rel_expr__Arithm_exprAssignment_1_1_0");
					put(grammarAccess.getRel_exprAccess().getString2Assignment_1_1_1(), "rule__Rel_expr__String2Assignment_1_1_1");
					put(grammarAccess.getRel_exprAccess().getListAssignment_1_1_2(), "rule__Rel_expr__ListAssignment_1_1_2");
					put(grammarAccess.getRel_exprAccess().getPlan_termAssignment_1_1_3(), "rule__Rel_expr__Plan_termAssignment_1_1_3");
					put(grammarAccess.getArithm_exprAccess().getArithm_expr_trmAssignment_0(), "rule__Arithm_expr__Arithm_expr_trmAssignment_0");
					put(grammarAccess.getArithm_exprAccess().getSubaddAssignment_1_0(), "rule__Arithm_expr__SubaddAssignment_1_0");
					put(grammarAccess.getArithm_exprAccess().getArithm_exprAssignment_1_1(), "rule__Arithm_expr__Arithm_exprAssignment_1_1");
					put(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_factorAssignment_0(), "rule__Arithm_expr_trm__Arithm_expr_factorAssignment_0");
					put(grammarAccess.getArithm_expr_trmAccess().getMuldivAssignment_1_0_0(), "rule__Arithm_expr_trm__MuldivAssignment_1_0_0");
					put(grammarAccess.getArithm_expr_trmAccess().getTk_intdivAssignment_1_0_1(), "rule__Arithm_expr_trm__Tk_intdivAssignment_1_0_1");
					put(grammarAccess.getArithm_expr_trmAccess().getTk_intmodAssignment_1_0_2(), "rule__Arithm_expr_trm__Tk_intmodAssignment_1_0_2");
					put(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_trmAssignment_1_1(), "rule__Arithm_expr_trm__Arithm_expr_trmAssignment_1_1");
					put(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_simpleAssignment_0(), "rule__Arithm_expr_factor__Arithm_expr_simpleAssignment_0");
					put(grammarAccess.getArithm_expr_factorAccess().getExponentialAssignment_1_0(), "rule__Arithm_expr_factor__ExponentialAssignment_1_0");
					put(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_factorAssignment_1_1(), "rule__Arithm_expr_factor__Arithm_expr_factorAssignment_1_1");
					put(grammarAccess.getArithm_expr_simpleAccess().getNumberAssignment_0(), "rule__Arithm_expr_simple__NumberAssignment_0");
					put(grammarAccess.getArithm_expr_simpleAccess().getUnaryAssignment_1_0(), "rule__Arithm_expr_simple__UnaryAssignment_1_0");
					put(grammarAccess.getArithm_expr_simpleAccess().getArithm_expr_simpleAssignment_1_1(), "rule__Arithm_expr_simple__Arithm_expr_simpleAssignment_1_1");
					put(grammarAccess.getArithm_expr_simpleAccess().getLog_exprAssignment_2_1(), "rule__Arithm_expr_simple__Log_exprAssignment_2_1");
					put(grammarAccess.getArithm_expr_simpleAccess().getFunctionAssignment_3(), "rule__Arithm_expr_simple__FunctionAssignment_3");
					put(grammarAccess.getFunctionAccess().getLiteralAssignment(), "rule__Function__LiteralAssignment");
					put(grammarAccess.getVarAccess().getVarAssignment_0_0(), "rule__Var__VarAssignment_0_0");
					put(grammarAccess.getVarAccess().getUnnamedvarAssignment_0_1(), "rule__Var__UnnamedvarAssignment_0_1");
					put(grammarAccess.getVarAccess().getListAssignment_1(), "rule__Var__ListAssignment_1");
					put(grammarAccess.getStringAccess().getStringAssignment(), "rule__String__StringAssignment");
					put(grammarAccess.getNumberAccess().getNumberAssignment_0_0(), "rule__Number__NumberAssignment_0_0");
					put(grammarAccess.getNumberAccess().getDecimalPartAssignment_0_2(), "rule__Number__DecimalPartAssignment_0_2");
					put(grammarAccess.getNumberAccess().getDecimalPartAssignment_1_1(), "rule__Number__DecimalPartAssignment_1_1");
					put(grammarAccess.getNumberAccess().getNumberAssignment_2(), "rule__Number__NumberAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			jasonide.xtext.asl.ui.contentassist.antlr.internal.InternalAslParser typedParser = (jasonide.xtext.asl.ui.contentassist.antlr.internal.InternalAslParser) parser;
			typedParser.entryRuleAgent();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
