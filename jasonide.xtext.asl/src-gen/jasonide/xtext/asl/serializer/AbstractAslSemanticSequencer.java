package jasonide.xtext.asl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jasonide.xtext.asl.asl.Agent;
import jasonide.xtext.asl.asl.Arithm_expr;
import jasonide.xtext.asl.asl.Arithm_expr_factor;
import jasonide.xtext.asl.asl.Arithm_expr_simple;
import jasonide.xtext.asl.asl.Arithm_expr_trm;
import jasonide.xtext.asl.asl.AslPackage;
import jasonide.xtext.asl.asl.Belief;
import jasonide.xtext.asl.asl.Body_formula;
import jasonide.xtext.asl.asl.Directive;
import jasonide.xtext.asl.asl.Function;
import jasonide.xtext.asl.asl.Initial_goal;
import jasonide.xtext.asl.asl.List;
import jasonide.xtext.asl.asl.Literal;
import jasonide.xtext.asl.asl.Log_expr;
import jasonide.xtext.asl.asl.Log_expr_factor;
import jasonide.xtext.asl.asl.Log_expr_trm;
import jasonide.xtext.asl.asl.Plan;
import jasonide.xtext.asl.asl.Plan_body;
import jasonide.xtext.asl.asl.Plan_body_factor;
import jasonide.xtext.asl.asl.Plan_body_term;
import jasonide.xtext.asl.asl.Plan_term;
import jasonide.xtext.asl.asl.Pred;
import jasonide.xtext.asl.asl.Rel_expr;
import jasonide.xtext.asl.asl.StmtFOR;
import jasonide.xtext.asl.asl.StmtIF;
import jasonide.xtext.asl.asl.StmtWHILE;
import jasonide.xtext.asl.asl.Term;
import jasonide.xtext.asl.asl.Term_in_list;
import jasonide.xtext.asl.asl.Terms;
import jasonide.xtext.asl.asl.Trigger;
import jasonide.xtext.asl.asl.Var;
import jasonide.xtext.asl.services.AslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AslPackage.AGENT:
				if(context == grammarAccess.getAgentRule()) {
					sequence_Agent(context, (Agent) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.ARITHM_EXPR:
				if(context == grammarAccess.getArithm_exprRule()) {
					sequence_Arithm_expr(context, (Arithm_expr) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.ARITHM_EXPR_FACTOR:
				if(context == grammarAccess.getArithm_expr_factorRule()) {
					sequence_Arithm_expr_factor(context, (Arithm_expr_factor) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.ARITHM_EXPR_SIMPLE:
				if(context == grammarAccess.getArithm_expr_simpleRule()) {
					sequence_Arithm_expr_simple(context, (Arithm_expr_simple) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.ARITHM_EXPR_TRM:
				if(context == grammarAccess.getArithm_expr_trmRule()) {
					sequence_Arithm_expr_trm(context, (Arithm_expr_trm) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.BELIEF:
				if(context == grammarAccess.getBeliefRule()) {
					sequence_Belief(context, (Belief) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.BODY_FORMULA:
				if(context == grammarAccess.getBody_formulaRule()) {
					sequence_Body_formula(context, (Body_formula) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule()) {
					sequence_Directive(context, (Directive) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.INITIAL_GOAL:
				if(context == grammarAccess.getInitial_goalRule()) {
					sequence_Initial_goal(context, (Initial_goal) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.LOG_EXPR:
				if(context == grammarAccess.getLog_exprRule()) {
					sequence_Log_expr(context, (Log_expr) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.LOG_EXPR_FACTOR:
				if(context == grammarAccess.getLog_expr_factorRule()) {
					sequence_Log_expr_factor(context, (Log_expr_factor) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.LOG_EXPR_TRM:
				if(context == grammarAccess.getLog_expr_trmRule()) {
					sequence_Log_expr_trm(context, (Log_expr_trm) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.NUMBER:
				if(context == grammarAccess.getNumberRule()) {
					sequence_Number(context, (jasonide.xtext.asl.asl.Number) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PLAN:
				if(context == grammarAccess.getPlanRule()) {
					sequence_Plan(context, (Plan) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PLAN_BODY:
				if(context == grammarAccess.getPlan_bodyRule()) {
					sequence_Plan_body(context, (Plan_body) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PLAN_BODY_FACTOR:
				if(context == grammarAccess.getPlan_body_factorRule()) {
					sequence_Plan_body_factor(context, (Plan_body_factor) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PLAN_BODY_TERM:
				if(context == grammarAccess.getPlan_body_termRule()) {
					sequence_Plan_body_term(context, (Plan_body_term) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PLAN_TERM:
				if(context == grammarAccess.getPlan_termRule()) {
					sequence_Plan_term(context, (Plan_term) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.PRED:
				if(context == grammarAccess.getPredRule()) {
					sequence_Pred(context, (Pred) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.REL_EXPR:
				if(context == grammarAccess.getRel_exprRule()) {
					sequence_Rel_expr(context, (Rel_expr) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.STMT_FOR:
				if(context == grammarAccess.getStmtFORRule()) {
					sequence_StmtFOR(context, (StmtFOR) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.STMT_IF:
				if(context == grammarAccess.getStmtIFRule()) {
					sequence_StmtIF(context, (StmtIF) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.STMT_WHILE:
				if(context == grammarAccess.getStmtWHILERule()) {
					sequence_StmtWHILE(context, (StmtWHILE) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.STRING:
				if(context == grammarAccess.getStringRule()) {
					sequence_String(context, (jasonide.xtext.asl.asl.String) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.TERM_IN_LIST:
				if(context == grammarAccess.getTerm_in_listRule()) {
					sequence_Term_in_list(context, (Term_in_list) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.TERMS:
				if(context == grammarAccess.getTermsRule()) {
					sequence_Terms(context, (Terms) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.TRIGGER:
				if(context == grammarAccess.getTriggerRule()) {
					sequence_Trigger(context, (Trigger) semanticObject); 
					return; 
				}
				else break;
			case AslPackage.VAR:
				if(context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         directive+=Directive* 
	 *         (belief+=Belief directive+=Directive*)* 
	 *         (initial_goal+=Initial_goal directive+=Directive*)* 
	 *         (plan+=Plan belief+=Belief* directive+=Directive*)*
	 *     )
	 */
	protected void sequence_Agent(EObject context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arithm_expr_trm=Arithm_expr_trm (subadd=TK_SUB_ADD arithm_expr=Arithm_expr)?)
	 */
	protected void sequence_Arithm_expr(EObject context, Arithm_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arithm_expr_simple=Arithm_expr_simple (exponential=TK_EXPONENTIAL arithm_expr_factor=Arithm_expr_factor)?)
	 */
	protected void sequence_Arithm_expr_factor(EObject context, Arithm_expr_factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=Number | (unary=TK_UNARY_OP arithm_expr_simple=Arithm_expr_simple) | log_expr=Log_expr | function=Function)
	 */
	protected void sequence_Arithm_expr_simple(EObject context, Arithm_expr_simple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arithm_expr_factor=Arithm_expr_factor ((muldiv=TK_MUL_DIV | tk_intdiv=TK_INTDIV | tk_intmod=TK_INTMOD) arithm_expr_trm=Arithm_expr_trm)?)
	 */
	protected void sequence_Arithm_expr_trm(EObject context, Arithm_expr_trm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (literal=Literal log_expr=Log_expr?)
	 */
	protected void sequence_Belief(EObject context, Belief semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (plan_term=Plan_term | log_expr=Log_expr)
	 */
	protected void sequence_Body_formula(EObject context, Body_formula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((tk_begin=TK_BEGIN pred=Pred agent=Agent) | pred2=Pred)
	 */
	protected void sequence_Directive(EObject context, Directive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literal=Literal
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.FUNCTION__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.FUNCTION__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getLiteralLiteralParserRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=Literal
	 */
	protected void sequence_Initial_goal(EObject context, Initial_goal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.INITIAL_GOAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.INITIAL_GOAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitial_goalAccess().getLiteralLiteralParserRuleCall_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((term_in_list+=Term_in_list term_in_list+=Term_in_list* (var=VART | unnamedvar=UNNAMEDVART | list=List)?)?)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((atom=JASON_ATOM | var=Var)? tk_neg=TK_NEG? (pred=Pred | var2=Var)) | tk_true=TK_TRUE | tk_false=TK_FALSE)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (log_expr_trm=Log_expr_trm log_expr=Log_expr?)
	 */
	protected void sequence_Log_expr(EObject context, Log_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((tk_not=TK_NOT log_expr_factor=Log_expr_factor) | rel_expr=Rel_expr)
	 */
	protected void sequence_Log_expr_factor(EObject context, Log_expr_factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (log_expr_factor=Log_expr_factor log_expr_trm=Log_expr_trm?)
	 */
	protected void sequence_Log_expr_trm(EObject context, Log_expr_trm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((number+=NUMBERT+ decimalPart+=NUMBERT+) | decimalPart+=NUMBERT+ | number+=NUMBERT+)
	 */
	protected void sequence_Number(EObject context, jasonide.xtext.asl.asl.Number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((tk_label_at=TK_LABEL_AT pred=Pred)? trigger=Trigger log_expr=Log_expr? plan_body=Plan_body?)
	 */
	protected void sequence_Plan(EObject context, Plan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (plan_body_term=Plan_body_term plan_body=Plan_body?)
	 */
	protected void sequence_Plan_body(EObject context, Plan_body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((stmtIF=StmtIF | stmtFOR=StmtFOR | stmtWHILE=StmtWHILE | body_formula=Body_formula) plan_body_factor=Plan_body_factor?)
	 */
	protected void sequence_Plan_body_factor(EObject context, Plan_body_factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (plan_body_factor=Plan_body_factor plan_body_term=Plan_body_term?)
	 */
	protected void sequence_Plan_body_term(EObject context, Plan_body_term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((tk_label_at=TK_LABEL_AT pred=Pred)? trigger=Trigger log_expr=Log_expr?)? (literal=Literal log_expr2=Log_expr)? plan_body=Plan_body?)
	 */
	protected void sequence_Plan_term(EObject context, Plan_term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((atom=JASON_ATOM | tk_begin=TK_BEGIN | tk_end=TK_END) terms=Terms? plan_term+=Plan_term* list=List?)
	 */
	protected void sequence_Pred(EObject context, Pred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arithm_exp=Arithm_expr | string=String) (relOp=TK_REL_OP (arithm_expr=Arithm_expr | string2=String | list=List | plan_term=Plan_term))?)
	 */
	protected void sequence_Rel_expr(EObject context, Rel_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tk_for=TK_FOR log_expr=Log_expr plan_term=Plan_term)
	 */
	protected void sequence_StmtFOR(EObject context, StmtFOR semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_FOR__TK_FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_FOR__TK_FOR));
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_FOR__LOG_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_FOR__LOG_EXPR));
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_FOR__PLAN_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_FOR__PLAN_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStmtFORAccess().getTk_forTK_FORParserRuleCall_0_0(), semanticObject.getTk_for());
		feeder.accept(grammarAccess.getStmtFORAccess().getLog_exprLog_exprParserRuleCall_2_0(), semanticObject.getLog_expr());
		feeder.accept(grammarAccess.getStmtFORAccess().getPlan_termPlan_termParserRuleCall_4_0(), semanticObject.getPlan_term());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tk_if=TK_IF log_expr=Log_expr plan_term=Plan_term (tk_else=TK_ELSE? plan_term2=Plan_term)?)
	 */
	protected void sequence_StmtIF(EObject context, StmtIF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tk_while=TK_WHILE log_expr=Log_expr plan_term=Plan_term)
	 */
	protected void sequence_StmtWHILE(EObject context, StmtWHILE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_WHILE__TK_WHILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_WHILE__TK_WHILE));
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_WHILE__LOG_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_WHILE__LOG_EXPR));
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STMT_WHILE__PLAN_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STMT_WHILE__PLAN_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStmtWHILEAccess().getTk_whileTK_WHILEParserRuleCall_0_0(), semanticObject.getTk_while());
		feeder.accept(grammarAccess.getStmtWHILEAccess().getLog_exprLog_exprParserRuleCall_2_0(), semanticObject.getLog_expr());
		feeder.accept(grammarAccess.getStmtWHILEAccess().getPlan_termPlan_termParserRuleCall_4_0(), semanticObject.getPlan_term());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     string=STRINGT
	 */
	protected void sequence_String(EObject context, jasonide.xtext.asl.asl.String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AslPackage.Literals.STRING__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AslPackage.Literals.STRING__STRING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringAccess().getStringSTRINGTTerminalRuleCall_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (list=List | plan_term=Plan_term | log_expr=Log_expr)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=List | arithm_expr=Arithm_expr | string=String | plan_term=Plan_term)
	 */
	protected void sequence_Term_in_list(EObject context, Term_in_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term+=Term term+=Term*)
	 */
	protected void sequence_Terms(EObject context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trigger=TriggerSymbol (literal=Literal | var=Var))
	 */
	protected void sequence_Trigger(EObject context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((var=VART | unnamedvar=UNNAMEDVART) list=List?)
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
