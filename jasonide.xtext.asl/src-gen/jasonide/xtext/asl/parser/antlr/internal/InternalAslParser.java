package jasonide.xtext.asl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jasonide.xtext.asl.services.AslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TK_LABEL_AT", "RULE_TK_NEG", "RULE_VART", "RULE_UNNAMEDVART", "RULE_STRINGT", "RULE_NUMBERT", "RULE_ATOMAPOST", "RULE_ATOM", "RULE_LCLETTER", "RULE_CH", "RULE_UCLETTER", "RULE_DIGIT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'{'", "'}'", "':-'", "'.'", "'!'", "':'", "'<-'", "'+'", "'-'", "'^'", "'?'", "';'", "'|||'", "'|&|'", "'('", "')'", "'!!'", "'>'", "'<'", "'::'", "','", "'['", "'|'", "']'", "'&'", "'<='", "'>='", "'=='", "'\\\\=='", "'='", "'*'", "'/'", "'**'", "'begin'", "'end'", "'if'", "'else'", "'elif'", "'for'", "'while'", "'not'", "'div'", "'mod'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int RULE_LCLETTER=12;
    public static final int T__19=19;
    public static final int RULE_CH=13;
    public static final int T__59=59;
    public static final int RULE_ATOM=11;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_UCLETTER=14;
    public static final int RULE_DIGIT=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_ATOMAPOST=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_VART=6;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_NUMBERT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_STRINGT=8;
    public static final int RULE_UNNAMEDVART=7;
    public static final int RULE_TK_NEG=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_TK_LABEL_AT=4;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private AslGrammarAccess grammarAccess;

        public InternalAslParser(TokenStream input, AslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Agent";
       	}

       	@Override
       	protected AslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAgent"
    // InternalAsl.g:70:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalAsl.g:70:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalAsl.g:71:2: iv_ruleAgent= ruleAgent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAgentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAgent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalAsl.g:77:1: ruleAgent returns [EObject current=null] : ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        EObject lv_directive_0_0 = null;

        EObject lv_belief_1_0 = null;

        EObject lv_directive_2_0 = null;

        EObject lv_initial_goal_3_0 = null;

        EObject lv_directive_4_0 = null;

        EObject lv_plan_5_0 = null;

        EObject lv_belief_6_0 = null;

        EObject lv_directive_7_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:83:2: ( ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* ) )
            // InternalAsl.g:84:2: ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* )
            {
            // InternalAsl.g:84:2: ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* )
            // InternalAsl.g:85:3: ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )*
            {
            // InternalAsl.g:85:3: ( (lv_directive_0_0= ruleDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_InternalAsl()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalAsl.g:86:4: (lv_directive_0_0= ruleDirective )
            	    {
            	    // InternalAsl.g:86:4: (lv_directive_0_0= ruleDirective )
            	    // InternalAsl.g:87:5: lv_directive_0_0= ruleDirective
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_directive_0_0=ruleDirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAgentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"directive",
            	      						lv_directive_0_0,
            	      						"jasonide.xtext.asl.Asl.Directive");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAsl.g:104:3: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )*
            	    {
            	    // InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) )
            	    // InternalAsl.g:106:5: (lv_belief_1_0= ruleBelief )
            	    {
            	    // InternalAsl.g:106:5: (lv_belief_1_0= ruleBelief )
            	    // InternalAsl.g:107:6: lv_belief_1_0= ruleBelief
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_belief_1_0=ruleBelief();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"belief",
            	      							lv_belief_1_0,
            	      							"jasonide.xtext.asl.Asl.Belief");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalAsl.g:124:4: ( (lv_directive_2_0= ruleDirective ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==19) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( (synpred2_InternalAsl()) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
            	    	    {
            	    	    // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
            	    	    // InternalAsl.g:126:6: lv_directive_2_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_directive_2_0=ruleDirective();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"directive",
            	    	      							lv_directive_2_0,
            	    	      							"jasonide.xtext.asl.Asl.Directive");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAsl.g:144:3: ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_InternalAsl()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalAsl.g:145:4: ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )*
            	    {
            	    // InternalAsl.g:145:4: ( (lv_initial_goal_3_0= ruleInitial_goal ) )
            	    // InternalAsl.g:146:5: (lv_initial_goal_3_0= ruleInitial_goal )
            	    {
            	    // InternalAsl.g:146:5: (lv_initial_goal_3_0= ruleInitial_goal )
            	    // InternalAsl.g:147:6: lv_initial_goal_3_0= ruleInitial_goal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAgentAccess().getInitial_goalInitial_goalParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_initial_goal_3_0=ruleInitial_goal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"initial_goal",
            	      							lv_initial_goal_3_0,
            	      							"jasonide.xtext.asl.Asl.Initial_goal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalAsl.g:164:4: ( (lv_directive_4_0= ruleDirective ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==19) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( (synpred4_InternalAsl()) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
            	    	    {
            	    	    // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
            	    	    // InternalAsl.g:166:6: lv_directive_4_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_directive_4_0=ruleDirective();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"directive",
            	    	      							lv_directive_4_0,
            	    	      							"jasonide.xtext.asl.Asl.Directive");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalAsl.g:184:3: ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case RULE_TK_LABEL_AT:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalAsl.g:185:4: ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )*
            	    {
            	    // InternalAsl.g:185:4: ( (lv_plan_5_0= rulePlan ) )
            	    // InternalAsl.g:186:5: (lv_plan_5_0= rulePlan )
            	    {
            	    // InternalAsl.g:186:5: (lv_plan_5_0= rulePlan )
            	    // InternalAsl.g:187:6: lv_plan_5_0= rulePlan
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAgentAccess().getPlanPlanParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_plan_5_0=rulePlan();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"plan",
            	      							lv_plan_5_0,
            	      							"jasonide.xtext.asl.Asl.Plan");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalAsl.g:204:4: ( (lv_belief_6_0= ruleBelief ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        alt6 = dfa6.predict(input);
            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
            	    	    {
            	    	    // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
            	    	    // InternalAsl.g:206:6: lv_belief_6_0= ruleBelief
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_belief_6_0=ruleBelief();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"belief",
            	    	      							lv_belief_6_0,
            	    	      							"jasonide.xtext.asl.Asl.Belief");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    // InternalAsl.g:223:4: ( (lv_directive_7_0= ruleDirective ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==19) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( (synpred7_InternalAsl()) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
            	    	    {
            	    	    // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
            	    	    // InternalAsl.g:225:6: lv_directive_7_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_directive_7_0=ruleDirective();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getAgentRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"directive",
            	    	      							lv_directive_7_0,
            	    	      							"jasonide.xtext.asl.Asl.Directive");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleDirective"
    // InternalAsl.g:247:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalAsl.g:247:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalAsl.g:248:2: iv_ruleDirective= ruleDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirective; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalAsl.g:254:1: ruleDirective returns [EObject current=null] : (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_tk_begin_1_0 = null;

        EObject lv_pred_2_0 = null;

        EObject lv_agent_4_0 = null;

        EObject lv_pred2_5_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:260:2: ( (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) ) )
            // InternalAsl.g:261:2: (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) )
            {
            // InternalAsl.g:261:2: (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) )
            // InternalAsl.g:262:3: otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalAsl.g:266:3: ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=19 && LA9_1<=20)||LA9_1==33||LA9_1==40) ) {
                    alt9=2;
                }
                else if ( ((LA9_1>=RULE_ATOMAPOST && LA9_1<=RULE_ATOM)||LA9_1==22||(LA9_1>=52 && LA9_1<=53)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_ATOMAPOST && LA9_0<=RULE_ATOM)||LA9_0==22||LA9_0==53) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAsl.g:267:4: ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) )
                    {
                    // InternalAsl.g:267:4: ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) )
                    // InternalAsl.g:268:5: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) )
                    {
                    // InternalAsl.g:268:5: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    // InternalAsl.g:269:6: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    {
                    // InternalAsl.g:269:6: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    // InternalAsl.g:270:7: lv_tk_begin_1_0= ruleTK_BEGIN
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDirectiveAccess().getTk_beginTK_BEGINParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_5);
                    lv_tk_begin_1_0=ruleTK_BEGIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      							}
                      							set(
                      								current,
                      								"tk_begin",
                      								lv_tk_begin_1_0,
                      								"jasonide.xtext.asl.Asl.TK_BEGIN");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAsl.g:287:5: ( (lv_pred_2_0= rulePred ) )
                    // InternalAsl.g:288:6: (lv_pred_2_0= rulePred )
                    {
                    // InternalAsl.g:288:6: (lv_pred_2_0= rulePred )
                    // InternalAsl.g:289:7: lv_pred_2_0= rulePred
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDirectiveAccess().getPredPredParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_6);
                    lv_pred_2_0=rulePred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      							}
                      							set(
                      								current,
                      								"pred",
                      								lv_pred_2_0,
                      								"jasonide.xtext.asl.Asl.Pred");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getRightCurlyBracketKeyword_1_0_2());
                      				
                    }
                    // InternalAsl.g:310:5: ( (lv_agent_4_0= ruleAgent ) )
                    // InternalAsl.g:311:6: (lv_agent_4_0= ruleAgent )
                    {
                    // InternalAsl.g:311:6: (lv_agent_4_0= ruleAgent )
                    // InternalAsl.g:312:7: lv_agent_4_0= ruleAgent
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDirectiveAccess().getAgentAgentParserRuleCall_1_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_agent_4_0=ruleAgent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      							}
                      							set(
                      								current,
                      								"agent",
                      								lv_agent_4_0,
                      								"jasonide.xtext.asl.Asl.Agent");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:331:4: ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' )
                    {
                    // InternalAsl.g:331:4: ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' )
                    // InternalAsl.g:332:5: ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}'
                    {
                    // InternalAsl.g:332:5: ( (lv_pred2_5_0= rulePred ) )
                    // InternalAsl.g:333:6: (lv_pred2_5_0= rulePred )
                    {
                    // InternalAsl.g:333:6: (lv_pred2_5_0= rulePred )
                    // InternalAsl.g:334:7: lv_pred2_5_0= rulePred
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDirectiveAccess().getPred2PredParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_6);
                    lv_pred2_5_0=rulePred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDirectiveRule());
                      							}
                      							set(
                      								current,
                      								"pred2",
                      								lv_pred2_5_0,
                      								"jasonide.xtext.asl.Asl.Pred");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDirectiveAccess().getRightCurlyBracketKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleBelief"
    // InternalAsl.g:361:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // InternalAsl.g:361:47: (iv_ruleBelief= ruleBelief EOF )
            // InternalAsl.g:362:2: iv_ruleBelief= ruleBelief EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeliefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBelief=ruleBelief();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBelief; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // InternalAsl.g:368:1: ruleBelief returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_literal_0_0 = null;

        EObject lv_log_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:374:2: ( ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' ) )
            // InternalAsl.g:375:2: ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' )
            {
            // InternalAsl.g:375:2: ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' )
            // InternalAsl.g:376:3: ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.'
            {
            // InternalAsl.g:376:3: ( (lv_literal_0_0= ruleLiteral ) )
            // InternalAsl.g:377:4: (lv_literal_0_0= ruleLiteral )
            {
            // InternalAsl.g:377:4: (lv_literal_0_0= ruleLiteral )
            // InternalAsl.g:378:5: lv_literal_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBeliefAccess().getLiteralLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_literal_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBeliefRule());
              					}
              					set(
              						current,
              						"literal",
              						lv_literal_0_0,
              						"jasonide.xtext.asl.Asl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:395:3: (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAsl.g:396:4: otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBeliefAccess().getColonHyphenMinusKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:400:4: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // InternalAsl.g:401:5: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // InternalAsl.g:401:5: (lv_log_expr_2_0= ruleLog_expr )
                    // InternalAsl.g:402:6: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBeliefAccess().getLog_exprLog_exprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_log_expr_2_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBeliefRule());
                      						}
                      						set(
                      							current,
                      							"log_expr",
                      							lv_log_expr_2_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBeliefAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleInitial_goal"
    // InternalAsl.g:428:1: entryRuleInitial_goal returns [EObject current=null] : iv_ruleInitial_goal= ruleInitial_goal EOF ;
    public final EObject entryRuleInitial_goal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial_goal = null;


        try {
            // InternalAsl.g:428:53: (iv_ruleInitial_goal= ruleInitial_goal EOF )
            // InternalAsl.g:429:2: iv_ruleInitial_goal= ruleInitial_goal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitial_goalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitial_goal=ruleInitial_goal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitial_goal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial_goal"


    // $ANTLR start "ruleInitial_goal"
    // InternalAsl.g:435:1: ruleInitial_goal returns [EObject current=null] : (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' ) ;
    public final EObject ruleInitial_goal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:441:2: ( (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' ) )
            // InternalAsl.g:442:2: (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' )
            {
            // InternalAsl.g:442:2: (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' )
            // InternalAsl.g:443:3: otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitial_goalAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalAsl.g:447:3: ( (lv_literal_1_0= ruleLiteral ) )
            // InternalAsl.g:448:4: (lv_literal_1_0= ruleLiteral )
            {
            // InternalAsl.g:448:4: (lv_literal_1_0= ruleLiteral )
            // InternalAsl.g:449:5: lv_literal_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitial_goalAccess().getLiteralLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_literal_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitial_goalRule());
              					}
              					set(
              						current,
              						"literal",
              						lv_literal_1_0,
              						"jasonide.xtext.asl.Asl.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInitial_goalAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial_goal"


    // $ANTLR start "entryRulePlan"
    // InternalAsl.g:474:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // InternalAsl.g:474:45: (iv_rulePlan= rulePlan EOF )
            // InternalAsl.g:475:2: iv_rulePlan= rulePlan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlan=rulePlan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // InternalAsl.g:481:1: rulePlan returns [EObject current=null] : ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )? ( (lv_trigger_3_0= ruleTrigger ) ) (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )? (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )? otherlv_8= '.' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token lv_tk_label_at_0_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_literal_1_0 = null;

        EObject lv_list_2_0 = null;

        EObject lv_trigger_3_0 = null;

        EObject lv_log_expr_5_0 = null;

        EObject lv_plan_body_7_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:487:2: ( ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )? ( (lv_trigger_3_0= ruleTrigger ) ) (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )? (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )? otherlv_8= '.' ) )
            // InternalAsl.g:488:2: ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )? ( (lv_trigger_3_0= ruleTrigger ) ) (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )? (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )? otherlv_8= '.' )
            {
            // InternalAsl.g:488:2: ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )? ( (lv_trigger_3_0= ruleTrigger ) ) (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )? (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )? otherlv_8= '.' )
            // InternalAsl.g:489:3: ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )? ( (lv_trigger_3_0= ruleTrigger ) ) (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )? (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )? otherlv_8= '.'
            {
            // InternalAsl.g:489:3: ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_TK_LABEL_AT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAsl.g:490:4: ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) )
                    {
                    // InternalAsl.g:490:4: ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) )
                    // InternalAsl.g:491:5: (lv_tk_label_at_0_0= RULE_TK_LABEL_AT )
                    {
                    // InternalAsl.g:491:5: (lv_tk_label_at_0_0= RULE_TK_LABEL_AT )
                    // InternalAsl.g:492:6: lv_tk_label_at_0_0= RULE_TK_LABEL_AT
                    {
                    lv_tk_label_at_0_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_tk_label_at_0_0, grammarAccess.getPlanAccess().getTk_label_atTK_LABEL_ATTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPlanRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"tk_label_at",
                      							lv_tk_label_at_0_0,
                      							"jasonide.xtext.asl.Asl.TK_LABEL_AT");
                      					
                    }

                    }


                    }

                    // InternalAsl.g:508:4: ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_list_2_0= ruleList ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=RULE_TK_NEG && LA11_0<=RULE_UNNAMEDVART)||(LA11_0>=RULE_ATOMAPOST && LA11_0<=RULE_ATOM)||LA11_0==22||LA11_0==38||(LA11_0>=52 && LA11_0<=53)||(LA11_0>=62 && LA11_0<=63)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==40) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAsl.g:509:5: ( (lv_literal_1_0= ruleLiteral ) )
                            {
                            // InternalAsl.g:509:5: ( (lv_literal_1_0= ruleLiteral ) )
                            // InternalAsl.g:510:6: (lv_literal_1_0= ruleLiteral )
                            {
                            // InternalAsl.g:510:6: (lv_literal_1_0= ruleLiteral )
                            // InternalAsl.g:511:7: lv_literal_1_0= ruleLiteral
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPlanAccess().getLiteralLiteralParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_literal_1_0=ruleLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPlanRule());
                              							}
                              							set(
                              								current,
                              								"literal",
                              								lv_literal_1_0,
                              								"jasonide.xtext.asl.Asl.Literal");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAsl.g:529:5: ( (lv_list_2_0= ruleList ) )
                            {
                            // InternalAsl.g:529:5: ( (lv_list_2_0= ruleList ) )
                            // InternalAsl.g:530:6: (lv_list_2_0= ruleList )
                            {
                            // InternalAsl.g:530:6: (lv_list_2_0= ruleList )
                            // InternalAsl.g:531:7: lv_list_2_0= ruleList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPlanAccess().getListListParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_list_2_0=ruleList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPlanRule());
                              							}
                              							set(
                              								current,
                              								"list",
                              								lv_list_2_0,
                              								"jasonide.xtext.asl.Asl.List");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAsl.g:550:3: ( (lv_trigger_3_0= ruleTrigger ) )
            // InternalAsl.g:551:4: (lv_trigger_3_0= ruleTrigger )
            {
            // InternalAsl.g:551:4: (lv_trigger_3_0= ruleTrigger )
            // InternalAsl.g:552:5: lv_trigger_3_0= ruleTrigger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_trigger_3_0=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlanRule());
              					}
              					set(
              						current,
              						"trigger",
              						lv_trigger_3_0,
              						"jasonide.xtext.asl.Asl.Trigger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:569:3: (otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAsl.g:570:4: otherlv_4= ':' ( (lv_log_expr_5_0= ruleLog_expr ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPlanAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalAsl.g:574:4: ( (lv_log_expr_5_0= ruleLog_expr ) )
                    // InternalAsl.g:575:5: (lv_log_expr_5_0= ruleLog_expr )
                    {
                    // InternalAsl.g:575:5: (lv_log_expr_5_0= ruleLog_expr )
                    // InternalAsl.g:576:6: lv_log_expr_5_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlanAccess().getLog_exprLog_exprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_log_expr_5_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlanRule());
                      						}
                      						set(
                      							current,
                      							"log_expr",
                      							lv_log_expr_5_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:594:3: (otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAsl.g:595:4: otherlv_6= '<-' ( (lv_plan_body_7_0= rulePlan_body ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPlanAccess().getLessThanSignHyphenMinusKeyword_3_0());
                      			
                    }
                    // InternalAsl.g:599:4: ( (lv_plan_body_7_0= rulePlan_body ) )
                    // InternalAsl.g:600:5: (lv_plan_body_7_0= rulePlan_body )
                    {
                    // InternalAsl.g:600:5: (lv_plan_body_7_0= rulePlan_body )
                    // InternalAsl.g:601:6: lv_plan_body_7_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlanAccess().getPlan_bodyPlan_bodyParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_plan_body_7_0=rulePlan_body();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlanRule());
                      						}
                      						set(
                      							current,
                      							"plan_body",
                      							lv_plan_body_7_0,
                      							"jasonide.xtext.asl.Asl.Plan_body");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPlanAccess().getFullStopKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleTrigger"
    // InternalAsl.g:627:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalAsl.g:627:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalAsl.g:628:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalAsl.g:634:1: ruleTrigger returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_trigger_0_0 = null;

        EObject lv_literal_1_0 = null;

        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:640:2: ( ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) ) )
            // InternalAsl.g:641:2: ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) )
            {
            // InternalAsl.g:641:2: ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) )
            // InternalAsl.g:642:3: ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) )
            {
            // InternalAsl.g:642:3: ( (lv_trigger_0_0= ruleTriggerSymbol ) )
            // InternalAsl.g:643:4: (lv_trigger_0_0= ruleTriggerSymbol )
            {
            // InternalAsl.g:643:4: (lv_trigger_0_0= ruleTriggerSymbol )
            // InternalAsl.g:644:5: lv_trigger_0_0= ruleTriggerSymbol
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTriggerAccess().getTriggerTriggerSymbolParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_trigger_0_0=ruleTriggerSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTriggerRule());
              					}
              					set(
              						current,
              						"trigger",
              						lv_trigger_0_0,
              						"jasonide.xtext.asl.Asl.TriggerSymbol");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:661:3: ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case RULE_TK_NEG:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 22:
            case 38:
            case 52:
            case 53:
            case 62:
            case 63:
                {
                alt15=1;
                }
                break;
            case RULE_VART:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred15_InternalAsl()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNNAMEDVART:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred15_InternalAsl()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAsl.g:662:4: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // InternalAsl.g:662:4: ( (lv_literal_1_0= ruleLiteral ) )
                    // InternalAsl.g:663:5: (lv_literal_1_0= ruleLiteral )
                    {
                    // InternalAsl.g:663:5: (lv_literal_1_0= ruleLiteral )
                    // InternalAsl.g:664:6: lv_literal_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTriggerAccess().getLiteralLiteralParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTriggerRule());
                      						}
                      						set(
                      							current,
                      							"literal",
                      							lv_literal_1_0,
                      							"jasonide.xtext.asl.Asl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:682:4: ( (lv_var_2_0= ruleVar ) )
                    {
                    // InternalAsl.g:682:4: ( (lv_var_2_0= ruleVar ) )
                    // InternalAsl.g:683:5: (lv_var_2_0= ruleVar )
                    {
                    // InternalAsl.g:683:5: (lv_var_2_0= ruleVar )
                    // InternalAsl.g:684:6: lv_var_2_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTriggerAccess().getVarVarParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_var_2_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTriggerRule());
                      						}
                      						set(
                      							current,
                      							"var",
                      							lv_var_2_0,
                      							"jasonide.xtext.asl.Asl.Var");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTriggerSymbol"
    // InternalAsl.g:706:1: entryRuleTriggerSymbol returns [String current=null] : iv_ruleTriggerSymbol= ruleTriggerSymbol EOF ;
    public final String entryRuleTriggerSymbol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTriggerSymbol = null;


        try {
            // InternalAsl.g:706:53: (iv_ruleTriggerSymbol= ruleTriggerSymbol EOF )
            // InternalAsl.g:707:2: iv_ruleTriggerSymbol= ruleTriggerSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTriggerSymbol=ruleTriggerSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerSymbol"


    // $ANTLR start "ruleTriggerSymbol"
    // InternalAsl.g:713:1: ruleTriggerSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? ) ;
    public final AntlrDatatypeRuleToken ruleTriggerSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:719:2: ( ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? ) )
            // InternalAsl.g:720:2: ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? )
            {
            // InternalAsl.g:720:2: ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? )
            // InternalAsl.g:721:3: (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )?
            {
            // InternalAsl.g:721:3: (kw= '+' | kw= '-' | kw= '^' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAsl.g:722:4: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getPlusSignKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:728:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getHyphenMinusKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAsl.g:734:4: kw= '^'
                    {
                    kw=(Token)match(input,28,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getCircumflexAccentKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalAsl.g:740:3: (kw= '!' | kw= '?' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalAsl.g:741:4: kw= '!'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getExclamationMarkKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:747:4: kw= '?'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getQuestionMarkKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerSymbol"


    // $ANTLR start "entryRulePlan_body"
    // InternalAsl.g:757:1: entryRulePlan_body returns [EObject current=null] : iv_rulePlan_body= rulePlan_body EOF ;
    public final EObject entryRulePlan_body() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan_body = null;


        try {
            // InternalAsl.g:757:50: (iv_rulePlan_body= rulePlan_body EOF )
            // InternalAsl.g:758:2: iv_rulePlan_body= rulePlan_body EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_bodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlan_body=rulePlan_body();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body"


    // $ANTLR start "rulePlan_body"
    // InternalAsl.g:764:1: rulePlan_body returns [EObject current=null] : ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? ) ;
    public final EObject rulePlan_body() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_plan_body_term_0_0 = null;

        EObject lv_plan_body_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:770:2: ( ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? ) )
            // InternalAsl.g:771:2: ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? )
            {
            // InternalAsl.g:771:2: ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? )
            // InternalAsl.g:772:3: ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )?
            {
            // InternalAsl.g:772:3: ( (lv_plan_body_term_0_0= rulePlan_body_term ) )
            // InternalAsl.g:773:4: (lv_plan_body_term_0_0= rulePlan_body_term )
            {
            // InternalAsl.g:773:4: (lv_plan_body_term_0_0= rulePlan_body_term )
            // InternalAsl.g:774:5: lv_plan_body_term_0_0= rulePlan_body_term
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_body_termPlan_body_termParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_plan_body_term_0_0=rulePlan_body_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlan_bodyRule());
              					}
              					set(
              						current,
              						"plan_body_term",
              						lv_plan_body_term_0_0,
              						"jasonide.xtext.asl.Asl.Plan_body_term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:791:3: (otherlv_1= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAsl.g:792:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPlan_bodyAccess().getSemicolonKeyword_1());
                      			
                    }

                    }
                    break;

            }

            // InternalAsl.g:797:3: ( (lv_plan_body_2_0= rulePlan_body ) )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAsl.g:798:4: (lv_plan_body_2_0= rulePlan_body )
                    {
                    // InternalAsl.g:798:4: (lv_plan_body_2_0= rulePlan_body )
                    // InternalAsl.g:799:5: lv_plan_body_2_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_bodyPlan_bodyParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_body_2_0=rulePlan_body();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPlan_bodyRule());
                      					}
                      					set(
                      						current,
                      						"plan_body",
                      						lv_plan_body_2_0,
                      						"jasonide.xtext.asl.Asl.Plan_body");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan_body"


    // $ANTLR start "entryRulePlan_body_term"
    // InternalAsl.g:820:1: entryRulePlan_body_term returns [EObject current=null] : iv_rulePlan_body_term= rulePlan_body_term EOF ;
    public final EObject entryRulePlan_body_term() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan_body_term = null;


        try {
            // InternalAsl.g:820:55: (iv_rulePlan_body_term= rulePlan_body_term EOF )
            // InternalAsl.g:821:2: iv_rulePlan_body_term= rulePlan_body_term EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_body_termRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlan_body_term=rulePlan_body_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body_term; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body_term"


    // $ANTLR start "rulePlan_body_term"
    // InternalAsl.g:827:1: rulePlan_body_term returns [EObject current=null] : ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? ) ;
    public final EObject rulePlan_body_term() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_plan_body_factor_0_0 = null;

        EObject lv_plan_body_term_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:833:2: ( ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? ) )
            // InternalAsl.g:834:2: ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? )
            {
            // InternalAsl.g:834:2: ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? )
            // InternalAsl.g:835:3: ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )?
            {
            // InternalAsl.g:835:3: ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) )
            // InternalAsl.g:836:4: (lv_plan_body_factor_0_0= rulePlan_body_factor )
            {
            // InternalAsl.g:836:4: (lv_plan_body_factor_0_0= rulePlan_body_factor )
            // InternalAsl.g:837:5: lv_plan_body_factor_0_0= rulePlan_body_factor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPlan_body_termAccess().getPlan_body_factorPlan_body_factorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_plan_body_factor_0_0=rulePlan_body_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPlan_body_termRule());
              					}
              					set(
              						current,
              						"plan_body_factor",
              						lv_plan_body_factor_0_0,
              						"jasonide.xtext.asl.Asl.Plan_body_factor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:854:3: (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAsl.g:855:4: otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPlan_body_termAccess().getVerticalLineVerticalLineVerticalLineKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:859:4: ( (lv_plan_body_term_2_0= rulePlan_body_term ) )
                    // InternalAsl.g:860:5: (lv_plan_body_term_2_0= rulePlan_body_term )
                    {
                    // InternalAsl.g:860:5: (lv_plan_body_term_2_0= rulePlan_body_term )
                    // InternalAsl.g:861:6: lv_plan_body_term_2_0= rulePlan_body_term
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_termAccess().getPlan_body_termPlan_body_termParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_body_term_2_0=rulePlan_body_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_termRule());
                      						}
                      						set(
                      							current,
                      							"plan_body_term",
                      							lv_plan_body_term_2_0,
                      							"jasonide.xtext.asl.Asl.Plan_body_term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan_body_term"


    // $ANTLR start "entryRulePlan_body_factor"
    // InternalAsl.g:883:1: entryRulePlan_body_factor returns [EObject current=null] : iv_rulePlan_body_factor= rulePlan_body_factor EOF ;
    public final EObject entryRulePlan_body_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan_body_factor = null;


        try {
            // InternalAsl.g:883:57: (iv_rulePlan_body_factor= rulePlan_body_factor EOF )
            // InternalAsl.g:884:2: iv_rulePlan_body_factor= rulePlan_body_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_body_factorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlan_body_factor=rulePlan_body_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body_factor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body_factor"


    // $ANTLR start "rulePlan_body_factor"
    // InternalAsl.g:890:1: rulePlan_body_factor returns [EObject current=null] : ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? ) ;
    public final EObject rulePlan_body_factor() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_stmtIF_0_0 = null;

        EObject lv_stmtFOR_1_0 = null;

        EObject lv_stmtWHILE_2_0 = null;

        EObject lv_body_formula_3_0 = null;

        EObject lv_plan_body_factor_5_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:896:2: ( ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? ) )
            // InternalAsl.g:897:2: ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? )
            {
            // InternalAsl.g:897:2: ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? )
            // InternalAsl.g:898:3: ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )?
            {
            // InternalAsl.g:898:3: ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt21=1;
                }
                break;
            case 57:
                {
                alt21=2;
                }
                break;
            case 58:
                {
                alt21=3;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_STRINGT:
            case RULE_NUMBERT:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 19:
            case 22:
            case 23:
            case 26:
            case 27:
            case 29:
            case 33:
            case 35:
            case 38:
            case 52:
            case 53:
            case 59:
            case 62:
            case 63:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAsl.g:899:4: ( (lv_stmtIF_0_0= ruleStmtIF ) )
                    {
                    // InternalAsl.g:899:4: ( (lv_stmtIF_0_0= ruleStmtIF ) )
                    // InternalAsl.g:900:5: (lv_stmtIF_0_0= ruleStmtIF )
                    {
                    // InternalAsl.g:900:5: (lv_stmtIF_0_0= ruleStmtIF )
                    // InternalAsl.g:901:6: lv_stmtIF_0_0= ruleStmtIF
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtIFStmtIFParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_stmtIF_0_0=ruleStmtIF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_factorRule());
                      						}
                      						set(
                      							current,
                      							"stmtIF",
                      							lv_stmtIF_0_0,
                      							"jasonide.xtext.asl.Asl.StmtIF");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:919:4: ( (lv_stmtFOR_1_0= ruleStmtFOR ) )
                    {
                    // InternalAsl.g:919:4: ( (lv_stmtFOR_1_0= ruleStmtFOR ) )
                    // InternalAsl.g:920:5: (lv_stmtFOR_1_0= ruleStmtFOR )
                    {
                    // InternalAsl.g:920:5: (lv_stmtFOR_1_0= ruleStmtFOR )
                    // InternalAsl.g:921:6: lv_stmtFOR_1_0= ruleStmtFOR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtFORStmtFORParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_stmtFOR_1_0=ruleStmtFOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_factorRule());
                      						}
                      						set(
                      							current,
                      							"stmtFOR",
                      							lv_stmtFOR_1_0,
                      							"jasonide.xtext.asl.Asl.StmtFOR");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:939:4: ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) )
                    {
                    // InternalAsl.g:939:4: ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) )
                    // InternalAsl.g:940:5: (lv_stmtWHILE_2_0= ruleStmtWHILE )
                    {
                    // InternalAsl.g:940:5: (lv_stmtWHILE_2_0= ruleStmtWHILE )
                    // InternalAsl.g:941:6: lv_stmtWHILE_2_0= ruleStmtWHILE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtWHILEStmtWHILEParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_stmtWHILE_2_0=ruleStmtWHILE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_factorRule());
                      						}
                      						set(
                      							current,
                      							"stmtWHILE",
                      							lv_stmtWHILE_2_0,
                      							"jasonide.xtext.asl.Asl.StmtWHILE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAsl.g:959:4: ( (lv_body_formula_3_0= ruleBody_formula ) )
                    {
                    // InternalAsl.g:959:4: ( (lv_body_formula_3_0= ruleBody_formula ) )
                    // InternalAsl.g:960:5: (lv_body_formula_3_0= ruleBody_formula )
                    {
                    // InternalAsl.g:960:5: (lv_body_formula_3_0= ruleBody_formula )
                    // InternalAsl.g:961:6: lv_body_formula_3_0= ruleBody_formula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_factorAccess().getBody_formulaBody_formulaParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_body_formula_3_0=ruleBody_formula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_factorRule());
                      						}
                      						set(
                      							current,
                      							"body_formula",
                      							lv_body_formula_3_0,
                      							"jasonide.xtext.asl.Asl.Body_formula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:979:3: (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAsl.g:980:4: otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPlan_body_factorAccess().getVerticalLineAmpersandVerticalLineKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:984:4: ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) )
                    // InternalAsl.g:985:5: (lv_plan_body_factor_5_0= rulePlan_body_factor )
                    {
                    // InternalAsl.g:985:5: (lv_plan_body_factor_5_0= rulePlan_body_factor )
                    // InternalAsl.g:986:6: lv_plan_body_factor_5_0= rulePlan_body_factor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_body_factorAccess().getPlan_body_factorPlan_body_factorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_body_factor_5_0=rulePlan_body_factor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_body_factorRule());
                      						}
                      						set(
                      							current,
                      							"plan_body_factor",
                      							lv_plan_body_factor_5_0,
                      							"jasonide.xtext.asl.Asl.Plan_body_factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan_body_factor"


    // $ANTLR start "entryRuleStmtIF"
    // InternalAsl.g:1008:1: entryRuleStmtIF returns [EObject current=null] : iv_ruleStmtIF= ruleStmtIF EOF ;
    public final EObject entryRuleStmtIF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtIF = null;


        try {
            // InternalAsl.g:1008:47: (iv_ruleStmtIF= ruleStmtIF EOF )
            // InternalAsl.g:1009:2: iv_ruleStmtIF= ruleStmtIF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtIFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtIF=ruleStmtIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtIF; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtIF"


    // $ANTLR start "ruleStmtIF"
    // InternalAsl.g:1015:1: ruleStmtIF returns [EObject current=null] : ( ( (lv_tk_if_0_0= ruleTK_IF ) ) ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) ) ) ;
    public final EObject ruleStmtIF() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tk_if_0_0 = null;

        EObject lv_stmtIFCommon_1_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1021:2: ( ( ( (lv_tk_if_0_0= ruleTK_IF ) ) ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) ) ) )
            // InternalAsl.g:1022:2: ( ( (lv_tk_if_0_0= ruleTK_IF ) ) ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) ) )
            {
            // InternalAsl.g:1022:2: ( ( (lv_tk_if_0_0= ruleTK_IF ) ) ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) ) )
            // InternalAsl.g:1023:3: ( (lv_tk_if_0_0= ruleTK_IF ) ) ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) )
            {
            // InternalAsl.g:1023:3: ( (lv_tk_if_0_0= ruleTK_IF ) )
            // InternalAsl.g:1024:4: (lv_tk_if_0_0= ruleTK_IF )
            {
            // InternalAsl.g:1024:4: (lv_tk_if_0_0= ruleTK_IF )
            // InternalAsl.g:1025:5: lv_tk_if_0_0= ruleTK_IF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtIFAccess().getTk_ifTK_IFParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_tk_if_0_0=ruleTK_IF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtIFRule());
              					}
              					set(
              						current,
              						"tk_if",
              						lv_tk_if_0_0,
              						"jasonide.xtext.asl.Asl.TK_IF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:1042:3: ( (lv_stmtIFCommon_1_0= ruleStmtIFCommon ) )
            // InternalAsl.g:1043:4: (lv_stmtIFCommon_1_0= ruleStmtIFCommon )
            {
            // InternalAsl.g:1043:4: (lv_stmtIFCommon_1_0= ruleStmtIFCommon )
            // InternalAsl.g:1044:5: lv_stmtIFCommon_1_0= ruleStmtIFCommon
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtIFAccess().getStmtIFCommonStmtIFCommonParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_stmtIFCommon_1_0=ruleStmtIFCommon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtIFRule());
              					}
              					set(
              						current,
              						"stmtIFCommon",
              						lv_stmtIFCommon_1_0,
              						"jasonide.xtext.asl.Asl.StmtIFCommon");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtIF"


    // $ANTLR start "entryRuleStmtIFCommon"
    // InternalAsl.g:1065:1: entryRuleStmtIFCommon returns [EObject current=null] : iv_ruleStmtIFCommon= ruleStmtIFCommon EOF ;
    public final EObject entryRuleStmtIFCommon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtIFCommon = null;


        try {
            // InternalAsl.g:1065:53: (iv_ruleStmtIFCommon= ruleStmtIFCommon EOF )
            // InternalAsl.g:1066:2: iv_ruleStmtIFCommon= ruleStmtIFCommon EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtIFCommonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtIFCommon=ruleStmtIFCommon();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtIFCommon; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtIFCommon"


    // $ANTLR start "ruleStmtIFCommon"
    // InternalAsl.g:1072:1: ruleStmtIFCommon returns [EObject current=null] : (otherlv_0= '(' ( (lv_log_expr_1_0= ruleLog_expr ) ) otherlv_2= ')' ( (lv_plan_term_3_0= rulePlan_term ) ) ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )? ) ;
    public final EObject ruleStmtIFCommon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_log_expr_1_0 = null;

        EObject lv_plan_term_3_0 = null;

        AntlrDatatypeRuleToken lv_tk_elif_4_0 = null;

        EObject lv_stmtIFCommon_5_0 = null;

        AntlrDatatypeRuleToken lv_tk_else_6_0 = null;

        EObject lv_plan_term2_7_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1078:2: ( (otherlv_0= '(' ( (lv_log_expr_1_0= ruleLog_expr ) ) otherlv_2= ')' ( (lv_plan_term_3_0= rulePlan_term ) ) ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )? ) )
            // InternalAsl.g:1079:2: (otherlv_0= '(' ( (lv_log_expr_1_0= ruleLog_expr ) ) otherlv_2= ')' ( (lv_plan_term_3_0= rulePlan_term ) ) ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )? )
            {
            // InternalAsl.g:1079:2: (otherlv_0= '(' ( (lv_log_expr_1_0= ruleLog_expr ) ) otherlv_2= ')' ( (lv_plan_term_3_0= rulePlan_term ) ) ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )? )
            // InternalAsl.g:1080:3: otherlv_0= '(' ( (lv_log_expr_1_0= ruleLog_expr ) ) otherlv_2= ')' ( (lv_plan_term_3_0= rulePlan_term ) ) ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStmtIFCommonAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAsl.g:1084:3: ( (lv_log_expr_1_0= ruleLog_expr ) )
            // InternalAsl.g:1085:4: (lv_log_expr_1_0= ruleLog_expr )
            {
            // InternalAsl.g:1085:4: (lv_log_expr_1_0= ruleLog_expr )
            // InternalAsl.g:1086:5: lv_log_expr_1_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtIFCommonAccess().getLog_exprLog_exprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_log_expr_1_0=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
              					}
              					set(
              						current,
              						"log_expr",
              						lv_log_expr_1_0,
              						"jasonide.xtext.asl.Asl.Log_expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStmtIFCommonAccess().getRightParenthesisKeyword_2());
              		
            }
            // InternalAsl.g:1107:3: ( (lv_plan_term_3_0= rulePlan_term ) )
            // InternalAsl.g:1108:4: (lv_plan_term_3_0= rulePlan_term )
            {
            // InternalAsl.g:1108:4: (lv_plan_term_3_0= rulePlan_term )
            // InternalAsl.g:1109:5: lv_plan_term_3_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtIFCommonAccess().getPlan_termPlan_termParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_plan_term_3_0=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
              					}
              					set(
              						current,
              						"plan_term",
              						lv_plan_term_3_0,
              						"jasonide.xtext.asl.Asl.Plan_term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:1126:3: ( ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) ) | ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==56) ) {
                alt23=1;
            }
            else if ( (LA23_0==55) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // InternalAsl.g:1127:4: ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) )
                    {
                    // InternalAsl.g:1127:4: ( ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) ) )
                    // InternalAsl.g:1128:5: ( (lv_tk_elif_4_0= ruleTK_ELIF ) ) ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) )
                    {
                    // InternalAsl.g:1128:5: ( (lv_tk_elif_4_0= ruleTK_ELIF ) )
                    // InternalAsl.g:1129:6: (lv_tk_elif_4_0= ruleTK_ELIF )
                    {
                    // InternalAsl.g:1129:6: (lv_tk_elif_4_0= ruleTK_ELIF )
                    // InternalAsl.g:1130:7: lv_tk_elif_4_0= ruleTK_ELIF
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStmtIFCommonAccess().getTk_elifTK_ELIFParserRuleCall_4_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_tk_elif_4_0=ruleTK_ELIF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
                      							}
                      							set(
                      								current,
                      								"tk_elif",
                      								lv_tk_elif_4_0,
                      								"jasonide.xtext.asl.Asl.TK_ELIF");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAsl.g:1147:5: ( (lv_stmtIFCommon_5_0= ruleStmtIFCommon ) )
                    // InternalAsl.g:1148:6: (lv_stmtIFCommon_5_0= ruleStmtIFCommon )
                    {
                    // InternalAsl.g:1148:6: (lv_stmtIFCommon_5_0= ruleStmtIFCommon )
                    // InternalAsl.g:1149:7: lv_stmtIFCommon_5_0= ruleStmtIFCommon
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStmtIFCommonAccess().getStmtIFCommonStmtIFCommonParserRuleCall_4_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_stmtIFCommon_5_0=ruleStmtIFCommon();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
                      							}
                      							set(
                      								current,
                      								"stmtIFCommon",
                      								lv_stmtIFCommon_5_0,
                      								"jasonide.xtext.asl.Asl.StmtIFCommon");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:1168:4: ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) )
                    {
                    // InternalAsl.g:1168:4: ( ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) ) )
                    // InternalAsl.g:1169:5: ( (lv_tk_else_6_0= ruleTK_ELSE ) ) ( (lv_plan_term2_7_0= rulePlan_term ) )
                    {
                    // InternalAsl.g:1169:5: ( (lv_tk_else_6_0= ruleTK_ELSE ) )
                    // InternalAsl.g:1170:6: (lv_tk_else_6_0= ruleTK_ELSE )
                    {
                    // InternalAsl.g:1170:6: (lv_tk_else_6_0= ruleTK_ELSE )
                    // InternalAsl.g:1171:7: lv_tk_else_6_0= ruleTK_ELSE
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStmtIFCommonAccess().getTk_elseTK_ELSEParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_23);
                    lv_tk_else_6_0=ruleTK_ELSE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
                      							}
                      							set(
                      								current,
                      								"tk_else",
                      								lv_tk_else_6_0,
                      								"jasonide.xtext.asl.Asl.TK_ELSE");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalAsl.g:1188:5: ( (lv_plan_term2_7_0= rulePlan_term ) )
                    // InternalAsl.g:1189:6: (lv_plan_term2_7_0= rulePlan_term )
                    {
                    // InternalAsl.g:1189:6: (lv_plan_term2_7_0= rulePlan_term )
                    // InternalAsl.g:1190:7: lv_plan_term2_7_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getStmtIFCommonAccess().getPlan_term2Plan_termParserRuleCall_4_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_term2_7_0=rulePlan_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getStmtIFCommonRule());
                      							}
                      							set(
                      								current,
                      								"plan_term2",
                      								lv_plan_term2_7_0,
                      								"jasonide.xtext.asl.Asl.Plan_term");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtIFCommon"


    // $ANTLR start "entryRuleStmtFOR"
    // InternalAsl.g:1213:1: entryRuleStmtFOR returns [EObject current=null] : iv_ruleStmtFOR= ruleStmtFOR EOF ;
    public final EObject entryRuleStmtFOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtFOR = null;


        try {
            // InternalAsl.g:1213:48: (iv_ruleStmtFOR= ruleStmtFOR EOF )
            // InternalAsl.g:1214:2: iv_ruleStmtFOR= ruleStmtFOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtFORRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtFOR=ruleStmtFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtFOR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtFOR"


    // $ANTLR start "ruleStmtFOR"
    // InternalAsl.g:1220:1: ruleStmtFOR returns [EObject current=null] : ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) ;
    public final EObject ruleStmtFOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tk_for_0_0 = null;

        EObject lv_log_expr_2_0 = null;

        EObject lv_plan_term_4_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1226:2: ( ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) )
            // InternalAsl.g:1227:2: ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            {
            // InternalAsl.g:1227:2: ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            // InternalAsl.g:1228:3: ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) )
            {
            // InternalAsl.g:1228:3: ( (lv_tk_for_0_0= ruleTK_FOR ) )
            // InternalAsl.g:1229:4: (lv_tk_for_0_0= ruleTK_FOR )
            {
            // InternalAsl.g:1229:4: (lv_tk_for_0_0= ruleTK_FOR )
            // InternalAsl.g:1230:5: lv_tk_for_0_0= ruleTK_FOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtFORAccess().getTk_forTK_FORParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_tk_for_0_0=ruleTK_FOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtFORRule());
              					}
              					set(
              						current,
              						"tk_for",
              						lv_tk_for_0_0,
              						"jasonide.xtext.asl.Asl.TK_FOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStmtFORAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAsl.g:1251:3: ( (lv_log_expr_2_0= ruleLog_expr ) )
            // InternalAsl.g:1252:4: (lv_log_expr_2_0= ruleLog_expr )
            {
            // InternalAsl.g:1252:4: (lv_log_expr_2_0= ruleLog_expr )
            // InternalAsl.g:1253:5: lv_log_expr_2_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtFORAccess().getLog_exprLog_exprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_log_expr_2_0=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtFORRule());
              					}
              					set(
              						current,
              						"log_expr",
              						lv_log_expr_2_0,
              						"jasonide.xtext.asl.Asl.Log_expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStmtFORAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAsl.g:1274:3: ( (lv_plan_term_4_0= rulePlan_term ) )
            // InternalAsl.g:1275:4: (lv_plan_term_4_0= rulePlan_term )
            {
            // InternalAsl.g:1275:4: (lv_plan_term_4_0= rulePlan_term )
            // InternalAsl.g:1276:5: lv_plan_term_4_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtFORAccess().getPlan_termPlan_termParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_plan_term_4_0=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtFORRule());
              					}
              					set(
              						current,
              						"plan_term",
              						lv_plan_term_4_0,
              						"jasonide.xtext.asl.Asl.Plan_term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtFOR"


    // $ANTLR start "entryRuleStmtWHILE"
    // InternalAsl.g:1297:1: entryRuleStmtWHILE returns [EObject current=null] : iv_ruleStmtWHILE= ruleStmtWHILE EOF ;
    public final EObject entryRuleStmtWHILE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtWHILE = null;


        try {
            // InternalAsl.g:1297:50: (iv_ruleStmtWHILE= ruleStmtWHILE EOF )
            // InternalAsl.g:1298:2: iv_ruleStmtWHILE= ruleStmtWHILE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtWHILERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtWHILE=ruleStmtWHILE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtWHILE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtWHILE"


    // $ANTLR start "ruleStmtWHILE"
    // InternalAsl.g:1304:1: ruleStmtWHILE returns [EObject current=null] : ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) ;
    public final EObject ruleStmtWHILE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tk_while_0_0 = null;

        EObject lv_log_expr_2_0 = null;

        EObject lv_plan_term_4_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1310:2: ( ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) )
            // InternalAsl.g:1311:2: ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            {
            // InternalAsl.g:1311:2: ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            // InternalAsl.g:1312:3: ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) )
            {
            // InternalAsl.g:1312:3: ( (lv_tk_while_0_0= ruleTK_WHILE ) )
            // InternalAsl.g:1313:4: (lv_tk_while_0_0= ruleTK_WHILE )
            {
            // InternalAsl.g:1313:4: (lv_tk_while_0_0= ruleTK_WHILE )
            // InternalAsl.g:1314:5: lv_tk_while_0_0= ruleTK_WHILE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtWHILEAccess().getTk_whileTK_WHILEParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_tk_while_0_0=ruleTK_WHILE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtWHILERule());
              					}
              					set(
              						current,
              						"tk_while",
              						lv_tk_while_0_0,
              						"jasonide.xtext.asl.Asl.TK_WHILE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStmtWHILEAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAsl.g:1335:3: ( (lv_log_expr_2_0= ruleLog_expr ) )
            // InternalAsl.g:1336:4: (lv_log_expr_2_0= ruleLog_expr )
            {
            // InternalAsl.g:1336:4: (lv_log_expr_2_0= ruleLog_expr )
            // InternalAsl.g:1337:5: lv_log_expr_2_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtWHILEAccess().getLog_exprLog_exprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_log_expr_2_0=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtWHILERule());
              					}
              					set(
              						current,
              						"log_expr",
              						lv_log_expr_2_0,
              						"jasonide.xtext.asl.Asl.Log_expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStmtWHILEAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAsl.g:1358:3: ( (lv_plan_term_4_0= rulePlan_term ) )
            // InternalAsl.g:1359:4: (lv_plan_term_4_0= rulePlan_term )
            {
            // InternalAsl.g:1359:4: (lv_plan_term_4_0= rulePlan_term )
            // InternalAsl.g:1360:5: lv_plan_term_4_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStmtWHILEAccess().getPlan_termPlan_termParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_plan_term_4_0=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStmtWHILERule());
              					}
              					set(
              						current,
              						"plan_term",
              						lv_plan_term_4_0,
              						"jasonide.xtext.asl.Asl.Plan_term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtWHILE"


    // $ANTLR start "entryRuleBody_formula"
    // InternalAsl.g:1381:1: entryRuleBody_formula returns [EObject current=null] : iv_ruleBody_formula= ruleBody_formula EOF ;
    public final EObject entryRuleBody_formula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody_formula = null;


        try {
            // InternalAsl.g:1381:53: (iv_ruleBody_formula= ruleBody_formula EOF )
            // InternalAsl.g:1382:2: iv_ruleBody_formula= ruleBody_formula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBody_formulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBody_formula=ruleBody_formula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody_formula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody_formula"


    // $ANTLR start "ruleBody_formula"
    // InternalAsl.g:1388:1: ruleBody_formula returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) ) ;
    public final EObject ruleBody_formula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_plan_term_9_0 = null;

        EObject lv_log_expr_10_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1394:2: ( ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) ) )
            // InternalAsl.g:1395:2: ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) )
            {
            // InternalAsl.g:1395:2: ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) )
            // InternalAsl.g:1396:3: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) )
            {
            // InternalAsl.g:1396:3: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )?
            int alt26=6;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalAsl.g:1397:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getBody_formulaAccess().getExclamationMarkKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:1402:4: otherlv_1= '!!'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getBody_formulaAccess().getExclamationMarkExclamationMarkKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalAsl.g:1407:4: otherlv_2= '?'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBody_formulaAccess().getQuestionMarkKeyword_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalAsl.g:1412:4: (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? )
                    {
                    // InternalAsl.g:1412:4: (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? )
                    // InternalAsl.g:1413:5: otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )?
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getBody_formulaAccess().getPlusSignKeyword_0_3_0());
                      				
                    }
                    // InternalAsl.g:1417:5: (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )?
                    int alt24=4;
                    switch ( input.LA(1) ) {
                        case 26:
                            {
                            alt24=1;
                            }
                            break;
                        case 36:
                            {
                            alt24=2;
                            }
                            break;
                        case 37:
                            {
                            alt24=3;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalAsl.g:1418:6: otherlv_4= '+'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getBody_formulaAccess().getPlusSignKeyword_0_3_1_0());
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalAsl.g:1423:6: otherlv_5= '>'
                            {
                            otherlv_5=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getBody_formulaAccess().getGreaterThanSignKeyword_0_3_1_1());
                              					
                            }

                            }
                            break;
                        case 3 :
                            // InternalAsl.g:1428:6: otherlv_6= '<'
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getBody_formulaAccess().getLessThanSignKeyword_0_3_1_2());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAsl.g:1435:4: (otherlv_7= '-' (otherlv_8= '+' )? )
                    {
                    // InternalAsl.g:1435:4: (otherlv_7= '-' (otherlv_8= '+' )? )
                    // InternalAsl.g:1436:5: otherlv_7= '-' (otherlv_8= '+' )?
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getBody_formulaAccess().getHyphenMinusKeyword_0_4_0());
                      				
                    }
                    // InternalAsl.g:1440:5: (otherlv_8= '+' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==26) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAsl.g:1441:6: otherlv_8= '+'
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_25); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getBody_formulaAccess().getPlusSignKeyword_0_4_1());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:1448:3: ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_TK_NEG && LA27_0<=RULE_ATOM)||LA27_0==22||LA27_0==27||LA27_0==33||LA27_0==38||(LA27_0>=52 && LA27_0<=53)||LA27_0==59||(LA27_0>=62 && LA27_0<=63)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAsl.g:1449:4: ( (lv_plan_term_9_0= rulePlan_term ) )
                    {
                    // InternalAsl.g:1449:4: ( (lv_plan_term_9_0= rulePlan_term ) )
                    // InternalAsl.g:1450:5: (lv_plan_term_9_0= rulePlan_term )
                    {
                    // InternalAsl.g:1450:5: (lv_plan_term_9_0= rulePlan_term )
                    // InternalAsl.g:1451:6: lv_plan_term_9_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBody_formulaAccess().getPlan_termPlan_termParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_term_9_0=rulePlan_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBody_formulaRule());
                      						}
                      						set(
                      							current,
                      							"plan_term",
                      							lv_plan_term_9_0,
                      							"jasonide.xtext.asl.Asl.Plan_term");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:1469:4: ( (lv_log_expr_10_0= ruleLog_expr ) )
                    {
                    // InternalAsl.g:1469:4: ( (lv_log_expr_10_0= ruleLog_expr ) )
                    // InternalAsl.g:1470:5: (lv_log_expr_10_0= ruleLog_expr )
                    {
                    // InternalAsl.g:1470:5: (lv_log_expr_10_0= ruleLog_expr )
                    // InternalAsl.g:1471:6: lv_log_expr_10_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBody_formulaAccess().getLog_exprLog_exprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_log_expr_10_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBody_formulaRule());
                      						}
                      						set(
                      							current,
                      							"log_expr",
                      							lv_log_expr_10_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody_formula"


    // $ANTLR start "entryRulePlan_term"
    // InternalAsl.g:1493:1: entryRulePlan_term returns [EObject current=null] : iv_rulePlan_term= rulePlan_term EOF ;
    public final EObject entryRulePlan_term() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan_term = null;


        try {
            // InternalAsl.g:1493:50: (iv_rulePlan_term= rulePlan_term EOF )
            // InternalAsl.g:1494:2: iv_rulePlan_term= rulePlan_term EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_termRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlan_term=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_term; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_term"


    // $ANTLR start "rulePlan_term"
    // InternalAsl.g:1500:1: rulePlan_term returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' ) ;
    public final EObject rulePlan_term() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_tk_label_at_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_pred_3_0 = null;

        EObject lv_trigger_4_0 = null;

        EObject lv_log_expr_6_0 = null;

        EObject lv_literal_9_0 = null;

        EObject lv_log_expr2_11_0 = null;

        EObject lv_plan_body_12_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1506:2: ( ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' ) )
            // InternalAsl.g:1507:2: ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' )
            {
            // InternalAsl.g:1507:2: ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' )
            // InternalAsl.g:1508:3: () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}'
            {
            // InternalAsl.g:1508:3: ()
            // InternalAsl.g:1509:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPlan_termAccess().getPlan_termAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPlan_termAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAsl.g:1522:3: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalAsl.g:1523:4: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )?
                    {
                    // InternalAsl.g:1523:4: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_TK_LABEL_AT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAsl.g:1524:5: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) )
                            {
                            // InternalAsl.g:1524:5: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) )
                            // InternalAsl.g:1525:6: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                            {
                            // InternalAsl.g:1525:6: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                            // InternalAsl.g:1526:7: lv_tk_label_at_2_0= RULE_TK_LABEL_AT
                            {
                            lv_tk_label_at_2_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_tk_label_at_2_0, grammarAccess.getPlan_termAccess().getTk_label_atTK_LABEL_ATTerminalRuleCall_2_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPlan_termRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"tk_label_at",
                              								lv_tk_label_at_2_0,
                              								"jasonide.xtext.asl.Asl.TK_LABEL_AT");
                              						
                            }

                            }


                            }

                            // InternalAsl.g:1542:5: ( (lv_pred_3_0= rulePred ) )
                            // InternalAsl.g:1543:6: (lv_pred_3_0= rulePred )
                            {
                            // InternalAsl.g:1543:6: (lv_pred_3_0= rulePred )
                            // InternalAsl.g:1544:7: lv_pred_3_0= rulePred
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPlan_termAccess().getPredPredParserRuleCall_2_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_12);
                            lv_pred_3_0=rulePred();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPlan_termRule());
                              							}
                              							set(
                              								current,
                              								"pred",
                              								lv_pred_3_0,
                              								"jasonide.xtext.asl.Asl.Pred");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAsl.g:1562:4: ( (lv_trigger_4_0= ruleTrigger ) )
                    // InternalAsl.g:1563:5: (lv_trigger_4_0= ruleTrigger )
                    {
                    // InternalAsl.g:1563:5: (lv_trigger_4_0= ruleTrigger )
                    // InternalAsl.g:1564:6: lv_trigger_4_0= ruleTrigger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_termAccess().getTriggerTriggerParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_trigger_4_0=ruleTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_termRule());
                      						}
                      						set(
                      							current,
                      							"trigger",
                      							lv_trigger_4_0,
                      							"jasonide.xtext.asl.Asl.Trigger");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:1581:4: (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==24) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalAsl.g:1582:5: otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) )
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getPlan_termAccess().getColonKeyword_2_2_0());
                              				
                            }
                            // InternalAsl.g:1586:5: ( (lv_log_expr_6_0= ruleLog_expr ) )
                            // InternalAsl.g:1587:6: (lv_log_expr_6_0= ruleLog_expr )
                            {
                            // InternalAsl.g:1587:6: (lv_log_expr_6_0= ruleLog_expr )
                            // InternalAsl.g:1588:7: lv_log_expr_6_0= ruleLog_expr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPlan_termAccess().getLog_exprLog_exprParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_30);
                            lv_log_expr_6_0=ruleLog_expr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPlan_termRule());
                              							}
                              							set(
                              								current,
                              								"log_expr",
                              								lv_log_expr_6_0,
                              								"jasonide.xtext.asl.Asl.Log_expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAsl.g:1606:4: (otherlv_7= '<-' | otherlv_8= ';' )?
                    int alt30=3;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==25) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==30) ) {
                        alt30=2;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAsl.g:1607:5: otherlv_7= '<-'
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getPlan_termAccess().getLessThanSignHyphenMinusKeyword_2_3_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalAsl.g:1612:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,30,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getPlan_termAccess().getSemicolonKeyword_2_3_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAsl.g:1618:3: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAsl.g:1619:4: ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) )
                    {
                    // InternalAsl.g:1619:4: ( (lv_literal_9_0= ruleLiteral ) )
                    // InternalAsl.g:1620:5: (lv_literal_9_0= ruleLiteral )
                    {
                    // InternalAsl.g:1620:5: (lv_literal_9_0= ruleLiteral )
                    // InternalAsl.g:1621:6: lv_literal_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_termAccess().getLiteralLiteralParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_literal_9_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_termRule());
                      						}
                      						set(
                      							current,
                      							"literal",
                      							lv_literal_9_0,
                      							"jasonide.xtext.asl.Asl.Literal");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPlan_termAccess().getColonHyphenMinusKeyword_3_1());
                      			
                    }
                    // InternalAsl.g:1642:4: ( (lv_log_expr2_11_0= ruleLog_expr ) )
                    // InternalAsl.g:1643:5: (lv_log_expr2_11_0= ruleLog_expr )
                    {
                    // InternalAsl.g:1643:5: (lv_log_expr2_11_0= ruleLog_expr )
                    // InternalAsl.g:1644:6: lv_log_expr2_11_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPlan_termAccess().getLog_expr2Log_exprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_log_expr2_11_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPlan_termRule());
                      						}
                      						set(
                      							current,
                      							"log_expr2",
                      							lv_log_expr2_11_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:1662:3: ( (lv_plan_body_12_0= rulePlan_body ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_TK_NEG && LA33_0<=RULE_ATOM)||LA33_0==19||(LA33_0>=22 && LA33_0<=23)||(LA33_0>=26 && LA33_0<=27)||LA33_0==29||LA33_0==33||LA33_0==35||LA33_0==38||(LA33_0>=52 && LA33_0<=54)||(LA33_0>=57 && LA33_0<=59)||(LA33_0>=62 && LA33_0<=63)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAsl.g:1663:4: (lv_plan_body_12_0= rulePlan_body )
                    {
                    // InternalAsl.g:1663:4: (lv_plan_body_12_0= rulePlan_body )
                    // InternalAsl.g:1664:5: lv_plan_body_12_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPlan_termAccess().getPlan_bodyPlan_bodyParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_plan_body_12_0=rulePlan_body();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPlan_termRule());
                      					}
                      					set(
                      						current,
                      						"plan_body",
                      						lv_plan_body_12_0,
                      						"jasonide.xtext.asl.Asl.Plan_body");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getPlan_termAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlan_term"


    // $ANTLR start "entryRuleLiteral"
    // InternalAsl.g:1689:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAsl.g:1689:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAsl.g:1690:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAsl.g:1696:1: ruleLiteral returns [EObject current=null] : ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_tk_neg_3_0=null;
        AntlrDatatypeRuleToken lv_atom_0_0 = null;

        EObject lv_var_1_0 = null;

        EObject lv_pred_4_0 = null;

        EObject lv_var2_5_0 = null;

        AntlrDatatypeRuleToken lv_tk_true_6_0 = null;

        AntlrDatatypeRuleToken lv_tk_false_7_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1702:2: ( ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) ) )
            // InternalAsl.g:1703:2: ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) )
            {
            // InternalAsl.g:1703:2: ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 22:
            case 38:
            case 52:
            case 53:
                {
                alt38=1;
                }
                break;
            case 62:
                {
                alt38=2;
                }
                break;
            case 63:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAsl.g:1704:3: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) )
                    {
                    // InternalAsl.g:1704:3: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) )
                    // InternalAsl.g:1705:4: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) )
                    {
                    // InternalAsl.g:1705:4: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )?
                    int alt35=2;
                    switch ( input.LA(1) ) {
                        case 22:
                            {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_ATOM) ) {
                                int LA35_2 = input.LA(3);

                                if ( (synpred48_InternalAsl()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case RULE_ATOM:
                            {
                            int LA35_2 = input.LA(2);

                            if ( (synpred48_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case RULE_ATOMAPOST:
                            {
                            int LA35_3 = input.LA(2);

                            if ( (synpred48_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case RULE_VART:
                            {
                            int LA35_4 = input.LA(2);

                            if ( (synpred48_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case RULE_UNNAMEDVART:
                            {
                            int LA35_5 = input.LA(2);

                            if ( (synpred48_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case 38:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalAsl.g:1706:5: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::'
                            {
                            // InternalAsl.g:1706:5: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )?
                            int alt34=3;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=RULE_ATOMAPOST && LA34_0<=RULE_ATOM)||LA34_0==22) ) {
                                alt34=1;
                            }
                            else if ( ((LA34_0>=RULE_VART && LA34_0<=RULE_UNNAMEDVART)) ) {
                                alt34=2;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalAsl.g:1707:6: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                                    {
                                    // InternalAsl.g:1707:6: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                                    // InternalAsl.g:1708:7: (lv_atom_0_0= ruleJASON_ATOM )
                                    {
                                    // InternalAsl.g:1708:7: (lv_atom_0_0= ruleJASON_ATOM )
                                    // InternalAsl.g:1709:8: lv_atom_0_0= ruleJASON_ATOM
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getLiteralAccess().getAtomJASON_ATOMParserRuleCall_0_0_0_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_33);
                                    lv_atom_0_0=ruleJASON_ATOM();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getLiteralRule());
                                      								}
                                      								set(
                                      									current,
                                      									"atom",
                                      									lv_atom_0_0,
                                      									"jasonide.xtext.asl.Asl.JASON_ATOM");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAsl.g:1727:6: ( (lv_var_1_0= ruleVar ) )
                                    {
                                    // InternalAsl.g:1727:6: ( (lv_var_1_0= ruleVar ) )
                                    // InternalAsl.g:1728:7: (lv_var_1_0= ruleVar )
                                    {
                                    // InternalAsl.g:1728:7: (lv_var_1_0= ruleVar )
                                    // InternalAsl.g:1729:8: lv_var_1_0= ruleVar
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_0_0_0_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_33);
                                    lv_var_1_0=ruleVar();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getLiteralRule());
                                      								}
                                      								set(
                                      									current,
                                      									"var",
                                      									lv_var_1_0,
                                      									"jasonide.xtext.asl.Asl.Var");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_2=(Token)match(input,38,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getColonColonKeyword_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalAsl.g:1752:4: ( (lv_tk_neg_3_0= RULE_TK_NEG ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_TK_NEG) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAsl.g:1753:5: (lv_tk_neg_3_0= RULE_TK_NEG )
                            {
                            // InternalAsl.g:1753:5: (lv_tk_neg_3_0= RULE_TK_NEG )
                            // InternalAsl.g:1754:6: lv_tk_neg_3_0= RULE_TK_NEG
                            {
                            lv_tk_neg_3_0=(Token)match(input,RULE_TK_NEG,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_tk_neg_3_0, grammarAccess.getLiteralAccess().getTk_negTK_NEGTerminalRuleCall_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getLiteralRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"tk_neg",
                              							lv_tk_neg_3_0,
                              							"jasonide.xtext.asl.Asl.TK_NEG");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalAsl.g:1770:4: ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_ATOMAPOST && LA37_0<=RULE_ATOM)||LA37_0==22||(LA37_0>=52 && LA37_0<=53)) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_VART && LA37_0<=RULE_UNNAMEDVART)) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAsl.g:1771:5: ( (lv_pred_4_0= rulePred ) )
                            {
                            // InternalAsl.g:1771:5: ( (lv_pred_4_0= rulePred ) )
                            // InternalAsl.g:1772:6: (lv_pred_4_0= rulePred )
                            {
                            // InternalAsl.g:1772:6: (lv_pred_4_0= rulePred )
                            // InternalAsl.g:1773:7: lv_pred_4_0= rulePred
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLiteralAccess().getPredPredParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_pred_4_0=rulePred();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLiteralRule());
                              							}
                              							set(
                              								current,
                              								"pred",
                              								lv_pred_4_0,
                              								"jasonide.xtext.asl.Asl.Pred");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAsl.g:1791:5: ( (lv_var2_5_0= ruleVar ) )
                            {
                            // InternalAsl.g:1791:5: ( (lv_var2_5_0= ruleVar ) )
                            // InternalAsl.g:1792:6: (lv_var2_5_0= ruleVar )
                            {
                            // InternalAsl.g:1792:6: (lv_var2_5_0= ruleVar )
                            // InternalAsl.g:1793:7: lv_var2_5_0= ruleVar
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getLiteralAccess().getVar2VarParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_var2_5_0=ruleVar();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getLiteralRule());
                              							}
                              							set(
                              								current,
                              								"var2",
                              								lv_var2_5_0,
                              								"jasonide.xtext.asl.Asl.Var");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:1813:3: ( (lv_tk_true_6_0= ruleTK_TRUE ) )
                    {
                    // InternalAsl.g:1813:3: ( (lv_tk_true_6_0= ruleTK_TRUE ) )
                    // InternalAsl.g:1814:4: (lv_tk_true_6_0= ruleTK_TRUE )
                    {
                    // InternalAsl.g:1814:4: (lv_tk_true_6_0= ruleTK_TRUE )
                    // InternalAsl.g:1815:5: lv_tk_true_6_0= ruleTK_TRUE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getTk_trueTK_TRUEParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tk_true_6_0=ruleTK_TRUE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"tk_true",
                      						lv_tk_true_6_0,
                      						"jasonide.xtext.asl.Asl.TK_TRUE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:1833:3: ( (lv_tk_false_7_0= ruleTK_FALSE ) )
                    {
                    // InternalAsl.g:1833:3: ( (lv_tk_false_7_0= ruleTK_FALSE ) )
                    // InternalAsl.g:1834:4: (lv_tk_false_7_0= ruleTK_FALSE )
                    {
                    // InternalAsl.g:1834:4: (lv_tk_false_7_0= ruleTK_FALSE )
                    // InternalAsl.g:1835:5: lv_tk_false_7_0= ruleTK_FALSE
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralAccess().getTk_falseTK_FALSEParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_tk_false_7_0=ruleTK_FALSE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralRule());
                      					}
                      					set(
                      						current,
                      						"tk_false",
                      						lv_tk_false_7_0,
                      						"jasonide.xtext.asl.Asl.TK_FALSE");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePred"
    // InternalAsl.g:1856:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // InternalAsl.g:1856:45: (iv_rulePred= rulePred EOF )
            // InternalAsl.g:1857:2: iv_rulePred= rulePred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePred=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePred"


    // $ANTLR start "rulePred"
    // InternalAsl.g:1863:1: rulePred returns [EObject current=null] : ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_atom_0_0 = null;

        AntlrDatatypeRuleToken lv_tk_begin_1_0 = null;

        AntlrDatatypeRuleToken lv_tk_end_2_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_plan_term_6_0 = null;

        EObject lv_list_7_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:1869:2: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? ) )
            // InternalAsl.g:1870:2: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? )
            {
            // InternalAsl.g:1870:2: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? )
            // InternalAsl.g:1871:3: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )?
            {
            // InternalAsl.g:1871:3: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 22:
                {
                alt39=1;
                }
                break;
            case 52:
                {
                alt39=2;
                }
                break;
            case 53:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAsl.g:1872:4: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                    {
                    // InternalAsl.g:1872:4: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                    // InternalAsl.g:1873:5: (lv_atom_0_0= ruleJASON_ATOM )
                    {
                    // InternalAsl.g:1873:5: (lv_atom_0_0= ruleJASON_ATOM )
                    // InternalAsl.g:1874:6: lv_atom_0_0= ruleJASON_ATOM
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredAccess().getAtomJASON_ATOMParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_atom_0_0=ruleJASON_ATOM();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredRule());
                      						}
                      						set(
                      							current,
                      							"atom",
                      							lv_atom_0_0,
                      							"jasonide.xtext.asl.Asl.JASON_ATOM");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:1892:4: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    {
                    // InternalAsl.g:1892:4: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    // InternalAsl.g:1893:5: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    {
                    // InternalAsl.g:1893:5: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    // InternalAsl.g:1894:6: lv_tk_begin_1_0= ruleTK_BEGIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredAccess().getTk_beginTK_BEGINParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_tk_begin_1_0=ruleTK_BEGIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredRule());
                      						}
                      						set(
                      							current,
                      							"tk_begin",
                      							lv_tk_begin_1_0,
                      							"jasonide.xtext.asl.Asl.TK_BEGIN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:1912:4: ( (lv_tk_end_2_0= ruleTK_END ) )
                    {
                    // InternalAsl.g:1912:4: ( (lv_tk_end_2_0= ruleTK_END ) )
                    // InternalAsl.g:1913:5: (lv_tk_end_2_0= ruleTK_END )
                    {
                    // InternalAsl.g:1913:5: (lv_tk_end_2_0= ruleTK_END )
                    // InternalAsl.g:1914:6: lv_tk_end_2_0= ruleTK_END
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredAccess().getTk_endTK_ENDParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_tk_end_2_0=ruleTK_END();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredRule());
                      						}
                      						set(
                      							current,
                      							"tk_end",
                      							lv_tk_end_2_0,
                      							"jasonide.xtext.asl.Asl.TK_END");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:1932:3: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalAsl.g:1933:4: otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPredAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:1937:4: ( (lv_terms_4_0= ruleTerms ) )
                    // InternalAsl.g:1938:5: (lv_terms_4_0= ruleTerms )
                    {
                    // InternalAsl.g:1938:5: (lv_terms_4_0= ruleTerms )
                    // InternalAsl.g:1939:6: lv_terms_4_0= ruleTerms
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_terms_4_0=ruleTerms();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredRule());
                      						}
                      						set(
                      							current,
                      							"terms",
                      							lv_terms_4_0,
                      							"jasonide.xtext.asl.Asl.Terms");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPredAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalAsl.g:1961:3: ( (lv_plan_term_6_0= rulePlan_term ) )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalAsl.g:1962:4: (lv_plan_term_6_0= rulePlan_term )
            	    {
            	    // InternalAsl.g:1962:4: (lv_plan_term_6_0= rulePlan_term )
            	    // InternalAsl.g:1963:5: lv_plan_term_6_0= rulePlan_term
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPredAccess().getPlan_termPlan_termParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_plan_term_6_0=rulePlan_term();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPredRule());
            	      					}
            	      					add(
            	      						current,
            	      						"plan_term",
            	      						lv_plan_term_6_0,
            	      						"jasonide.xtext.asl.Asl.Plan_term");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalAsl.g:1980:3: ( (lv_list_7_0= ruleList ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAsl.g:1981:4: (lv_list_7_0= ruleList )
                    {
                    // InternalAsl.g:1981:4: (lv_list_7_0= ruleList )
                    // InternalAsl.g:1982:5: lv_list_7_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPredAccess().getListListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_7_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPredRule());
                      					}
                      					set(
                      						current,
                      						"list",
                      						lv_list_7_0,
                      						"jasonide.xtext.asl.Asl.List");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePred"


    // $ANTLR start "entryRuleTerms"
    // InternalAsl.g:2003:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // InternalAsl.g:2003:46: (iv_ruleTerms= ruleTerms EOF )
            // InternalAsl.g:2004:2: iv_ruleTerms= ruleTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerms=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerms; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // InternalAsl.g:2010:1: ruleTerms returns [EObject current=null] : ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2016:2: ( ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) )
            // InternalAsl.g:2017:2: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            {
            // InternalAsl.g:2017:2: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            // InternalAsl.g:2018:3: ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            {
            // InternalAsl.g:2018:3: ( (lv_term_0_0= ruleTerm ) )
            // InternalAsl.g:2019:4: (lv_term_0_0= ruleTerm )
            {
            // InternalAsl.g:2019:4: (lv_term_0_0= ruleTerm )
            // InternalAsl.g:2020:5: lv_term_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_39);
            lv_term_0_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermsRule());
              					}
              					add(
              						current,
              						"term",
              						lv_term_0_0,
              						"jasonide.xtext.asl.Asl.Term");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:2037:3: (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==39) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAsl.g:2038:4: otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalAsl.g:2042:4: ( (lv_term_2_0= ruleTerm ) )
            	    // InternalAsl.g:2043:5: (lv_term_2_0= ruleTerm )
            	    {
            	    // InternalAsl.g:2043:5: (lv_term_2_0= ruleTerm )
            	    // InternalAsl.g:2044:6: lv_term_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_term_2_0=ruleTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTermsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"term",
            	      							lv_term_2_0,
            	      							"jasonide.xtext.asl.Asl.Term");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // InternalAsl.g:2066:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalAsl.g:2066:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalAsl.g:2067:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalAsl.g:2073:1: ruleTerm returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_0 = null;

        EObject lv_plan_term_1_0 = null;

        EObject lv_log_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2079:2: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) ) )
            // InternalAsl.g:2080:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) )
            {
            // InternalAsl.g:2080:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt44=1;
                }
                break;
            case 19:
                {
                alt44=2;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_STRINGT:
            case RULE_NUMBERT:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 22:
            case 27:
            case 33:
            case 38:
            case 52:
            case 53:
            case 59:
            case 62:
            case 63:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAsl.g:2081:3: ( (lv_list_0_0= ruleList ) )
                    {
                    // InternalAsl.g:2081:3: ( (lv_list_0_0= ruleList ) )
                    // InternalAsl.g:2082:4: (lv_list_0_0= ruleList )
                    {
                    // InternalAsl.g:2082:4: (lv_list_0_0= ruleList )
                    // InternalAsl.g:2083:5: lv_list_0_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTermAccess().getListListParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_0_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTermRule());
                      					}
                      					set(
                      						current,
                      						"list",
                      						lv_list_0_0,
                      						"jasonide.xtext.asl.Asl.List");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:2101:3: ( (lv_plan_term_1_0= rulePlan_term ) )
                    {
                    // InternalAsl.g:2101:3: ( (lv_plan_term_1_0= rulePlan_term ) )
                    // InternalAsl.g:2102:4: (lv_plan_term_1_0= rulePlan_term )
                    {
                    // InternalAsl.g:2102:4: (lv_plan_term_1_0= rulePlan_term )
                    // InternalAsl.g:2103:5: lv_plan_term_1_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTermAccess().getPlan_termPlan_termParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_term_1_0=rulePlan_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTermRule());
                      					}
                      					set(
                      						current,
                      						"plan_term",
                      						lv_plan_term_1_0,
                      						"jasonide.xtext.asl.Asl.Plan_term");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:2121:3: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    // InternalAsl.g:2121:3: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // InternalAsl.g:2122:4: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // InternalAsl.g:2122:4: (lv_log_expr_2_0= ruleLog_expr )
                    // InternalAsl.g:2123:5: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTermAccess().getLog_exprLog_exprParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_log_expr_2_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTermRule());
                      					}
                      					set(
                      						current,
                      						"log_expr",
                      						lv_log_expr_2_0,
                      						"jasonide.xtext.asl.Asl.Log_expr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleList"
    // InternalAsl.g:2144:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalAsl.g:2144:45: (iv_ruleList= ruleList EOF )
            // InternalAsl.g:2145:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalAsl.g:2151:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_var_6_0=null;
        Token lv_unnamedvar_7_0=null;
        Token otherlv_9=null;
        EObject lv_term_in_list_2_0 = null;

        EObject lv_term_in_list_4_0 = null;

        EObject lv_list_8_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2157:2: ( ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) )
            // InternalAsl.g:2158:2: ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            {
            // InternalAsl.g:2158:2: ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            // InternalAsl.g:2159:3: () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']'
            {
            // InternalAsl.g:2159:3: ()
            // InternalAsl.g:2160:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getListAccess().getListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalAsl.g:2173:3: ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_TK_NEG && LA48_0<=RULE_ATOM)||LA48_0==19||LA48_0==22||LA48_0==27||LA48_0==33||LA48_0==38||LA48_0==40||(LA48_0>=52 && LA48_0<=53)||(LA48_0>=62 && LA48_0<=63)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAsl.g:2174:4: ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    {
                    // InternalAsl.g:2174:4: ( (lv_term_in_list_2_0= ruleTerm_in_list ) )
                    // InternalAsl.g:2175:5: (lv_term_in_list_2_0= ruleTerm_in_list )
                    {
                    // InternalAsl.g:2175:5: (lv_term_in_list_2_0= ruleTerm_in_list )
                    // InternalAsl.g:2176:6: lv_term_in_list_2_0= ruleTerm_in_list
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getListAccess().getTerm_in_listTerm_in_listParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_term_in_list_2_0=ruleTerm_in_list();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getListRule());
                      						}
                      						add(
                      							current,
                      							"term_in_list",
                      							lv_term_in_list_2_0,
                      							"jasonide.xtext.asl.Asl.Term_in_list");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:2193:4: (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==39) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalAsl.g:2194:5: otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalAsl.g:2198:5: ( (lv_term_in_list_4_0= ruleTerm_in_list ) )
                    	    // InternalAsl.g:2199:6: (lv_term_in_list_4_0= ruleTerm_in_list )
                    	    {
                    	    // InternalAsl.g:2199:6: (lv_term_in_list_4_0= ruleTerm_in_list )
                    	    // InternalAsl.g:2200:7: lv_term_in_list_4_0= ruleTerm_in_list
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListAccess().getTerm_in_listTerm_in_listParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_term_in_list_4_0=ruleTerm_in_list();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"term_in_list",
                    	      								lv_term_in_list_4_0,
                    	      								"jasonide.xtext.asl.Asl.Term_in_list");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    // InternalAsl.g:2218:4: (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==41) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAsl.g:2219:5: otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            {
                            otherlv_5=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getListAccess().getVerticalLineKeyword_2_2_0());
                              				
                            }
                            // InternalAsl.g:2223:5: ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            int alt46=3;
                            switch ( input.LA(1) ) {
                            case RULE_VART:
                                {
                                alt46=1;
                                }
                                break;
                            case RULE_UNNAMEDVART:
                                {
                                alt46=2;
                                }
                                break;
                            case 40:
                                {
                                alt46=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }

                            switch (alt46) {
                                case 1 :
                                    // InternalAsl.g:2224:6: ( (lv_var_6_0= RULE_VART ) )
                                    {
                                    // InternalAsl.g:2224:6: ( (lv_var_6_0= RULE_VART ) )
                                    // InternalAsl.g:2225:7: (lv_var_6_0= RULE_VART )
                                    {
                                    // InternalAsl.g:2225:7: (lv_var_6_0= RULE_VART )
                                    // InternalAsl.g:2226:8: lv_var_6_0= RULE_VART
                                    {
                                    lv_var_6_0=(Token)match(input,RULE_VART,FOLLOW_42); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_var_6_0, grammarAccess.getListAccess().getVarVARTTerminalRuleCall_2_2_1_0_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getListRule());
                                      								}
                                      								setWithLastConsumed(
                                      									current,
                                      									"var",
                                      									lv_var_6_0,
                                      									"jasonide.xtext.asl.Asl.VART");
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAsl.g:2243:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    {
                                    // InternalAsl.g:2243:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    // InternalAsl.g:2244:7: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    {
                                    // InternalAsl.g:2244:7: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    // InternalAsl.g:2245:8: lv_unnamedvar_7_0= RULE_UNNAMEDVART
                                    {
                                    lv_unnamedvar_7_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_42); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(lv_unnamedvar_7_0, grammarAccess.getListAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_2_2_1_1_0());
                                      							
                                    }
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElement(grammarAccess.getListRule());
                                      								}
                                      								setWithLastConsumed(
                                      									current,
                                      									"unnamedvar",
                                      									lv_unnamedvar_7_0,
                                      									"jasonide.xtext.asl.Asl.UNNAMEDVART");
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // InternalAsl.g:2262:6: ( (lv_list_8_0= ruleList ) )
                                    {
                                    // InternalAsl.g:2262:6: ( (lv_list_8_0= ruleList ) )
                                    // InternalAsl.g:2263:7: (lv_list_8_0= ruleList )
                                    {
                                    // InternalAsl.g:2263:7: (lv_list_8_0= ruleList )
                                    // InternalAsl.g:2264:8: lv_list_8_0= ruleList
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getListAccess().getListListParserRuleCall_2_2_1_2_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_42);
                                    lv_list_8_0=ruleList();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getListRule());
                                      								}
                                      								set(
                                      									current,
                                      									"list",
                                      									lv_list_8_0,
                                      									"jasonide.xtext.asl.Asl.List");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getListAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleTerm_in_list"
    // InternalAsl.g:2292:1: entryRuleTerm_in_list returns [EObject current=null] : iv_ruleTerm_in_list= ruleTerm_in_list EOF ;
    public final EObject entryRuleTerm_in_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm_in_list = null;


        try {
            // InternalAsl.g:2292:53: (iv_ruleTerm_in_list= ruleTerm_in_list EOF )
            // InternalAsl.g:2293:2: iv_ruleTerm_in_list= ruleTerm_in_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerm_in_listRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm_in_list=ruleTerm_in_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm_in_list; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm_in_list"


    // $ANTLR start "ruleTerm_in_list"
    // InternalAsl.g:2299:1: ruleTerm_in_list returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) ) ;
    public final EObject ruleTerm_in_list() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_0 = null;

        EObject lv_arithm_expr_1_0 = null;

        EObject lv_string_2_0 = null;

        EObject lv_plan_term_3_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2305:2: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) ) )
            // InternalAsl.g:2306:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) )
            {
            // InternalAsl.g:2306:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt49=1;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_NUMBERT:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 22:
            case 27:
            case 33:
            case 38:
            case 52:
            case 53:
            case 62:
            case 63:
                {
                alt49=2;
                }
                break;
            case RULE_STRINGT:
                {
                alt49=3;
                }
                break;
            case 19:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalAsl.g:2307:3: ( (lv_list_0_0= ruleList ) )
                    {
                    // InternalAsl.g:2307:3: ( (lv_list_0_0= ruleList ) )
                    // InternalAsl.g:2308:4: (lv_list_0_0= ruleList )
                    {
                    // InternalAsl.g:2308:4: (lv_list_0_0= ruleList )
                    // InternalAsl.g:2309:5: lv_list_0_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerm_in_listAccess().getListListParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_0_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerm_in_listRule());
                      					}
                      					set(
                      						current,
                      						"list",
                      						lv_list_0_0,
                      						"jasonide.xtext.asl.Asl.List");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:2327:3: ( (lv_arithm_expr_1_0= ruleArithm_expr ) )
                    {
                    // InternalAsl.g:2327:3: ( (lv_arithm_expr_1_0= ruleArithm_expr ) )
                    // InternalAsl.g:2328:4: (lv_arithm_expr_1_0= ruleArithm_expr )
                    {
                    // InternalAsl.g:2328:4: (lv_arithm_expr_1_0= ruleArithm_expr )
                    // InternalAsl.g:2329:5: lv_arithm_expr_1_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerm_in_listAccess().getArithm_exprArithm_exprParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_arithm_expr_1_0=ruleArithm_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerm_in_listRule());
                      					}
                      					set(
                      						current,
                      						"arithm_expr",
                      						lv_arithm_expr_1_0,
                      						"jasonide.xtext.asl.Asl.Arithm_expr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:2347:3: ( (lv_string_2_0= ruleString ) )
                    {
                    // InternalAsl.g:2347:3: ( (lv_string_2_0= ruleString ) )
                    // InternalAsl.g:2348:4: (lv_string_2_0= ruleString )
                    {
                    // InternalAsl.g:2348:4: (lv_string_2_0= ruleString )
                    // InternalAsl.g:2349:5: lv_string_2_0= ruleString
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerm_in_listAccess().getStringStringParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_string_2_0=ruleString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerm_in_listRule());
                      					}
                      					set(
                      						current,
                      						"string",
                      						lv_string_2_0,
                      						"jasonide.xtext.asl.Asl.String");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAsl.g:2367:3: ( (lv_plan_term_3_0= rulePlan_term ) )
                    {
                    // InternalAsl.g:2367:3: ( (lv_plan_term_3_0= rulePlan_term ) )
                    // InternalAsl.g:2368:4: (lv_plan_term_3_0= rulePlan_term )
                    {
                    // InternalAsl.g:2368:4: (lv_plan_term_3_0= rulePlan_term )
                    // InternalAsl.g:2369:5: lv_plan_term_3_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerm_in_listAccess().getPlan_termPlan_termParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_plan_term_3_0=rulePlan_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTerm_in_listRule());
                      					}
                      					set(
                      						current,
                      						"plan_term",
                      						lv_plan_term_3_0,
                      						"jasonide.xtext.asl.Asl.Plan_term");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm_in_list"


    // $ANTLR start "entryRuleLog_expr"
    // InternalAsl.g:2390:1: entryRuleLog_expr returns [EObject current=null] : iv_ruleLog_expr= ruleLog_expr EOF ;
    public final EObject entryRuleLog_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog_expr = null;


        try {
            // InternalAsl.g:2390:49: (iv_ruleLog_expr= ruleLog_expr EOF )
            // InternalAsl.g:2391:2: iv_ruleLog_expr= ruleLog_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLog_expr=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr"


    // $ANTLR start "ruleLog_expr"
    // InternalAsl.g:2397:1: ruleLog_expr returns [EObject current=null] : ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? ) ;
    public final EObject ruleLog_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_log_expr_trm_0_0 = null;

        EObject lv_log_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2403:2: ( ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? ) )
            // InternalAsl.g:2404:2: ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? )
            {
            // InternalAsl.g:2404:2: ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? )
            // InternalAsl.g:2405:3: ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            {
            // InternalAsl.g:2405:3: ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) )
            // InternalAsl.g:2406:4: (lv_log_expr_trm_0_0= ruleLog_expr_trm )
            {
            // InternalAsl.g:2406:4: (lv_log_expr_trm_0_0= ruleLog_expr_trm )
            // InternalAsl.g:2407:5: lv_log_expr_trm_0_0= ruleLog_expr_trm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLog_exprAccess().getLog_expr_trmLog_expr_trmParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_log_expr_trm_0_0=ruleLog_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLog_exprRule());
              					}
              					set(
              						current,
              						"log_expr_trm",
              						lv_log_expr_trm_0_0,
              						"jasonide.xtext.asl.Asl.Log_expr_trm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:2424:3: (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAsl.g:2425:4: otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLog_exprAccess().getVerticalLineKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:2429:4: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // InternalAsl.g:2430:5: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // InternalAsl.g:2430:5: (lv_log_expr_2_0= ruleLog_expr )
                    // InternalAsl.g:2431:6: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLog_exprAccess().getLog_exprLog_exprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_log_expr_2_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLog_exprRule());
                      						}
                      						set(
                      							current,
                      							"log_expr",
                      							lv_log_expr_2_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr"


    // $ANTLR start "entryRuleLog_expr_trm"
    // InternalAsl.g:2453:1: entryRuleLog_expr_trm returns [EObject current=null] : iv_ruleLog_expr_trm= ruleLog_expr_trm EOF ;
    public final EObject entryRuleLog_expr_trm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog_expr_trm = null;


        try {
            // InternalAsl.g:2453:53: (iv_ruleLog_expr_trm= ruleLog_expr_trm EOF )
            // InternalAsl.g:2454:2: iv_ruleLog_expr_trm= ruleLog_expr_trm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_expr_trmRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLog_expr_trm=ruleLog_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr_trm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr_trm"


    // $ANTLR start "ruleLog_expr_trm"
    // InternalAsl.g:2460:1: ruleLog_expr_trm returns [EObject current=null] : ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? ) ;
    public final EObject ruleLog_expr_trm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_log_expr_factor_0_0 = null;

        EObject lv_log_expr_trm_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2466:2: ( ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? ) )
            // InternalAsl.g:2467:2: ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? )
            {
            // InternalAsl.g:2467:2: ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? )
            // InternalAsl.g:2468:3: ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )?
            {
            // InternalAsl.g:2468:3: ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) )
            // InternalAsl.g:2469:4: (lv_log_expr_factor_0_0= ruleLog_expr_factor )
            {
            // InternalAsl.g:2469:4: (lv_log_expr_factor_0_0= ruleLog_expr_factor )
            // InternalAsl.g:2470:5: lv_log_expr_factor_0_0= ruleLog_expr_factor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLog_expr_trmAccess().getLog_expr_factorLog_expr_factorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_log_expr_factor_0_0=ruleLog_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLog_expr_trmRule());
              					}
              					set(
              						current,
              						"log_expr_factor",
              						lv_log_expr_factor_0_0,
              						"jasonide.xtext.asl.Asl.Log_expr_factor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:2487:3: (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAsl.g:2488:4: otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLog_expr_trmAccess().getAmpersandKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:2492:4: ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) )
                    // InternalAsl.g:2493:5: (lv_log_expr_trm_2_0= ruleLog_expr_trm )
                    {
                    // InternalAsl.g:2493:5: (lv_log_expr_trm_2_0= ruleLog_expr_trm )
                    // InternalAsl.g:2494:6: lv_log_expr_trm_2_0= ruleLog_expr_trm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLog_expr_trmAccess().getLog_expr_trmLog_expr_trmParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_log_expr_trm_2_0=ruleLog_expr_trm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLog_expr_trmRule());
                      						}
                      						set(
                      							current,
                      							"log_expr_trm",
                      							lv_log_expr_trm_2_0,
                      							"jasonide.xtext.asl.Asl.Log_expr_trm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr_trm"


    // $ANTLR start "entryRuleLog_expr_factor"
    // InternalAsl.g:2516:1: entryRuleLog_expr_factor returns [EObject current=null] : iv_ruleLog_expr_factor= ruleLog_expr_factor EOF ;
    public final EObject entryRuleLog_expr_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog_expr_factor = null;


        try {
            // InternalAsl.g:2516:56: (iv_ruleLog_expr_factor= ruleLog_expr_factor EOF )
            // InternalAsl.g:2517:2: iv_ruleLog_expr_factor= ruleLog_expr_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_expr_factorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLog_expr_factor=ruleLog_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr_factor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr_factor"


    // $ANTLR start "ruleLog_expr_factor"
    // InternalAsl.g:2523:1: ruleLog_expr_factor returns [EObject current=null] : ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) ) ;
    public final EObject ruleLog_expr_factor() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tk_not_0_0 = null;

        EObject lv_log_expr_factor_1_0 = null;

        EObject lv_rel_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2529:2: ( ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) ) )
            // InternalAsl.g:2530:2: ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) )
            {
            // InternalAsl.g:2530:2: ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==59) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_TK_NEG && LA52_0<=RULE_ATOM)||LA52_0==22||LA52_0==27||LA52_0==33||LA52_0==38||(LA52_0>=52 && LA52_0<=53)||(LA52_0>=62 && LA52_0<=63)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAsl.g:2531:3: ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) )
                    {
                    // InternalAsl.g:2531:3: ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) )
                    // InternalAsl.g:2532:4: ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) )
                    {
                    // InternalAsl.g:2532:4: ( (lv_tk_not_0_0= ruleTK_NOT ) )
                    // InternalAsl.g:2533:5: (lv_tk_not_0_0= ruleTK_NOT )
                    {
                    // InternalAsl.g:2533:5: (lv_tk_not_0_0= ruleTK_NOT )
                    // InternalAsl.g:2534:6: lv_tk_not_0_0= ruleTK_NOT
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLog_expr_factorAccess().getTk_notTK_NOTParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_tk_not_0_0=ruleTK_NOT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLog_expr_factorRule());
                      						}
                      						set(
                      							current,
                      							"tk_not",
                      							lv_tk_not_0_0,
                      							"jasonide.xtext.asl.Asl.TK_NOT");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:2551:4: ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) )
                    // InternalAsl.g:2552:5: (lv_log_expr_factor_1_0= ruleLog_expr_factor )
                    {
                    // InternalAsl.g:2552:5: (lv_log_expr_factor_1_0= ruleLog_expr_factor )
                    // InternalAsl.g:2553:6: lv_log_expr_factor_1_0= ruleLog_expr_factor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLog_expr_factorAccess().getLog_expr_factorLog_expr_factorParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_log_expr_factor_1_0=ruleLog_expr_factor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLog_expr_factorRule());
                      						}
                      						set(
                      							current,
                      							"log_expr_factor",
                      							lv_log_expr_factor_1_0,
                      							"jasonide.xtext.asl.Asl.Log_expr_factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:2572:3: ( (lv_rel_expr_2_0= ruleRel_expr ) )
                    {
                    // InternalAsl.g:2572:3: ( (lv_rel_expr_2_0= ruleRel_expr ) )
                    // InternalAsl.g:2573:4: (lv_rel_expr_2_0= ruleRel_expr )
                    {
                    // InternalAsl.g:2573:4: (lv_rel_expr_2_0= ruleRel_expr )
                    // InternalAsl.g:2574:5: lv_rel_expr_2_0= ruleRel_expr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLog_expr_factorAccess().getRel_exprRel_exprParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_rel_expr_2_0=ruleRel_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLog_expr_factorRule());
                      					}
                      					set(
                      						current,
                      						"rel_expr",
                      						lv_rel_expr_2_0,
                      						"jasonide.xtext.asl.Asl.Rel_expr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr_factor"


    // $ANTLR start "entryRuleRel_expr"
    // InternalAsl.g:2595:1: entryRuleRel_expr returns [EObject current=null] : iv_ruleRel_expr= ruleRel_expr EOF ;
    public final EObject entryRuleRel_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRel_expr = null;


        try {
            // InternalAsl.g:2595:49: (iv_ruleRel_expr= ruleRel_expr EOF )
            // InternalAsl.g:2596:2: iv_ruleRel_expr= ruleRel_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRel_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRel_expr=ruleRel_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRel_expr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRel_expr"


    // $ANTLR start "ruleRel_expr"
    // InternalAsl.g:2602:1: ruleRel_expr returns [EObject current=null] : ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? ) ;
    public final EObject ruleRel_expr() throws RecognitionException {
        EObject current = null;

        EObject lv_arithm_exp_0_0 = null;

        EObject lv_string_1_0 = null;

        AntlrDatatypeRuleToken lv_relOp_2_0 = null;

        EObject lv_arithm_expr_3_0 = null;

        EObject lv_string2_4_0 = null;

        EObject lv_list_5_0 = null;

        EObject lv_plan_term_6_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2608:2: ( ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? ) )
            // InternalAsl.g:2609:2: ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? )
            {
            // InternalAsl.g:2609:2: ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? )
            // InternalAsl.g:2610:3: ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )?
            {
            // InternalAsl.g:2610:3: ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_TK_NEG && LA53_0<=RULE_UNNAMEDVART)||(LA53_0>=RULE_NUMBERT && LA53_0<=RULE_ATOM)||LA53_0==22||LA53_0==27||LA53_0==33||LA53_0==38||(LA53_0>=52 && LA53_0<=53)||(LA53_0>=62 && LA53_0<=63)) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_STRINGT) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalAsl.g:2611:4: ( (lv_arithm_exp_0_0= ruleArithm_expr ) )
                    {
                    // InternalAsl.g:2611:4: ( (lv_arithm_exp_0_0= ruleArithm_expr ) )
                    // InternalAsl.g:2612:5: (lv_arithm_exp_0_0= ruleArithm_expr )
                    {
                    // InternalAsl.g:2612:5: (lv_arithm_exp_0_0= ruleArithm_expr )
                    // InternalAsl.g:2613:6: lv_arithm_exp_0_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRel_exprAccess().getArithm_expArithm_exprParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_arithm_exp_0_0=ruleArithm_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRel_exprRule());
                      						}
                      						set(
                      							current,
                      							"arithm_exp",
                      							lv_arithm_exp_0_0,
                      							"jasonide.xtext.asl.Asl.Arithm_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:2631:4: ( (lv_string_1_0= ruleString ) )
                    {
                    // InternalAsl.g:2631:4: ( (lv_string_1_0= ruleString ) )
                    // InternalAsl.g:2632:5: (lv_string_1_0= ruleString )
                    {
                    // InternalAsl.g:2632:5: (lv_string_1_0= ruleString )
                    // InternalAsl.g:2633:6: lv_string_1_0= ruleString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRel_exprAccess().getStringStringParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_string_1_0=ruleString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRel_exprRule());
                      						}
                      						set(
                      							current,
                      							"string",
                      							lv_string_1_0,
                      							"jasonide.xtext.asl.Asl.String");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:2651:3: ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=36 && LA55_0<=37)||(LA55_0>=44 && LA55_0<=48)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAsl.g:2652:4: ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) )
                    {
                    // InternalAsl.g:2652:4: ( (lv_relOp_2_0= ruleTK_REL_OP ) )
                    // InternalAsl.g:2653:5: (lv_relOp_2_0= ruleTK_REL_OP )
                    {
                    // InternalAsl.g:2653:5: (lv_relOp_2_0= ruleTK_REL_OP )
                    // InternalAsl.g:2654:6: lv_relOp_2_0= ruleTK_REL_OP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRel_exprAccess().getRelOpTK_REL_OPParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_relOp_2_0=ruleTK_REL_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRel_exprRule());
                      						}
                      						set(
                      							current,
                      							"relOp",
                      							lv_relOp_2_0,
                      							"jasonide.xtext.asl.Asl.TK_REL_OP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:2671:4: ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) )
                    int alt54=4;
                    switch ( input.LA(1) ) {
                    case RULE_TK_NEG:
                    case RULE_VART:
                    case RULE_UNNAMEDVART:
                    case RULE_NUMBERT:
                    case RULE_ATOMAPOST:
                    case RULE_ATOM:
                    case 22:
                    case 27:
                    case 33:
                    case 38:
                    case 52:
                    case 53:
                    case 62:
                    case 63:
                        {
                        alt54=1;
                        }
                        break;
                    case RULE_STRINGT:
                        {
                        alt54=2;
                        }
                        break;
                    case 40:
                        {
                        alt54=3;
                        }
                        break;
                    case 19:
                        {
                        alt54=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // InternalAsl.g:2672:5: ( (lv_arithm_expr_3_0= ruleArithm_expr ) )
                            {
                            // InternalAsl.g:2672:5: ( (lv_arithm_expr_3_0= ruleArithm_expr ) )
                            // InternalAsl.g:2673:6: (lv_arithm_expr_3_0= ruleArithm_expr )
                            {
                            // InternalAsl.g:2673:6: (lv_arithm_expr_3_0= ruleArithm_expr )
                            // InternalAsl.g:2674:7: lv_arithm_expr_3_0= ruleArithm_expr
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRel_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_arithm_expr_3_0=ruleArithm_expr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRel_exprRule());
                              							}
                              							set(
                              								current,
                              								"arithm_expr",
                              								lv_arithm_expr_3_0,
                              								"jasonide.xtext.asl.Asl.Arithm_expr");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAsl.g:2692:5: ( (lv_string2_4_0= ruleString ) )
                            {
                            // InternalAsl.g:2692:5: ( (lv_string2_4_0= ruleString ) )
                            // InternalAsl.g:2693:6: (lv_string2_4_0= ruleString )
                            {
                            // InternalAsl.g:2693:6: (lv_string2_4_0= ruleString )
                            // InternalAsl.g:2694:7: lv_string2_4_0= ruleString
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRel_exprAccess().getString2StringParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_string2_4_0=ruleString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRel_exprRule());
                              							}
                              							set(
                              								current,
                              								"string2",
                              								lv_string2_4_0,
                              								"jasonide.xtext.asl.Asl.String");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAsl.g:2712:5: ( (lv_list_5_0= ruleList ) )
                            {
                            // InternalAsl.g:2712:5: ( (lv_list_5_0= ruleList ) )
                            // InternalAsl.g:2713:6: (lv_list_5_0= ruleList )
                            {
                            // InternalAsl.g:2713:6: (lv_list_5_0= ruleList )
                            // InternalAsl.g:2714:7: lv_list_5_0= ruleList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRel_exprAccess().getListListParserRuleCall_1_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_list_5_0=ruleList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRel_exprRule());
                              							}
                              							set(
                              								current,
                              								"list",
                              								lv_list_5_0,
                              								"jasonide.xtext.asl.Asl.List");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalAsl.g:2732:5: ( (lv_plan_term_6_0= rulePlan_term ) )
                            {
                            // InternalAsl.g:2732:5: ( (lv_plan_term_6_0= rulePlan_term ) )
                            // InternalAsl.g:2733:6: (lv_plan_term_6_0= rulePlan_term )
                            {
                            // InternalAsl.g:2733:6: (lv_plan_term_6_0= rulePlan_term )
                            // InternalAsl.g:2734:7: lv_plan_term_6_0= rulePlan_term
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getRel_exprAccess().getPlan_termPlan_termParserRuleCall_1_1_3_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_plan_term_6_0=rulePlan_term();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getRel_exprRule());
                              							}
                              							set(
                              								current,
                              								"plan_term",
                              								lv_plan_term_6_0,
                              								"jasonide.xtext.asl.Asl.Plan_term");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRel_expr"


    // $ANTLR start "entryRuleTK_REL_OP"
    // InternalAsl.g:2757:1: entryRuleTK_REL_OP returns [String current=null] : iv_ruleTK_REL_OP= ruleTK_REL_OP EOF ;
    public final String entryRuleTK_REL_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_REL_OP = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:2759:2: (iv_ruleTK_REL_OP= ruleTK_REL_OP EOF )
            // InternalAsl.g:2760:2: iv_ruleTK_REL_OP= ruleTK_REL_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_REL_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_REL_OP=ruleTK_REL_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_REL_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTK_REL_OP"


    // $ANTLR start "ruleTK_REL_OP"
    // InternalAsl.g:2769:1: ruleTK_REL_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleTK_REL_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:2776:2: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) ) )
            // InternalAsl.g:2777:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) )
            {
            // InternalAsl.g:2777:2: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt57=1;
                }
                break;
            case 44:
                {
                alt57=2;
                }
                break;
            case 36:
                {
                alt57=3;
                }
                break;
            case 45:
                {
                alt57=4;
                }
                break;
            case 46:
                {
                alt57=5;
                }
                break;
            case 47:
                {
                alt57=6;
                }
                break;
            case 48:
                {
                alt57=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalAsl.g:2778:3: kw= '<'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:2784:3: kw= '<='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAsl.g:2790:3: kw= '>'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAsl.g:2796:3: kw= '>='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAsl.g:2802:3: kw= '=='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getEqualsSignEqualsSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAsl.g:2808:3: kw= '\\\\=='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getReverseSolidusEqualsSignEqualsSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAsl.g:2814:3: (kw= '=' (kw= '.' kw= '.' )? )
                    {
                    // InternalAsl.g:2814:3: (kw= '=' (kw= '.' kw= '.' )? )
                    // InternalAsl.g:2815:4: kw= '=' (kw= '.' kw= '.' )?
                    {
                    kw=(Token)match(input,48,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getEqualsSignKeyword_6_0());
                      			
                    }
                    // InternalAsl.g:2820:4: (kw= '.' kw= '.' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==22) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==22) ) {
                            alt56=1;
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAsl.g:2821:5: kw= '.' kw= '.'
                            {
                            kw=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getFullStopKeyword_6_1_0());
                              				
                            }
                            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getFullStopKeyword_6_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTK_REL_OP"


    // $ANTLR start "entryRuleArithm_expr"
    // InternalAsl.g:2840:1: entryRuleArithm_expr returns [EObject current=null] : iv_ruleArithm_expr= ruleArithm_expr EOF ;
    public final EObject entryRuleArithm_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithm_expr = null;


        try {
            // InternalAsl.g:2840:52: (iv_ruleArithm_expr= ruleArithm_expr EOF )
            // InternalAsl.g:2841:2: iv_ruleArithm_expr= ruleArithm_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_exprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithm_expr=ruleArithm_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr"


    // $ANTLR start "ruleArithm_expr"
    // InternalAsl.g:2847:1: ruleArithm_expr returns [EObject current=null] : ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? ) ;
    public final EObject ruleArithm_expr() throws RecognitionException {
        EObject current = null;

        EObject lv_arithm_expr_trm_0_0 = null;

        AntlrDatatypeRuleToken lv_subadd_1_0 = null;

        EObject lv_arithm_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2853:2: ( ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? ) )
            // InternalAsl.g:2854:2: ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? )
            {
            // InternalAsl.g:2854:2: ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? )
            // InternalAsl.g:2855:3: ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?
            {
            // InternalAsl.g:2855:3: ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) )
            // InternalAsl.g:2856:4: (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm )
            {
            // InternalAsl.g:2856:4: (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm )
            // InternalAsl.g:2857:5: lv_arithm_expr_trm_0_0= ruleArithm_expr_trm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_expr_trmArithm_expr_trmParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_arithm_expr_trm_0_0=ruleArithm_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithm_exprRule());
              					}
              					set(
              						current,
              						"arithm_expr_trm",
              						lv_arithm_expr_trm_0_0,
              						"jasonide.xtext.asl.Asl.Arithm_expr_trm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:2874:3: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalAsl.g:2875:4: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
                    {
                    // InternalAsl.g:2875:4: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) )
                    // InternalAsl.g:2876:5: (lv_subadd_1_0= ruleTK_SUB_ADD )
                    {
                    // InternalAsl.g:2876:5: (lv_subadd_1_0= ruleTK_SUB_ADD )
                    // InternalAsl.g:2877:6: lv_subadd_1_0= ruleTK_SUB_ADD
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_exprAccess().getSubaddTK_SUB_ADDParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_subadd_1_0=ruleTK_SUB_ADD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_exprRule());
                      						}
                      						set(
                      							current,
                      							"subadd",
                      							lv_subadd_1_0,
                      							"jasonide.xtext.asl.Asl.TK_SUB_ADD");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:2894:4: ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
                    // InternalAsl.g:2895:5: (lv_arithm_expr_2_0= ruleArithm_expr )
                    {
                    // InternalAsl.g:2895:5: (lv_arithm_expr_2_0= ruleArithm_expr )
                    // InternalAsl.g:2896:6: lv_arithm_expr_2_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_arithm_expr_2_0=ruleArithm_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_exprRule());
                      						}
                      						set(
                      							current,
                      							"arithm_expr",
                      							lv_arithm_expr_2_0,
                      							"jasonide.xtext.asl.Asl.Arithm_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr"


    // $ANTLR start "entryRuleTK_SUB_ADD"
    // InternalAsl.g:2918:1: entryRuleTK_SUB_ADD returns [String current=null] : iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF ;
    public final String entryRuleTK_SUB_ADD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_SUB_ADD = null;


        try {
            // InternalAsl.g:2918:50: (iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF )
            // InternalAsl.g:2919:2: iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_SUB_ADDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_SUB_ADD=ruleTK_SUB_ADD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_SUB_ADD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_SUB_ADD"


    // $ANTLR start "ruleTK_SUB_ADD"
    // InternalAsl.g:2925:1: ruleTK_SUB_ADD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleTK_SUB_ADD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:2931:2: ( (kw= '+' | kw= '-' ) )
            // InternalAsl.g:2932:2: (kw= '+' | kw= '-' )
            {
            // InternalAsl.g:2932:2: (kw= '+' | kw= '-' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            else if ( (LA59_0==27) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAsl.g:2933:3: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_SUB_ADDAccess().getPlusSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:2939:3: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_SUB_ADDAccess().getHyphenMinusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_SUB_ADD"


    // $ANTLR start "entryRuleArithm_expr_trm"
    // InternalAsl.g:2948:1: entryRuleArithm_expr_trm returns [EObject current=null] : iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF ;
    public final EObject entryRuleArithm_expr_trm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithm_expr_trm = null;


        try {
            // InternalAsl.g:2948:56: (iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF )
            // InternalAsl.g:2949:2: iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_trmRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithm_expr_trm=ruleArithm_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_trm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_trm"


    // $ANTLR start "ruleArithm_expr_trm"
    // InternalAsl.g:2955:1: ruleArithm_expr_trm returns [EObject current=null] : ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? ) ;
    public final EObject ruleArithm_expr_trm() throws RecognitionException {
        EObject current = null;

        EObject lv_arithm_expr_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_muldiv_1_0 = null;

        AntlrDatatypeRuleToken lv_tk_intdiv_2_0 = null;

        AntlrDatatypeRuleToken lv_tk_intmod_3_0 = null;

        EObject lv_arithm_expr_trm_4_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:2961:2: ( ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? ) )
            // InternalAsl.g:2962:2: ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? )
            {
            // InternalAsl.g:2962:2: ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? )
            // InternalAsl.g:2963:3: ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )?
            {
            // InternalAsl.g:2963:3: ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) )
            // InternalAsl.g:2964:4: (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor )
            {
            // InternalAsl.g:2964:4: (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor )
            // InternalAsl.g:2965:5: lv_arithm_expr_factor_0_0= ruleArithm_expr_factor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_factorArithm_expr_factorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_arithm_expr_factor_0_0=ruleArithm_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithm_expr_trmRule());
              					}
              					set(
              						current,
              						"arithm_expr_factor",
              						lv_arithm_expr_factor_0_0,
              						"jasonide.xtext.asl.Asl.Arithm_expr_factor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:2982:3: ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=49 && LA61_0<=50)||(LA61_0>=60 && LA61_0<=61)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAsl.g:2983:4: ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) )
                    {
                    // InternalAsl.g:2983:4: ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) )
                    int alt60=3;
                    switch ( input.LA(1) ) {
                    case 49:
                    case 50:
                        {
                        alt60=1;
                        }
                        break;
                    case 60:
                        {
                        alt60=2;
                        }
                        break;
                    case 61:
                        {
                        alt60=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // InternalAsl.g:2984:5: ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) )
                            {
                            // InternalAsl.g:2984:5: ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) )
                            // InternalAsl.g:2985:6: (lv_muldiv_1_0= ruleTK_MUL_DIV )
                            {
                            // InternalAsl.g:2985:6: (lv_muldiv_1_0= ruleTK_MUL_DIV )
                            // InternalAsl.g:2986:7: lv_muldiv_1_0= ruleTK_MUL_DIV
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getMuldivTK_MUL_DIVParserRuleCall_1_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_48);
                            lv_muldiv_1_0=ruleTK_MUL_DIV();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getArithm_expr_trmRule());
                              							}
                              							set(
                              								current,
                              								"muldiv",
                              								lv_muldiv_1_0,
                              								"jasonide.xtext.asl.Asl.TK_MUL_DIV");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAsl.g:3004:5: ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) )
                            {
                            // InternalAsl.g:3004:5: ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) )
                            // InternalAsl.g:3005:6: (lv_tk_intdiv_2_0= ruleTK_INTDIV )
                            {
                            // InternalAsl.g:3005:6: (lv_tk_intdiv_2_0= ruleTK_INTDIV )
                            // InternalAsl.g:3006:7: lv_tk_intdiv_2_0= ruleTK_INTDIV
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getTk_intdivTK_INTDIVParserRuleCall_1_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_48);
                            lv_tk_intdiv_2_0=ruleTK_INTDIV();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getArithm_expr_trmRule());
                              							}
                              							set(
                              								current,
                              								"tk_intdiv",
                              								lv_tk_intdiv_2_0,
                              								"jasonide.xtext.asl.Asl.TK_INTDIV");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAsl.g:3024:5: ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) )
                            {
                            // InternalAsl.g:3024:5: ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) )
                            // InternalAsl.g:3025:6: (lv_tk_intmod_3_0= ruleTK_INTMOD )
                            {
                            // InternalAsl.g:3025:6: (lv_tk_intmod_3_0= ruleTK_INTMOD )
                            // InternalAsl.g:3026:7: lv_tk_intmod_3_0= ruleTK_INTMOD
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getTk_intmodTK_INTMODParserRuleCall_1_0_2_0());
                              						
                            }
                            pushFollow(FOLLOW_48);
                            lv_tk_intmod_3_0=ruleTK_INTMOD();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getArithm_expr_trmRule());
                              							}
                              							set(
                              								current,
                              								"tk_intmod",
                              								lv_tk_intmod_3_0,
                              								"jasonide.xtext.asl.Asl.TK_INTMOD");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAsl.g:3044:4: ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) )
                    // InternalAsl.g:3045:5: (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm )
                    {
                    // InternalAsl.g:3045:5: (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm )
                    // InternalAsl.g:3046:6: lv_arithm_expr_trm_4_0= ruleArithm_expr_trm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_trmArithm_expr_trmParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_arithm_expr_trm_4_0=ruleArithm_expr_trm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_trmRule());
                      						}
                      						set(
                      							current,
                      							"arithm_expr_trm",
                      							lv_arithm_expr_trm_4_0,
                      							"jasonide.xtext.asl.Asl.Arithm_expr_trm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_trm"


    // $ANTLR start "entryRuleTK_MUL_DIV"
    // InternalAsl.g:3068:1: entryRuleTK_MUL_DIV returns [String current=null] : iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF ;
    public final String entryRuleTK_MUL_DIV() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_MUL_DIV = null;


        try {
            // InternalAsl.g:3068:50: (iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF )
            // InternalAsl.g:3069:2: iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_MUL_DIVRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_MUL_DIV=ruleTK_MUL_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_MUL_DIV.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MUL_DIV"


    // $ANTLR start "ruleTK_MUL_DIV"
    // InternalAsl.g:3075:1: ruleTK_MUL_DIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleTK_MUL_DIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3081:2: ( (kw= '*' | kw= '/' ) )
            // InternalAsl.g:3082:2: (kw= '*' | kw= '/' )
            {
            // InternalAsl.g:3082:2: (kw= '*' | kw= '/' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            else if ( (LA62_0==50) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAsl.g:3083:3: kw= '*'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_MUL_DIVAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAsl.g:3089:3: kw= '/'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTK_MUL_DIVAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_MUL_DIV"


    // $ANTLR start "entryRuleArithm_expr_factor"
    // InternalAsl.g:3098:1: entryRuleArithm_expr_factor returns [EObject current=null] : iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF ;
    public final EObject entryRuleArithm_expr_factor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithm_expr_factor = null;


        try {
            // InternalAsl.g:3098:59: (iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF )
            // InternalAsl.g:3099:2: iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_factorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithm_expr_factor=ruleArithm_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_factor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_factor"


    // $ANTLR start "ruleArithm_expr_factor"
    // InternalAsl.g:3105:1: ruleArithm_expr_factor returns [EObject current=null] : ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? ) ;
    public final EObject ruleArithm_expr_factor() throws RecognitionException {
        EObject current = null;

        EObject lv_arithm_expr_simple_0_0 = null;

        AntlrDatatypeRuleToken lv_exponential_1_0 = null;

        EObject lv_arithm_expr_factor_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:3111:2: ( ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? ) )
            // InternalAsl.g:3112:2: ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? )
            {
            // InternalAsl.g:3112:2: ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? )
            // InternalAsl.g:3113:3: ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )?
            {
            // InternalAsl.g:3113:3: ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) )
            // InternalAsl.g:3114:4: (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple )
            {
            // InternalAsl.g:3114:4: (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple )
            // InternalAsl.g:3115:5: lv_arithm_expr_simple_0_0= ruleArithm_expr_simple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_simpleArithm_expr_simpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_arithm_expr_simple_0_0=ruleArithm_expr_simple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArithm_expr_factorRule());
              					}
              					set(
              						current,
              						"arithm_expr_simple",
              						lv_arithm_expr_simple_0_0,
              						"jasonide.xtext.asl.Asl.Arithm_expr_simple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAsl.g:3132:3: ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAsl.g:3133:4: ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) )
                    {
                    // InternalAsl.g:3133:4: ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) )
                    // InternalAsl.g:3134:5: (lv_exponential_1_0= ruleTK_EXPONENTIAL )
                    {
                    // InternalAsl.g:3134:5: (lv_exponential_1_0= ruleTK_EXPONENTIAL )
                    // InternalAsl.g:3135:6: lv_exponential_1_0= ruleTK_EXPONENTIAL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getExponentialTK_EXPONENTIALParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_exponential_1_0=ruleTK_EXPONENTIAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_factorRule());
                      						}
                      						set(
                      							current,
                      							"exponential",
                      							lv_exponential_1_0,
                      							"jasonide.xtext.asl.Asl.TK_EXPONENTIAL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:3152:4: ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) )
                    // InternalAsl.g:3153:5: (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor )
                    {
                    // InternalAsl.g:3153:5: (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor )
                    // InternalAsl.g:3154:6: lv_arithm_expr_factor_2_0= ruleArithm_expr_factor
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_factorArithm_expr_factorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_arithm_expr_factor_2_0=ruleArithm_expr_factor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_factorRule());
                      						}
                      						set(
                      							current,
                      							"arithm_expr_factor",
                      							lv_arithm_expr_factor_2_0,
                      							"jasonide.xtext.asl.Asl.Arithm_expr_factor");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_factor"


    // $ANTLR start "entryRuleTK_EXPONENTIAL"
    // InternalAsl.g:3176:1: entryRuleTK_EXPONENTIAL returns [String current=null] : iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF ;
    public final String entryRuleTK_EXPONENTIAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_EXPONENTIAL = null;


        try {
            // InternalAsl.g:3176:54: (iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF )
            // InternalAsl.g:3177:2: iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_EXPONENTIALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_EXPONENTIAL=ruleTK_EXPONENTIAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_EXPONENTIAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_EXPONENTIAL"


    // $ANTLR start "ruleTK_EXPONENTIAL"
    // InternalAsl.g:3183:1: ruleTK_EXPONENTIAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '**' ;
    public final AntlrDatatypeRuleToken ruleTK_EXPONENTIAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3189:2: (kw= '**' )
            // InternalAsl.g:3190:2: kw= '**'
            {
            kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_EXPONENTIALAccess().getAsteriskAsteriskKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_EXPONENTIAL"


    // $ANTLR start "entryRuleArithm_expr_simple"
    // InternalAsl.g:3198:1: entryRuleArithm_expr_simple returns [EObject current=null] : iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF ;
    public final EObject entryRuleArithm_expr_simple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithm_expr_simple = null;


        try {
            // InternalAsl.g:3198:59: (iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF )
            // InternalAsl.g:3199:2: iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_simpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithm_expr_simple=ruleArithm_expr_simple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_simple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_simple"


    // $ANTLR start "ruleArithm_expr_simple"
    // InternalAsl.g:3205:1: ruleArithm_expr_simple returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) ) ;
    public final EObject ruleArithm_expr_simple() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_unary_1_0 = null;

        EObject lv_arithm_expr_simple_2_0 = null;

        EObject lv_log_expr_4_0 = null;

        EObject lv_function_6_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:3211:2: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) ) )
            // InternalAsl.g:3212:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) )
            {
            // InternalAsl.g:3212:2: ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBERT:
                {
                alt64=1;
                }
                break;
            case 22:
                {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==RULE_ATOM) ) {
                    alt64=4;
                }
                else if ( (LA64_2==RULE_NUMBERT) ) {
                    alt64=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt64=2;
                }
                break;
            case 33:
                {
                alt64=3;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_ATOMAPOST:
            case RULE_ATOM:
            case 38:
            case 52:
            case 53:
            case 62:
            case 63:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalAsl.g:3213:3: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // InternalAsl.g:3213:3: ( (lv_number_0_0= ruleNumber ) )
                    // InternalAsl.g:3214:4: (lv_number_0_0= ruleNumber )
                    {
                    // InternalAsl.g:3214:4: (lv_number_0_0= ruleNumber )
                    // InternalAsl.g:3215:5: lv_number_0_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getNumberNumberParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_number_0_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArithm_expr_simpleRule());
                      					}
                      					set(
                      						current,
                      						"number",
                      						lv_number_0_0,
                      						"jasonide.xtext.asl.Asl.Number");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:3233:3: ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) )
                    {
                    // InternalAsl.g:3233:3: ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) )
                    // InternalAsl.g:3234:4: ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) )
                    {
                    // InternalAsl.g:3234:4: ( (lv_unary_1_0= ruleTK_UNARY_OP ) )
                    // InternalAsl.g:3235:5: (lv_unary_1_0= ruleTK_UNARY_OP )
                    {
                    // InternalAsl.g:3235:5: (lv_unary_1_0= ruleTK_UNARY_OP )
                    // InternalAsl.g:3236:6: lv_unary_1_0= ruleTK_UNARY_OP
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getUnaryTK_UNARY_OPParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_unary_1_0=ruleTK_UNARY_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_simpleRule());
                      						}
                      						set(
                      							current,
                      							"unary",
                      							lv_unary_1_0,
                      							"jasonide.xtext.asl.Asl.TK_UNARY_OP");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalAsl.g:3253:4: ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) )
                    // InternalAsl.g:3254:5: (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple )
                    {
                    // InternalAsl.g:3254:5: (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple )
                    // InternalAsl.g:3255:6: lv_arithm_expr_simple_2_0= ruleArithm_expr_simple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getArithm_expr_simpleArithm_expr_simpleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_arithm_expr_simple_2_0=ruleArithm_expr_simple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_simpleRule());
                      						}
                      						set(
                      							current,
                      							"arithm_expr_simple",
                      							lv_arithm_expr_simple_2_0,
                      							"jasonide.xtext.asl.Asl.Arithm_expr_simple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:3274:3: (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' )
                    {
                    // InternalAsl.g:3274:3: (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' )
                    // InternalAsl.g:3275:4: otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArithm_expr_simpleAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalAsl.g:3279:4: ( (lv_log_expr_4_0= ruleLog_expr ) )
                    // InternalAsl.g:3280:5: (lv_log_expr_4_0= ruleLog_expr )
                    {
                    // InternalAsl.g:3280:5: (lv_log_expr_4_0= ruleLog_expr )
                    // InternalAsl.g:3281:6: lv_log_expr_4_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getLog_exprLog_exprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_log_expr_4_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArithm_expr_simpleRule());
                      						}
                      						set(
                      							current,
                      							"log_expr",
                      							lv_log_expr_4_0,
                      							"jasonide.xtext.asl.Asl.Log_expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getArithm_expr_simpleAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAsl.g:3304:3: ( (lv_function_6_0= ruleFunction ) )
                    {
                    // InternalAsl.g:3304:3: ( (lv_function_6_0= ruleFunction ) )
                    // InternalAsl.g:3305:4: (lv_function_6_0= ruleFunction )
                    {
                    // InternalAsl.g:3305:4: (lv_function_6_0= ruleFunction )
                    // InternalAsl.g:3306:5: lv_function_6_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getFunctionFunctionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_function_6_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArithm_expr_simpleRule());
                      					}
                      					set(
                      						current,
                      						"function",
                      						lv_function_6_0,
                      						"jasonide.xtext.asl.Asl.Function");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_simple"


    // $ANTLR start "entryRuleTK_UNARY_OP"
    // InternalAsl.g:3327:1: entryRuleTK_UNARY_OP returns [String current=null] : iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF ;
    public final String entryRuleTK_UNARY_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_UNARY_OP = null;


        try {
            // InternalAsl.g:3327:51: (iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF )
            // InternalAsl.g:3328:2: iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_UNARY_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_UNARY_OP=ruleTK_UNARY_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_UNARY_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_UNARY_OP"


    // $ANTLR start "ruleTK_UNARY_OP"
    // InternalAsl.g:3334:1: ruleTK_UNARY_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleTK_UNARY_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3340:2: (kw= '-' )
            // InternalAsl.g:3341:2: kw= '-'
            {
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_UNARY_OPAccess().getHyphenMinusKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_UNARY_OP"


    // $ANTLR start "entryRuleFunction"
    // InternalAsl.g:3349:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAsl.g:3349:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalAsl.g:3350:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalAsl.g:3356:1: ruleFunction returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_literal_0_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:3362:2: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // InternalAsl.g:3363:2: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // InternalAsl.g:3363:2: ( (lv_literal_0_0= ruleLiteral ) )
            // InternalAsl.g:3364:3: (lv_literal_0_0= ruleLiteral )
            {
            // InternalAsl.g:3364:3: (lv_literal_0_0= ruleLiteral )
            // InternalAsl.g:3365:4: lv_literal_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunctionAccess().getLiteralLiteralParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_literal_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunctionRule());
              				}
              				set(
              					current,
              					"literal",
              					lv_literal_0_0,
              					"jasonide.xtext.asl.Asl.Literal");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVar"
    // InternalAsl.g:3385:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalAsl.g:3385:44: (iv_ruleVar= ruleVar EOF )
            // InternalAsl.g:3386:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalAsl.g:3392:1: ruleVar returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_unnamedvar_1_0=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalAsl.g:3398:2: ( ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) )
            // InternalAsl.g:3399:2: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            {
            // InternalAsl.g:3399:2: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            // InternalAsl.g:3400:3: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )?
            {
            // InternalAsl.g:3400:3: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_VART) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_UNNAMEDVART) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAsl.g:3401:4: ( (lv_var_0_0= RULE_VART ) )
                    {
                    // InternalAsl.g:3401:4: ( (lv_var_0_0= RULE_VART ) )
                    // InternalAsl.g:3402:5: (lv_var_0_0= RULE_VART )
                    {
                    // InternalAsl.g:3402:5: (lv_var_0_0= RULE_VART )
                    // InternalAsl.g:3403:6: lv_var_0_0= RULE_VART
                    {
                    lv_var_0_0=(Token)match(input,RULE_VART,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarVARTTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"var",
                      							lv_var_0_0,
                      							"jasonide.xtext.asl.Asl.VART");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:3420:4: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    {
                    // InternalAsl.g:3420:4: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    // InternalAsl.g:3421:5: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    {
                    // InternalAsl.g:3421:5: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    // InternalAsl.g:3422:6: lv_unnamedvar_1_0= RULE_UNNAMEDVART
                    {
                    lv_unnamedvar_1_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_unnamedvar_1_0, grammarAccess.getVarAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVarRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"unnamedvar",
                      							lv_unnamedvar_1_0,
                      							"jasonide.xtext.asl.Asl.UNNAMEDVART");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAsl.g:3439:3: ( (lv_list_2_0= ruleList ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==40) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAsl.g:3440:4: (lv_list_2_0= ruleList )
                    {
                    // InternalAsl.g:3440:4: (lv_list_2_0= ruleList )
                    // InternalAsl.g:3441:5: lv_list_2_0= ruleList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarAccess().getListListParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_list_2_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getVarRule());
                      					}
                      					set(
                      						current,
                      						"list",
                      						lv_list_2_0,
                      						"jasonide.xtext.asl.Asl.List");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleString"
    // InternalAsl.g:3462:1: entryRuleString returns [EObject current=null] : iv_ruleString= ruleString EOF ;
    public final EObject entryRuleString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString = null;


        try {
            // InternalAsl.g:3462:47: (iv_ruleString= ruleString EOF )
            // InternalAsl.g:3463:2: iv_ruleString= ruleString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleString=ruleString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString"


    // $ANTLR start "ruleString"
    // InternalAsl.g:3469:1: ruleString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRINGT ) ) ;
    public final EObject ruleString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalAsl.g:3475:2: ( ( (lv_string_0_0= RULE_STRINGT ) ) )
            // InternalAsl.g:3476:2: ( (lv_string_0_0= RULE_STRINGT ) )
            {
            // InternalAsl.g:3476:2: ( (lv_string_0_0= RULE_STRINGT ) )
            // InternalAsl.g:3477:3: (lv_string_0_0= RULE_STRINGT )
            {
            // InternalAsl.g:3477:3: (lv_string_0_0= RULE_STRINGT )
            // InternalAsl.g:3478:4: lv_string_0_0= RULE_STRINGT
            {
            lv_string_0_0=(Token)match(input,RULE_STRINGT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_string_0_0, grammarAccess.getStringAccess().getStringSTRINGTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringRule());
              				}
              				setWithLastConsumed(
              					current,
              					"string",
              					lv_string_0_0,
              					"jasonide.xtext.asl.Asl.STRINGT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString"


    // $ANTLR start "entryRuleNumber"
    // InternalAsl.g:3497:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:3499:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalAsl.g:3500:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalAsl.g:3509:1: ruleNumber returns [EObject current=null] : ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;
        Token otherlv_3=null;
        Token lv_decimalPart_4_0=null;
        Token lv_number_5_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:3516:2: ( ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ ) )
            // InternalAsl.g:3517:2: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ )
            {
            // InternalAsl.g:3517:2: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ )
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_NUMBERT) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred98_InternalAsl()) ) {
                    alt71=1;
                }
                else if ( (true) ) {
                    alt71=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA71_0==22) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAsl.g:3518:3: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
                    {
                    // InternalAsl.g:3518:3: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
                    // InternalAsl.g:3519:4: ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
                    {
                    // InternalAsl.g:3519:4: ( (lv_number_0_0= RULE_NUMBERT ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_NUMBERT) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalAsl.g:3520:5: (lv_number_0_0= RULE_NUMBERT )
                    	    {
                    	    // InternalAsl.g:3520:5: (lv_number_0_0= RULE_NUMBERT )
                    	    // InternalAsl.g:3521:6: lv_number_0_0= RULE_NUMBERT
                    	    {
                    	    lv_number_0_0=(Token)match(input,RULE_NUMBERT,FOLLOW_52); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_number_0_0, grammarAccess.getNumberAccess().getNumberNUMBERTTerminalRuleCall_0_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getNumberRule());
                    	      						}
                    	      						addWithLastConsumed(
                    	      							current,
                    	      							"number",
                    	      							lv_number_0_0,
                    	      							"jasonide.xtext.asl.Asl.NUMBERT");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    otherlv_1=(Token)match(input,22,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalAsl.g:3541:4: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_NUMBERT) ) {
                            int LA68_2 = input.LA(2);

                            if ( (synpred97_InternalAsl()) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
                    	    {
                    	    // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
                    	    // InternalAsl.g:3543:6: lv_decimalPart_2_0= RULE_NUMBERT
                    	    {
                    	    lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_decimalPart_2_0, grammarAccess.getNumberAccess().getDecimalPartNUMBERTTerminalRuleCall_0_2_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getNumberRule());
                    	      						}
                    	      						addWithLastConsumed(
                    	      							current,
                    	      							"decimalPart",
                    	      							lv_decimalPart_2_0,
                    	      							"jasonide.xtext.asl.Asl.NUMBERT");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:3561:3: (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ )
                    {
                    // InternalAsl.g:3561:3: (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ )
                    // InternalAsl.g:3562:4: otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalAsl.g:3566:4: ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_NUMBERT) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred99_InternalAsl()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalAsl.g:3567:5: (lv_decimalPart_4_0= RULE_NUMBERT )
                    	    {
                    	    // InternalAsl.g:3567:5: (lv_decimalPart_4_0= RULE_NUMBERT )
                    	    // InternalAsl.g:3568:6: lv_decimalPart_4_0= RULE_NUMBERT
                    	    {
                    	    lv_decimalPart_4_0=(Token)match(input,RULE_NUMBERT,FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_decimalPart_4_0, grammarAccess.getNumberAccess().getDecimalPartNUMBERTTerminalRuleCall_1_1_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getNumberRule());
                    	      						}
                    	      						addWithLastConsumed(
                    	      							current,
                    	      							"decimalPart",
                    	      							lv_decimalPart_4_0,
                    	      							"jasonide.xtext.asl.Asl.NUMBERT");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalAsl.g:3586:3: ( (lv_number_5_0= RULE_NUMBERT ) )+
                    {
                    // InternalAsl.g:3586:3: ( (lv_number_5_0= RULE_NUMBERT ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_NUMBERT) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred101_InternalAsl()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAsl.g:3587:4: (lv_number_5_0= RULE_NUMBERT )
                    	    {
                    	    // InternalAsl.g:3587:4: (lv_number_5_0= RULE_NUMBERT )
                    	    // InternalAsl.g:3588:5: lv_number_5_0= RULE_NUMBERT
                    	    {
                    	    lv_number_5_0=(Token)match(input,RULE_NUMBERT,FOLLOW_54); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(lv_number_5_0, grammarAccess.getNumberAccess().getNumberNUMBERTTerminalRuleCall_2_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					if (current==null) {
                    	      						current = createModelElement(grammarAccess.getNumberRule());
                    	      					}
                    	      					addWithLastConsumed(
                    	      						current,
                    	      						"number",
                    	      						lv_number_5_0,
                    	      						"jasonide.xtext.asl.Asl.NUMBERT");
                    	      				
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJASON_ATOM"
    // InternalAsl.g:3611:1: entryRuleJASON_ATOM returns [String current=null] : iv_ruleJASON_ATOM= ruleJASON_ATOM EOF ;
    public final String entryRuleJASON_ATOM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJASON_ATOM = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:3613:2: (iv_ruleJASON_ATOM= ruleJASON_ATOM EOF )
            // InternalAsl.g:3614:2: iv_ruleJASON_ATOM= ruleJASON_ATOM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOMRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJASON_ATOM=ruleJASON_ATOM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM"


    // $ANTLR start "ruleJASON_ATOM"
    // InternalAsl.g:3623:1: ruleJASON_ATOM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) | this_ATOMAPOST_2= RULE_ATOMAPOST ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ATOMAPOST_2=null;
        AntlrDatatypeRuleToken this_JASON_ATOM_HEAD_0 = null;

        AntlrDatatypeRuleToken this_JASON_ATOM_TAIL_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalAsl.g:3630:2: ( ( (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) | this_ATOMAPOST_2= RULE_ATOMAPOST ) )
            // InternalAsl.g:3631:2: ( (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) | this_ATOMAPOST_2= RULE_ATOMAPOST )
            {
            // InternalAsl.g:3631:2: ( (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) | this_ATOMAPOST_2= RULE_ATOMAPOST )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ATOM||LA73_0==22) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ATOMAPOST) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalAsl.g:3632:3: (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* )
                    {
                    // InternalAsl.g:3632:3: (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* )
                    // InternalAsl.g:3633:4: this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_HEADParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_JASON_ATOM_HEAD_0=ruleJASON_ATOM_HEAD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_JASON_ATOM_HEAD_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalAsl.g:3643:4: (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==22) ) {
                            int LA72_2 = input.LA(2);

                            if ( (LA72_2==RULE_ATOM) ) {
                                int LA72_3 = input.LA(3);

                                if ( (synpred102_InternalAsl()) ) {
                                    alt72=1;
                                }


                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalAsl.g:3644:5: this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_TAILParserRuleCall_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    this_JASON_ATOM_TAIL_1=ruleJASON_ATOM_TAIL();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_JASON_ATOM_TAIL_1);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalAsl.g:3657:3: this_ATOMAPOST_2= RULE_ATOMAPOST
                    {
                    this_ATOMAPOST_2=(Token)match(input,RULE_ATOMAPOST,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ATOMAPOST_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ATOMAPOST_2, grammarAccess.getJASON_ATOMAccess().getATOMAPOSTTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM"


    // $ANTLR start "entryRuleJASON_ATOM_HEAD"
    // InternalAsl.g:3671:1: entryRuleJASON_ATOM_HEAD returns [String current=null] : iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF ;
    public final String entryRuleJASON_ATOM_HEAD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJASON_ATOM_HEAD = null;


        try {
            // InternalAsl.g:3671:55: (iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF )
            // InternalAsl.g:3672:2: iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOM_HEADRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJASON_ATOM_HEAD=ruleJASON_ATOM_HEAD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM_HEAD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM_HEAD"


    // $ANTLR start "ruleJASON_ATOM_HEAD"
    // InternalAsl.g:3678:1: ruleJASON_ATOM_HEAD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM_HEAD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalAsl.g:3684:2: ( ( (kw= '.' )? this_ATOM_1= RULE_ATOM ) )
            // InternalAsl.g:3685:2: ( (kw= '.' )? this_ATOM_1= RULE_ATOM )
            {
            // InternalAsl.g:3685:2: ( (kw= '.' )? this_ATOM_1= RULE_ATOM )
            // InternalAsl.g:3686:3: (kw= '.' )? this_ATOM_1= RULE_ATOM
            {
            // InternalAsl.g:3686:3: (kw= '.' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==22) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAsl.g:3687:4: kw= '.'
                    {
                    kw=(Token)match(input,22,FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getJASON_ATOM_HEADAccess().getFullStopKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ATOM_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ATOM_1, grammarAccess.getJASON_ATOM_HEADAccess().getATOMTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM_HEAD"


    // $ANTLR start "entryRuleJASON_ATOM_TAIL"
    // InternalAsl.g:3704:1: entryRuleJASON_ATOM_TAIL returns [String current=null] : iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF ;
    public final String entryRuleJASON_ATOM_TAIL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJASON_ATOM_TAIL = null;


        try {
            // InternalAsl.g:3704:55: (iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF )
            // InternalAsl.g:3705:2: iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOM_TAILRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJASON_ATOM_TAIL=ruleJASON_ATOM_TAIL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM_TAIL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM_TAIL"


    // $ANTLR start "ruleJASON_ATOM_TAIL"
    // InternalAsl.g:3711:1: ruleJASON_ATOM_TAIL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM_TAIL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalAsl.g:3717:2: ( (kw= '.' this_ATOM_1= RULE_ATOM ) )
            // InternalAsl.g:3718:2: (kw= '.' this_ATOM_1= RULE_ATOM )
            {
            // InternalAsl.g:3718:2: (kw= '.' this_ATOM_1= RULE_ATOM )
            // InternalAsl.g:3719:3: kw= '.' this_ATOM_1= RULE_ATOM
            {
            kw=(Token)match(input,22,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getJASON_ATOM_TAILAccess().getFullStopKeyword_0());
              		
            }
            this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ATOM_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ATOM_1, grammarAccess.getJASON_ATOM_TAILAccess().getATOMTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM_TAIL"


    // $ANTLR start "entryRuleTK_BEGIN"
    // InternalAsl.g:3735:1: entryRuleTK_BEGIN returns [String current=null] : iv_ruleTK_BEGIN= ruleTK_BEGIN EOF ;
    public final String entryRuleTK_BEGIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_BEGIN = null;


        try {
            // InternalAsl.g:3735:48: (iv_ruleTK_BEGIN= ruleTK_BEGIN EOF )
            // InternalAsl.g:3736:2: iv_ruleTK_BEGIN= ruleTK_BEGIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_BEGINRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_BEGIN=ruleTK_BEGIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_BEGIN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_BEGIN"


    // $ANTLR start "ruleTK_BEGIN"
    // InternalAsl.g:3742:1: ruleTK_BEGIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'begin' ;
    public final AntlrDatatypeRuleToken ruleTK_BEGIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3748:2: (kw= 'begin' )
            // InternalAsl.g:3749:2: kw= 'begin'
            {
            kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_BEGINAccess().getBeginKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_BEGIN"


    // $ANTLR start "entryRuleTK_END"
    // InternalAsl.g:3757:1: entryRuleTK_END returns [String current=null] : iv_ruleTK_END= ruleTK_END EOF ;
    public final String entryRuleTK_END() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_END = null;


        try {
            // InternalAsl.g:3757:46: (iv_ruleTK_END= ruleTK_END EOF )
            // InternalAsl.g:3758:2: iv_ruleTK_END= ruleTK_END EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_ENDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_END=ruleTK_END();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_END.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_END"


    // $ANTLR start "ruleTK_END"
    // InternalAsl.g:3764:1: ruleTK_END returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleTK_END() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3770:2: (kw= 'end' )
            // InternalAsl.g:3771:2: kw= 'end'
            {
            kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_ENDAccess().getEndKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_END"


    // $ANTLR start "entryRuleTK_IF"
    // InternalAsl.g:3779:1: entryRuleTK_IF returns [String current=null] : iv_ruleTK_IF= ruleTK_IF EOF ;
    public final String entryRuleTK_IF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_IF = null;


        try {
            // InternalAsl.g:3779:45: (iv_ruleTK_IF= ruleTK_IF EOF )
            // InternalAsl.g:3780:2: iv_ruleTK_IF= ruleTK_IF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_IFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_IF=ruleTK_IF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_IF.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_IF"


    // $ANTLR start "ruleTK_IF"
    // InternalAsl.g:3786:1: ruleTK_IF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleTK_IF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3792:2: (kw= 'if' )
            // InternalAsl.g:3793:2: kw= 'if'
            {
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_IFAccess().getIfKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_IF"


    // $ANTLR start "entryRuleTK_ELSE"
    // InternalAsl.g:3801:1: entryRuleTK_ELSE returns [String current=null] : iv_ruleTK_ELSE= ruleTK_ELSE EOF ;
    public final String entryRuleTK_ELSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_ELSE = null;


        try {
            // InternalAsl.g:3801:47: (iv_ruleTK_ELSE= ruleTK_ELSE EOF )
            // InternalAsl.g:3802:2: iv_ruleTK_ELSE= ruleTK_ELSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_ELSERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_ELSE=ruleTK_ELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_ELSE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ELSE"


    // $ANTLR start "ruleTK_ELSE"
    // InternalAsl.g:3808:1: ruleTK_ELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleTK_ELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3814:2: (kw= 'else' )
            // InternalAsl.g:3815:2: kw= 'else'
            {
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_ELSEAccess().getElseKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_ELSE"


    // $ANTLR start "entryRuleTK_ELIF"
    // InternalAsl.g:3823:1: entryRuleTK_ELIF returns [String current=null] : iv_ruleTK_ELIF= ruleTK_ELIF EOF ;
    public final String entryRuleTK_ELIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_ELIF = null;


        try {
            // InternalAsl.g:3823:47: (iv_ruleTK_ELIF= ruleTK_ELIF EOF )
            // InternalAsl.g:3824:2: iv_ruleTK_ELIF= ruleTK_ELIF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_ELIFRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_ELIF=ruleTK_ELIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_ELIF.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ELIF"


    // $ANTLR start "ruleTK_ELIF"
    // InternalAsl.g:3830:1: ruleTK_ELIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'elif' ;
    public final AntlrDatatypeRuleToken ruleTK_ELIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3836:2: (kw= 'elif' )
            // InternalAsl.g:3837:2: kw= 'elif'
            {
            kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_ELIFAccess().getElifKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_ELIF"


    // $ANTLR start "entryRuleTK_FOR"
    // InternalAsl.g:3845:1: entryRuleTK_FOR returns [String current=null] : iv_ruleTK_FOR= ruleTK_FOR EOF ;
    public final String entryRuleTK_FOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_FOR = null;


        try {
            // InternalAsl.g:3845:46: (iv_ruleTK_FOR= ruleTK_FOR EOF )
            // InternalAsl.g:3846:2: iv_ruleTK_FOR= ruleTK_FOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_FORRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_FOR=ruleTK_FOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_FOR.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_FOR"


    // $ANTLR start "ruleTK_FOR"
    // InternalAsl.g:3852:1: ruleTK_FOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleTK_FOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3858:2: (kw= 'for' )
            // InternalAsl.g:3859:2: kw= 'for'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_FORAccess().getForKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_FOR"


    // $ANTLR start "entryRuleTK_WHILE"
    // InternalAsl.g:3867:1: entryRuleTK_WHILE returns [String current=null] : iv_ruleTK_WHILE= ruleTK_WHILE EOF ;
    public final String entryRuleTK_WHILE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_WHILE = null;


        try {
            // InternalAsl.g:3867:48: (iv_ruleTK_WHILE= ruleTK_WHILE EOF )
            // InternalAsl.g:3868:2: iv_ruleTK_WHILE= ruleTK_WHILE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_WHILERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_WHILE=ruleTK_WHILE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_WHILE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_WHILE"


    // $ANTLR start "ruleTK_WHILE"
    // InternalAsl.g:3874:1: ruleTK_WHILE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'while' ;
    public final AntlrDatatypeRuleToken ruleTK_WHILE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3880:2: (kw= 'while' )
            // InternalAsl.g:3881:2: kw= 'while'
            {
            kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_WHILEAccess().getWhileKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_WHILE"


    // $ANTLR start "entryRuleTK_NOT"
    // InternalAsl.g:3889:1: entryRuleTK_NOT returns [String current=null] : iv_ruleTK_NOT= ruleTK_NOT EOF ;
    public final String entryRuleTK_NOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_NOT = null;


        try {
            // InternalAsl.g:3889:46: (iv_ruleTK_NOT= ruleTK_NOT EOF )
            // InternalAsl.g:3890:2: iv_ruleTK_NOT= ruleTK_NOT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_NOTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_NOT=ruleTK_NOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_NOT.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_NOT"


    // $ANTLR start "ruleTK_NOT"
    // InternalAsl.g:3896:1: ruleTK_NOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleTK_NOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3902:2: (kw= 'not' )
            // InternalAsl.g:3903:2: kw= 'not'
            {
            kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_NOTAccess().getNotKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_NOT"


    // $ANTLR start "entryRuleTK_INTDIV"
    // InternalAsl.g:3911:1: entryRuleTK_INTDIV returns [String current=null] : iv_ruleTK_INTDIV= ruleTK_INTDIV EOF ;
    public final String entryRuleTK_INTDIV() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_INTDIV = null;


        try {
            // InternalAsl.g:3911:49: (iv_ruleTK_INTDIV= ruleTK_INTDIV EOF )
            // InternalAsl.g:3912:2: iv_ruleTK_INTDIV= ruleTK_INTDIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_INTDIVRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_INTDIV=ruleTK_INTDIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_INTDIV.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_INTDIV"


    // $ANTLR start "ruleTK_INTDIV"
    // InternalAsl.g:3918:1: ruleTK_INTDIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken ruleTK_INTDIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3924:2: (kw= 'div' )
            // InternalAsl.g:3925:2: kw= 'div'
            {
            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_INTDIVAccess().getDivKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_INTDIV"


    // $ANTLR start "entryRuleTK_INTMOD"
    // InternalAsl.g:3933:1: entryRuleTK_INTMOD returns [String current=null] : iv_ruleTK_INTMOD= ruleTK_INTMOD EOF ;
    public final String entryRuleTK_INTMOD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_INTMOD = null;


        try {
            // InternalAsl.g:3933:49: (iv_ruleTK_INTMOD= ruleTK_INTMOD EOF )
            // InternalAsl.g:3934:2: iv_ruleTK_INTMOD= ruleTK_INTMOD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_INTMODRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_INTMOD=ruleTK_INTMOD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_INTMOD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_INTMOD"


    // $ANTLR start "ruleTK_INTMOD"
    // InternalAsl.g:3940:1: ruleTK_INTMOD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken ruleTK_INTMOD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3946:2: (kw= 'mod' )
            // InternalAsl.g:3947:2: kw= 'mod'
            {
            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_INTMODAccess().getModKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_INTMOD"


    // $ANTLR start "entryRuleTK_TRUE"
    // InternalAsl.g:3955:1: entryRuleTK_TRUE returns [String current=null] : iv_ruleTK_TRUE= ruleTK_TRUE EOF ;
    public final String entryRuleTK_TRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_TRUE = null;


        try {
            // InternalAsl.g:3955:47: (iv_ruleTK_TRUE= ruleTK_TRUE EOF )
            // InternalAsl.g:3956:2: iv_ruleTK_TRUE= ruleTK_TRUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_TRUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_TRUE=ruleTK_TRUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_TRUE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_TRUE"


    // $ANTLR start "ruleTK_TRUE"
    // InternalAsl.g:3962:1: ruleTK_TRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTK_TRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3968:2: (kw= 'true' )
            // InternalAsl.g:3969:2: kw= 'true'
            {
            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_TRUEAccess().getTrueKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_TRUE"


    // $ANTLR start "entryRuleTK_FALSE"
    // InternalAsl.g:3977:1: entryRuleTK_FALSE returns [String current=null] : iv_ruleTK_FALSE= ruleTK_FALSE EOF ;
    public final String entryRuleTK_FALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_FALSE = null;


        try {
            // InternalAsl.g:3977:48: (iv_ruleTK_FALSE= ruleTK_FALSE EOF )
            // InternalAsl.g:3978:2: iv_ruleTK_FALSE= ruleTK_FALSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_FALSERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTK_FALSE=ruleTK_FALSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_FALSE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_FALSE"


    // $ANTLR start "ruleTK_FALSE"
    // InternalAsl.g:3984:1: ruleTK_FALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleTK_FALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsl.g:3990:2: (kw= 'false' )
            // InternalAsl.g:3991:2: kw= 'false'
            {
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTK_FALSEAccess().getFalseKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_FALSE"

    // $ANTLR start synpred1_InternalAsl
    public final void synpred1_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_0_0 = null;


        // InternalAsl.g:86:4: ( (lv_directive_0_0= ruleDirective ) )
        // InternalAsl.g:86:4: (lv_directive_0_0= ruleDirective )
        {
        // InternalAsl.g:86:4: (lv_directive_0_0= ruleDirective )
        // InternalAsl.g:87:5: lv_directive_0_0= ruleDirective
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_0_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_directive_0_0=ruleDirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalAsl

    // $ANTLR start synpred2_InternalAsl
    public final void synpred2_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_2_0 = null;


        // InternalAsl.g:125:5: ( (lv_directive_2_0= ruleDirective ) )
        // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
        {
        // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
        // InternalAsl.g:126:6: lv_directive_2_0= ruleDirective
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_directive_2_0=ruleDirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalAsl

    // $ANTLR start synpred3_InternalAsl
    public final void synpred3_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_belief_1_0 = null;

        EObject lv_directive_2_0 = null;


        // InternalAsl.g:105:4: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )
        // InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )*
        {
        // InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) )
        // InternalAsl.g:106:5: (lv_belief_1_0= ruleBelief )
        {
        // InternalAsl.g:106:5: (lv_belief_1_0= ruleBelief )
        // InternalAsl.g:107:6: lv_belief_1_0= ruleBelief
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_4);
        lv_belief_1_0=ruleBelief();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAsl.g:124:4: ( (lv_directive_2_0= ruleDirective ) )*
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==19) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
        	    {
        	    // InternalAsl.g:125:5: (lv_directive_2_0= ruleDirective )
        	    // InternalAsl.g:126:6: lv_directive_2_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {

        	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0());
        	      					
        	    }
        	    pushFollow(FOLLOW_3);
        	    lv_directive_2_0=ruleDirective();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop75;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred3_InternalAsl

    // $ANTLR start synpred4_InternalAsl
    public final void synpred4_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_4_0 = null;


        // InternalAsl.g:165:5: ( (lv_directive_4_0= ruleDirective ) )
        // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
        {
        // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
        // InternalAsl.g:166:6: lv_directive_4_0= ruleDirective
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_directive_4_0=ruleDirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalAsl

    // $ANTLR start synpred5_InternalAsl
    public final void synpred5_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_initial_goal_3_0 = null;

        EObject lv_directive_4_0 = null;


        // InternalAsl.g:145:4: ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )
        // InternalAsl.g:145:4: ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )*
        {
        // InternalAsl.g:145:4: ( (lv_initial_goal_3_0= ruleInitial_goal ) )
        // InternalAsl.g:146:5: (lv_initial_goal_3_0= ruleInitial_goal )
        {
        // InternalAsl.g:146:5: (lv_initial_goal_3_0= ruleInitial_goal )
        // InternalAsl.g:147:6: lv_initial_goal_3_0= ruleInitial_goal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getInitial_goalInitial_goalParserRuleCall_2_0_0());
          					
        }
        pushFollow(FOLLOW_4);
        lv_initial_goal_3_0=ruleInitial_goal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAsl.g:164:4: ( (lv_directive_4_0= ruleDirective ) )*
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==19) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
        	    {
        	    // InternalAsl.g:165:5: (lv_directive_4_0= ruleDirective )
        	    // InternalAsl.g:166:6: lv_directive_4_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {

        	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0());
        	      					
        	    }
        	    pushFollow(FOLLOW_3);
        	    lv_directive_4_0=ruleDirective();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop76;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred5_InternalAsl

    // $ANTLR start synpred6_InternalAsl
    public final void synpred6_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_belief_6_0 = null;


        // InternalAsl.g:205:5: ( (lv_belief_6_0= ruleBelief ) )
        // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
        {
        // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
        // InternalAsl.g:206:6: lv_belief_6_0= ruleBelief
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_belief_6_0=ruleBelief();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalAsl

    // $ANTLR start synpred7_InternalAsl
    public final void synpred7_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_7_0 = null;


        // InternalAsl.g:224:5: ( (lv_directive_7_0= ruleDirective ) )
        // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
        {
        // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
        // InternalAsl.g:225:6: lv_directive_7_0= ruleDirective
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_directive_7_0=ruleDirective();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalAsl

    // $ANTLR start synpred8_InternalAsl
    public final void synpred8_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_plan_5_0 = null;

        EObject lv_belief_6_0 = null;

        EObject lv_directive_7_0 = null;


        // InternalAsl.g:185:4: ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )
        // InternalAsl.g:185:4: ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )*
        {
        // InternalAsl.g:185:4: ( (lv_plan_5_0= rulePlan ) )
        // InternalAsl.g:186:5: (lv_plan_5_0= rulePlan )
        {
        // InternalAsl.g:186:5: (lv_plan_5_0= rulePlan )
        // InternalAsl.g:187:6: lv_plan_5_0= rulePlan
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAgentAccess().getPlanPlanParserRuleCall_3_0_0());
          					
        }
        pushFollow(FOLLOW_4);
        lv_plan_5_0=rulePlan();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAsl.g:204:4: ( (lv_belief_6_0= ruleBelief ) )*
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_TK_NEG && LA77_0<=RULE_UNNAMEDVART)||(LA77_0>=RULE_ATOMAPOST && LA77_0<=RULE_ATOM)||LA77_0==22||LA77_0==38||(LA77_0>=52 && LA77_0<=53)||(LA77_0>=62 && LA77_0<=63)) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
        	    {
        	    // InternalAsl.g:205:5: (lv_belief_6_0= ruleBelief )
        	    // InternalAsl.g:206:6: lv_belief_6_0= ruleBelief
        	    {
        	    if ( state.backtracking==0 ) {

        	      						newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0());
        	      					
        	    }
        	    pushFollow(FOLLOW_4);
        	    lv_belief_6_0=ruleBelief();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop77;
            }
        } while (true);

        // InternalAsl.g:223:4: ( (lv_directive_7_0= ruleDirective ) )*
        loop78:
        do {
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==19) ) {
                alt78=1;
            }


            switch (alt78) {
        	case 1 :
        	    // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
        	    {
        	    // InternalAsl.g:224:5: (lv_directive_7_0= ruleDirective )
        	    // InternalAsl.g:225:6: lv_directive_7_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {

        	      						newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0());
        	      					
        	    }
        	    pushFollow(FOLLOW_3);
        	    lv_directive_7_0=ruleDirective();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop78;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred8_InternalAsl

    // $ANTLR start synpred15_InternalAsl
    public final void synpred15_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_literal_1_0 = null;


        // InternalAsl.g:662:4: ( ( (lv_literal_1_0= ruleLiteral ) ) )
        // InternalAsl.g:662:4: ( (lv_literal_1_0= ruleLiteral ) )
        {
        // InternalAsl.g:662:4: ( (lv_literal_1_0= ruleLiteral ) )
        // InternalAsl.g:663:5: (lv_literal_1_0= ruleLiteral )
        {
        // InternalAsl.g:663:5: (lv_literal_1_0= ruleLiteral )
        // InternalAsl.g:664:6: lv_literal_1_0= ruleLiteral
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTriggerAccess().getLiteralLiteralParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_literal_1_0=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalAsl

    // $ANTLR start synpred21_InternalAsl
    public final void synpred21_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_plan_body_2_0 = null;


        // InternalAsl.g:798:4: ( (lv_plan_body_2_0= rulePlan_body ) )
        // InternalAsl.g:798:4: (lv_plan_body_2_0= rulePlan_body )
        {
        // InternalAsl.g:798:4: (lv_plan_body_2_0= rulePlan_body )
        // InternalAsl.g:799:5: lv_plan_body_2_0= rulePlan_body
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_bodyPlan_bodyParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_plan_body_2_0=rulePlan_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalAsl

    // $ANTLR start synpred37_InternalAsl
    public final void synpred37_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;

        // InternalAsl.g:1435:4: ( (otherlv_7= '-' (otherlv_8= '+' )? ) )
        // InternalAsl.g:1435:4: (otherlv_7= '-' (otherlv_8= '+' )? )
        {
        // InternalAsl.g:1435:4: (otherlv_7= '-' (otherlv_8= '+' )? )
        // InternalAsl.g:1436:5: otherlv_7= '-' (otherlv_8= '+' )?
        {
        otherlv_7=(Token)match(input,27,FOLLOW_56); if (state.failed) return ;
        // InternalAsl.g:1440:5: (otherlv_8= '+' )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==26) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // InternalAsl.g:1441:6: otherlv_8= '+'
                {
                otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalAsl

    // $ANTLR start synpred43_InternalAsl
    public final void synpred43_InternalAsl_fragment() throws RecognitionException {   
        Token lv_tk_label_at_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_pred_3_0 = null;

        EObject lv_trigger_4_0 = null;

        EObject lv_log_expr_6_0 = null;


        // InternalAsl.g:1523:4: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )
        // InternalAsl.g:1523:4: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )?
        {
        // InternalAsl.g:1523:4: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_TK_LABEL_AT) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // InternalAsl.g:1524:5: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) )
                {
                // InternalAsl.g:1524:5: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) )
                // InternalAsl.g:1525:6: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                {
                // InternalAsl.g:1525:6: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                // InternalAsl.g:1526:7: lv_tk_label_at_2_0= RULE_TK_LABEL_AT
                {
                lv_tk_label_at_2_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_5); if (state.failed) return ;

                }


                }

                // InternalAsl.g:1542:5: ( (lv_pred_3_0= rulePred ) )
                // InternalAsl.g:1543:6: (lv_pred_3_0= rulePred )
                {
                // InternalAsl.g:1543:6: (lv_pred_3_0= rulePred )
                // InternalAsl.g:1544:7: lv_pred_3_0= rulePred
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPlan_termAccess().getPredPredParserRuleCall_2_0_1_0());
                  						
                }
                pushFollow(FOLLOW_12);
                lv_pred_3_0=rulePred();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalAsl.g:1562:4: ( (lv_trigger_4_0= ruleTrigger ) )
        // InternalAsl.g:1563:5: (lv_trigger_4_0= ruleTrigger )
        {
        // InternalAsl.g:1563:5: (lv_trigger_4_0= ruleTrigger )
        // InternalAsl.g:1564:6: lv_trigger_4_0= ruleTrigger
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPlan_termAccess().getTriggerTriggerParserRuleCall_2_1_0());
          					
        }
        pushFollow(FOLLOW_57);
        lv_trigger_4_0=ruleTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAsl.g:1581:4: (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==24) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // InternalAsl.g:1582:5: otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) )
                {
                otherlv_5=(Token)match(input,24,FOLLOW_8); if (state.failed) return ;
                // InternalAsl.g:1586:5: ( (lv_log_expr_6_0= ruleLog_expr ) )
                // InternalAsl.g:1587:6: (lv_log_expr_6_0= ruleLog_expr )
                {
                // InternalAsl.g:1587:6: (lv_log_expr_6_0= ruleLog_expr )
                // InternalAsl.g:1588:7: lv_log_expr_6_0= ruleLog_expr
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getPlan_termAccess().getLog_exprLog_exprParserRuleCall_2_2_1_0());
                  						
                }
                pushFollow(FOLLOW_58);
                lv_log_expr_6_0=ruleLog_expr();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalAsl.g:1606:4: (otherlv_7= '<-' | otherlv_8= ';' )?
        int alt84=3;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==25) ) {
            alt84=1;
        }
        else if ( (LA84_0==30) ) {
            alt84=2;
        }
        switch (alt84) {
            case 1 :
                // InternalAsl.g:1607:5: otherlv_7= '<-'
                {
                otherlv_7=(Token)match(input,25,FOLLOW_2); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalAsl.g:1612:5: otherlv_8= ';'
                {
                otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred43_InternalAsl

    // $ANTLR start synpred44_InternalAsl
    public final void synpred44_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_literal_9_0 = null;

        EObject lv_log_expr2_11_0 = null;


        // InternalAsl.g:1619:4: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )
        // InternalAsl.g:1619:4: ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) )
        {
        // InternalAsl.g:1619:4: ( (lv_literal_9_0= ruleLiteral ) )
        // InternalAsl.g:1620:5: (lv_literal_9_0= ruleLiteral )
        {
        // InternalAsl.g:1620:5: (lv_literal_9_0= ruleLiteral )
        // InternalAsl.g:1621:6: lv_literal_9_0= ruleLiteral
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPlan_termAccess().getLiteralLiteralParserRuleCall_3_0_0());
          					
        }
        pushFollow(FOLLOW_32);
        lv_literal_9_0=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,21,FOLLOW_8); if (state.failed) return ;
        // InternalAsl.g:1642:4: ( (lv_log_expr2_11_0= ruleLog_expr ) )
        // InternalAsl.g:1643:5: (lv_log_expr2_11_0= ruleLog_expr )
        {
        // InternalAsl.g:1643:5: (lv_log_expr2_11_0= ruleLog_expr )
        // InternalAsl.g:1644:6: lv_log_expr2_11_0= ruleLog_expr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPlan_termAccess().getLog_expr2Log_exprParserRuleCall_3_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_log_expr2_11_0=ruleLog_expr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred44_InternalAsl

    // $ANTLR start synpred48_InternalAsl
    public final void synpred48_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_atom_0_0 = null;

        EObject lv_var_1_0 = null;


        // InternalAsl.g:1706:5: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )
        // InternalAsl.g:1706:5: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::'
        {
        // InternalAsl.g:1706:5: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )?
        int alt85=3;
        int LA85_0 = input.LA(1);

        if ( ((LA85_0>=RULE_ATOMAPOST && LA85_0<=RULE_ATOM)||LA85_0==22) ) {
            alt85=1;
        }
        else if ( ((LA85_0>=RULE_VART && LA85_0<=RULE_UNNAMEDVART)) ) {
            alt85=2;
        }
        switch (alt85) {
            case 1 :
                // InternalAsl.g:1707:6: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                {
                // InternalAsl.g:1707:6: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                // InternalAsl.g:1708:7: (lv_atom_0_0= ruleJASON_ATOM )
                {
                // InternalAsl.g:1708:7: (lv_atom_0_0= ruleJASON_ATOM )
                // InternalAsl.g:1709:8: lv_atom_0_0= ruleJASON_ATOM
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getLiteralAccess().getAtomJASON_ATOMParserRuleCall_0_0_0_0_0());
                  							
                }
                pushFollow(FOLLOW_33);
                lv_atom_0_0=ruleJASON_ATOM();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalAsl.g:1727:6: ( (lv_var_1_0= ruleVar ) )
                {
                // InternalAsl.g:1727:6: ( (lv_var_1_0= ruleVar ) )
                // InternalAsl.g:1728:7: (lv_var_1_0= ruleVar )
                {
                // InternalAsl.g:1728:7: (lv_var_1_0= ruleVar )
                // InternalAsl.g:1729:8: lv_var_1_0= ruleVar
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_0_0_0_1_0());
                  							
                }
                pushFollow(FOLLOW_33);
                lv_var_1_0=ruleVar();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalAsl

    // $ANTLR start synpred55_InternalAsl
    public final void synpred55_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_terms_4_0 = null;


        // InternalAsl.g:1933:4: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )
        // InternalAsl.g:1933:4: otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,33,FOLLOW_37); if (state.failed) return ;
        // InternalAsl.g:1937:4: ( (lv_terms_4_0= ruleTerms ) )
        // InternalAsl.g:1938:5: (lv_terms_4_0= ruleTerms )
        {
        // InternalAsl.g:1938:5: (lv_terms_4_0= ruleTerms )
        // InternalAsl.g:1939:6: lv_terms_4_0= ruleTerms
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_22);
        lv_terms_4_0=ruleTerms();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalAsl

    // $ANTLR start synpred56_InternalAsl
    public final void synpred56_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_plan_term_6_0 = null;


        // InternalAsl.g:1962:4: ( (lv_plan_term_6_0= rulePlan_term ) )
        // InternalAsl.g:1962:4: (lv_plan_term_6_0= rulePlan_term )
        {
        // InternalAsl.g:1962:4: (lv_plan_term_6_0= rulePlan_term )
        // InternalAsl.g:1963:5: lv_plan_term_6_0= rulePlan_term
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getPredAccess().getPlan_termPlan_termParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_plan_term_6_0=rulePlan_term();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred56_InternalAsl

    // $ANTLR start synpred84_InternalAsl
    public final void synpred84_InternalAsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_subadd_1_0 = null;

        EObject lv_arithm_expr_2_0 = null;


        // InternalAsl.g:2875:4: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )
        // InternalAsl.g:2875:4: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
        {
        // InternalAsl.g:2875:4: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) )
        // InternalAsl.g:2876:5: (lv_subadd_1_0= ruleTK_SUB_ADD )
        {
        // InternalAsl.g:2876:5: (lv_subadd_1_0= ruleTK_SUB_ADD )
        // InternalAsl.g:2877:6: lv_subadd_1_0= ruleTK_SUB_ADD
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithm_exprAccess().getSubaddTK_SUB_ADDParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_48);
        lv_subadd_1_0=ruleTK_SUB_ADD();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalAsl.g:2894:4: ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
        // InternalAsl.g:2895:5: (lv_arithm_expr_2_0= ruleArithm_expr )
        {
        // InternalAsl.g:2895:5: (lv_arithm_expr_2_0= ruleArithm_expr )
        // InternalAsl.g:2896:6: lv_arithm_expr_2_0= ruleArithm_expr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_arithm_expr_2_0=ruleArithm_expr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred84_InternalAsl

    // $ANTLR start synpred97_InternalAsl
    public final void synpred97_InternalAsl_fragment() throws RecognitionException {   
        Token lv_decimalPart_2_0=null;

        // InternalAsl.g:3542:5: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )
        // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
        {
        // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
        // InternalAsl.g:3543:6: lv_decimalPart_2_0= RULE_NUMBERT
        {
        lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalAsl

    // $ANTLR start synpred98_InternalAsl
    public final void synpred98_InternalAsl_fragment() throws RecognitionException {   
        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;

        // InternalAsl.g:3518:3: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) )
        // InternalAsl.g:3518:3: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
        {
        // InternalAsl.g:3518:3: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
        // InternalAsl.g:3519:4: ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
        {
        // InternalAsl.g:3519:4: ( (lv_number_0_0= RULE_NUMBERT ) )+
        int cnt96=0;
        loop96:
        do {
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_NUMBERT) ) {
                alt96=1;
            }


            switch (alt96) {
        	case 1 :
        	    // InternalAsl.g:3520:5: (lv_number_0_0= RULE_NUMBERT )
        	    {
        	    // InternalAsl.g:3520:5: (lv_number_0_0= RULE_NUMBERT )
        	    // InternalAsl.g:3521:6: lv_number_0_0= RULE_NUMBERT
        	    {
        	    lv_number_0_0=(Token)match(input,RULE_NUMBERT,FOLLOW_52); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt96 >= 1 ) break loop96;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(96, input);
                    throw eee;
            }
            cnt96++;
        } while (true);

        otherlv_1=(Token)match(input,22,FOLLOW_53); if (state.failed) return ;
        // InternalAsl.g:3541:4: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
        int cnt97=0;
        loop97:
        do {
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_NUMBERT) ) {
                alt97=1;
            }


            switch (alt97) {
        	case 1 :
        	    // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
        	    {
        	    // InternalAsl.g:3542:5: (lv_decimalPart_2_0= RULE_NUMBERT )
        	    // InternalAsl.g:3543:6: lv_decimalPart_2_0= RULE_NUMBERT
        	    {
        	    lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_54); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt97 >= 1 ) break loop97;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(97, input);
                    throw eee;
            }
            cnt97++;
        } while (true);


        }


        }
    }
    // $ANTLR end synpred98_InternalAsl

    // $ANTLR start synpred99_InternalAsl
    public final void synpred99_InternalAsl_fragment() throws RecognitionException {   
        Token lv_decimalPart_4_0=null;

        // InternalAsl.g:3567:5: ( (lv_decimalPart_4_0= RULE_NUMBERT ) )
        // InternalAsl.g:3567:5: (lv_decimalPart_4_0= RULE_NUMBERT )
        {
        // InternalAsl.g:3567:5: (lv_decimalPart_4_0= RULE_NUMBERT )
        // InternalAsl.g:3568:6: lv_decimalPart_4_0= RULE_NUMBERT
        {
        lv_decimalPart_4_0=(Token)match(input,RULE_NUMBERT,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred99_InternalAsl

    // $ANTLR start synpred101_InternalAsl
    public final void synpred101_InternalAsl_fragment() throws RecognitionException {   
        Token lv_number_5_0=null;

        // InternalAsl.g:3587:4: ( (lv_number_5_0= RULE_NUMBERT ) )
        // InternalAsl.g:3587:4: (lv_number_5_0= RULE_NUMBERT )
        {
        // InternalAsl.g:3587:4: (lv_number_5_0= RULE_NUMBERT )
        // InternalAsl.g:3588:5: lv_number_5_0= RULE_NUMBERT
        {
        lv_number_5_0=(Token)match(input,RULE_NUMBERT,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred101_InternalAsl

    // $ANTLR start synpred102_InternalAsl
    public final void synpred102_InternalAsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_JASON_ATOM_TAIL_1 = null;


        // InternalAsl.g:3644:5: (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )
        // InternalAsl.g:3644:5: this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_TAILParserRuleCall_0_1());
          				
        }
        pushFollow(FOLLOW_2);
        this_JASON_ATOM_TAIL_1=ruleJASON_ATOM_TAIL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_InternalAsl

    // Delegated rules

    public final boolean synpred1_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\4\1\uffff\13\0\1\uffff";
    static final String dfa_4s = "\1\77\1\uffff\13\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\13\uffff\1\1";
    static final String dfa_6s = "\2\uffff\1\7\1\2\1\5\1\11\1\12\1\0\1\4\1\1\1\3\1\6\1\10\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\10\1\5\1\6\2\uffff\1\4\1\3\7\uffff\1\1\2\uffff\1\2\1\1\2\uffff\3\1\11\uffff\1\7\15\uffff\1\11\1\12\10\uffff\1\13\1\14",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 104:3: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_12 = input.LA(1);

                         
                        int index3_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\24\uffff";
    static final String dfa_9s = "\1\1\23\uffff";
    static final String dfa_10s = "\1\4\2\uffff\13\0\6\uffff";
    static final String dfa_11s = "\1\77\2\uffff\13\0\6\uffff";
    static final String dfa_12s = "\1\uffff\1\2\21\uffff\1\1";
    static final String dfa_13s = "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\11\1\6\1\7\2\uffff\1\5\1\4\7\uffff\1\1\2\uffff\1\3\1\1\2\uffff\3\1\11\uffff\1\10\15\uffff\1\12\1\13\10\uffff\1\14\1\15",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 204:4: ( (lv_belief_6_0= ruleBelief ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\33\uffff";
    static final String dfa_16s = "\1\31\32\uffff";
    static final String dfa_17s = "\1\5\13\uffff\1\0\16\uffff";
    static final String dfa_18s = "\1\77\13\uffff\1\0\16\uffff";
    static final String dfa_19s = "\1\uffff\1\1\27\uffff\1\2\1\uffff";
    static final String dfa_20s = "\14\uffff\1\0\16\uffff}>";
    static final String[] dfa_21s = {
            "\7\1\7\uffff\1\1\1\31\1\uffff\1\14\1\1\2\uffff\2\1\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\15\uffff\3\1\2\uffff\3\1\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "797:3: ( (lv_plan_body_2_0= rulePlan_body ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_12 = input.LA(1);

                         
                        int index19_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index19_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\27\uffff";
    static final String dfa_23s = "\1\5\4\uffff\1\0\21\uffff";
    static final String dfa_24s = "\1\77\4\uffff\1\0\21\uffff";
    static final String dfa_25s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\17\uffff\1\5";
    static final String dfa_26s = "\5\uffff\1\0\21\uffff}>";
    static final String[] dfa_27s = {
            "\7\6\7\uffff\1\6\2\uffff\1\6\1\1\2\uffff\1\4\1\5\1\uffff\1\3\3\uffff\1\6\1\uffff\1\2\2\uffff\1\6\15\uffff\2\6\5\uffff\1\6\2\uffff\2\6",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1396:3: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalAsl()) ) {s = 22;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\45\uffff";
    static final String dfa_29s = "\1\4\1\uffff\2\5\1\uffff\1\11\4\0\1\5\1\6\4\0\1\11\4\0\1\5\1\6\4\0\1\13\4\0\1\13\4\0";
    static final String dfa_30s = "\1\77\1\uffff\2\77\1\uffff\1\13\4\0\2\65\4\0\1\13\4\0\2\65\4\0\1\13\4\0\1\13\4\0";
    static final String dfa_31s = "\1\uffff\1\1\2\uffff\1\2\40\uffff";
    static final String dfa_32s = "\6\uffff\1\4\1\3\1\24\1\0\2\uffff\1\5\1\16\1\25\1\15\1\uffff\1\6\1\23\1\26\1\13\2\uffff\1\1\1\20\1\2\1\21\1\uffff\1\22\1\7\1\27\1\11\1\uffff\1\12\1\17\1\14\1\10}>";
    static final String[] dfa_33s = {
            "\1\1\7\4\7\uffff\2\4\1\uffff\2\4\2\uffff\1\2\1\3\1\1\1\4\3\uffff\1\4\1\uffff\1\4\2\uffff\1\4\15\uffff\3\4\2\uffff\3\4\2\uffff\2\4",
            "",
            "\1\13\1\10\1\11\2\4\1\7\1\6\7\uffff\1\4\2\uffff\1\5\1\1\2\uffff\2\4\1\uffff\1\1\3\uffff\1\4\2\uffff\2\4\1\12\15\uffff\1\14\1\15\5\uffff\1\4\2\uffff\1\16\1\17",
            "\1\26\1\23\1\24\2\4\1\22\1\21\7\uffff\1\4\2\uffff\1\20\1\1\2\uffff\2\4\1\uffff\1\1\3\uffff\1\4\4\uffff\1\25\15\uffff\1\27\1\30\5\uffff\1\4\2\uffff\1\31\1\32",
            "",
            "\1\4\1\uffff\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\13\1\36\1\37\2\uffff\1\35\1\34\12\uffff\1\33\35\uffff\1\14\1\15",
            "\1\36\1\37\2\uffff\1\35\1\34\12\uffff\1\33\35\uffff\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\4\1\uffff\1\21",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\26\1\43\1\44\2\uffff\1\42\1\41\12\uffff\1\40\35\uffff\1\27\1\30",
            "\1\43\1\44\2\uffff\1\42\1\41\12\uffff\1\40\35\uffff\1\27\1\30",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\34",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1522:3: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_29 = input.LA(1);

                         
                        int index31_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_29);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_36 = input.LA(1);

                         
                        int index31_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_35 = input.LA(1);

                         
                        int index31_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_35);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\1\5\13\0\17\uffff";
    static final String dfa_35s = "\1\77\13\0\17\uffff";
    static final String dfa_36s = "\14\uffff\1\2\15\uffff\1\1";
    static final String dfa_37s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\17\uffff}>";
    static final String[] dfa_38s = {
            "\1\7\1\4\1\5\2\14\1\3\1\2\7\uffff\2\14\1\uffff\1\1\1\14\2\uffff\2\14\1\uffff\1\14\3\uffff\1\14\1\uffff\1\14\2\uffff\1\6\15\uffff\1\10\1\11\1\14\2\uffff\3\14\2\uffff\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1618:3: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalAsl()) ) {s = 26;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\65\uffff";
    static final String dfa_40s = "\1\2\64\uffff";
    static final String dfa_41s = "\1\5\1\0\63\uffff";
    static final String dfa_42s = "\1\77\1\0\63\uffff";
    static final String dfa_43s = "\2\uffff\1\2\61\uffff\1\1";
    static final String dfa_44s = "\1\uffff\1\0\63\uffff}>";
    static final String[] dfa_45s = {
            "\7\2\7\uffff\16\2\1\1\25\2\2\uffff\7\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "1932:3: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalAsl()) ) {s = 52;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\1\1\64\uffff";
    static final String dfa_47s = "\1\5\33\uffff\1\0\30\uffff";
    static final String dfa_48s = "\1\77\33\uffff\1\0\30\uffff";
    static final String dfa_49s = "\1\uffff\1\2\62\uffff\1\1";
    static final String dfa_50s = "\34\uffff\1\0\30\uffff}>";
    static final String[] dfa_51s = {
            "\7\1\7\uffff\1\34\43\1\2\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_39;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()* loopback of 1961:3: ( (lv_plan_term_6_0= rulePlan_term ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_28 = input.LA(1);

                         
                        int index41_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalAsl()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\54\uffff";
    static final String dfa_53s = "\1\3\53\uffff";
    static final String dfa_54s = "\1\5\2\0\51\uffff";
    static final String dfa_55s = "\1\77\2\0\51\uffff";
    static final String dfa_56s = "\3\uffff\1\2\47\uffff\1\1";
    static final String dfa_57s = "\1\uffff\1\0\1\1\51\uffff}>";
    static final String[] dfa_58s = {
            "\7\3\7\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\1\1\2\1\uffff\13\3\1\uffff\10\3\3\uffff\3\3\2\uffff\3\3\2\uffff\2\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "2874:3: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalAsl()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalAsl()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xC03000401CC80CF2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xC03000401CC80CF0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0030000000400C00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC830004208400FE0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xC030004000400CE0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xC030014000400CE0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001C000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xCE70004A2CC80FE0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xCE70004A6CC80FE2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xCE70004A2CC80FE2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC830004208480FE0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xC83000720C480FE0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xC83000420C480FE0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xCE70004A3CD80FF0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xCE70004A6FD80FE0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xCE70004A6ED80FE0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xCE70004A2CD80FE0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0030000000400CE0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0030000000400CC0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xC030014200480CE2L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC830014208480FE0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xC030014000480CE2L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC830054208480FE0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000068000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001F03000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xC030004208400EE0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x3006000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xC030014000400CE2L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000042000002L});

}