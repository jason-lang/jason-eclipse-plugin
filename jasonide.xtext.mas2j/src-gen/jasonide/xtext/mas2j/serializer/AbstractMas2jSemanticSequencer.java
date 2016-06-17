package jasonide.xtext.mas2j.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jasonide.xtext.mas2j.mas2j.Agent;
import jasonide.xtext.mas2j.mas2j.AgentArchClass;
import jasonide.xtext.mas2j.mas2j.AgentClass;
import jasonide.xtext.mas2j.mas2j.Agents;
import jasonide.xtext.mas2j.mas2j.BeliefBaseClass;
import jasonide.xtext.mas2j.mas2j.Beliefs;
import jasonide.xtext.mas2j.mas2j.Classpath;
import jasonide.xtext.mas2j.mas2j.Classpaths;
import jasonide.xtext.mas2j.mas2j.ClsDef;
import jasonide.xtext.mas2j.mas2j.Control;
import jasonide.xtext.mas2j.mas2j.Directive;
import jasonide.xtext.mas2j.mas2j.Directives;
import jasonide.xtext.mas2j.mas2j.DiscardEvents;
import jasonide.xtext.mas2j.mas2j.Environment;
import jasonide.xtext.mas2j.mas2j.EnvironmentLocus;
import jasonide.xtext.mas2j.mas2j.FileName;
import jasonide.xtext.mas2j.mas2j.Goals;
import jasonide.xtext.mas2j.mas2j.Infrastructure;
import jasonide.xtext.mas2j.mas2j.Instances;
import jasonide.xtext.mas2j.mas2j.LstParametersClsDef;
import jasonide.xtext.mas2j.mas2j.Mas2jModel;
import jasonide.xtext.mas2j.mas2j.Mas2jPackage;
import jasonide.xtext.mas2j.mas2j.Mindinspector;
import jasonide.xtext.mas2j.mas2j.NewFocus;
import jasonide.xtext.mas2j.mas2j.Nrcbp;
import jasonide.xtext.mas2j.mas2j.Options;
import jasonide.xtext.mas2j.mas2j.OtherOption;
import jasonide.xtext.mas2j.mas2j.ParameterClsDef;
import jasonide.xtext.mas2j.mas2j.RequeueEvents;
import jasonide.xtext.mas2j.mas2j.RetrieveEvents;
import jasonide.xtext.mas2j.mas2j.SameFocus;
import jasonide.xtext.mas2j.mas2j.Sourcepath;
import jasonide.xtext.mas2j.mas2j.Sourcepaths;
import jasonide.xtext.mas2j.mas2j.Verbose;
import jasonide.xtext.mas2j.services.Mas2jGrammarAccess;
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
public abstract class AbstractMas2jSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Mas2jGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Mas2jPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Mas2jPackage.AGENT:
				if(context == grammarAccess.getAgentRule()) {
					sequence_Agent(context, (Agent) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.AGENT_ARCH_CLASS:
				if(context == grammarAccess.getAgentArchClassRule()) {
					sequence_AgentArchClass(context, (AgentArchClass) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.AGENT_CLASS:
				if(context == grammarAccess.getAgentClassRule()) {
					sequence_AgentClass(context, (AgentClass) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.AGENTS:
				if(context == grammarAccess.getAgentsRule()) {
					sequence_Agents(context, (Agents) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.BELIEF_BASE_CLASS:
				if(context == grammarAccess.getBeliefBaseClassRule()) {
					sequence_BeliefBaseClass(context, (BeliefBaseClass) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.BELIEFS:
				if(context == grammarAccess.getBeliefsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Beliefs(context, (Beliefs) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.CLASSPATH:
				if(context == grammarAccess.getClasspathRule()) {
					sequence_Classpath(context, (Classpath) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.CLASSPATHS:
				if(context == grammarAccess.getClasspathsRule()) {
					sequence_Classpaths(context, (Classpaths) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.CLS_DEF:
				if(context == grammarAccess.getClsDefRule() ||
				   context == grammarAccess.getParameterClsDefRule()) {
					sequence_ClsDef(context, (ClsDef) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.CONTROL:
				if(context == grammarAccess.getControlRule()) {
					sequence_Control(context, (Control) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.DIRECTIVE:
				if(context == grammarAccess.getDirectiveRule()) {
					sequence_Directive(context, (Directive) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.DIRECTIVES:
				if(context == grammarAccess.getDirectivesRule()) {
					sequence_Directives(context, (Directives) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.DISCARD_EVENTS:
				if(context == grammarAccess.getEventsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Events(context, (DiscardEvents) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.ENVIRONMENT:
				if(context == grammarAccess.getEnvironmentRule()) {
					sequence_Environment(context, (Environment) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.ENVIRONMENT_LOCUS:
				if(context == grammarAccess.getEnvironmentLocusRule()) {
					sequence_EnvironmentLocus(context, (EnvironmentLocus) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.FILE_NAME:
				if(context == grammarAccess.getFileNameRule()) {
					sequence_FileName(context, (FileName) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.GOALS:
				if(context == grammarAccess.getGoalsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Goals(context, (Goals) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.INFRASTRUCTURE:
				if(context == grammarAccess.getInfrastructureRule()) {
					sequence_Infrastructure(context, (Infrastructure) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.INSTANCES:
				if(context == grammarAccess.getInstancesRule()) {
					sequence_Instances(context, (Instances) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.LST_PARAMETERS_CLS_DEF:
				if(context == grammarAccess.getLstParametersClsDefRule() ||
				   context == grammarAccess.getParameterClsDefRule()) {
					sequence_LstParametersClsDef(context, (LstParametersClsDef) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.MAS2J_MODEL:
				if(context == grammarAccess.getMas2jModelRule()) {
					sequence_Mas2jModel(context, (Mas2jModel) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.MINDINSPECTOR:
				if(context == grammarAccess.getMindinspectorRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Mindinspector(context, (Mindinspector) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.NEW_FOCUS:
				if(context == grammarAccess.getIntBelsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_IntBels(context, (NewFocus) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.NRCBP:
				if(context == grammarAccess.getNrcbpRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Nrcbp(context, (Nrcbp) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.OPTIONS:
				if(context == grammarAccess.getOptionsRule()) {
					sequence_Options(context, (Options) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.OTHER_OPTION:
				if(context == grammarAccess.getOptionRule() ||
				   context == grammarAccess.getOtherOptionRule()) {
					sequence_OtherOption(context, (OtherOption) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.PARAMETER_CLS_DEF:
				if(context == grammarAccess.getParameterClsDefRule()) {
					sequence_ParameterClsDef(context, (ParameterClsDef) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.REQUEUE_EVENTS:
				if(context == grammarAccess.getEventsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Events(context, (RequeueEvents) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.RETRIEVE_EVENTS:
				if(context == grammarAccess.getEventsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_Events(context, (RetrieveEvents) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.SAME_FOCUS:
				if(context == grammarAccess.getIntBelsRule() ||
				   context == grammarAccess.getOptionRule()) {
					sequence_IntBels(context, (SameFocus) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.SOURCEPATH:
				if(context == grammarAccess.getSourcepathRule()) {
					sequence_Sourcepath(context, (Sourcepath) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.SOURCEPATHS:
				if(context == grammarAccess.getSourcepathsRule()) {
					sequence_Sourcepaths(context, (Sourcepaths) semanticObject); 
					return; 
				}
				else break;
			case Mas2jPackage.VERBOSE:
				if(context == grammarAccess.getOptionRule() ||
				   context == grammarAccess.getVerboseRule()) {
					sequence_Verbose(context, (Verbose) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     agentArchClass=ClsDef
	 */
	protected void sequence_AgentArchClass(EObject context, AgentArchClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.AGENT_ARCH_CLASS__AGENT_ARCH_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.AGENT_ARCH_CLASS__AGENT_ARCH_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAgentArchClassAccess().getAgentArchClassClsDefParserRuleCall_1_0(), semanticObject.getAgentArchClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     agentClass=ClsDef
	 */
	protected void sequence_AgentClass(EObject context, AgentClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.AGENT_CLASS__AGENT_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.AGENT_CLASS__AGENT_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAgentClassAccess().getAgentClassClsDefParserRuleCall_1_0(), semanticObject.getAgentClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID_WITH_STARTING_LCLETTER 
	 *         sourceFile=FileName? 
	 *         options=Options? 
	 *         (agentArchClass+=AgentArchClass | beliefBaseClass+=BeliefBaseClass | agentClass+=AgentClass | instances+=Instances | environment+=EnvironmentLocus)*
	 *     )
	 */
	protected void sequence_Agent(EObject context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     agents+=Agent+
	 */
	protected void sequence_Agents(EObject context, Agents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     beliefBaseClass=ClsDef
	 */
	protected void sequence_BeliefBaseClass(EObject context, BeliefBaseClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.BELIEF_BASE_CLASS__BELIEF_BASE_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.BELIEF_BASE_CLASS__BELIEF_BASE_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBeliefBaseClassAccess().getBeliefBaseClassClsDefParserRuleCall_1_0(), semanticObject.getBeliefBaseClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_Beliefs(EObject context, Beliefs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.BELIEFS__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.BELIEFS__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBeliefsAccess().getValSTRINGTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nomeclasspath=STRING
	 */
	protected void sequence_Classpath(EObject context, Classpath semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.CLASSPATH__NOMECLASSPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.CLASSPATH__NOMECLASSPATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClasspathAccess().getNomeclasspathSTRINGTerminalRuleCall_0_0(), semanticObject.getNomeclasspath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     classpath+=Classpath+
	 */
	protected void sequence_Classpaths(EObject context, Classpaths semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (infrastructure=FQN (parameter+=ParameterClsDef parameter+=ParameterClsDef*)?)
	 */
	protected void sequence_ClsDef(EObject context, ClsDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (control=ClsDef controlLocus=STRING?)
	 */
	protected void sequence_Control(EObject context, Control semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (directive=ID_WITH_STARTING_LCLETTER clsDirective=ClsDef)
	 */
	protected void sequence_Directive(EObject context, Directive semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.DIRECTIVE__DIRECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.DIRECTIVE__DIRECTIVE));
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.DIRECTIVE__CLS_DIRECTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.DIRECTIVE__CLS_DIRECTIVE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDirectiveAccess().getDirectiveID_WITH_STARTING_LCLETTERTerminalRuleCall_0_0(), semanticObject.getDirective());
		feeder.accept(grammarAccess.getDirectiveAccess().getClsDirectiveClsDefParserRuleCall_2_0(), semanticObject.getClsDirective());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     directives+=Directive+
	 */
	protected void sequence_Directives(EObject context, Directives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     environmentLocus=STRING
	 */
	protected void sequence_EnvironmentLocus(EObject context, EnvironmentLocus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.ENVIRONMENT_LOCUS__ENVIRONMENT_LOCUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.ENVIRONMENT_LOCUS__ENVIRONMENT_LOCUS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnvironmentLocusAccess().getEnvironmentLocusSTRINGTerminalRuleCall_1_0(), semanticObject.getEnvironmentLocus());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (environment=ClsDef environmentLocus=STRING?)
	 */
	protected void sequence_Environment(EObject context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DiscardEvents}
	 */
	protected void sequence_Events(EObject context, DiscardEvents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RequeueEvents}
	 */
	protected void sequence_Events(EObject context, RequeueEvents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RetrieveEvents}
	 */
	protected void sequence_Events(EObject context, RetrieveEvents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=PATH? asid+=ID_WITH_STARTING_LCLETTER asid+=ID_WITH_STARTING_LCLETTER?)
	 */
	protected void sequence_FileName(EObject context, FileName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_Goals(EObject context, Goals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.GOALS__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.GOALS__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalsAccess().getValSTRINGTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     infrastructure=ClsDef
	 */
	protected void sequence_Infrastructure(EObject context, Infrastructure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.INFRASTRUCTURE__INFRASTRUCTURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.INFRASTRUCTURE__INFRASTRUCTURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInfrastructureAccess().getInfrastructureClsDefParserRuleCall_2_0(), semanticObject.getInfrastructure());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instances=INT_LITERAL
	 */
	protected void sequence_Instances(EObject context, Instances semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.INSTANCES__INSTANCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.INSTANCES__INSTANCES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstancesAccess().getInstancesINT_LITERALTerminalRuleCall_1_0(), semanticObject.getInstances());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NewFocus}
	 */
	protected void sequence_IntBels(EObject context, NewFocus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SameFocus}
	 */
	protected void sequence_IntBels(EObject context, SameFocus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter+=ParameterClsDef parameter+=ParameterClsDef*)
	 */
	protected void sequence_LstParametersClsDef(EObject context, LstParametersClsDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID_WITH_STARTING_LCLETTER 
	 *         infrastructure=Infrastructure? 
	 *         environment=Environment? 
	 *         control=Control? 
	 *         agents=Agents 
	 *         directives=Directives? 
	 *         classpath=Classpaths? 
	 *         sourcepath=Sourcepaths?
	 *     )
	 */
	protected void sequence_Mas2jModel(EObject context, Mas2jModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_Mindinspector(EObject context, Mindinspector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.MINDINSPECTOR__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.MINDINSPECTOR__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMindinspectorAccess().getValSTRINGTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     val=INT_LITERAL
	 */
	protected void sequence_Nrcbp(EObject context, Nrcbp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.NRCBP__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.NRCBP__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNrcbpAccess().getValINT_LITERALTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (options+=Option options+=Option*)
	 */
	protected void sequence_Options(EObject context, Options semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optionName=ID (val=ID | val=STRING | int_val=INT_LITERAL))
	 */
	protected void sequence_OtherOption(EObject context, OtherOption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameterclsint=INT_LITERAL | parameterclsstr=STRING)
	 */
	protected void sequence_ParameterClsDef(EObject context, ParameterClsDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     nomesourcepath=STRING
	 */
	protected void sequence_Sourcepath(EObject context, Sourcepath semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.SOURCEPATH__NOMESOURCEPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.SOURCEPATH__NOMESOURCEPATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourcepathAccess().getNomesourcepathSTRINGTerminalRuleCall_0_0(), semanticObject.getNomesourcepath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     sourcepath+=Sourcepath+
	 */
	protected void sequence_Sourcepaths(EObject context, Sourcepaths semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=INT_LITERAL
	 */
	protected void sequence_Verbose(EObject context, Verbose semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Mas2jPackage.Literals.VERBOSE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Mas2jPackage.Literals.VERBOSE__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVerboseAccess().getValINT_LITERALTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
}
