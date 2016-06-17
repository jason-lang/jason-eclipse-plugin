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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TK_LABEL_AT", "RULE_TK_NEG", "RULE_VART", "RULE_UNNAMEDVART", "RULE_STRINGT", "RULE_NUMBERT", "RULE_ATOM", "RULE_LCLETTER", "RULE_CH", "RULE_UCLETTER", "RULE_DIGIT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'{'", "'}'", "':-'", "'.'", "'!'", "':'", "'<-'", "'+'", "'-'", "'^'", "'?'", "';'", "'|||'", "'|&|'", "'('", "')'", "'!!'", "'>'", "'<'", "'::'", "','", "'['", "'|'", "']'", "'&'", "'<='", "'>='", "'=='", "'\\\\=='", "'='", "'*'", "'/'", "'**'", "'begin'", "'end'", "'if'", "'else'", "'for'", "'while'", "'not'", "'div'", "'mod'", "'true'", "'false'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_TK_LABEL_AT=4;
    public static final int T__61=61;
    public static final int RULE_ATOM=10;
    public static final int RULE_NUMBERT=9;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_STRINGT=8;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_CH=12;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VART=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_TK_NEG=5;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_LCLETTER=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UCLETTER=13;
    public static final int RULE_UNNAMEDVART=7;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=14;

    // delegates
    // delegators


        public InternalAslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[206+1];
             
             
        }
        

    public String[] getTokenNames() { return InternalAslParser.tokenNames; }
    public String getGrammarFileName() { return "../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g"; }



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
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:74:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;
        int entryRuleAgent_StartIndex = input.index();
        EObject iv_ruleAgent = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:75:2: (iv_ruleAgent= ruleAgent EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:76:2: iv_ruleAgent= ruleAgent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAgentRule()); 
            }
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent88);
            iv_ruleAgent=ruleAgent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAgent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent98); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, entryRuleAgent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:83:1: ruleAgent returns [EObject current=null] : ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;
        int ruleAgent_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:86:28: ( ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:87:1: ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:87:1: ( ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )* )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:87:2: ( (lv_directive_0_0= ruleDirective ) )* ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )* ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )* ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )*
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:87:2: ( (lv_directive_0_0= ruleDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_InternalAsl()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:88:1: (lv_directive_0_0= ruleDirective )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:88:1: (lv_directive_0_0= ruleDirective )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:89:3: lv_directive_0_0= ruleDirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDirective_in_ruleAgent144);
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
            	              		"Directive");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:3: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )*
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:106:1: (lv_belief_1_0= ruleBelief )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:106:1: (lv_belief_1_0= ruleBelief )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:107:3: lv_belief_1_0= ruleBelief
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBelief_in_ruleAgent167);
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
            	              		"Belief");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:123:2: ( (lv_directive_2_0= ruleDirective ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==18) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( (synpred2_InternalAsl()) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
            	    	    {
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:125:3: lv_directive_2_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDirective_in_ruleAgent188);
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
            	    	              		"Directive");
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

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:5: ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_InternalAsl()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:6: ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )*
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:6: ( (lv_initial_goal_3_0= ruleInitial_goal ) )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:142:1: (lv_initial_goal_3_0= ruleInitial_goal )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:142:1: (lv_initial_goal_3_0= ruleInitial_goal )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:143:3: lv_initial_goal_3_0= ruleInitial_goal
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAgentAccess().getInitial_goalInitial_goalParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInitial_goal_in_ruleAgent213);
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
            	              		"Initial_goal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:159:2: ( (lv_directive_4_0= ruleDirective ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==18) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( (synpred4_InternalAsl()) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
            	    	    {
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:161:3: lv_directive_4_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDirective_in_ruleAgent234);
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
            	    	              		"Directive");
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

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:5: ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )*
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
                case 25:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred8_InternalAsl()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 27:
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
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:6: ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )*
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:6: ( (lv_plan_5_0= rulePlan ) )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:178:1: (lv_plan_5_0= rulePlan )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:178:1: (lv_plan_5_0= rulePlan )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:179:3: lv_plan_5_0= rulePlan
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAgentAccess().getPlanPlanParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlan_in_ruleAgent259);
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
            	              		"Plan");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:195:2: ( (lv_belief_6_0= ruleBelief ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        alt6 = dfa6.predict(input);
            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
            	    	    {
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:197:3: lv_belief_6_0= ruleBelief
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleBelief_in_ruleAgent280);
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
            	    	              		"Belief");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:213:3: ( (lv_directive_7_0= ruleDirective ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==18) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( (synpred7_InternalAsl()) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
            	    	    {
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
            	    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:215:3: lv_directive_7_0= ruleDirective
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDirective_in_ruleAgent302);
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
            	    	              		"Directive");
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
            if ( state.backtracking>0 ) { memoize(input, 2, ruleAgent_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleDirective"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:239:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;
        int entryRuleDirective_StartIndex = input.index();
        EObject iv_ruleDirective = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:240:2: (iv_ruleDirective= ruleDirective EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:241:2: iv_ruleDirective= ruleDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectiveRule()); 
            }
            pushFollow(FOLLOW_ruleDirective_in_entryRuleDirective341);
            iv_ruleDirective=ruleDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirective; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirective351); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, entryRuleDirective_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:248:1: ruleDirective returns [EObject current=null] : (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;
        int ruleDirective_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_tk_begin_1_0 = null;

        EObject lv_pred_2_0 = null;

        EObject lv_agent_4_0 = null;

        EObject lv_pred2_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:251:28: ( (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:252:1: (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:252:1: (otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:252:3: otherlv_0= '{' ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDirective388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:256:1: ( ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) ) | ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==51) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=18 && LA9_1<=19)||LA9_1==32||LA9_1==39) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ATOM||LA9_1==21||(LA9_1>=51 && LA9_1<=52)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_ATOM||LA9_0==21||LA9_0==52) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:256:2: ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:256:2: ( ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:256:3: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) ( (lv_pred_2_0= rulePred ) ) otherlv_3= '}' ( (lv_agent_4_0= ruleAgent ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:256:3: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:257:1: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:257:1: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:258:3: lv_tk_begin_1_0= ruleTK_BEGIN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDirectiveAccess().getTk_beginTK_BEGINParserRuleCall_1_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_BEGIN_in_ruleDirective411);
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
                              		"TK_BEGIN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:274:2: ( (lv_pred_2_0= rulePred ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:275:1: (lv_pred_2_0= rulePred )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:275:1: (lv_pred_2_0= rulePred )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:276:3: lv_pred_2_0= rulePred
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDirectiveAccess().getPredPredParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePred_in_ruleDirective432);
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
                              		"Pred");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDirective444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDirectiveAccess().getRightCurlyBracketKeyword_1_0_2());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:296:1: ( (lv_agent_4_0= ruleAgent ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:297:1: (lv_agent_4_0= ruleAgent )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:297:1: (lv_agent_4_0= ruleAgent )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:298:3: lv_agent_4_0= ruleAgent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDirectiveAccess().getAgentAgentParserRuleCall_1_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAgent_in_ruleDirective465);
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
                              		"Agent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:315:6: ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:315:6: ( ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}' )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:315:7: ( (lv_pred2_5_0= rulePred ) ) otherlv_6= '}'
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:315:7: ( (lv_pred2_5_0= rulePred ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:316:1: (lv_pred2_5_0= rulePred )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:316:1: (lv_pred2_5_0= rulePred )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:317:3: lv_pred2_5_0= rulePred
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDirectiveAccess().getPred2PredParserRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePred_in_ruleDirective494);
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
                              		"Pred");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleDirective506); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 4, ruleDirective_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleBelief"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:345:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;
        int entryRuleBelief_StartIndex = input.index();
        EObject iv_ruleBelief = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:346:2: (iv_ruleBelief= ruleBelief EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:347:2: iv_ruleBelief= ruleBelief EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeliefRule()); 
            }
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief544);
            iv_ruleBelief=ruleBelief();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBelief; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, entryRuleBelief_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:354:1: ruleBelief returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;
        int ruleBelief_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_literal_0_0 = null;

        EObject lv_log_expr_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:357:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:358:1: ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:358:1: ( ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:358:2: ( (lv_literal_0_0= ruleLiteral ) ) (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? otherlv_3= '.'
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:358:2: ( (lv_literal_0_0= ruleLiteral ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:359:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:359:1: (lv_literal_0_0= ruleLiteral )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:360:3: lv_literal_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBeliefAccess().getLiteralLiteralParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleBelief600);
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
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:376:2: (otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:376:4: otherlv_1= ':-' ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBelief613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBeliefAccess().getColonHyphenMinusKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:380:1: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:381:1: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:381:1: (lv_log_expr_2_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:382:3: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBeliefAccess().getLog_exprLog_exprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_ruleBelief634);
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
                              		"Log_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBelief648); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 6, ruleBelief_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleInitial_goal"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:410:1: entryRuleInitial_goal returns [EObject current=null] : iv_ruleInitial_goal= ruleInitial_goal EOF ;
    public final EObject entryRuleInitial_goal() throws RecognitionException {
        EObject current = null;
        int entryRuleInitial_goal_StartIndex = input.index();
        EObject iv_ruleInitial_goal = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:411:2: (iv_ruleInitial_goal= ruleInitial_goal EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:412:2: iv_ruleInitial_goal= ruleInitial_goal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitial_goalRule()); 
            }
            pushFollow(FOLLOW_ruleInitial_goal_in_entryRuleInitial_goal684);
            iv_ruleInitial_goal=ruleInitial_goal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitial_goal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitial_goal694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, entryRuleInitial_goal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial_goal"


    // $ANTLR start "ruleInitial_goal"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:419:1: ruleInitial_goal returns [EObject current=null] : (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' ) ;
    public final EObject ruleInitial_goal() throws RecognitionException {
        EObject current = null;
        int ruleInitial_goal_StartIndex = input.index();
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:422:28: ( (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:423:1: (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:423:1: (otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:423:3: otherlv_0= '!' ( (lv_literal_1_0= ruleLiteral ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInitial_goal731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInitial_goalAccess().getExclamationMarkKeyword_0());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:427:1: ( (lv_literal_1_0= ruleLiteral ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:428:1: (lv_literal_1_0= ruleLiteral )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:428:1: (lv_literal_1_0= ruleLiteral )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:429:3: lv_literal_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInitial_goalAccess().getLiteralLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleInitial_goal752);
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
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleInitial_goal764); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 8, ruleInitial_goal_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleInitial_goal"


    // $ANTLR start "entryRulePlan"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:457:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;
        int entryRulePlan_StartIndex = input.index();
        EObject iv_rulePlan = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:458:2: (iv_rulePlan= rulePlan EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:459:2: iv_rulePlan= rulePlan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlanRule()); 
            }
            pushFollow(FOLLOW_rulePlan_in_entryRulePlan800);
            iv_rulePlan=rulePlan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, entryRulePlan_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:466:1: rulePlan returns [EObject current=null] : ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )? ( (lv_trigger_2_0= ruleTrigger ) ) (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )? (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )? otherlv_7= '.' ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;
        int rulePlan_StartIndex = input.index();
        Token lv_tk_label_at_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_pred_1_0 = null;

        EObject lv_trigger_2_0 = null;

        EObject lv_log_expr_4_0 = null;

        EObject lv_plan_body_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:469:28: ( ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )? ( (lv_trigger_2_0= ruleTrigger ) ) (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )? (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )? otherlv_7= '.' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:1: ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )? ( (lv_trigger_2_0= ruleTrigger ) ) (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )? (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )? otherlv_7= '.' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:1: ( ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )? ( (lv_trigger_2_0= ruleTrigger ) ) (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )? (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )? otherlv_7= '.' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:2: ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )? ( (lv_trigger_2_0= ruleTrigger ) ) (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )? (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )? otherlv_7= '.'
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:2: ( ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_TK_LABEL_AT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:3: ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_1_0= rulePred ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:470:3: ( (lv_tk_label_at_0_0= RULE_TK_LABEL_AT ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:471:1: (lv_tk_label_at_0_0= RULE_TK_LABEL_AT )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:471:1: (lv_tk_label_at_0_0= RULE_TK_LABEL_AT )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:472:3: lv_tk_label_at_0_0= RULE_TK_LABEL_AT
                    {
                    lv_tk_label_at_0_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_RULE_TK_LABEL_AT_in_rulePlan853); if (state.failed) return current;
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
                              		"TK_LABEL_AT");
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:488:2: ( (lv_pred_1_0= rulePred ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:489:1: (lv_pred_1_0= rulePred )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:489:1: (lv_pred_1_0= rulePred )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:490:3: lv_pred_1_0= rulePred
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlanAccess().getPredPredParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePred_in_rulePlan879);
                    lv_pred_1_0=rulePred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPlanRule());
                      	        }
                             		set(
                             			current, 
                             			"pred",
                              		lv_pred_1_0, 
                              		"Pred");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:506:4: ( (lv_trigger_2_0= ruleTrigger ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:507:1: (lv_trigger_2_0= ruleTrigger )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:507:1: (lv_trigger_2_0= ruleTrigger )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:508:3: lv_trigger_2_0= ruleTrigger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPlanAccess().getTriggerTriggerParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTrigger_in_rulePlan902);
            lv_trigger_2_0=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPlanRule());
              	        }
                     		set(
                     			current, 
                     			"trigger",
                      		lv_trigger_2_0, 
                      		"Trigger");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:524:2: (otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:524:4: otherlv_3= ':' ( (lv_log_expr_4_0= ruleLog_expr ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePlan915); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPlanAccess().getColonKeyword_2_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:528:1: ( (lv_log_expr_4_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:529:1: (lv_log_expr_4_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:529:1: (lv_log_expr_4_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:530:3: lv_log_expr_4_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlanAccess().getLog_exprLog_exprParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_rulePlan936);
                    lv_log_expr_4_0=ruleLog_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPlanRule());
                      	        }
                             		set(
                             			current, 
                             			"log_expr",
                              		lv_log_expr_4_0, 
                              		"Log_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:546:4: (otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:546:6: otherlv_5= '<-' ( (lv_plan_body_6_0= rulePlan_body ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePlan951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPlanAccess().getLessThanSignHyphenMinusKeyword_3_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:550:1: ( (lv_plan_body_6_0= rulePlan_body ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:551:1: (lv_plan_body_6_0= rulePlan_body )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:551:1: (lv_plan_body_6_0= rulePlan_body )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:552:3: lv_plan_body_6_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlanAccess().getPlan_bodyPlan_bodyParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_body_in_rulePlan972);
                    lv_plan_body_6_0=rulePlan_body();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPlanRule());
                      	        }
                             		set(
                             			current, 
                             			"plan_body",
                              		lv_plan_body_6_0, 
                              		"Plan_body");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_rulePlan986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPlanAccess().getFullStopKeyword_4());
                  
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
            if ( state.backtracking>0 ) { memoize(input, 10, rulePlan_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRuleTrigger"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:580:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;
        int entryRuleTrigger_StartIndex = input.index();
        EObject iv_ruleTrigger = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:581:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:582:2: iv_ruleTrigger= ruleTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerRule()); 
            }
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1022);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrigger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1032); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, entryRuleTrigger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:589:1: ruleTrigger returns [EObject current=null] : ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;
        int ruleTrigger_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_trigger_0_0 = null;

        EObject lv_literal_1_0 = null;

        EObject lv_var_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:592:28: ( ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:593:1: ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:593:1: ( ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:593:2: ( (lv_trigger_0_0= ruleTriggerSymbol ) ) ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:593:2: ( (lv_trigger_0_0= ruleTriggerSymbol ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:594:1: (lv_trigger_0_0= ruleTriggerSymbol )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:594:1: (lv_trigger_0_0= ruleTriggerSymbol )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:595:3: lv_trigger_0_0= ruleTriggerSymbol
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTriggerAccess().getTriggerTriggerSymbolParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTriggerSymbol_in_ruleTrigger1078);
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
                      		"TriggerSymbol");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:2: ( ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_var_2_0= ruleVar ) ) )
            int alt14=2;
            switch ( input.LA(1) ) {
            case RULE_TK_NEG:
            case RULE_ATOM:
            case 21:
            case 37:
            case 51:
            case 52:
            case 60:
            case 61:
                {
                alt14=1;
                }
                break;
            case RULE_VART:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred14_InternalAsl()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNNAMEDVART:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred14_InternalAsl()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:3: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:3: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:612:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:612:1: (lv_literal_1_0= ruleLiteral )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:613:3: lv_literal_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTriggerAccess().getLiteralLiteralParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTrigger1100);
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
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:630:6: ( (lv_var_2_0= ruleVar ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:630:6: ( (lv_var_2_0= ruleVar ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:631:1: (lv_var_2_0= ruleVar )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:631:1: (lv_var_2_0= ruleVar )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:632:3: lv_var_2_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTriggerAccess().getVarVarParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVar_in_ruleTrigger1127);
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
                              		"Var");
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
            if ( state.backtracking>0 ) { memoize(input, 12, ruleTrigger_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTriggerSymbol"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:656:1: entryRuleTriggerSymbol returns [String current=null] : iv_ruleTriggerSymbol= ruleTriggerSymbol EOF ;
    public final String entryRuleTriggerSymbol() throws RecognitionException {
        String current = null;
        int entryRuleTriggerSymbol_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTriggerSymbol = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:657:2: (iv_ruleTriggerSymbol= ruleTriggerSymbol EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:658:2: iv_ruleTriggerSymbol= ruleTriggerSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTriggerSymbolRule()); 
            }
            pushFollow(FOLLOW_ruleTriggerSymbol_in_entryRuleTriggerSymbol1165);
            iv_ruleTriggerSymbol=ruleTriggerSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTriggerSymbol.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerSymbol1176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, entryRuleTriggerSymbol_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerSymbol"


    // $ANTLR start "ruleTriggerSymbol"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:665:1: ruleTriggerSymbol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? ) ;
    public final AntlrDatatypeRuleToken ruleTriggerSymbol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTriggerSymbol_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:668:28: ( ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:669:1: ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:669:1: ( (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:669:2: (kw= '+' | kw= '-' | kw= '^' ) (kw= '!' | kw= '?' )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:669:2: (kw= '+' | kw= '-' | kw= '^' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:670:2: kw= '+'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleTriggerSymbol1215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:677:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTriggerSymbol1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:684:2: kw= '^'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTriggerSymbol1253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getCircumflexAccentKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:689:2: (kw= '!' | kw= '?' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:690:2: kw= '!'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTriggerSymbol1268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTriggerSymbolAccess().getExclamationMarkKeyword_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:697:2: kw= '?'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleTriggerSymbol1287); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 14, ruleTriggerSymbol_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTriggerSymbol"


    // $ANTLR start "entryRulePlan_body"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:710:1: entryRulePlan_body returns [EObject current=null] : iv_rulePlan_body= rulePlan_body EOF ;
    public final EObject entryRulePlan_body() throws RecognitionException {
        EObject current = null;
        int entryRulePlan_body_StartIndex = input.index();
        EObject iv_rulePlan_body = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:711:2: (iv_rulePlan_body= rulePlan_body EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:712:2: iv_rulePlan_body= rulePlan_body EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_bodyRule()); 
            }
            pushFollow(FOLLOW_rulePlan_body_in_entryRulePlan_body1329);
            iv_rulePlan_body=rulePlan_body();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan_body1339); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, entryRulePlan_body_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body"


    // $ANTLR start "rulePlan_body"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:719:1: rulePlan_body returns [EObject current=null] : ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? ) ;
    public final EObject rulePlan_body() throws RecognitionException {
        EObject current = null;
        int rulePlan_body_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_plan_body_term_0_0 = null;

        EObject lv_plan_body_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:722:28: ( ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:723:1: ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:723:1: ( ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:723:2: ( (lv_plan_body_term_0_0= rulePlan_body_term ) ) (otherlv_1= ';' )? ( (lv_plan_body_2_0= rulePlan_body ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:723:2: ( (lv_plan_body_term_0_0= rulePlan_body_term ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:724:1: (lv_plan_body_term_0_0= rulePlan_body_term )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:724:1: (lv_plan_body_term_0_0= rulePlan_body_term )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:725:3: lv_plan_body_term_0_0= rulePlan_body_term
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_body_termPlan_body_termParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlan_body_term_in_rulePlan_body1385);
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
                      		"Plan_body_term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:741:2: (otherlv_1= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:741:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePlan_body1398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPlan_bodyAccess().getSemicolonKeyword_1());
                          
                    }

                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:745:3: ( (lv_plan_body_2_0= rulePlan_body ) )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:746:1: (lv_plan_body_2_0= rulePlan_body )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:746:1: (lv_plan_body_2_0= rulePlan_body )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:747:3: lv_plan_body_2_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_bodyPlan_bodyParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_body_in_rulePlan_body1421);
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
                              		"Plan_body");
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
            if ( state.backtracking>0 ) { memoize(input, 16, rulePlan_body_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePlan_body"


    // $ANTLR start "entryRulePlan_body_term"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:771:1: entryRulePlan_body_term returns [EObject current=null] : iv_rulePlan_body_term= rulePlan_body_term EOF ;
    public final EObject entryRulePlan_body_term() throws RecognitionException {
        EObject current = null;
        int entryRulePlan_body_term_StartIndex = input.index();
        EObject iv_rulePlan_body_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:772:2: (iv_rulePlan_body_term= rulePlan_body_term EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:773:2: iv_rulePlan_body_term= rulePlan_body_term EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_body_termRule()); 
            }
            pushFollow(FOLLOW_rulePlan_body_term_in_entryRulePlan_body_term1458);
            iv_rulePlan_body_term=rulePlan_body_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body_term; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan_body_term1468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, entryRulePlan_body_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body_term"


    // $ANTLR start "rulePlan_body_term"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:780:1: rulePlan_body_term returns [EObject current=null] : ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? ) ;
    public final EObject rulePlan_body_term() throws RecognitionException {
        EObject current = null;
        int rulePlan_body_term_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_plan_body_factor_0_0 = null;

        EObject lv_plan_body_term_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:783:28: ( ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:784:1: ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:784:1: ( ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:784:2: ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) ) (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:784:2: ( (lv_plan_body_factor_0_0= rulePlan_body_factor ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:785:1: (lv_plan_body_factor_0_0= rulePlan_body_factor )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:785:1: (lv_plan_body_factor_0_0= rulePlan_body_factor )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:786:3: lv_plan_body_factor_0_0= rulePlan_body_factor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPlan_body_termAccess().getPlan_body_factorPlan_body_factorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlan_body_factor_in_rulePlan_body_term1514);
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
                      		"Plan_body_factor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:802:2: (otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:802:4: otherlv_1= '|||' ( (lv_plan_body_term_2_0= rulePlan_body_term ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_rulePlan_body_term1527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPlan_body_termAccess().getVerticalLineVerticalLineVerticalLineKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:806:1: ( (lv_plan_body_term_2_0= rulePlan_body_term ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:807:1: (lv_plan_body_term_2_0= rulePlan_body_term )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:807:1: (lv_plan_body_term_2_0= rulePlan_body_term )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:808:3: lv_plan_body_term_2_0= rulePlan_body_term
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_termAccess().getPlan_body_termPlan_body_termParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_body_term_in_rulePlan_body_term1548);
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
                              		"Plan_body_term");
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
            if ( state.backtracking>0 ) { memoize(input, 18, rulePlan_body_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePlan_body_term"


    // $ANTLR start "entryRulePlan_body_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:832:1: entryRulePlan_body_factor returns [EObject current=null] : iv_rulePlan_body_factor= rulePlan_body_factor EOF ;
    public final EObject entryRulePlan_body_factor() throws RecognitionException {
        EObject current = null;
        int entryRulePlan_body_factor_StartIndex = input.index();
        EObject iv_rulePlan_body_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:833:2: (iv_rulePlan_body_factor= rulePlan_body_factor EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:834:2: iv_rulePlan_body_factor= rulePlan_body_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_body_factorRule()); 
            }
            pushFollow(FOLLOW_rulePlan_body_factor_in_entryRulePlan_body_factor1586);
            iv_rulePlan_body_factor=rulePlan_body_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_body_factor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan_body_factor1596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, entryRulePlan_body_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_body_factor"


    // $ANTLR start "rulePlan_body_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:841:1: rulePlan_body_factor returns [EObject current=null] : ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? ) ;
    public final EObject rulePlan_body_factor() throws RecognitionException {
        EObject current = null;
        int rulePlan_body_factor_StartIndex = input.index();
        Token otherlv_4=null;
        EObject lv_stmtIF_0_0 = null;

        EObject lv_stmtFOR_1_0 = null;

        EObject lv_stmtWHILE_2_0 = null;

        EObject lv_body_formula_3_0 = null;

        EObject lv_plan_body_factor_5_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:844:28: ( ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:1: ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:1: ( ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:2: ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) ) (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:2: ( ( (lv_stmtIF_0_0= ruleStmtIF ) ) | ( (lv_stmtFOR_1_0= ruleStmtFOR ) ) | ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) ) | ( (lv_body_formula_3_0= ruleBody_formula ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 55:
                {
                alt20=2;
                }
                break;
            case 56:
                {
                alt20=3;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_STRINGT:
            case RULE_NUMBERT:
            case RULE_ATOM:
            case 18:
            case 21:
            case 22:
            case 25:
            case 26:
            case 28:
            case 32:
            case 34:
            case 37:
            case 51:
            case 52:
            case 57:
            case 60:
            case 61:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:3: ( (lv_stmtIF_0_0= ruleStmtIF ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:845:3: ( (lv_stmtIF_0_0= ruleStmtIF ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:846:1: (lv_stmtIF_0_0= ruleStmtIF )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:846:1: (lv_stmtIF_0_0= ruleStmtIF )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:847:3: lv_stmtIF_0_0= ruleStmtIF
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtIFStmtIFParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStmtIF_in_rulePlan_body_factor1643);
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
                              		"StmtIF");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:864:6: ( (lv_stmtFOR_1_0= ruleStmtFOR ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:864:6: ( (lv_stmtFOR_1_0= ruleStmtFOR ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:865:1: (lv_stmtFOR_1_0= ruleStmtFOR )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:865:1: (lv_stmtFOR_1_0= ruleStmtFOR )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:866:3: lv_stmtFOR_1_0= ruleStmtFOR
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtFORStmtFORParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStmtFOR_in_rulePlan_body_factor1670);
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
                              		"StmtFOR");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:883:6: ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:883:6: ( (lv_stmtWHILE_2_0= ruleStmtWHILE ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:884:1: (lv_stmtWHILE_2_0= ruleStmtWHILE )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:884:1: (lv_stmtWHILE_2_0= ruleStmtWHILE )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:885:3: lv_stmtWHILE_2_0= ruleStmtWHILE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_factorAccess().getStmtWHILEStmtWHILEParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStmtWHILE_in_rulePlan_body_factor1697);
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
                              		"StmtWHILE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:902:6: ( (lv_body_formula_3_0= ruleBody_formula ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:902:6: ( (lv_body_formula_3_0= ruleBody_formula ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:903:1: (lv_body_formula_3_0= ruleBody_formula )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:903:1: (lv_body_formula_3_0= ruleBody_formula )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:904:3: lv_body_formula_3_0= ruleBody_formula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_factorAccess().getBody_formulaBody_formulaParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBody_formula_in_rulePlan_body_factor1724);
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
                              		"Body_formula");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:920:3: (otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:920:5: otherlv_4= '|&|' ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePlan_body_factor1738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPlan_body_factorAccess().getVerticalLineAmpersandVerticalLineKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:924:1: ( (lv_plan_body_factor_5_0= rulePlan_body_factor ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:925:1: (lv_plan_body_factor_5_0= rulePlan_body_factor )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:925:1: (lv_plan_body_factor_5_0= rulePlan_body_factor )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:926:3: lv_plan_body_factor_5_0= rulePlan_body_factor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_body_factorAccess().getPlan_body_factorPlan_body_factorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_body_factor_in_rulePlan_body_factor1759);
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
                              		"Plan_body_factor");
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
            if ( state.backtracking>0 ) { memoize(input, 20, rulePlan_body_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePlan_body_factor"


    // $ANTLR start "entryRuleStmtIF"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:950:1: entryRuleStmtIF returns [EObject current=null] : iv_ruleStmtIF= ruleStmtIF EOF ;
    public final EObject entryRuleStmtIF() throws RecognitionException {
        EObject current = null;
        int entryRuleStmtIF_StartIndex = input.index();
        EObject iv_ruleStmtIF = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:951:2: (iv_ruleStmtIF= ruleStmtIF EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:952:2: iv_ruleStmtIF= ruleStmtIF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtIFRule()); 
            }
            pushFollow(FOLLOW_ruleStmtIF_in_entryRuleStmtIF1797);
            iv_ruleStmtIF=ruleStmtIF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtIF; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmtIF1807); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, entryRuleStmtIF_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtIF"


    // $ANTLR start "ruleStmtIF"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:959:1: ruleStmtIF returns [EObject current=null] : ( ( (lv_tk_if_0_0= ruleTK_IF ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )? ) ;
    public final EObject ruleStmtIF() throws RecognitionException {
        EObject current = null;
        int ruleStmtIF_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tk_if_0_0 = null;

        EObject lv_log_expr_2_0 = null;

        EObject lv_plan_term_4_0 = null;

        AntlrDatatypeRuleToken lv_tk_else_5_0 = null;

        EObject lv_plan_term2_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:962:28: ( ( ( (lv_tk_if_0_0= ruleTK_IF ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:963:1: ( ( (lv_tk_if_0_0= ruleTK_IF ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:963:1: ( ( (lv_tk_if_0_0= ruleTK_IF ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:963:2: ( (lv_tk_if_0_0= ruleTK_IF ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:963:2: ( (lv_tk_if_0_0= ruleTK_IF ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:964:1: (lv_tk_if_0_0= ruleTK_IF )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:964:1: (lv_tk_if_0_0= ruleTK_IF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:965:3: lv_tk_if_0_0= ruleTK_IF
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtIFAccess().getTk_ifTK_IFParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTK_IF_in_ruleStmtIF1853);
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
                      		"TK_IF");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStmtIF1865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStmtIFAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:985:1: ( (lv_log_expr_2_0= ruleLog_expr ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:986:1: (lv_log_expr_2_0= ruleLog_expr )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:986:1: (lv_log_expr_2_0= ruleLog_expr )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:987:3: lv_log_expr_2_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtIFAccess().getLog_exprLog_exprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLog_expr_in_ruleStmtIF1886);
            lv_log_expr_2_0=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStmtIFRule());
              	        }
                     		set(
                     			current, 
                     			"log_expr",
                      		lv_log_expr_2_0, 
                      		"Log_expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleStmtIF1898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStmtIFAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1007:1: ( (lv_plan_term_4_0= rulePlan_term ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1008:1: (lv_plan_term_4_0= rulePlan_term )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1008:1: (lv_plan_term_4_0= rulePlan_term )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1009:3: lv_plan_term_4_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtIFAccess().getPlan_termPlan_termParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlan_term_in_ruleStmtIF1919);
            lv_plan_term_4_0=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStmtIFRule());
              	        }
                     		set(
                     			current, 
                     			"plan_term",
                      		lv_plan_term_4_0, 
                      		"Plan_term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:2: ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:3: ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:3: ( (lv_tk_else_5_0= ruleTK_ELSE ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==54) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1026:1: (lv_tk_else_5_0= ruleTK_ELSE )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1026:1: (lv_tk_else_5_0= ruleTK_ELSE )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1027:3: lv_tk_else_5_0= ruleTK_ELSE
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStmtIFAccess().getTk_elseTK_ELSEParserRuleCall_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTK_ELSE_in_ruleStmtIF1941);
                            lv_tk_else_5_0=ruleTK_ELSE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStmtIFRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"tk_else",
                                      		lv_tk_else_5_0, 
                                      		"TK_ELSE");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1043:3: ( (lv_plan_term2_6_0= rulePlan_term ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1044:1: (lv_plan_term2_6_0= rulePlan_term )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1044:1: (lv_plan_term2_6_0= rulePlan_term )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1045:3: lv_plan_term2_6_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtIFAccess().getPlan_term2Plan_termParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_term_in_ruleStmtIF1963);
                    lv_plan_term2_6_0=rulePlan_term();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtIFRule());
                      	        }
                             		set(
                             			current, 
                             			"plan_term2",
                              		lv_plan_term2_6_0, 
                              		"Plan_term");
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
            if ( state.backtracking>0 ) { memoize(input, 22, ruleStmtIF_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStmtIF"


    // $ANTLR start "entryRuleStmtFOR"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1069:1: entryRuleStmtFOR returns [EObject current=null] : iv_ruleStmtFOR= ruleStmtFOR EOF ;
    public final EObject entryRuleStmtFOR() throws RecognitionException {
        EObject current = null;
        int entryRuleStmtFOR_StartIndex = input.index();
        EObject iv_ruleStmtFOR = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1070:2: (iv_ruleStmtFOR= ruleStmtFOR EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1071:2: iv_ruleStmtFOR= ruleStmtFOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtFORRule()); 
            }
            pushFollow(FOLLOW_ruleStmtFOR_in_entryRuleStmtFOR2001);
            iv_ruleStmtFOR=ruleStmtFOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtFOR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmtFOR2011); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, entryRuleStmtFOR_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtFOR"


    // $ANTLR start "ruleStmtFOR"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1078:1: ruleStmtFOR returns [EObject current=null] : ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) ;
    public final EObject ruleStmtFOR() throws RecognitionException {
        EObject current = null;
        int ruleStmtFOR_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tk_for_0_0 = null;

        EObject lv_log_expr_2_0 = null;

        EObject lv_plan_term_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1081:28: ( ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1082:1: ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1082:1: ( ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1082:2: ( (lv_tk_for_0_0= ruleTK_FOR ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1082:2: ( (lv_tk_for_0_0= ruleTK_FOR ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1083:1: (lv_tk_for_0_0= ruleTK_FOR )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1083:1: (lv_tk_for_0_0= ruleTK_FOR )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1084:3: lv_tk_for_0_0= ruleTK_FOR
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtFORAccess().getTk_forTK_FORParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTK_FOR_in_ruleStmtFOR2057);
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
                      		"TK_FOR");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStmtFOR2069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStmtFORAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1104:1: ( (lv_log_expr_2_0= ruleLog_expr ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1105:1: (lv_log_expr_2_0= ruleLog_expr )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1105:1: (lv_log_expr_2_0= ruleLog_expr )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1106:3: lv_log_expr_2_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtFORAccess().getLog_exprLog_exprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLog_expr_in_ruleStmtFOR2090);
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
                      		"Log_expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleStmtFOR2102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStmtFORAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1126:1: ( (lv_plan_term_4_0= rulePlan_term ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1127:1: (lv_plan_term_4_0= rulePlan_term )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1127:1: (lv_plan_term_4_0= rulePlan_term )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1128:3: lv_plan_term_4_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtFORAccess().getPlan_termPlan_termParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlan_term_in_ruleStmtFOR2123);
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
                      		"Plan_term");
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
            if ( state.backtracking>0 ) { memoize(input, 24, ruleStmtFOR_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStmtFOR"


    // $ANTLR start "entryRuleStmtWHILE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1152:1: entryRuleStmtWHILE returns [EObject current=null] : iv_ruleStmtWHILE= ruleStmtWHILE EOF ;
    public final EObject entryRuleStmtWHILE() throws RecognitionException {
        EObject current = null;
        int entryRuleStmtWHILE_StartIndex = input.index();
        EObject iv_ruleStmtWHILE = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1153:2: (iv_ruleStmtWHILE= ruleStmtWHILE EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1154:2: iv_ruleStmtWHILE= ruleStmtWHILE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtWHILERule()); 
            }
            pushFollow(FOLLOW_ruleStmtWHILE_in_entryRuleStmtWHILE2159);
            iv_ruleStmtWHILE=ruleStmtWHILE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtWHILE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmtWHILE2169); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, entryRuleStmtWHILE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtWHILE"


    // $ANTLR start "ruleStmtWHILE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1161:1: ruleStmtWHILE returns [EObject current=null] : ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) ;
    public final EObject ruleStmtWHILE() throws RecognitionException {
        EObject current = null;
        int ruleStmtWHILE_StartIndex = input.index();
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tk_while_0_0 = null;

        EObject lv_log_expr_2_0 = null;

        EObject lv_plan_term_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1164:28: ( ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1165:1: ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1165:1: ( ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1165:2: ( (lv_tk_while_0_0= ruleTK_WHILE ) ) otherlv_1= '(' ( (lv_log_expr_2_0= ruleLog_expr ) ) otherlv_3= ')' ( (lv_plan_term_4_0= rulePlan_term ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1165:2: ( (lv_tk_while_0_0= ruleTK_WHILE ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1166:1: (lv_tk_while_0_0= ruleTK_WHILE )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1166:1: (lv_tk_while_0_0= ruleTK_WHILE )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1167:3: lv_tk_while_0_0= ruleTK_WHILE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtWHILEAccess().getTk_whileTK_WHILEParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTK_WHILE_in_ruleStmtWHILE2215);
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
                      		"TK_WHILE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStmtWHILE2227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStmtWHILEAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1187:1: ( (lv_log_expr_2_0= ruleLog_expr ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1188:1: (lv_log_expr_2_0= ruleLog_expr )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1188:1: (lv_log_expr_2_0= ruleLog_expr )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1189:3: lv_log_expr_2_0= ruleLog_expr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtWHILEAccess().getLog_exprLog_exprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLog_expr_in_ruleStmtWHILE2248);
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
                      		"Log_expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleStmtWHILE2260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStmtWHILEAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1209:1: ( (lv_plan_term_4_0= rulePlan_term ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1210:1: (lv_plan_term_4_0= rulePlan_term )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1210:1: (lv_plan_term_4_0= rulePlan_term )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1211:3: lv_plan_term_4_0= rulePlan_term
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStmtWHILEAccess().getPlan_termPlan_termParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlan_term_in_ruleStmtWHILE2281);
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
                      		"Plan_term");
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
            if ( state.backtracking>0 ) { memoize(input, 26, ruleStmtWHILE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleStmtWHILE"


    // $ANTLR start "entryRuleBody_formula"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1235:1: entryRuleBody_formula returns [EObject current=null] : iv_ruleBody_formula= ruleBody_formula EOF ;
    public final EObject entryRuleBody_formula() throws RecognitionException {
        EObject current = null;
        int entryRuleBody_formula_StartIndex = input.index();
        EObject iv_ruleBody_formula = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1236:2: (iv_ruleBody_formula= ruleBody_formula EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1237:2: iv_ruleBody_formula= ruleBody_formula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBody_formulaRule()); 
            }
            pushFollow(FOLLOW_ruleBody_formula_in_entryRuleBody_formula2317);
            iv_ruleBody_formula=ruleBody_formula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody_formula; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody_formula2327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, entryRuleBody_formula_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleBody_formula"


    // $ANTLR start "ruleBody_formula"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1244:1: ruleBody_formula returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) ) ;
    public final EObject ruleBody_formula() throws RecognitionException {
        EObject current = null;
        int ruleBody_formula_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1247:28: ( ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1248:1: ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1248:1: ( (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1248:2: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )? ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1248:2: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )?
            int alt26=6;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1248:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBody_formula2365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBody_formulaAccess().getExclamationMarkKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1253:7: otherlv_1= '!!'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleBody_formula2383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBody_formulaAccess().getExclamationMarkExclamationMarkKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1258:7: otherlv_2= '?'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleBody_formula2401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBody_formulaAccess().getQuestionMarkKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1263:6: (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1263:6: (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1263:8: otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )?
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleBody_formula2420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBody_formulaAccess().getPlusSignKeyword_0_3_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1267:1: (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )?
                    int alt24=4;
                    switch ( input.LA(1) ) {
                        case 25:
                            {
                            alt24=1;
                            }
                            break;
                        case 35:
                            {
                            alt24=2;
                            }
                            break;
                        case 36:
                            {
                            alt24=3;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1267:3: otherlv_4= '+'
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleBody_formula2433); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getBody_formulaAccess().getPlusSignKeyword_0_3_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1272:7: otherlv_5= '>'
                            {
                            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleBody_formula2451); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getBody_formulaAccess().getGreaterThanSignKeyword_0_3_1_1());
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1277:7: otherlv_6= '<'
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleBody_formula2469); if (state.failed) return current;
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:6: (otherlv_7= '-' (otherlv_8= '+' )? )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:6: (otherlv_7= '-' (otherlv_8= '+' )? )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:8: otherlv_7= '-' (otherlv_8= '+' )?
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleBody_formula2491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBody_formulaAccess().getHyphenMinusKeyword_0_4_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1286:1: (otherlv_8= '+' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==25) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1286:3: otherlv_8= '+'
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleBody_formula2504); if (state.failed) return current;
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

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1290:6: ( ( (lv_plan_term_9_0= rulePlan_term ) ) | ( (lv_log_expr_10_0= ruleLog_expr ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_TK_NEG && LA27_0<=RULE_ATOM)||LA27_0==21||LA27_0==26||LA27_0==32||LA27_0==37||(LA27_0>=51 && LA27_0<=52)||LA27_0==57||(LA27_0>=60 && LA27_0<=61)) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1290:7: ( (lv_plan_term_9_0= rulePlan_term ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1290:7: ( (lv_plan_term_9_0= rulePlan_term ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1291:1: (lv_plan_term_9_0= rulePlan_term )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1291:1: (lv_plan_term_9_0= rulePlan_term )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1292:3: lv_plan_term_9_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBody_formulaAccess().getPlan_termPlan_termParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_term_in_ruleBody_formula2531);
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
                              		"Plan_term");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1309:6: ( (lv_log_expr_10_0= ruleLog_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1309:6: ( (lv_log_expr_10_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1310:1: (lv_log_expr_10_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1310:1: (lv_log_expr_10_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1311:3: lv_log_expr_10_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBody_formulaAccess().getLog_exprLog_exprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_ruleBody_formula2558);
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
                              		"Log_expr");
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
            if ( state.backtracking>0 ) { memoize(input, 28, ruleBody_formula_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleBody_formula"


    // $ANTLR start "entryRulePlan_term"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1335:1: entryRulePlan_term returns [EObject current=null] : iv_rulePlan_term= rulePlan_term EOF ;
    public final EObject entryRulePlan_term() throws RecognitionException {
        EObject current = null;
        int entryRulePlan_term_StartIndex = input.index();
        EObject iv_rulePlan_term = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1336:2: (iv_rulePlan_term= rulePlan_term EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1337:2: iv_rulePlan_term= rulePlan_term EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlan_termRule()); 
            }
            pushFollow(FOLLOW_rulePlan_term_in_entryRulePlan_term2595);
            iv_rulePlan_term=rulePlan_term();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlan_term; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlan_term2605); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, entryRulePlan_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePlan_term"


    // $ANTLR start "rulePlan_term"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1344:1: rulePlan_term returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' ) ;
    public final EObject rulePlan_term() throws RecognitionException {
        EObject current = null;
        int rulePlan_term_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1347:28: ( ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1348:1: ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1348:1: ( () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1348:2: () otherlv_1= '{' ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )? ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )? ( (lv_plan_body_12_0= rulePlan_body ) )? otherlv_13= '}'
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1348:2: ()
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1349:2: 
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePlan_term2654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPlan_termAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:1: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:2: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )?
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:2: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_TK_LABEL_AT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:3: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:3: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1362:1: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1362:1: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1363:3: lv_tk_label_at_2_0= RULE_TK_LABEL_AT
                            {
                            lv_tk_label_at_2_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_RULE_TK_LABEL_AT_in_rulePlan_term2673); if (state.failed) return current;
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
                                      		"TK_LABEL_AT");
                              	    
                            }

                            }


                            }

                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1379:2: ( (lv_pred_3_0= rulePred ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1380:1: (lv_pred_3_0= rulePred )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1380:1: (lv_pred_3_0= rulePred )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1381:3: lv_pred_3_0= rulePred
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPlan_termAccess().getPredPredParserRuleCall_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePred_in_rulePlan_term2699);
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
                                      		"Pred");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1397:4: ( (lv_trigger_4_0= ruleTrigger ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1398:1: (lv_trigger_4_0= ruleTrigger )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1398:1: (lv_trigger_4_0= ruleTrigger )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1399:3: lv_trigger_4_0= ruleTrigger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_termAccess().getTriggerTriggerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTrigger_in_rulePlan_term2722);
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
                              		"Trigger");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1415:2: (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==23) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1415:4: otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) )
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePlan_term2735); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getPlan_termAccess().getColonKeyword_2_2_0());
                                  
                            }
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1419:1: ( (lv_log_expr_6_0= ruleLog_expr ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1420:1: (lv_log_expr_6_0= ruleLog_expr )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1420:1: (lv_log_expr_6_0= ruleLog_expr )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1421:3: lv_log_expr_6_0= ruleLog_expr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPlan_termAccess().getLog_exprLog_exprParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleLog_expr_in_rulePlan_term2756);
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
                                      		"Log_expr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1437:4: (otherlv_7= '<-' | otherlv_8= ';' )?
                    int alt30=3;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==24) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==29) ) {
                        alt30=2;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1437:6: otherlv_7= '<-'
                            {
                            otherlv_7=(Token)match(input,24,FOLLOW_24_in_rulePlan_term2771); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getPlan_termAccess().getLessThanSignHyphenMinusKeyword_2_3_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1442:7: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_29_in_rulePlan_term2789); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPlan_termAccess().getSemicolonKeyword_2_3_1());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:5: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:6: ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:6: ( (lv_literal_9_0= ruleLiteral ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1447:1: (lv_literal_9_0= ruleLiteral )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1447:1: (lv_literal_9_0= ruleLiteral )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1448:3: lv_literal_9_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_termAccess().getLiteralLiteralParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePlan_term2815);
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
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_rulePlan_term2827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getPlan_termAccess().getColonHyphenMinusKeyword_3_1());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1468:1: ( (lv_log_expr2_11_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1469:1: (lv_log_expr2_11_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1469:1: (lv_log_expr2_11_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1470:3: lv_log_expr2_11_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_termAccess().getLog_expr2Log_exprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_rulePlan_term2848);
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
                              		"Log_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1486:4: ( (lv_plan_body_12_0= rulePlan_body ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_TK_NEG && LA33_0<=RULE_ATOM)||LA33_0==18||(LA33_0>=21 && LA33_0<=22)||(LA33_0>=25 && LA33_0<=26)||LA33_0==28||LA33_0==32||LA33_0==34||LA33_0==37||(LA33_0>=51 && LA33_0<=53)||(LA33_0>=55 && LA33_0<=57)||(LA33_0>=60 && LA33_0<=61)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1487:1: (lv_plan_body_12_0= rulePlan_body )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1487:1: (lv_plan_body_12_0= rulePlan_body )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1488:3: lv_plan_body_12_0= rulePlan_body
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPlan_termAccess().getPlan_bodyPlan_bodyParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_body_in_rulePlan_term2871);
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
                              		"Plan_body");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_19_in_rulePlan_term2884); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 30, rulePlan_term_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePlan_term"


    // $ANTLR start "entryRuleLiteral"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1516:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;
        int entryRuleLiteral_StartIndex = input.index();
        EObject iv_ruleLiteral = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1517:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1518:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2920);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2930); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, entryRuleLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1525:1: ruleLiteral returns [EObject current=null] : ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;
        int ruleLiteral_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1528:28: ( ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:1: ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:1: ( ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) ) | ( (lv_tk_true_6_0= ruleTK_TRUE ) ) | ( (lv_tk_false_7_0= ruleTK_FALSE ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_ATOM:
            case 21:
            case 37:
            case 51:
            case 52:
                {
                alt38=1;
                }
                break;
            case 60:
                {
                alt38=2;
                }
                break;
            case 61:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:2: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:2: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:3: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )? ( (lv_tk_neg_3_0= RULE_TK_NEG ) )? ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:3: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )?
                    int alt35=2;
                    switch ( input.LA(1) ) {
                        case 21:
                            {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_ATOM) ) {
                                int LA35_2 = input.LA(3);

                                if ( (synpred47_InternalAsl()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case RULE_ATOM:
                            {
                            int LA35_2 = input.LA(2);

                            if ( (synpred47_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case RULE_VART:
                            {
                            int LA35_3 = input.LA(2);

                            if ( (synpred47_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case RULE_UNNAMEDVART:
                            {
                            int LA35_4 = input.LA(2);

                            if ( (synpred47_InternalAsl()) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case 37:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    switch (alt35) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:4: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::'
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:4: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )?
                            int alt34=3;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==RULE_ATOM||LA34_0==21) ) {
                                alt34=1;
                            }
                            else if ( ((LA34_0>=RULE_VART && LA34_0<=RULE_UNNAMEDVART)) ) {
                                alt34=2;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:5: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:5: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1530:1: (lv_atom_0_0= ruleJASON_ATOM )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1530:1: (lv_atom_0_0= ruleJASON_ATOM )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1531:3: lv_atom_0_0= ruleJASON_ATOM
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getLiteralAccess().getAtomJASON_ATOMParserRuleCall_0_0_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleJASON_ATOM_in_ruleLiteral2979);
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
                                              		"JASON_ATOM");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1548:6: ( (lv_var_1_0= ruleVar ) )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1548:6: ( (lv_var_1_0= ruleVar ) )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1549:1: (lv_var_1_0= ruleVar )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1549:1: (lv_var_1_0= ruleVar )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1550:3: lv_var_1_0= ruleVar
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_0_0_0_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleVar_in_ruleLiteral3006);
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
                                              		"Var");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleLiteral3020); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getColonColonKeyword_0_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1570:3: ( (lv_tk_neg_3_0= RULE_TK_NEG ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_TK_NEG) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1571:1: (lv_tk_neg_3_0= RULE_TK_NEG )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1571:1: (lv_tk_neg_3_0= RULE_TK_NEG )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1572:3: lv_tk_neg_3_0= RULE_TK_NEG
                            {
                            lv_tk_neg_3_0=(Token)match(input,RULE_TK_NEG,FOLLOW_RULE_TK_NEG_in_ruleLiteral3039); if (state.failed) return current;
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
                                      		"TK_NEG");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1588:3: ( ( (lv_pred_4_0= rulePred ) ) | ( (lv_var2_5_0= ruleVar ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ATOM||LA37_0==21||(LA37_0>=51 && LA37_0<=52)) ) {
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
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1588:4: ( (lv_pred_4_0= rulePred ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1588:4: ( (lv_pred_4_0= rulePred ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1589:1: (lv_pred_4_0= rulePred )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1589:1: (lv_pred_4_0= rulePred )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1590:3: lv_pred_4_0= rulePred
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralAccess().getPredPredParserRuleCall_0_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePred_in_ruleLiteral3067);
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
                                      		"Pred");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1607:6: ( (lv_var2_5_0= ruleVar ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1607:6: ( (lv_var2_5_0= ruleVar ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1608:1: (lv_var2_5_0= ruleVar )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1608:1: (lv_var2_5_0= ruleVar )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1609:3: lv_var2_5_0= ruleVar
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralAccess().getVar2VarParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVar_in_ruleLiteral3094);
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
                                      		"Var");
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1626:6: ( (lv_tk_true_6_0= ruleTK_TRUE ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1626:6: ( (lv_tk_true_6_0= ruleTK_TRUE ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1627:1: (lv_tk_true_6_0= ruleTK_TRUE )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1627:1: (lv_tk_true_6_0= ruleTK_TRUE )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1628:3: lv_tk_true_6_0= ruleTK_TRUE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getTk_trueTK_TRUEParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_TRUE_in_ruleLiteral3123);
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
                              		"TK_TRUE");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1645:6: ( (lv_tk_false_7_0= ruleTK_FALSE ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1645:6: ( (lv_tk_false_7_0= ruleTK_FALSE ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1646:1: (lv_tk_false_7_0= ruleTK_FALSE )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1646:1: (lv_tk_false_7_0= ruleTK_FALSE )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1647:3: lv_tk_false_7_0= ruleTK_FALSE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getTk_falseTK_FALSEParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_FALSE_in_ruleLiteral3150);
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
                              		"TK_FALSE");
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
            if ( state.backtracking>0 ) { memoize(input, 32, ruleLiteral_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePred"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1671:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;
        int entryRulePred_StartIndex = input.index();
        EObject iv_rulePred = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1672:2: (iv_rulePred= rulePred EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1673:2: iv_rulePred= rulePred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredRule()); 
            }
            pushFollow(FOLLOW_rulePred_in_entryRulePred3186);
            iv_rulePred=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePred; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePred3196); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, entryRulePred_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRulePred"


    // $ANTLR start "rulePred"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1680:1: rulePred returns [EObject current=null] : ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;
        int rulePred_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1683:28: ( ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:1: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:1: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:2: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) ) (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )? ( (lv_plan_term_6_0= rulePlan_term ) )* ( (lv_list_7_0= ruleList ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:2: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_tk_begin_1_0= ruleTK_BEGIN ) ) | ( (lv_tk_end_2_0= ruleTK_END ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case 21:
                {
                alt39=1;
                }
                break;
            case 51:
                {
                alt39=2;
                }
                break;
            case 52:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:3: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1684:3: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1685:1: (lv_atom_0_0= ruleJASON_ATOM )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1685:1: (lv_atom_0_0= ruleJASON_ATOM )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1686:3: lv_atom_0_0= ruleJASON_ATOM
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredAccess().getAtomJASON_ATOMParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJASON_ATOM_in_rulePred3243);
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
                              		"JASON_ATOM");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1703:6: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1703:6: ( (lv_tk_begin_1_0= ruleTK_BEGIN ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1704:1: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1704:1: (lv_tk_begin_1_0= ruleTK_BEGIN )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1705:3: lv_tk_begin_1_0= ruleTK_BEGIN
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredAccess().getTk_beginTK_BEGINParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_BEGIN_in_rulePred3270);
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
                              		"TK_BEGIN");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1722:6: ( (lv_tk_end_2_0= ruleTK_END ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1722:6: ( (lv_tk_end_2_0= ruleTK_END ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1723:1: (lv_tk_end_2_0= ruleTK_END )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1723:1: (lv_tk_end_2_0= ruleTK_END )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1724:3: lv_tk_end_2_0= ruleTK_END
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredAccess().getTk_endTK_ENDParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_END_in_rulePred3297);
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
                              		"TK_END");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1740:3: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1740:5: otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_rulePred3311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPredAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1744:1: ( (lv_terms_4_0= ruleTerms ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1745:1: (lv_terms_4_0= ruleTerms )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1745:1: (lv_terms_4_0= ruleTerms )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1746:3: lv_terms_4_0= ruleTerms
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerms_in_rulePred3332);
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
                              		"Terms");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulePred3344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPredAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1766:3: ( (lv_plan_term_6_0= rulePlan_term ) )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1767:1: (lv_plan_term_6_0= rulePlan_term )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1767:1: (lv_plan_term_6_0= rulePlan_term )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1768:3: lv_plan_term_6_0= rulePlan_term
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPredAccess().getPlan_termPlan_termParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlan_term_in_rulePred3367);
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
            	              		"Plan_term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1784:3: ( (lv_list_7_0= ruleList ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1785:1: (lv_list_7_0= ruleList )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1785:1: (lv_list_7_0= ruleList )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1786:3: lv_list_7_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredAccess().getListListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList_in_rulePred3389);
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
                              		"List");
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
            if ( state.backtracking>0 ) { memoize(input, 34, rulePred_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "rulePred"


    // $ANTLR start "entryRuleTerms"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1810:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;
        int entryRuleTerms_StartIndex = input.index();
        EObject iv_ruleTerms = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1811:2: (iv_ruleTerms= ruleTerms EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1812:2: iv_ruleTerms= ruleTerms EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermsRule()); 
            }
            pushFollow(FOLLOW_ruleTerms_in_entryRuleTerms3426);
            iv_ruleTerms=ruleTerms();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerms; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerms3436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, entryRuleTerms_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1819:1: ruleTerms returns [EObject current=null] : ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;
        int ruleTerms_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1822:28: ( ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1823:1: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1823:1: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1823:2: ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1823:2: ( (lv_term_0_0= ruleTerm ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1824:1: (lv_term_0_0= ruleTerm )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1824:1: (lv_term_0_0= ruleTerm )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1825:3: lv_term_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTerm_in_ruleTerms3482);
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
                      		"Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1841:2: (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==38) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1841:4: otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTerms3495); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1845:1: ( (lv_term_2_0= ruleTerm ) )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1846:1: (lv_term_2_0= ruleTerm )
            	    {
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1846:1: (lv_term_2_0= ruleTerm )
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1847:3: lv_term_2_0= ruleTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerms3516);
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
            	              		"Term");
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
            if ( state.backtracking>0 ) { memoize(input, 36, ruleTerms_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1871:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;
        int entryRuleTerm_StartIndex = input.index();
        EObject iv_ruleTerm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1872:2: (iv_ruleTerm= ruleTerm EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1873:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm3554);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm3564); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, entryRuleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1880:1: ruleTerm returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;
        int ruleTerm_StartIndex = input.index();
        EObject lv_list_0_0 = null;

        EObject lv_plan_term_1_0 = null;

        EObject lv_log_expr_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1883:28: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1884:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1884:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_plan_term_1_0= rulePlan_term ) ) | ( (lv_log_expr_2_0= ruleLog_expr ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt44=1;
                }
                break;
            case 18:
                {
                alt44=2;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_STRINGT:
            case RULE_NUMBERT:
            case RULE_ATOM:
            case 21:
            case 26:
            case 32:
            case 37:
            case 51:
            case 52:
            case 57:
            case 60:
            case 61:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1884:2: ( (lv_list_0_0= ruleList ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1884:2: ( (lv_list_0_0= ruleList ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1885:1: (lv_list_0_0= ruleList )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1885:1: (lv_list_0_0= ruleList )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1886:3: lv_list_0_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getListListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList_in_ruleTerm3610);
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
                              		"List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1903:6: ( (lv_plan_term_1_0= rulePlan_term ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1903:6: ( (lv_plan_term_1_0= rulePlan_term ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1904:1: (lv_plan_term_1_0= rulePlan_term )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1904:1: (lv_plan_term_1_0= rulePlan_term )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1905:3: lv_plan_term_1_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getPlan_termPlan_termParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_term_in_ruleTerm3637);
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
                              		"Plan_term");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1922:6: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1922:6: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1923:1: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1923:1: (lv_log_expr_2_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1924:3: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getLog_exprLog_exprParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_ruleTerm3664);
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
                              		"Log_expr");
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
            if ( state.backtracking>0 ) { memoize(input, 38, ruleTerm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleList"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1948:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;
        int entryRuleList_StartIndex = input.index();
        EObject iv_ruleList = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1949:2: (iv_ruleList= ruleList EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1950:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FOLLOW_ruleList_in_entryRuleList3700);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleList3710); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, entryRuleList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1957:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;
        int ruleList_StartIndex = input.index();
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1960:28: ( ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1961:1: ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1961:1: ( () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1961:2: () otherlv_1= '[' ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']'
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1961:2: ()
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1962:2: 
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleList3759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1974:1: ( ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_TK_NEG && LA48_0<=RULE_ATOM)||LA48_0==18||LA48_0==21||LA48_0==26||LA48_0==32||LA48_0==37||LA48_0==39||(LA48_0>=51 && LA48_0<=52)||(LA48_0>=60 && LA48_0<=61)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1974:2: ( (lv_term_in_list_2_0= ruleTerm_in_list ) ) (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1974:2: ( (lv_term_in_list_2_0= ruleTerm_in_list ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1975:1: (lv_term_in_list_2_0= ruleTerm_in_list )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1975:1: (lv_term_in_list_2_0= ruleTerm_in_list )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1976:3: lv_term_in_list_2_0= ruleTerm_in_list
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListAccess().getTerm_in_listTerm_in_listParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerm_in_list_in_ruleList3781);
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
                              		"Term_in_list");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1992:2: (otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==38) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1992:4: otherlv_3= ',' ( (lv_term_in_list_4_0= ruleTerm_in_list ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleList3794); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1996:1: ( (lv_term_in_list_4_0= ruleTerm_in_list ) )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1997:1: (lv_term_in_list_4_0= ruleTerm_in_list )
                    	    {
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1997:1: (lv_term_in_list_4_0= ruleTerm_in_list )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1998:3: lv_term_in_list_4_0= ruleTerm_in_list
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListAccess().getTerm_in_listTerm_in_listParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTerm_in_list_in_ruleList3815);
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
                    	              		"Term_in_list");
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

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2014:4: (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==40) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2014:6: otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            {
                            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleList3830); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getListAccess().getVerticalLineKeyword_2_2_0());
                                  
                            }
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2018:1: ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
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
                            case 39:
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
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2018:2: ( (lv_var_6_0= RULE_VART ) )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2018:2: ( (lv_var_6_0= RULE_VART ) )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2019:1: (lv_var_6_0= RULE_VART )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2019:1: (lv_var_6_0= RULE_VART )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2020:3: lv_var_6_0= RULE_VART
                                    {
                                    lv_var_6_0=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleList3848); if (state.failed) return current;
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
                                              		"VART");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2037:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2037:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2038:1: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2038:1: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2039:3: lv_unnamedvar_7_0= RULE_UNNAMEDVART
                                    {
                                    lv_unnamedvar_7_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_RULE_UNNAMEDVART_in_ruleList3876); if (state.failed) return current;
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
                                              		"UNNAMEDVART");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2056:6: ( (lv_list_8_0= ruleList ) )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2056:6: ( (lv_list_8_0= ruleList ) )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2057:1: (lv_list_8_0= ruleList )
                                    {
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2057:1: (lv_list_8_0= ruleList )
                                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2058:3: lv_list_8_0= ruleList
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getListAccess().getListListParserRuleCall_2_2_1_2_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleList_in_ruleList3908);
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
                                              		"List");
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

            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleList3925); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 40, ruleList_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleTerm_in_list"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2086:1: entryRuleTerm_in_list returns [EObject current=null] : iv_ruleTerm_in_list= ruleTerm_in_list EOF ;
    public final EObject entryRuleTerm_in_list() throws RecognitionException {
        EObject current = null;
        int entryRuleTerm_in_list_StartIndex = input.index();
        EObject iv_ruleTerm_in_list = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2087:2: (iv_ruleTerm_in_list= ruleTerm_in_list EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2088:2: iv_ruleTerm_in_list= ruleTerm_in_list EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerm_in_listRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_list_in_entryRuleTerm_in_list3961);
            iv_ruleTerm_in_list=ruleTerm_in_list();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm_in_list; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm_in_list3971); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, entryRuleTerm_in_list_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm_in_list"


    // $ANTLR start "ruleTerm_in_list"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2095:1: ruleTerm_in_list returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) ) ;
    public final EObject ruleTerm_in_list() throws RecognitionException {
        EObject current = null;
        int ruleTerm_in_list_StartIndex = input.index();
        EObject lv_list_0_0 = null;

        EObject lv_arithm_expr_1_0 = null;

        EObject lv_string_2_0 = null;

        EObject lv_plan_term_3_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2098:28: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2099:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2099:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_arithm_expr_1_0= ruleArithm_expr ) ) | ( (lv_string_2_0= ruleString ) ) | ( (lv_plan_term_3_0= rulePlan_term ) ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt49=1;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_NUMBERT:
            case RULE_ATOM:
            case 21:
            case 26:
            case 32:
            case 37:
            case 51:
            case 52:
            case 60:
            case 61:
                {
                alt49=2;
                }
                break;
            case RULE_STRINGT:
                {
                alt49=3;
                }
                break;
            case 18:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2099:2: ( (lv_list_0_0= ruleList ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2099:2: ( (lv_list_0_0= ruleList ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2100:1: (lv_list_0_0= ruleList )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2100:1: (lv_list_0_0= ruleList )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2101:3: lv_list_0_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTerm_in_listAccess().getListListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList_in_ruleTerm_in_list4017);
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
                              		"List");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2118:6: ( (lv_arithm_expr_1_0= ruleArithm_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2118:6: ( (lv_arithm_expr_1_0= ruleArithm_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2119:1: (lv_arithm_expr_1_0= ruleArithm_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2119:1: (lv_arithm_expr_1_0= ruleArithm_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2120:3: lv_arithm_expr_1_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTerm_in_listAccess().getArithm_exprArithm_exprParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_in_ruleTerm_in_list4044);
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
                              		"Arithm_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2137:6: ( (lv_string_2_0= ruleString ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2137:6: ( (lv_string_2_0= ruleString ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2138:1: (lv_string_2_0= ruleString )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2138:1: (lv_string_2_0= ruleString )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2139:3: lv_string_2_0= ruleString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTerm_in_listAccess().getStringStringParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleString_in_ruleTerm_in_list4071);
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
                              		"String");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2156:6: ( (lv_plan_term_3_0= rulePlan_term ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2156:6: ( (lv_plan_term_3_0= rulePlan_term ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2157:1: (lv_plan_term_3_0= rulePlan_term )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2157:1: (lv_plan_term_3_0= rulePlan_term )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2158:3: lv_plan_term_3_0= rulePlan_term
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTerm_in_listAccess().getPlan_termPlan_termParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePlan_term_in_ruleTerm_in_list4098);
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
                              		"Plan_term");
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
            if ( state.backtracking>0 ) { memoize(input, 42, ruleTerm_in_list_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTerm_in_list"


    // $ANTLR start "entryRuleLog_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2182:1: entryRuleLog_expr returns [EObject current=null] : iv_ruleLog_expr= ruleLog_expr EOF ;
    public final EObject entryRuleLog_expr() throws RecognitionException {
        EObject current = null;
        int entryRuleLog_expr_StartIndex = input.index();
        EObject iv_ruleLog_expr = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2183:2: (iv_ruleLog_expr= ruleLog_expr EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2184:2: iv_ruleLog_expr= ruleLog_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_exprRule()); 
            }
            pushFollow(FOLLOW_ruleLog_expr_in_entryRuleLog_expr4134);
            iv_ruleLog_expr=ruleLog_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog_expr4144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, entryRuleLog_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr"


    // $ANTLR start "ruleLog_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2191:1: ruleLog_expr returns [EObject current=null] : ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? ) ;
    public final EObject ruleLog_expr() throws RecognitionException {
        EObject current = null;
        int ruleLog_expr_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_log_expr_trm_0_0 = null;

        EObject lv_log_expr_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2194:28: ( ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2195:1: ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2195:1: ( ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2195:2: ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) ) (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2195:2: ( (lv_log_expr_trm_0_0= ruleLog_expr_trm ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2196:1: (lv_log_expr_trm_0_0= ruleLog_expr_trm )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2196:1: (lv_log_expr_trm_0_0= ruleLog_expr_trm )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2197:3: lv_log_expr_trm_0_0= ruleLog_expr_trm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLog_exprAccess().getLog_expr_trmLog_expr_trmParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLog_expr_trm_in_ruleLog_expr4190);
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
                      		"Log_expr_trm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2213:2: (otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2213:4: otherlv_1= '|' ( (lv_log_expr_2_0= ruleLog_expr ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleLog_expr4203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLog_exprAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2217:1: ( (lv_log_expr_2_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2218:1: (lv_log_expr_2_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2218:1: (lv_log_expr_2_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2219:3: lv_log_expr_2_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLog_exprAccess().getLog_exprLog_exprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_ruleLog_expr4224);
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
                              		"Log_expr");
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
            if ( state.backtracking>0 ) { memoize(input, 44, ruleLog_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr"


    // $ANTLR start "entryRuleLog_expr_trm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2243:1: entryRuleLog_expr_trm returns [EObject current=null] : iv_ruleLog_expr_trm= ruleLog_expr_trm EOF ;
    public final EObject entryRuleLog_expr_trm() throws RecognitionException {
        EObject current = null;
        int entryRuleLog_expr_trm_StartIndex = input.index();
        EObject iv_ruleLog_expr_trm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2244:2: (iv_ruleLog_expr_trm= ruleLog_expr_trm EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2245:2: iv_ruleLog_expr_trm= ruleLog_expr_trm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_expr_trmRule()); 
            }
            pushFollow(FOLLOW_ruleLog_expr_trm_in_entryRuleLog_expr_trm4262);
            iv_ruleLog_expr_trm=ruleLog_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr_trm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog_expr_trm4272); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, entryRuleLog_expr_trm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr_trm"


    // $ANTLR start "ruleLog_expr_trm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2252:1: ruleLog_expr_trm returns [EObject current=null] : ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? ) ;
    public final EObject ruleLog_expr_trm() throws RecognitionException {
        EObject current = null;
        int ruleLog_expr_trm_StartIndex = input.index();
        Token otherlv_1=null;
        EObject lv_log_expr_factor_0_0 = null;

        EObject lv_log_expr_trm_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2255:28: ( ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2256:1: ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2256:1: ( ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2256:2: ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) ) (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2256:2: ( (lv_log_expr_factor_0_0= ruleLog_expr_factor ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2257:1: (lv_log_expr_factor_0_0= ruleLog_expr_factor )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2257:1: (lv_log_expr_factor_0_0= ruleLog_expr_factor )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2258:3: lv_log_expr_factor_0_0= ruleLog_expr_factor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLog_expr_trmAccess().getLog_expr_factorLog_expr_factorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLog_expr_factor_in_ruleLog_expr_trm4318);
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
                      		"Log_expr_factor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2274:2: (otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2274:4: otherlv_1= '&' ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) )
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleLog_expr_trm4331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLog_expr_trmAccess().getAmpersandKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2278:1: ( (lv_log_expr_trm_2_0= ruleLog_expr_trm ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2279:1: (lv_log_expr_trm_2_0= ruleLog_expr_trm )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2279:1: (lv_log_expr_trm_2_0= ruleLog_expr_trm )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2280:3: lv_log_expr_trm_2_0= ruleLog_expr_trm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLog_expr_trmAccess().getLog_expr_trmLog_expr_trmParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_trm_in_ruleLog_expr_trm4352);
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
                              		"Log_expr_trm");
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
            if ( state.backtracking>0 ) { memoize(input, 46, ruleLog_expr_trm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr_trm"


    // $ANTLR start "entryRuleLog_expr_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2304:1: entryRuleLog_expr_factor returns [EObject current=null] : iv_ruleLog_expr_factor= ruleLog_expr_factor EOF ;
    public final EObject entryRuleLog_expr_factor() throws RecognitionException {
        EObject current = null;
        int entryRuleLog_expr_factor_StartIndex = input.index();
        EObject iv_ruleLog_expr_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2305:2: (iv_ruleLog_expr_factor= ruleLog_expr_factor EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2306:2: iv_ruleLog_expr_factor= ruleLog_expr_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLog_expr_factorRule()); 
            }
            pushFollow(FOLLOW_ruleLog_expr_factor_in_entryRuleLog_expr_factor4390);
            iv_ruleLog_expr_factor=ruleLog_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLog_expr_factor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLog_expr_factor4400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, entryRuleLog_expr_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleLog_expr_factor"


    // $ANTLR start "ruleLog_expr_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2313:1: ruleLog_expr_factor returns [EObject current=null] : ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) ) ;
    public final EObject ruleLog_expr_factor() throws RecognitionException {
        EObject current = null;
        int ruleLog_expr_factor_StartIndex = input.index();
        AntlrDatatypeRuleToken lv_tk_not_0_0 = null;

        EObject lv_log_expr_factor_1_0 = null;

        EObject lv_rel_expr_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2316:28: ( ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:1: ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:1: ( ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) ) | ( (lv_rel_expr_2_0= ruleRel_expr ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==57) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_TK_NEG && LA52_0<=RULE_ATOM)||LA52_0==21||LA52_0==26||LA52_0==32||LA52_0==37||(LA52_0>=51 && LA52_0<=52)||(LA52_0>=60 && LA52_0<=61)) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:2: ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:2: ( ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:3: ( (lv_tk_not_0_0= ruleTK_NOT ) ) ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2317:3: ( (lv_tk_not_0_0= ruleTK_NOT ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2318:1: (lv_tk_not_0_0= ruleTK_NOT )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2318:1: (lv_tk_not_0_0= ruleTK_NOT )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2319:3: lv_tk_not_0_0= ruleTK_NOT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLog_expr_factorAccess().getTk_notTK_NOTParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_NOT_in_ruleLog_expr_factor4447);
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
                              		"TK_NOT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2335:2: ( (lv_log_expr_factor_1_0= ruleLog_expr_factor ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2336:1: (lv_log_expr_factor_1_0= ruleLog_expr_factor )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2336:1: (lv_log_expr_factor_1_0= ruleLog_expr_factor )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2337:3: lv_log_expr_factor_1_0= ruleLog_expr_factor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLog_expr_factorAccess().getLog_expr_factorLog_expr_factorParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_factor_in_ruleLog_expr_factor4468);
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
                              		"Log_expr_factor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2354:6: ( (lv_rel_expr_2_0= ruleRel_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2354:6: ( (lv_rel_expr_2_0= ruleRel_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2355:1: (lv_rel_expr_2_0= ruleRel_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2355:1: (lv_rel_expr_2_0= ruleRel_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2356:3: lv_rel_expr_2_0= ruleRel_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLog_expr_factorAccess().getRel_exprRel_exprParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRel_expr_in_ruleLog_expr_factor4496);
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
                              		"Rel_expr");
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
            if ( state.backtracking>0 ) { memoize(input, 48, ruleLog_expr_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleLog_expr_factor"


    // $ANTLR start "entryRuleRel_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2380:1: entryRuleRel_expr returns [EObject current=null] : iv_ruleRel_expr= ruleRel_expr EOF ;
    public final EObject entryRuleRel_expr() throws RecognitionException {
        EObject current = null;
        int entryRuleRel_expr_StartIndex = input.index();
        EObject iv_ruleRel_expr = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2381:2: (iv_ruleRel_expr= ruleRel_expr EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2382:2: iv_ruleRel_expr= ruleRel_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRel_exprRule()); 
            }
            pushFollow(FOLLOW_ruleRel_expr_in_entryRuleRel_expr4532);
            iv_ruleRel_expr=ruleRel_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRel_expr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRel_expr4542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, entryRuleRel_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleRel_expr"


    // $ANTLR start "ruleRel_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2389:1: ruleRel_expr returns [EObject current=null] : ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? ) ;
    public final EObject ruleRel_expr() throws RecognitionException {
        EObject current = null;
        int ruleRel_expr_StartIndex = input.index();
        EObject lv_arithm_exp_0_0 = null;

        EObject lv_string_1_0 = null;

        AntlrDatatypeRuleToken lv_relOp_2_0 = null;

        EObject lv_arithm_expr_3_0 = null;

        EObject lv_string2_4_0 = null;

        EObject lv_list_5_0 = null;

        EObject lv_plan_term_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2392:28: ( ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:1: ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:1: ( ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:2: ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) ) ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:2: ( ( (lv_arithm_exp_0_0= ruleArithm_expr ) ) | ( (lv_string_1_0= ruleString ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_TK_NEG && LA53_0<=RULE_UNNAMEDVART)||(LA53_0>=RULE_NUMBERT && LA53_0<=RULE_ATOM)||LA53_0==21||LA53_0==26||LA53_0==32||LA53_0==37||(LA53_0>=51 && LA53_0<=52)||(LA53_0>=60 && LA53_0<=61)) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:3: ( (lv_arithm_exp_0_0= ruleArithm_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2393:3: ( (lv_arithm_exp_0_0= ruleArithm_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2394:1: (lv_arithm_exp_0_0= ruleArithm_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2394:1: (lv_arithm_exp_0_0= ruleArithm_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2395:3: lv_arithm_exp_0_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRel_exprAccess().getArithm_expArithm_exprParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_in_ruleRel_expr4589);
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
                              		"Arithm_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2412:6: ( (lv_string_1_0= ruleString ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2412:6: ( (lv_string_1_0= ruleString ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2413:1: (lv_string_1_0= ruleString )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2413:1: (lv_string_1_0= ruleString )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2414:3: lv_string_1_0= ruleString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRel_exprAccess().getStringStringParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleString_in_ruleRel_expr4616);
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
                              		"String");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2430:3: ( ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=35 && LA55_0<=36)||(LA55_0>=43 && LA55_0<=47)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2430:4: ( (lv_relOp_2_0= ruleTK_REL_OP ) ) ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2430:4: ( (lv_relOp_2_0= ruleTK_REL_OP ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2431:1: (lv_relOp_2_0= ruleTK_REL_OP )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2431:1: (lv_relOp_2_0= ruleTK_REL_OP )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2432:3: lv_relOp_2_0= ruleTK_REL_OP
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRel_exprAccess().getRelOpTK_REL_OPParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_REL_OP_in_ruleRel_expr4639);
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
                              		"TK_REL_OP");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2448:2: ( ( (lv_arithm_expr_3_0= ruleArithm_expr ) ) | ( (lv_string2_4_0= ruleString ) ) | ( (lv_list_5_0= ruleList ) ) | ( (lv_plan_term_6_0= rulePlan_term ) ) )
                    int alt54=4;
                    switch ( input.LA(1) ) {
                    case RULE_TK_NEG:
                    case RULE_VART:
                    case RULE_UNNAMEDVART:
                    case RULE_NUMBERT:
                    case RULE_ATOM:
                    case 21:
                    case 26:
                    case 32:
                    case 37:
                    case 51:
                    case 52:
                    case 60:
                    case 61:
                        {
                        alt54=1;
                        }
                        break;
                    case RULE_STRINGT:
                        {
                        alt54=2;
                        }
                        break;
                    case 39:
                        {
                        alt54=3;
                        }
                        break;
                    case 18:
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
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2448:3: ( (lv_arithm_expr_3_0= ruleArithm_expr ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2448:3: ( (lv_arithm_expr_3_0= ruleArithm_expr ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2449:1: (lv_arithm_expr_3_0= ruleArithm_expr )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2449:1: (lv_arithm_expr_3_0= ruleArithm_expr )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2450:3: lv_arithm_expr_3_0= ruleArithm_expr
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRel_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArithm_expr_in_ruleRel_expr4661);
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
                                      		"Arithm_expr");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2467:6: ( (lv_string2_4_0= ruleString ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2467:6: ( (lv_string2_4_0= ruleString ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2468:1: (lv_string2_4_0= ruleString )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2468:1: (lv_string2_4_0= ruleString )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2469:3: lv_string2_4_0= ruleString
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRel_exprAccess().getString2StringParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleString_in_ruleRel_expr4688);
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
                                      		"String");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2486:6: ( (lv_list_5_0= ruleList ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2486:6: ( (lv_list_5_0= ruleList ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2487:1: (lv_list_5_0= ruleList )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2487:1: (lv_list_5_0= ruleList )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2488:3: lv_list_5_0= ruleList
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRel_exprAccess().getListListParserRuleCall_1_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleList_in_ruleRel_expr4715);
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
                                      		"List");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2505:6: ( (lv_plan_term_6_0= rulePlan_term ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2505:6: ( (lv_plan_term_6_0= rulePlan_term ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2506:1: (lv_plan_term_6_0= rulePlan_term )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2506:1: (lv_plan_term_6_0= rulePlan_term )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2507:3: lv_plan_term_6_0= rulePlan_term
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRel_exprAccess().getPlan_termPlan_termParserRuleCall_1_1_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePlan_term_in_ruleRel_expr4742);
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
                                      		"Plan_term");
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
            if ( state.backtracking>0 ) { memoize(input, 50, ruleRel_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleRel_expr"


    // $ANTLR start "entryRuleTK_REL_OP"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2531:1: entryRuleTK_REL_OP returns [String current=null] : iv_ruleTK_REL_OP= ruleTK_REL_OP EOF ;
    public final String entryRuleTK_REL_OP() throws RecognitionException {
        String current = null;
        int entryRuleTK_REL_OP_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_REL_OP = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2535:2: (iv_ruleTK_REL_OP= ruleTK_REL_OP EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2536:2: iv_ruleTK_REL_OP= ruleTK_REL_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_REL_OPRule()); 
            }
            pushFollow(FOLLOW_ruleTK_REL_OP_in_entryRuleTK_REL_OP4788);
            iv_ruleTK_REL_OP=ruleTK_REL_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_REL_OP.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_REL_OP4799); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, entryRuleTK_REL_OP_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTK_REL_OP"


    // $ANTLR start "ruleTK_REL_OP"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2546:1: ruleTK_REL_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleTK_REL_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_REL_OP_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2550:28: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2551:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2551:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' | kw= '==' | kw= '\\\\==' | (kw= '=' (kw= '.' kw= '.' )? ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt57=1;
                }
                break;
            case 43:
                {
                alt57=2;
                }
                break;
            case 35:
                {
                alt57=3;
                }
                break;
            case 44:
                {
                alt57=4;
                }
                break;
            case 45:
                {
                alt57=5;
                }
                break;
            case 46:
                {
                alt57=6;
                }
                break;
            case 47:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2552:2: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleTK_REL_OP4841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2559:2: kw= '<='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleTK_REL_OP4860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2566:2: kw= '>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleTK_REL_OP4879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2573:2: kw= '>='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleTK_REL_OP4898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2580:2: kw= '=='
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleTK_REL_OP4917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getEqualsSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2587:2: kw= '\\\\=='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTK_REL_OP4936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getReverseSolidusEqualsSignEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2593:6: (kw= '=' (kw= '.' kw= '.' )? )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2593:6: (kw= '=' (kw= '.' kw= '.' )? )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2594:2: kw= '=' (kw= '.' kw= '.' )?
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleTK_REL_OP4956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getEqualsSignKeyword_6_0()); 
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2599:1: (kw= '.' kw= '.' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==21) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==21) ) {
                            alt56=1;
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2600:2: kw= '.' kw= '.'
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleTK_REL_OP4970); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getTK_REL_OPAccess().getFullStopKeyword_6_1_0()); 
                                  
                            }
                            kw=(Token)match(input,21,FOLLOW_21_in_ruleTK_REL_OP4983); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 52, ruleTK_REL_OP_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTK_REL_OP"


    // $ANTLR start "entryRuleArithm_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2622:1: entryRuleArithm_expr returns [EObject current=null] : iv_ruleArithm_expr= ruleArithm_expr EOF ;
    public final EObject entryRuleArithm_expr() throws RecognitionException {
        EObject current = null;
        int entryRuleArithm_expr_StartIndex = input.index();
        EObject iv_ruleArithm_expr = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2623:2: (iv_ruleArithm_expr= ruleArithm_expr EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2624:2: iv_ruleArithm_expr= ruleArithm_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_exprRule()); 
            }
            pushFollow(FOLLOW_ruleArithm_expr_in_entryRuleArithm_expr5030);
            iv_ruleArithm_expr=ruleArithm_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithm_expr5040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, entryRuleArithm_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr"


    // $ANTLR start "ruleArithm_expr"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2631:1: ruleArithm_expr returns [EObject current=null] : ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? ) ;
    public final EObject ruleArithm_expr() throws RecognitionException {
        EObject current = null;
        int ruleArithm_expr_StartIndex = input.index();
        EObject lv_arithm_expr_trm_0_0 = null;

        AntlrDatatypeRuleToken lv_subadd_1_0 = null;

        EObject lv_arithm_expr_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2634:28: ( ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2635:1: ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2635:1: ( ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2635:2: ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) ) ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2635:2: ( (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2636:1: (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2636:1: (lv_arithm_expr_trm_0_0= ruleArithm_expr_trm )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2637:3: lv_arithm_expr_trm_0_0= ruleArithm_expr_trm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_expr_trmArithm_expr_trmParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithm_expr_trm_in_ruleArithm_expr5086);
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
                      		"Arithm_expr_trm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:2: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:3: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:3: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2654:1: (lv_subadd_1_0= ruleTK_SUB_ADD )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2654:1: (lv_subadd_1_0= ruleTK_SUB_ADD )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2655:3: lv_subadd_1_0= ruleTK_SUB_ADD
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_exprAccess().getSubaddTK_SUB_ADDParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_SUB_ADD_in_ruleArithm_expr5108);
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
                              		"TK_SUB_ADD");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2671:2: ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2672:1: (lv_arithm_expr_2_0= ruleArithm_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2672:1: (lv_arithm_expr_2_0= ruleArithm_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2673:3: lv_arithm_expr_2_0= ruleArithm_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_in_ruleArithm_expr5129);
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
                              		"Arithm_expr");
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
            if ( state.backtracking>0 ) { memoize(input, 54, ruleArithm_expr_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr"


    // $ANTLR start "entryRuleTK_SUB_ADD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2697:1: entryRuleTK_SUB_ADD returns [String current=null] : iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF ;
    public final String entryRuleTK_SUB_ADD() throws RecognitionException {
        String current = null;
        int entryRuleTK_SUB_ADD_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_SUB_ADD = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2698:2: (iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2699:2: iv_ruleTK_SUB_ADD= ruleTK_SUB_ADD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_SUB_ADDRule()); 
            }
            pushFollow(FOLLOW_ruleTK_SUB_ADD_in_entryRuleTK_SUB_ADD5168);
            iv_ruleTK_SUB_ADD=ruleTK_SUB_ADD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_SUB_ADD.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_SUB_ADD5179); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, entryRuleTK_SUB_ADD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_SUB_ADD"


    // $ANTLR start "ruleTK_SUB_ADD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2706:1: ruleTK_SUB_ADD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleTK_SUB_ADD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_SUB_ADD_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2709:28: ( (kw= '+' | kw= '-' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2710:1: (kw= '+' | kw= '-' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2710:1: (kw= '+' | kw= '-' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            else if ( (LA59_0==26) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2711:2: kw= '+'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleTK_SUB_ADD5217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_SUB_ADDAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2718:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTK_SUB_ADD5236); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 56, ruleTK_SUB_ADD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_SUB_ADD"


    // $ANTLR start "entryRuleArithm_expr_trm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2731:1: entryRuleArithm_expr_trm returns [EObject current=null] : iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF ;
    public final EObject entryRuleArithm_expr_trm() throws RecognitionException {
        EObject current = null;
        int entryRuleArithm_expr_trm_StartIndex = input.index();
        EObject iv_ruleArithm_expr_trm = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2732:2: (iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2733:2: iv_ruleArithm_expr_trm= ruleArithm_expr_trm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_trmRule()); 
            }
            pushFollow(FOLLOW_ruleArithm_expr_trm_in_entryRuleArithm_expr_trm5276);
            iv_ruleArithm_expr_trm=ruleArithm_expr_trm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_trm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithm_expr_trm5286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, entryRuleArithm_expr_trm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_trm"


    // $ANTLR start "ruleArithm_expr_trm"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2740:1: ruleArithm_expr_trm returns [EObject current=null] : ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? ) ;
    public final EObject ruleArithm_expr_trm() throws RecognitionException {
        EObject current = null;
        int ruleArithm_expr_trm_StartIndex = input.index();
        EObject lv_arithm_expr_factor_0_0 = null;

        AntlrDatatypeRuleToken lv_muldiv_1_0 = null;

        AntlrDatatypeRuleToken lv_tk_intdiv_2_0 = null;

        AntlrDatatypeRuleToken lv_tk_intmod_3_0 = null;

        EObject lv_arithm_expr_trm_4_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2743:28: ( ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2744:1: ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2744:1: ( ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2744:2: ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) ) ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2744:2: ( (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2745:1: (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2745:1: (lv_arithm_expr_factor_0_0= ruleArithm_expr_factor )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2746:3: lv_arithm_expr_factor_0_0= ruleArithm_expr_factor
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_factorArithm_expr_factorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithm_expr_factor_in_ruleArithm_expr_trm5332);
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
                      		"Arithm_expr_factor");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2762:2: ( ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=48 && LA61_0<=49)||(LA61_0>=58 && LA61_0<=59)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2762:3: ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) ) ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2762:3: ( ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) ) | ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) ) | ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) ) )
                    int alt60=3;
                    switch ( input.LA(1) ) {
                    case 48:
                    case 49:
                        {
                        alt60=1;
                        }
                        break;
                    case 58:
                        {
                        alt60=2;
                        }
                        break;
                    case 59:
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
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2762:4: ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2762:4: ( (lv_muldiv_1_0= ruleTK_MUL_DIV ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2763:1: (lv_muldiv_1_0= ruleTK_MUL_DIV )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2763:1: (lv_muldiv_1_0= ruleTK_MUL_DIV )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2764:3: lv_muldiv_1_0= ruleTK_MUL_DIV
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getMuldivTK_MUL_DIVParserRuleCall_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTK_MUL_DIV_in_ruleArithm_expr_trm5355);
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
                                      		"TK_MUL_DIV");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2781:6: ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2781:6: ( (lv_tk_intdiv_2_0= ruleTK_INTDIV ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2782:1: (lv_tk_intdiv_2_0= ruleTK_INTDIV )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2782:1: (lv_tk_intdiv_2_0= ruleTK_INTDIV )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2783:3: lv_tk_intdiv_2_0= ruleTK_INTDIV
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getTk_intdivTK_INTDIVParserRuleCall_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTK_INTDIV_in_ruleArithm_expr_trm5382);
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
                                      		"TK_INTDIV");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2800:6: ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2800:6: ( (lv_tk_intmod_3_0= ruleTK_INTMOD ) )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2801:1: (lv_tk_intmod_3_0= ruleTK_INTMOD )
                            {
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2801:1: (lv_tk_intmod_3_0= ruleTK_INTMOD )
                            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2802:3: lv_tk_intmod_3_0= ruleTK_INTMOD
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getTk_intmodTK_INTMODParserRuleCall_1_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTK_INTMOD_in_ruleArithm_expr_trm5409);
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
                                      		"TK_INTMOD");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2818:3: ( (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2819:1: (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2819:1: (lv_arithm_expr_trm_4_0= ruleArithm_expr_trm )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2820:3: lv_arithm_expr_trm_4_0= ruleArithm_expr_trm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_trmAccess().getArithm_expr_trmArithm_expr_trmParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_trm_in_ruleArithm_expr_trm5431);
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
                              		"Arithm_expr_trm");
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
            if ( state.backtracking>0 ) { memoize(input, 58, ruleArithm_expr_trm_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_trm"


    // $ANTLR start "entryRuleTK_MUL_DIV"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2844:1: entryRuleTK_MUL_DIV returns [String current=null] : iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF ;
    public final String entryRuleTK_MUL_DIV() throws RecognitionException {
        String current = null;
        int entryRuleTK_MUL_DIV_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_MUL_DIV = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2845:2: (iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2846:2: iv_ruleTK_MUL_DIV= ruleTK_MUL_DIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_MUL_DIVRule()); 
            }
            pushFollow(FOLLOW_ruleTK_MUL_DIV_in_entryRuleTK_MUL_DIV5470);
            iv_ruleTK_MUL_DIV=ruleTK_MUL_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_MUL_DIV.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MUL_DIV5481); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, entryRuleTK_MUL_DIV_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MUL_DIV"


    // $ANTLR start "ruleTK_MUL_DIV"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2853:1: ruleTK_MUL_DIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleTK_MUL_DIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_MUL_DIV_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2856:28: ( (kw= '*' | kw= '/' ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2857:1: (kw= '*' | kw= '/' )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2857:1: (kw= '*' | kw= '/' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            else if ( (LA62_0==49) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2858:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleTK_MUL_DIV5519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTK_MUL_DIVAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2865:2: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleTK_MUL_DIV5538); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 60, ruleTK_MUL_DIV_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_MUL_DIV"


    // $ANTLR start "entryRuleArithm_expr_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2878:1: entryRuleArithm_expr_factor returns [EObject current=null] : iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF ;
    public final EObject entryRuleArithm_expr_factor() throws RecognitionException {
        EObject current = null;
        int entryRuleArithm_expr_factor_StartIndex = input.index();
        EObject iv_ruleArithm_expr_factor = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2879:2: (iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2880:2: iv_ruleArithm_expr_factor= ruleArithm_expr_factor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_factorRule()); 
            }
            pushFollow(FOLLOW_ruleArithm_expr_factor_in_entryRuleArithm_expr_factor5578);
            iv_ruleArithm_expr_factor=ruleArithm_expr_factor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_factor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithm_expr_factor5588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, entryRuleArithm_expr_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_factor"


    // $ANTLR start "ruleArithm_expr_factor"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2887:1: ruleArithm_expr_factor returns [EObject current=null] : ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? ) ;
    public final EObject ruleArithm_expr_factor() throws RecognitionException {
        EObject current = null;
        int ruleArithm_expr_factor_StartIndex = input.index();
        EObject lv_arithm_expr_simple_0_0 = null;

        AntlrDatatypeRuleToken lv_exponential_1_0 = null;

        EObject lv_arithm_expr_factor_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2890:28: ( ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2891:1: ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2891:1: ( ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2891:2: ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) ) ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2891:2: ( (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2892:1: (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2892:1: (lv_arithm_expr_simple_0_0= ruleArithm_expr_simple )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2893:3: lv_arithm_expr_simple_0_0= ruleArithm_expr_simple
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_simpleArithm_expr_simpleParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArithm_expr_simple_in_ruleArithm_expr_factor5634);
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
                      		"Arithm_expr_simple");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2909:2: ( ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2909:3: ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) ) ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2909:3: ( (lv_exponential_1_0= ruleTK_EXPONENTIAL ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2910:1: (lv_exponential_1_0= ruleTK_EXPONENTIAL )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2910:1: (lv_exponential_1_0= ruleTK_EXPONENTIAL )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2911:3: lv_exponential_1_0= ruleTK_EXPONENTIAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getExponentialTK_EXPONENTIALParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_EXPONENTIAL_in_ruleArithm_expr_factor5656);
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
                              		"TK_EXPONENTIAL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2927:2: ( (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2928:1: (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2928:1: (lv_arithm_expr_factor_2_0= ruleArithm_expr_factor )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2929:3: lv_arithm_expr_factor_2_0= ruleArithm_expr_factor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_factorAccess().getArithm_expr_factorArithm_expr_factorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_factor_in_ruleArithm_expr_factor5677);
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
                              		"Arithm_expr_factor");
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
            if ( state.backtracking>0 ) { memoize(input, 62, ruleArithm_expr_factor_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_factor"


    // $ANTLR start "entryRuleTK_EXPONENTIAL"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2953:1: entryRuleTK_EXPONENTIAL returns [String current=null] : iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF ;
    public final String entryRuleTK_EXPONENTIAL() throws RecognitionException {
        String current = null;
        int entryRuleTK_EXPONENTIAL_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_EXPONENTIAL = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2954:2: (iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2955:2: iv_ruleTK_EXPONENTIAL= ruleTK_EXPONENTIAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_EXPONENTIALRule()); 
            }
            pushFollow(FOLLOW_ruleTK_EXPONENTIAL_in_entryRuleTK_EXPONENTIAL5716);
            iv_ruleTK_EXPONENTIAL=ruleTK_EXPONENTIAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_EXPONENTIAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_EXPONENTIAL5727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, entryRuleTK_EXPONENTIAL_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_EXPONENTIAL"


    // $ANTLR start "ruleTK_EXPONENTIAL"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2962:1: ruleTK_EXPONENTIAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '**' ;
    public final AntlrDatatypeRuleToken ruleTK_EXPONENTIAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_EXPONENTIAL_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2965:28: (kw= '**' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2967:2: kw= '**'
            {
            kw=(Token)match(input,50,FOLLOW_50_in_ruleTK_EXPONENTIAL5764); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 64, ruleTK_EXPONENTIAL_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_EXPONENTIAL"


    // $ANTLR start "entryRuleArithm_expr_simple"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2980:1: entryRuleArithm_expr_simple returns [EObject current=null] : iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF ;
    public final EObject entryRuleArithm_expr_simple() throws RecognitionException {
        EObject current = null;
        int entryRuleArithm_expr_simple_StartIndex = input.index();
        EObject iv_ruleArithm_expr_simple = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2981:2: (iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2982:2: iv_ruleArithm_expr_simple= ruleArithm_expr_simple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithm_expr_simpleRule()); 
            }
            pushFollow(FOLLOW_ruleArithm_expr_simple_in_entryRuleArithm_expr_simple5803);
            iv_ruleArithm_expr_simple=ruleArithm_expr_simple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithm_expr_simple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithm_expr_simple5813); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, entryRuleArithm_expr_simple_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleArithm_expr_simple"


    // $ANTLR start "ruleArithm_expr_simple"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2989:1: ruleArithm_expr_simple returns [EObject current=null] : ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) ) ;
    public final EObject ruleArithm_expr_simple() throws RecognitionException {
        EObject current = null;
        int ruleArithm_expr_simple_StartIndex = input.index();
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_unary_1_0 = null;

        EObject lv_arithm_expr_simple_2_0 = null;

        EObject lv_log_expr_4_0 = null;

        EObject lv_function_6_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2992:28: ( ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2993:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2993:1: ( ( (lv_number_0_0= ruleNumber ) ) | ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) ) | (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' ) | ( (lv_function_6_0= ruleFunction ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBERT:
                {
                alt64=1;
                }
                break;
            case 21:
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
            case 26:
                {
                alt64=2;
                }
                break;
            case 32:
                {
                alt64=3;
                }
                break;
            case RULE_TK_NEG:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case RULE_ATOM:
            case 37:
            case 51:
            case 52:
            case 60:
            case 61:
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2993:2: ( (lv_number_0_0= ruleNumber ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2993:2: ( (lv_number_0_0= ruleNumber ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2994:1: (lv_number_0_0= ruleNumber )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2994:1: (lv_number_0_0= ruleNumber )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2995:3: lv_number_0_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getNumberNumberParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleArithm_expr_simple5859);
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
                              		"Number");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3012:6: ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3012:6: ( ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3012:7: ( (lv_unary_1_0= ruleTK_UNARY_OP ) ) ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3012:7: ( (lv_unary_1_0= ruleTK_UNARY_OP ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3013:1: (lv_unary_1_0= ruleTK_UNARY_OP )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3013:1: (lv_unary_1_0= ruleTK_UNARY_OP )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3014:3: lv_unary_1_0= ruleTK_UNARY_OP
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getUnaryTK_UNARY_OPParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTK_UNARY_OP_in_ruleArithm_expr_simple5887);
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
                              		"TK_UNARY_OP");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3030:2: ( (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3031:1: (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3031:1: (lv_arithm_expr_simple_2_0= ruleArithm_expr_simple )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3032:3: lv_arithm_expr_simple_2_0= ruleArithm_expr_simple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getArithm_expr_simpleArithm_expr_simpleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithm_expr_simple_in_ruleArithm_expr_simple5908);
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
                              		"Arithm_expr_simple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3049:6: (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3049:6: (otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')' )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3049:8: otherlv_3= '(' ( (lv_log_expr_4_0= ruleLog_expr ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleArithm_expr_simple5928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArithm_expr_simpleAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3053:1: ( (lv_log_expr_4_0= ruleLog_expr ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3054:1: (lv_log_expr_4_0= ruleLog_expr )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3054:1: (lv_log_expr_4_0= ruleLog_expr )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3055:3: lv_log_expr_4_0= ruleLog_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getLog_exprLog_exprParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLog_expr_in_ruleArithm_expr_simple5949);
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
                              		"Log_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleArithm_expr_simple5961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArithm_expr_simpleAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3076:6: ( (lv_function_6_0= ruleFunction ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3076:6: ( (lv_function_6_0= ruleFunction ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3077:1: (lv_function_6_0= ruleFunction )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3077:1: (lv_function_6_0= ruleFunction )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3078:3: lv_function_6_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithm_expr_simpleAccess().getFunctionFunctionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleArithm_expr_simple5989);
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
                              		"Function");
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
            if ( state.backtracking>0 ) { memoize(input, 66, ruleArithm_expr_simple_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleArithm_expr_simple"


    // $ANTLR start "entryRuleTK_UNARY_OP"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3102:1: entryRuleTK_UNARY_OP returns [String current=null] : iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF ;
    public final String entryRuleTK_UNARY_OP() throws RecognitionException {
        String current = null;
        int entryRuleTK_UNARY_OP_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_UNARY_OP = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3103:2: (iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3104:2: iv_ruleTK_UNARY_OP= ruleTK_UNARY_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_UNARY_OPRule()); 
            }
            pushFollow(FOLLOW_ruleTK_UNARY_OP_in_entryRuleTK_UNARY_OP6026);
            iv_ruleTK_UNARY_OP=ruleTK_UNARY_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_UNARY_OP.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_UNARY_OP6037); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, entryRuleTK_UNARY_OP_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_UNARY_OP"


    // $ANTLR start "ruleTK_UNARY_OP"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3111:1: ruleTK_UNARY_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleTK_UNARY_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_UNARY_OP_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3114:28: (kw= '-' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3116:2: kw= '-'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleTK_UNARY_OP6074); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 68, ruleTK_UNARY_OP_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_UNARY_OP"


    // $ANTLR start "entryRuleFunction"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3129:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;
        int entryRuleFunction_StartIndex = input.index();
        EObject iv_ruleFunction = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3130:2: (iv_ruleFunction= ruleFunction EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3131:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction6113);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction6123); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, entryRuleFunction_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3138:1: ruleFunction returns [EObject current=null] : ( (lv_literal_0_0= ruleLiteral ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;
        int ruleFunction_StartIndex = input.index();
        EObject lv_literal_0_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3141:28: ( ( (lv_literal_0_0= ruleLiteral ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3142:1: ( (lv_literal_0_0= ruleLiteral ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3142:1: ( (lv_literal_0_0= ruleLiteral ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3143:1: (lv_literal_0_0= ruleLiteral )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3143:1: (lv_literal_0_0= ruleLiteral )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3144:3: lv_literal_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getLiteralLiteralParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleFunction6168);
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
                      		"Literal");
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
            if ( state.backtracking>0 ) { memoize(input, 70, ruleFunction_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVar"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3168:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;
        int entryRuleVar_StartIndex = input.index();
        EObject iv_ruleVar = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3169:2: (iv_ruleVar= ruleVar EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3170:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar6203);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar6213); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, entryRuleVar_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3177:1: ruleVar returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;
        int ruleVar_StartIndex = input.index();
        Token lv_var_0_0=null;
        Token lv_unnamedvar_1_0=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3180:28: ( ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:1: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:1: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:2: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )?
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:2: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) )
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:3: ( (lv_var_0_0= RULE_VART ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3181:3: ( (lv_var_0_0= RULE_VART ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3182:1: (lv_var_0_0= RULE_VART )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3182:1: (lv_var_0_0= RULE_VART )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3183:3: lv_var_0_0= RULE_VART
                    {
                    lv_var_0_0=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleVar6256); if (state.failed) return current;
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
                              		"VART");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3200:6: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3200:6: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3201:1: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3201:1: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3202:3: lv_unnamedvar_1_0= RULE_UNNAMEDVART
                    {
                    lv_unnamedvar_1_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_RULE_UNNAMEDVART_in_ruleVar6284); if (state.failed) return current;
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
                              		"UNNAMEDVART");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3218:3: ( (lv_list_2_0= ruleList ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3219:1: (lv_list_2_0= ruleList )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3219:1: (lv_list_2_0= ruleList )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3220:3: lv_list_2_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarAccess().getListListParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleList_in_ruleVar6311);
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
                              		"List");
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
            if ( state.backtracking>0 ) { memoize(input, 72, ruleVar_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleString"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3244:1: entryRuleString returns [EObject current=null] : iv_ruleString= ruleString EOF ;
    public final EObject entryRuleString() throws RecognitionException {
        EObject current = null;
        int entryRuleString_StartIndex = input.index();
        EObject iv_ruleString = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3245:2: (iv_ruleString= ruleString EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3246:2: iv_ruleString= ruleString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringRule()); 
            }
            pushFollow(FOLLOW_ruleString_in_entryRuleString6348);
            iv_ruleString=ruleString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleString6358); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, entryRuleString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleString"


    // $ANTLR start "ruleString"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3253:1: ruleString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRINGT ) ) ;
    public final EObject ruleString() throws RecognitionException {
        EObject current = null;
        int ruleString_StartIndex = input.index();
        Token lv_string_0_0=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3256:28: ( ( (lv_string_0_0= RULE_STRINGT ) ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3257:1: ( (lv_string_0_0= RULE_STRINGT ) )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3257:1: ( (lv_string_0_0= RULE_STRINGT ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3258:1: (lv_string_0_0= RULE_STRINGT )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3258:1: (lv_string_0_0= RULE_STRINGT )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3259:3: lv_string_0_0= RULE_STRINGT
            {
            lv_string_0_0=(Token)match(input,RULE_STRINGT,FOLLOW_RULE_STRINGT_in_ruleString6399); if (state.failed) return current;
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
                      		"STRINGT");
              	    
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
            if ( state.backtracking>0 ) { memoize(input, 74, ruleString_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleString"


    // $ANTLR start "entryRuleNumber"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3283:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;
        int entryRuleNumber_StartIndex = input.index();
        EObject iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3287:2: (iv_ruleNumber= ruleNumber EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3288:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber6445);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber6455); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, entryRuleNumber_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3298:1: ruleNumber returns [EObject current=null] : ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;
        int ruleNumber_StartIndex = input.index();
        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;
        Token otherlv_3=null;
        Token lv_decimalPart_4_0=null;
        Token lv_number_5_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3302:28: ( ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:1: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:1: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) | (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ ) | ( (lv_number_5_0= RULE_NUMBERT ) )+ )
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_NUMBERT) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred97_InternalAsl()) ) {
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
            else if ( (LA71_0==21) ) {
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:2: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:2: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:3: ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:3: ( (lv_number_0_0= RULE_NUMBERT ) )+
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
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3304:1: (lv_number_0_0= RULE_NUMBERT )
                    	    {
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3304:1: (lv_number_0_0= RULE_NUMBERT )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3305:3: lv_number_0_0= RULE_NUMBERT
                    	    {
                    	    lv_number_0_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_ruleNumber6502); if (state.failed) return current;
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
                    	              		"NUMBERT");
                    	      	    
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

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleNumber6520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getFullStopKeyword_0_1());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3325:1: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==RULE_NUMBERT) ) {
                            int LA68_2 = input.LA(2);

                            if ( (synpred96_InternalAsl()) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
                    	    {
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3327:3: lv_decimalPart_2_0= RULE_NUMBERT
                    	    {
                    	    lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_ruleNumber6537); if (state.failed) return current;
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
                    	              		"NUMBERT");
                    	      	    
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3344:6: (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ )
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3344:6: (otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+ )
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3344:8: otherlv_3= '.' ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleNumber6563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                          
                    }
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3348:1: ( (lv_decimalPart_4_0= RULE_NUMBERT ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_NUMBERT) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred98_InternalAsl()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3349:1: (lv_decimalPart_4_0= RULE_NUMBERT )
                    	    {
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3349:1: (lv_decimalPart_4_0= RULE_NUMBERT )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3350:3: lv_decimalPart_4_0= RULE_NUMBERT
                    	    {
                    	    lv_decimalPart_4_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_ruleNumber6580); if (state.failed) return current;
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
                    	              		"NUMBERT");
                    	      	    
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
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3367:6: ( (lv_number_5_0= RULE_NUMBERT ) )+
                    {
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3367:6: ( (lv_number_5_0= RULE_NUMBERT ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_NUMBERT) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred100_InternalAsl()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3368:1: (lv_number_5_0= RULE_NUMBERT )
                    	    {
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3368:1: (lv_number_5_0= RULE_NUMBERT )
                    	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3369:3: lv_number_5_0= RULE_NUMBERT
                    	    {
                    	    lv_number_5_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_ruleNumber6610); if (state.failed) return current;
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
                    	              		"NUMBERT");
                    	      	    
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
            if ( state.backtracking>0 ) { memoize(input, 76, ruleNumber_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJASON_ATOM"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3396:1: entryRuleJASON_ATOM returns [String current=null] : iv_ruleJASON_ATOM= ruleJASON_ATOM EOF ;
    public final String entryRuleJASON_ATOM() throws RecognitionException {
        String current = null;
        int entryRuleJASON_ATOM_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleJASON_ATOM = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3400:2: (iv_ruleJASON_ATOM= ruleJASON_ATOM EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3401:2: iv_ruleJASON_ATOM= ruleJASON_ATOM EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOMRule()); 
            }
            pushFollow(FOLLOW_ruleJASON_ATOM_in_entryRuleJASON_ATOM6663);
            iv_ruleJASON_ATOM=ruleJASON_ATOM();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJASON_ATOM6674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, entryRuleJASON_ATOM_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM"


    // $ANTLR start "ruleJASON_ATOM"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3411:1: ruleJASON_ATOM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleJASON_ATOM_StartIndex = input.index();
        AntlrDatatypeRuleToken this_JASON_ATOM_HEAD_0 = null;

        AntlrDatatypeRuleToken this_JASON_ATOM_TAIL_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3415:28: ( (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3416:1: (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3416:1: (this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )* )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3417:5: this_JASON_ATOM_HEAD_0= ruleJASON_ATOM_HEAD (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_HEADParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleJASON_ATOM_HEAD_in_ruleJASON_ATOM6725);
            this_JASON_ATOM_HEAD_0=ruleJASON_ATOM_HEAD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_JASON_ATOM_HEAD_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3427:1: (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==21) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ATOM) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred101_InternalAsl()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3428:5: this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_TAILParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleJASON_ATOM_TAIL_in_ruleJASON_ATOM6753);
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, ruleJASON_ATOM_StartIndex); }

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM"


    // $ANTLR start "entryRuleJASON_ATOM_HEAD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3449:1: entryRuleJASON_ATOM_HEAD returns [String current=null] : iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF ;
    public final String entryRuleJASON_ATOM_HEAD() throws RecognitionException {
        String current = null;
        int entryRuleJASON_ATOM_HEAD_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleJASON_ATOM_HEAD = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3450:2: (iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3451:2: iv_ruleJASON_ATOM_HEAD= ruleJASON_ATOM_HEAD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOM_HEADRule()); 
            }
            pushFollow(FOLLOW_ruleJASON_ATOM_HEAD_in_entryRuleJASON_ATOM_HEAD6805);
            iv_ruleJASON_ATOM_HEAD=ruleJASON_ATOM_HEAD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM_HEAD.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJASON_ATOM_HEAD6816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, entryRuleJASON_ATOM_HEAD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM_HEAD"


    // $ANTLR start "ruleJASON_ATOM_HEAD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3458:1: ruleJASON_ATOM_HEAD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM_HEAD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleJASON_ATOM_HEAD_StartIndex = input.index();
        Token kw=null;
        Token this_ATOM_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3461:28: ( ( (kw= '.' )? this_ATOM_1= RULE_ATOM ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3462:1: ( (kw= '.' )? this_ATOM_1= RULE_ATOM )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3462:1: ( (kw= '.' )? this_ATOM_1= RULE_ATOM )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3462:2: (kw= '.' )? this_ATOM_1= RULE_ATOM
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3462:2: (kw= '.' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==21) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3463:2: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleJASON_ATOM_HEAD6855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJASON_ATOM_HEADAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleJASON_ATOM_HEAD6872); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 80, ruleJASON_ATOM_HEAD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM_HEAD"


    // $ANTLR start "entryRuleJASON_ATOM_TAIL"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3483:1: entryRuleJASON_ATOM_TAIL returns [String current=null] : iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF ;
    public final String entryRuleJASON_ATOM_TAIL() throws RecognitionException {
        String current = null;
        int entryRuleJASON_ATOM_TAIL_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleJASON_ATOM_TAIL = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3484:2: (iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3485:2: iv_ruleJASON_ATOM_TAIL= ruleJASON_ATOM_TAIL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJASON_ATOM_TAILRule()); 
            }
            pushFollow(FOLLOW_ruleJASON_ATOM_TAIL_in_entryRuleJASON_ATOM_TAIL6918);
            iv_ruleJASON_ATOM_TAIL=ruleJASON_ATOM_TAIL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJASON_ATOM_TAIL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJASON_ATOM_TAIL6929); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, entryRuleJASON_ATOM_TAIL_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleJASON_ATOM_TAIL"


    // $ANTLR start "ruleJASON_ATOM_TAIL"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3492:1: ruleJASON_ATOM_TAIL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleJASON_ATOM_TAIL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleJASON_ATOM_TAIL_StartIndex = input.index();
        Token kw=null;
        Token this_ATOM_1=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3495:28: ( (kw= '.' this_ATOM_1= RULE_ATOM ) )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3496:1: (kw= '.' this_ATOM_1= RULE_ATOM )
            {
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3496:1: (kw= '.' this_ATOM_1= RULE_ATOM )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3497:2: kw= '.' this_ATOM_1= RULE_ATOM
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleJASON_ATOM_TAIL6967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getJASON_ATOM_TAILAccess().getFullStopKeyword_0()); 
                  
            }
            this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleJASON_ATOM_TAIL6982); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 82, ruleJASON_ATOM_TAIL_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleJASON_ATOM_TAIL"


    // $ANTLR start "entryRuleTK_BEGIN"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3517:1: entryRuleTK_BEGIN returns [String current=null] : iv_ruleTK_BEGIN= ruleTK_BEGIN EOF ;
    public final String entryRuleTK_BEGIN() throws RecognitionException {
        String current = null;
        int entryRuleTK_BEGIN_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_BEGIN = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3518:2: (iv_ruleTK_BEGIN= ruleTK_BEGIN EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3519:2: iv_ruleTK_BEGIN= ruleTK_BEGIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_BEGINRule()); 
            }
            pushFollow(FOLLOW_ruleTK_BEGIN_in_entryRuleTK_BEGIN7028);
            iv_ruleTK_BEGIN=ruleTK_BEGIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_BEGIN.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_BEGIN7039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, entryRuleTK_BEGIN_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_BEGIN"


    // $ANTLR start "ruleTK_BEGIN"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3526:1: ruleTK_BEGIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'begin' ;
    public final AntlrDatatypeRuleToken ruleTK_BEGIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_BEGIN_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3529:28: (kw= 'begin' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3531:2: kw= 'begin'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleTK_BEGIN7076); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 84, ruleTK_BEGIN_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_BEGIN"


    // $ANTLR start "entryRuleTK_END"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3544:1: entryRuleTK_END returns [String current=null] : iv_ruleTK_END= ruleTK_END EOF ;
    public final String entryRuleTK_END() throws RecognitionException {
        String current = null;
        int entryRuleTK_END_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_END = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3545:2: (iv_ruleTK_END= ruleTK_END EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3546:2: iv_ruleTK_END= ruleTK_END EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_ENDRule()); 
            }
            pushFollow(FOLLOW_ruleTK_END_in_entryRuleTK_END7116);
            iv_ruleTK_END=ruleTK_END();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_END.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_END7127); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, entryRuleTK_END_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_END"


    // $ANTLR start "ruleTK_END"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3553:1: ruleTK_END returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'end' ;
    public final AntlrDatatypeRuleToken ruleTK_END() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_END_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3556:28: (kw= 'end' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3558:2: kw= 'end'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleTK_END7164); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 86, ruleTK_END_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_END"


    // $ANTLR start "entryRuleTK_IF"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3571:1: entryRuleTK_IF returns [String current=null] : iv_ruleTK_IF= ruleTK_IF EOF ;
    public final String entryRuleTK_IF() throws RecognitionException {
        String current = null;
        int entryRuleTK_IF_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_IF = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3572:2: (iv_ruleTK_IF= ruleTK_IF EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3573:2: iv_ruleTK_IF= ruleTK_IF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_IFRule()); 
            }
            pushFollow(FOLLOW_ruleTK_IF_in_entryRuleTK_IF7204);
            iv_ruleTK_IF=ruleTK_IF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_IF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_IF7215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, entryRuleTK_IF_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_IF"


    // $ANTLR start "ruleTK_IF"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3580:1: ruleTK_IF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleTK_IF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_IF_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3583:28: (kw= 'if' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3585:2: kw= 'if'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleTK_IF7252); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 88, ruleTK_IF_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_IF"


    // $ANTLR start "entryRuleTK_ELSE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3598:1: entryRuleTK_ELSE returns [String current=null] : iv_ruleTK_ELSE= ruleTK_ELSE EOF ;
    public final String entryRuleTK_ELSE() throws RecognitionException {
        String current = null;
        int entryRuleTK_ELSE_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_ELSE = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3599:2: (iv_ruleTK_ELSE= ruleTK_ELSE EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3600:2: iv_ruleTK_ELSE= ruleTK_ELSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_ELSERule()); 
            }
            pushFollow(FOLLOW_ruleTK_ELSE_in_entryRuleTK_ELSE7292);
            iv_ruleTK_ELSE=ruleTK_ELSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_ELSE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ELSE7303); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, entryRuleTK_ELSE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ELSE"


    // $ANTLR start "ruleTK_ELSE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3607:1: ruleTK_ELSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'else' ;
    public final AntlrDatatypeRuleToken ruleTK_ELSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_ELSE_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3610:28: (kw= 'else' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3612:2: kw= 'else'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleTK_ELSE7340); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 90, ruleTK_ELSE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_ELSE"


    // $ANTLR start "entryRuleTK_FOR"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3625:1: entryRuleTK_FOR returns [String current=null] : iv_ruleTK_FOR= ruleTK_FOR EOF ;
    public final String entryRuleTK_FOR() throws RecognitionException {
        String current = null;
        int entryRuleTK_FOR_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_FOR = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3626:2: (iv_ruleTK_FOR= ruleTK_FOR EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3627:2: iv_ruleTK_FOR= ruleTK_FOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_FORRule()); 
            }
            pushFollow(FOLLOW_ruleTK_FOR_in_entryRuleTK_FOR7380);
            iv_ruleTK_FOR=ruleTK_FOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_FOR.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_FOR7391); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, entryRuleTK_FOR_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_FOR"


    // $ANTLR start "ruleTK_FOR"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3634:1: ruleTK_FOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'for' ;
    public final AntlrDatatypeRuleToken ruleTK_FOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_FOR_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3637:28: (kw= 'for' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3639:2: kw= 'for'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleTK_FOR7428); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 92, ruleTK_FOR_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_FOR"


    // $ANTLR start "entryRuleTK_WHILE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3652:1: entryRuleTK_WHILE returns [String current=null] : iv_ruleTK_WHILE= ruleTK_WHILE EOF ;
    public final String entryRuleTK_WHILE() throws RecognitionException {
        String current = null;
        int entryRuleTK_WHILE_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_WHILE = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3653:2: (iv_ruleTK_WHILE= ruleTK_WHILE EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3654:2: iv_ruleTK_WHILE= ruleTK_WHILE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_WHILERule()); 
            }
            pushFollow(FOLLOW_ruleTK_WHILE_in_entryRuleTK_WHILE7468);
            iv_ruleTK_WHILE=ruleTK_WHILE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_WHILE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_WHILE7479); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, entryRuleTK_WHILE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_WHILE"


    // $ANTLR start "ruleTK_WHILE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3661:1: ruleTK_WHILE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'while' ;
    public final AntlrDatatypeRuleToken ruleTK_WHILE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_WHILE_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3664:28: (kw= 'while' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3666:2: kw= 'while'
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleTK_WHILE7516); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 94, ruleTK_WHILE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_WHILE"


    // $ANTLR start "entryRuleTK_NOT"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3679:1: entryRuleTK_NOT returns [String current=null] : iv_ruleTK_NOT= ruleTK_NOT EOF ;
    public final String entryRuleTK_NOT() throws RecognitionException {
        String current = null;
        int entryRuleTK_NOT_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_NOT = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3680:2: (iv_ruleTK_NOT= ruleTK_NOT EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3681:2: iv_ruleTK_NOT= ruleTK_NOT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_NOTRule()); 
            }
            pushFollow(FOLLOW_ruleTK_NOT_in_entryRuleTK_NOT7556);
            iv_ruleTK_NOT=ruleTK_NOT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_NOT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_NOT7567); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, entryRuleTK_NOT_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_NOT"


    // $ANTLR start "ruleTK_NOT"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3688:1: ruleTK_NOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleTK_NOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_NOT_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3691:28: (kw= 'not' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3693:2: kw= 'not'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleTK_NOT7604); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 96, ruleTK_NOT_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_NOT"


    // $ANTLR start "entryRuleTK_INTDIV"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3706:1: entryRuleTK_INTDIV returns [String current=null] : iv_ruleTK_INTDIV= ruleTK_INTDIV EOF ;
    public final String entryRuleTK_INTDIV() throws RecognitionException {
        String current = null;
        int entryRuleTK_INTDIV_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_INTDIV = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3707:2: (iv_ruleTK_INTDIV= ruleTK_INTDIV EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3708:2: iv_ruleTK_INTDIV= ruleTK_INTDIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_INTDIVRule()); 
            }
            pushFollow(FOLLOW_ruleTK_INTDIV_in_entryRuleTK_INTDIV7644);
            iv_ruleTK_INTDIV=ruleTK_INTDIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_INTDIV.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_INTDIV7655); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, entryRuleTK_INTDIV_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_INTDIV"


    // $ANTLR start "ruleTK_INTDIV"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3715:1: ruleTK_INTDIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken ruleTK_INTDIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_INTDIV_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3718:28: (kw= 'div' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3720:2: kw= 'div'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleTK_INTDIV7692); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 98, ruleTK_INTDIV_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_INTDIV"


    // $ANTLR start "entryRuleTK_INTMOD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3733:1: entryRuleTK_INTMOD returns [String current=null] : iv_ruleTK_INTMOD= ruleTK_INTMOD EOF ;
    public final String entryRuleTK_INTMOD() throws RecognitionException {
        String current = null;
        int entryRuleTK_INTMOD_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_INTMOD = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3734:2: (iv_ruleTK_INTMOD= ruleTK_INTMOD EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3735:2: iv_ruleTK_INTMOD= ruleTK_INTMOD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_INTMODRule()); 
            }
            pushFollow(FOLLOW_ruleTK_INTMOD_in_entryRuleTK_INTMOD7732);
            iv_ruleTK_INTMOD=ruleTK_INTMOD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_INTMOD.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_INTMOD7743); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, entryRuleTK_INTMOD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_INTMOD"


    // $ANTLR start "ruleTK_INTMOD"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3742:1: ruleTK_INTMOD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken ruleTK_INTMOD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_INTMOD_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3745:28: (kw= 'mod' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3747:2: kw= 'mod'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleTK_INTMOD7780); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 100, ruleTK_INTMOD_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_INTMOD"


    // $ANTLR start "entryRuleTK_TRUE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3760:1: entryRuleTK_TRUE returns [String current=null] : iv_ruleTK_TRUE= ruleTK_TRUE EOF ;
    public final String entryRuleTK_TRUE() throws RecognitionException {
        String current = null;
        int entryRuleTK_TRUE_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_TRUE = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3761:2: (iv_ruleTK_TRUE= ruleTK_TRUE EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3762:2: iv_ruleTK_TRUE= ruleTK_TRUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_TRUERule()); 
            }
            pushFollow(FOLLOW_ruleTK_TRUE_in_entryRuleTK_TRUE7820);
            iv_ruleTK_TRUE=ruleTK_TRUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_TRUE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TRUE7831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, entryRuleTK_TRUE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_TRUE"


    // $ANTLR start "ruleTK_TRUE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3769:1: ruleTK_TRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTK_TRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_TRUE_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3772:28: (kw= 'true' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3774:2: kw= 'true'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleTK_TRUE7868); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 102, ruleTK_TRUE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_TRUE"


    // $ANTLR start "entryRuleTK_FALSE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3787:1: entryRuleTK_FALSE returns [String current=null] : iv_ruleTK_FALSE= ruleTK_FALSE EOF ;
    public final String entryRuleTK_FALSE() throws RecognitionException {
        String current = null;
        int entryRuleTK_FALSE_StartIndex = input.index();
        AntlrDatatypeRuleToken iv_ruleTK_FALSE = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3788:2: (iv_ruleTK_FALSE= ruleTK_FALSE EOF )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3789:2: iv_ruleTK_FALSE= ruleTK_FALSE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTK_FALSERule()); 
            }
            pushFollow(FOLLOW_ruleTK_FALSE_in_entryRuleTK_FALSE7908);
            iv_ruleTK_FALSE=ruleTK_FALSE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTK_FALSE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_FALSE7919); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, entryRuleTK_FALSE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_FALSE"


    // $ANTLR start "ruleTK_FALSE"
    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3796:1: ruleTK_FALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleTK_FALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
        int ruleTK_FALSE_StartIndex = input.index();
        Token kw=null;

         enterRule(); 
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return current; }
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3799:28: (kw= 'false' )
            // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3801:2: kw= 'false'
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleTK_FALSE7956); if (state.failed) return current;
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
            if ( state.backtracking>0 ) { memoize(input, 104, ruleTK_FALSE_StartIndex); }
        }
        return current;
    }
    // $ANTLR end "ruleTK_FALSE"

    // $ANTLR start synpred1_InternalAsl
    public final void synpred1_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_0_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:88:1: ( (lv_directive_0_0= ruleDirective ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:88:1: (lv_directive_0_0= ruleDirective )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:88:1: (lv_directive_0_0= ruleDirective )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:89:3: lv_directive_0_0= ruleDirective
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDirective_in_synpred1_InternalAsl144);
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


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: ( (lv_directive_2_0= ruleDirective ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:125:3: lv_directive_2_0= ruleDirective
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDirective_in_synpred2_InternalAsl188);
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


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:4: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )*
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:105:4: ( (lv_belief_1_0= ruleBelief ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:106:1: (lv_belief_1_0= ruleBelief )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:106:1: (lv_belief_1_0= ruleBelief )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:107:3: lv_belief_1_0= ruleBelief
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleBelief_in_synpred3_InternalAsl167);
        lv_belief_1_0=ruleBelief();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:123:2: ( (lv_directive_2_0= ruleDirective ) )*
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:124:1: (lv_directive_2_0= ruleDirective )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:125:3: lv_directive_2_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDirective_in_synpred3_InternalAsl188);
        	    lv_directive_2_0=ruleDirective();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop74;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred3_InternalAsl

    // $ANTLR start synpred4_InternalAsl
    public final void synpred4_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_directive_4_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: ( (lv_directive_4_0= ruleDirective ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:161:3: lv_directive_4_0= ruleDirective
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDirective_in_synpred4_InternalAsl234);
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


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:6: ( ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )* )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:6: ( (lv_initial_goal_3_0= ruleInitial_goal ) ) ( (lv_directive_4_0= ruleDirective ) )*
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:141:6: ( (lv_initial_goal_3_0= ruleInitial_goal ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:142:1: (lv_initial_goal_3_0= ruleInitial_goal )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:142:1: (lv_initial_goal_3_0= ruleInitial_goal )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:143:3: lv_initial_goal_3_0= ruleInitial_goal
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getInitial_goalInitial_goalParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleInitial_goal_in_synpred5_InternalAsl213);
        lv_initial_goal_3_0=ruleInitial_goal();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:159:2: ( (lv_directive_4_0= ruleDirective ) )*
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==18) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:160:1: (lv_directive_4_0= ruleDirective )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:161:3: lv_directive_4_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDirective_in_synpred5_InternalAsl234);
        	    lv_directive_4_0=ruleDirective();

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
    // $ANTLR end synpred5_InternalAsl

    // $ANTLR start synpred6_InternalAsl
    public final void synpred6_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_belief_6_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: ( (lv_belief_6_0= ruleBelief ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:197:3: lv_belief_6_0= ruleBelief
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleBelief_in_synpred6_InternalAsl280);
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


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: ( (lv_directive_7_0= ruleDirective ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:215:3: lv_directive_7_0= ruleDirective
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleDirective_in_synpred7_InternalAsl302);
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


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:6: ( ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )* )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:6: ( (lv_plan_5_0= rulePlan ) ) ( (lv_belief_6_0= ruleBelief ) )* ( (lv_directive_7_0= ruleDirective ) )*
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:177:6: ( (lv_plan_5_0= rulePlan ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:178:1: (lv_plan_5_0= rulePlan )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:178:1: (lv_plan_5_0= rulePlan )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:179:3: lv_plan_5_0= rulePlan
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAgentAccess().getPlanPlanParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePlan_in_synpred8_InternalAsl259);
        lv_plan_5_0=rulePlan();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:195:2: ( (lv_belief_6_0= ruleBelief ) )*
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_TK_NEG && LA76_0<=RULE_UNNAMEDVART)||LA76_0==RULE_ATOM||LA76_0==21||LA76_0==37||(LA76_0>=51 && LA76_0<=52)||(LA76_0>=60 && LA76_0<=61)) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:196:1: (lv_belief_6_0= ruleBelief )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:197:3: lv_belief_6_0= ruleBelief
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefBeliefParserRuleCall_3_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleBelief_in_synpred8_InternalAsl280);
        	    lv_belief_6_0=ruleBelief();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop76;
            }
        } while (true);

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:213:3: ( (lv_directive_7_0= ruleDirective ) )*
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:214:1: (lv_directive_7_0= ruleDirective )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:215:3: lv_directive_7_0= ruleDirective
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getAgentAccess().getDirectiveDirectiveParserRuleCall_3_2_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDirective_in_synpred8_InternalAsl302);
        	    lv_directive_7_0=ruleDirective();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop77;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred8_InternalAsl

    // $ANTLR start synpred14_InternalAsl
    public final void synpred14_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_literal_1_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:3: ( ( (lv_literal_1_0= ruleLiteral ) ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:3: ( (lv_literal_1_0= ruleLiteral ) )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:611:3: ( (lv_literal_1_0= ruleLiteral ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:612:1: (lv_literal_1_0= ruleLiteral )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:612:1: (lv_literal_1_0= ruleLiteral )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:613:3: lv_literal_1_0= ruleLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTriggerAccess().getLiteralLiteralParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleLiteral_in_synpred14_InternalAsl1100);
        lv_literal_1_0=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalAsl

    // $ANTLR start synpred20_InternalAsl
    public final void synpred20_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_plan_body_2_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:746:1: ( (lv_plan_body_2_0= rulePlan_body ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:746:1: (lv_plan_body_2_0= rulePlan_body )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:746:1: (lv_plan_body_2_0= rulePlan_body )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:747:3: lv_plan_body_2_0= rulePlan_body
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPlan_bodyAccess().getPlan_bodyPlan_bodyParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePlan_body_in_synpred20_InternalAsl1421);
        lv_plan_body_2_0=rulePlan_body();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalAsl

    // $ANTLR start synpred27_InternalAsl
    public final void synpred27_InternalAsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_tk_else_5_0 = null;

        EObject lv_plan_term2_6_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:3: ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:3: ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1025:3: ( (lv_tk_else_5_0= ruleTK_ELSE ) )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==54) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1026:1: (lv_tk_else_5_0= ruleTK_ELSE )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1026:1: (lv_tk_else_5_0= ruleTK_ELSE )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1027:3: lv_tk_else_5_0= ruleTK_ELSE
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getStmtIFAccess().getTk_elseTK_ELSEParserRuleCall_5_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleTK_ELSE_in_synpred27_InternalAsl1941);
                lv_tk_else_5_0=ruleTK_ELSE();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1043:3: ( (lv_plan_term2_6_0= rulePlan_term ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1044:1: (lv_plan_term2_6_0= rulePlan_term )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1044:1: (lv_plan_term2_6_0= rulePlan_term )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1045:3: lv_plan_term2_6_0= rulePlan_term
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStmtIFAccess().getPlan_term2Plan_termParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePlan_term_in_synpred27_InternalAsl1963);
        lv_plan_term2_6_0=rulePlan_term();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalAsl

    // $ANTLR start synpred36_InternalAsl
    public final void synpred36_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:6: ( (otherlv_7= '-' (otherlv_8= '+' )? ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:6: (otherlv_7= '-' (otherlv_8= '+' )? )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:6: (otherlv_7= '-' (otherlv_8= '+' )? )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1282:8: otherlv_7= '-' (otherlv_8= '+' )?
        {
        otherlv_7=(Token)match(input,26,FOLLOW_26_in_synpred36_InternalAsl2491); if (state.failed) return ;
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1286:1: (otherlv_8= '+' )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==25) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1286:3: otherlv_8= '+'
                {
                otherlv_8=(Token)match(input,25,FOLLOW_25_in_synpred36_InternalAsl2504); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalAsl

    // $ANTLR start synpred42_InternalAsl
    public final void synpred42_InternalAsl_fragment() throws RecognitionException {   
        Token lv_tk_label_at_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_pred_3_0 = null;

        EObject lv_trigger_4_0 = null;

        EObject lv_log_expr_6_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:2: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:2: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )?
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:2: ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_TK_LABEL_AT) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:3: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1361:3: ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1362:1: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1362:1: (lv_tk_label_at_2_0= RULE_TK_LABEL_AT )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1363:3: lv_tk_label_at_2_0= RULE_TK_LABEL_AT
                {
                lv_tk_label_at_2_0=(Token)match(input,RULE_TK_LABEL_AT,FOLLOW_RULE_TK_LABEL_AT_in_synpred42_InternalAsl2673); if (state.failed) return ;

                }


                }

                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1379:2: ( (lv_pred_3_0= rulePred ) )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1380:1: (lv_pred_3_0= rulePred )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1380:1: (lv_pred_3_0= rulePred )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1381:3: lv_pred_3_0= rulePred
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getPlan_termAccess().getPredPredParserRuleCall_2_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_rulePred_in_synpred42_InternalAsl2699);
                lv_pred_3_0=rulePred();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1397:4: ( (lv_trigger_4_0= ruleTrigger ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1398:1: (lv_trigger_4_0= ruleTrigger )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1398:1: (lv_trigger_4_0= ruleTrigger )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1399:3: lv_trigger_4_0= ruleTrigger
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPlan_termAccess().getTriggerTriggerParserRuleCall_2_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTrigger_in_synpred42_InternalAsl2722);
        lv_trigger_4_0=ruleTrigger();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1415:2: (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==23) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1415:4: otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) )
                {
                otherlv_5=(Token)match(input,23,FOLLOW_23_in_synpred42_InternalAsl2735); if (state.failed) return ;
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1419:1: ( (lv_log_expr_6_0= ruleLog_expr ) )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1420:1: (lv_log_expr_6_0= ruleLog_expr )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1420:1: (lv_log_expr_6_0= ruleLog_expr )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1421:3: lv_log_expr_6_0= ruleLog_expr
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getPlan_termAccess().getLog_exprLog_exprParserRuleCall_2_2_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleLog_expr_in_synpred42_InternalAsl2756);
                lv_log_expr_6_0=ruleLog_expr();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1437:4: (otherlv_7= '<-' | otherlv_8= ';' )?
        int alt83=3;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==24) ) {
            alt83=1;
        }
        else if ( (LA83_0==29) ) {
            alt83=2;
        }
        switch (alt83) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1437:6: otherlv_7= '<-'
                {
                otherlv_7=(Token)match(input,24,FOLLOW_24_in_synpred42_InternalAsl2771); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1442:7: otherlv_8= ';'
                {
                otherlv_8=(Token)match(input,29,FOLLOW_29_in_synpred42_InternalAsl2789); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred42_InternalAsl

    // $ANTLR start synpred43_InternalAsl
    public final void synpred43_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_literal_9_0 = null;

        EObject lv_log_expr2_11_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:6: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:6: ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1446:6: ( (lv_literal_9_0= ruleLiteral ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1447:1: (lv_literal_9_0= ruleLiteral )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1447:1: (lv_literal_9_0= ruleLiteral )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1448:3: lv_literal_9_0= ruleLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPlan_termAccess().getLiteralLiteralParserRuleCall_3_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleLiteral_in_synpred43_InternalAsl2815);
        lv_literal_9_0=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,20,FOLLOW_20_in_synpred43_InternalAsl2827); if (state.failed) return ;
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1468:1: ( (lv_log_expr2_11_0= ruleLog_expr ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1469:1: (lv_log_expr2_11_0= ruleLog_expr )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1469:1: (lv_log_expr2_11_0= ruleLog_expr )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1470:3: lv_log_expr2_11_0= ruleLog_expr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPlan_termAccess().getLog_expr2Log_exprParserRuleCall_3_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleLog_expr_in_synpred43_InternalAsl2848);
        lv_log_expr2_11_0=ruleLog_expr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred43_InternalAsl

    // $ANTLR start synpred47_InternalAsl
    public final void synpred47_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_atom_0_0 = null;

        EObject lv_var_1_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:4: ( ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::' )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:4: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )? otherlv_2= '::'
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:4: ( ( (lv_atom_0_0= ruleJASON_ATOM ) ) | ( (lv_var_1_0= ruleVar ) ) )?
        int alt84=3;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ATOM||LA84_0==21) ) {
            alt84=1;
        }
        else if ( ((LA84_0>=RULE_VART && LA84_0<=RULE_UNNAMEDVART)) ) {
            alt84=2;
        }
        switch (alt84) {
            case 1 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:5: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1529:5: ( (lv_atom_0_0= ruleJASON_ATOM ) )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1530:1: (lv_atom_0_0= ruleJASON_ATOM )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1530:1: (lv_atom_0_0= ruleJASON_ATOM )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1531:3: lv_atom_0_0= ruleJASON_ATOM
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getLiteralAccess().getAtomJASON_ATOMParserRuleCall_0_0_0_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleJASON_ATOM_in_synpred47_InternalAsl2979);
                lv_atom_0_0=ruleJASON_ATOM();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1548:6: ( (lv_var_1_0= ruleVar ) )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1548:6: ( (lv_var_1_0= ruleVar ) )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1549:1: (lv_var_1_0= ruleVar )
                {
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1549:1: (lv_var_1_0= ruleVar )
                // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1550:3: lv_var_1_0= ruleVar
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_0_0_0_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleVar_in_synpred47_InternalAsl3006);
                lv_var_1_0=ruleVar();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_2=(Token)match(input,37,FOLLOW_37_in_synpred47_InternalAsl3020); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalAsl

    // $ANTLR start synpred54_InternalAsl
    public final void synpred54_InternalAsl_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_terms_4_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1740:5: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1740:5: otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,32,FOLLOW_32_in_synpred54_InternalAsl3311); if (state.failed) return ;
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1744:1: ( (lv_terms_4_0= ruleTerms ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1745:1: (lv_terms_4_0= ruleTerms )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1745:1: (lv_terms_4_0= ruleTerms )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1746:3: lv_terms_4_0= ruleTerms
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTerms_in_synpred54_InternalAsl3332);
        lv_terms_4_0=ruleTerms();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_5=(Token)match(input,33,FOLLOW_33_in_synpred54_InternalAsl3344); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalAsl

    // $ANTLR start synpred55_InternalAsl
    public final void synpred55_InternalAsl_fragment() throws RecognitionException {   
        EObject lv_plan_term_6_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1767:1: ( (lv_plan_term_6_0= rulePlan_term ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1767:1: (lv_plan_term_6_0= rulePlan_term )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1767:1: (lv_plan_term_6_0= rulePlan_term )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:1768:3: lv_plan_term_6_0= rulePlan_term
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPredAccess().getPlan_termPlan_termParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_rulePlan_term_in_synpred55_InternalAsl3367);
        lv_plan_term_6_0=rulePlan_term();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred55_InternalAsl

    // $ANTLR start synpred83_InternalAsl
    public final void synpred83_InternalAsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_subadd_1_0 = null;

        EObject lv_arithm_expr_2_0 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:3: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:3: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2653:3: ( (lv_subadd_1_0= ruleTK_SUB_ADD ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2654:1: (lv_subadd_1_0= ruleTK_SUB_ADD )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2654:1: (lv_subadd_1_0= ruleTK_SUB_ADD )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2655:3: lv_subadd_1_0= ruleTK_SUB_ADD
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArithm_exprAccess().getSubaddTK_SUB_ADDParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTK_SUB_ADD_in_synpred83_InternalAsl5108);
        lv_subadd_1_0=ruleTK_SUB_ADD();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2671:2: ( (lv_arithm_expr_2_0= ruleArithm_expr ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2672:1: (lv_arithm_expr_2_0= ruleArithm_expr )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2672:1: (lv_arithm_expr_2_0= ruleArithm_expr )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:2673:3: lv_arithm_expr_2_0= ruleArithm_expr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getArithm_exprAccess().getArithm_exprArithm_exprParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleArithm_expr_in_synpred83_InternalAsl5129);
        lv_arithm_expr_2_0=ruleArithm_expr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred83_InternalAsl

    // $ANTLR start synpred96_InternalAsl
    public final void synpred96_InternalAsl_fragment() throws RecognitionException {   
        Token lv_decimalPart_2_0=null;

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3327:3: lv_decimalPart_2_0= RULE_NUMBERT
        {
        lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_synpred96_InternalAsl6537); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred96_InternalAsl

    // $ANTLR start synpred97_InternalAsl
    public final void synpred97_InternalAsl_fragment() throws RecognitionException {   
        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimalPart_2_0=null;

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:2: ( ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:2: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:2: ( ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+ )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:3: ( (lv_number_0_0= RULE_NUMBERT ) )+ otherlv_1= '.' ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3303:3: ( (lv_number_0_0= RULE_NUMBERT ) )+
        int cnt95=0;
        loop95:
        do {
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_NUMBERT) ) {
                alt95=1;
            }


            switch (alt95) {
        	case 1 :
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3304:1: (lv_number_0_0= RULE_NUMBERT )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3304:1: (lv_number_0_0= RULE_NUMBERT )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3305:3: lv_number_0_0= RULE_NUMBERT
        	    {
        	    lv_number_0_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_synpred97_InternalAsl6502); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt95 >= 1 ) break loop95;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(95, input);
                    throw eee;
            }
            cnt95++;
        } while (true);

        otherlv_1=(Token)match(input,21,FOLLOW_21_in_synpred97_InternalAsl6520); if (state.failed) return ;
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3325:1: ( (lv_decimalPart_2_0= RULE_NUMBERT ) )+
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
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
        	    {
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3326:1: (lv_decimalPart_2_0= RULE_NUMBERT )
        	    // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3327:3: lv_decimalPart_2_0= RULE_NUMBERT
        	    {
        	    lv_decimalPart_2_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_synpred97_InternalAsl6537); if (state.failed) return ;

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


        }


        }
    }
    // $ANTLR end synpred97_InternalAsl

    // $ANTLR start synpred98_InternalAsl
    public final void synpred98_InternalAsl_fragment() throws RecognitionException {   
        Token lv_decimalPart_4_0=null;

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3349:1: ( (lv_decimalPart_4_0= RULE_NUMBERT ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3349:1: (lv_decimalPart_4_0= RULE_NUMBERT )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3349:1: (lv_decimalPart_4_0= RULE_NUMBERT )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3350:3: lv_decimalPart_4_0= RULE_NUMBERT
        {
        lv_decimalPart_4_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_synpred98_InternalAsl6580); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred98_InternalAsl

    // $ANTLR start synpred100_InternalAsl
    public final void synpred100_InternalAsl_fragment() throws RecognitionException {   
        Token lv_number_5_0=null;

        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3368:1: ( (lv_number_5_0= RULE_NUMBERT ) )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3368:1: (lv_number_5_0= RULE_NUMBERT )
        {
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3368:1: (lv_number_5_0= RULE_NUMBERT )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3369:3: lv_number_5_0= RULE_NUMBERT
        {
        lv_number_5_0=(Token)match(input,RULE_NUMBERT,FOLLOW_RULE_NUMBERT_in_synpred100_InternalAsl6610); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred100_InternalAsl

    // $ANTLR start synpred101_InternalAsl
    public final void synpred101_InternalAsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_JASON_ATOM_TAIL_1 = null;


        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3428:5: (this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL )
        // ../jasonide.xtext.asl/src-gen/jasonide/xtext/asl/parser/antlr/internal/InternalAsl.g:3428:5: this_JASON_ATOM_TAIL_1= ruleJASON_ATOM_TAIL
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getJASON_ATOMAccess().getJASON_ATOM_TAILParserRuleCall_1()); 
              
        }
        pushFollow(FOLLOW_ruleJASON_ATOM_TAIL_in_synpred101_InternalAsl6753);
        this_JASON_ATOM_TAIL_1=ruleJASON_ATOM_TAIL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalAsl

    // Delegated rules

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
    public final boolean synpred54_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred20_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalAsl_fragment(); // can never throw exception
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
    public final boolean synpred83_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalAsl_fragment(); // can never throw exception
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
    public final boolean synpred47_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalAsl_fragment(); // can never throw exception
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
    public final boolean synpred36_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalAsl_fragment(); // can never throw exception
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
    public final boolean synpred14_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalAsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalAsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalAsl_fragment(); // can never throw exception
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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\1\14\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\12\0\1\uffff";
    static final String DFA3_maxS =
        "\1\75\1\uffff\12\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\12\uffff\1\1";
    static final String DFA3_specialS =
        "\2\uffff\1\7\1\4\1\2\1\11\1\6\1\0\1\1\1\10\1\3\1\5\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\7\1\4\1\5\2\uffff\1\3\7\uffff\1\1\2\uffff\1\2\1\1\2\uffff"+
            "\3\1\11\uffff\1\6\15\uffff\1\10\1\11\7\uffff\1\12\1\13",
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
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 105:3: ( ( (lv_belief_1_0= ruleBelief ) ) ( (lv_directive_2_0= ruleDirective ) )* )*";
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
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalAsl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index3_5);
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
    static final String DFA6_eotS =
        "\23\uffff";
    static final String DFA6_eofS =
        "\1\1\22\uffff";
    static final String DFA6_minS =
        "\1\4\2\uffff\12\0\6\uffff";
    static final String DFA6_maxS =
        "\1\75\2\uffff\12\0\6\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA6_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\10\1\5\1\6\2\uffff\1\4\7\uffff\1\1\2\uffff\1\3\1\1\2"+
            "\uffff\3\1\11\uffff\1\7\15\uffff\1\11\1\12\7\uffff\1\13\1\14",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 195:2: ( (lv_belief_6_0= ruleBelief ) )*";
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
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAsl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_12);
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
    static final String DFA18_eotS =
        "\32\uffff";
    static final String DFA18_eofS =
        "\1\30\31\uffff";
    static final String DFA18_minS =
        "\1\5\13\uffff\1\0\15\uffff";
    static final String DFA18_maxS =
        "\1\75\13\uffff\1\0\15\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\26\uffff\1\2\1\uffff";
    static final String DFA18_specialS =
        "\14\uffff\1\0\15\uffff}>";
    static final String[] DFA18_transitionS = {
            "\6\1\7\uffff\1\1\1\30\1\uffff\1\14\1\1\2\uffff\2\1\1\uffff\1"+
            "\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\15\uffff\3\1\1\uffff"+
            "\3\1\2\uffff\2\1",
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
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "745:3: ( (lv_plan_body_2_0= rulePlan_body ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_12 = input.LA(1);

                         
                        int index18_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index18_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\36\uffff";
    static final String DFA23_eofS =
        "\1\3\35\uffff";
    static final String DFA23_minS =
        "\1\5\1\uffff\1\0\33\uffff";
    static final String DFA23_maxS =
        "\1\75\1\uffff\1\0\33\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\32\uffff";
    static final String DFA23_specialS =
        "\2\uffff\1\0\33\uffff}>";
    static final String[] DFA23_transitionS = {
            "\6\3\7\uffff\1\2\1\3\1\uffff\2\3\2\uffff\2\3\1\uffff\5\3\1\uffff"+
            "\1\3\2\uffff\1\3\15\uffff\3\3\1\1\3\3\2\uffff\2\3",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1025:2: ( ( (lv_tk_else_5_0= ruleTK_ELSE ) )? ( (lv_plan_term2_6_0= rulePlan_term ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_2 = input.LA(1);

                         
                        int index23_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index23_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\26\uffff";
    static final String DFA26_eofS =
        "\26\uffff";
    static final String DFA26_minS =
        "\1\5\4\uffff\1\0\20\uffff";
    static final String DFA26_maxS =
        "\1\75\4\uffff\1\0\20\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\16\uffff\1\5";
    static final String DFA26_specialS =
        "\5\uffff\1\0\20\uffff}>";
    static final String[] DFA26_transitionS = {
            "\6\6\7\uffff\1\6\2\uffff\1\6\1\1\2\uffff\1\4\1\5\1\uffff\1\3"+
            "\3\uffff\1\6\1\uffff\1\2\2\uffff\1\6\15\uffff\2\6\4\uffff\1"+
            "\6\2\uffff\2\6",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1248:2: (otherlv_0= '!' | otherlv_1= '!!' | otherlv_2= '?' | (otherlv_3= '+' (otherlv_4= '+' | otherlv_5= '>' | otherlv_6= '<' )? ) | (otherlv_7= '-' (otherlv_8= '+' )? ) )?";
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
                        if ( (synpred36_InternalAsl()) ) {s = 21;}

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
    static final String DFA31_eotS =
        "\41\uffff";
    static final String DFA31_eofS =
        "\41\uffff";
    static final String DFA31_minS =
        "\1\4\1\uffff\2\5\1\uffff\1\11\3\0\1\5\1\6\4\0\1\11\3\0\1\5\1\6\4"+
        "\0\1\12\3\0\1\12\3\0";
    static final String DFA31_maxS =
        "\1\75\1\uffff\2\75\1\uffff\1\12\3\0\2\64\4\0\1\12\3\0\2\64\4\0\1"+
        "\12\3\0\1\12\3\0";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\34\uffff";
    static final String DFA31_specialS =
        "\6\uffff\1\17\1\5\1\4\2\uffff\1\0\1\23\1\16\1\6\1\uffff\1\12\1\11"+
        "\1\20\2\uffff\1\13\1\7\1\10\1\22\1\uffff\1\21\1\15\1\1\1\uffff\1"+
        "\14\1\3\1\2}>";
    static final String[] DFA31_transitionS = {
            "\1\1\6\4\7\uffff\2\4\1\uffff\2\4\2\uffff\1\2\1\3\1\1\1\4\3\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\1\4\15\uffff\3\4\1\uffff\3\4\2\uffff"+
            "\2\4",
            "",
            "\1\12\1\7\1\10\2\4\1\6\7\uffff\1\4\2\uffff\1\5\1\1\2\uffff"+
            "\2\4\1\uffff\1\1\3\uffff\1\4\2\uffff\2\4\1\11\15\uffff\1\13"+
            "\1\14\4\uffff\1\4\2\uffff\1\15\1\16",
            "\1\24\1\21\1\22\2\4\1\20\7\uffff\1\4\2\uffff\1\17\1\1\2\uffff"+
            "\2\4\1\uffff\1\1\3\uffff\1\4\4\uffff\1\23\15\uffff\1\25\1\26"+
            "\4\uffff\1\4\2\uffff\1\27\1\30",
            "",
            "\1\4\1\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\12\1\33\1\34\2\uffff\1\32\12\uffff\1\31\35\uffff\1\13\1"+
            "\14",
            "\1\33\1\34\2\uffff\1\32\12\uffff\1\31\35\uffff\1\13\1\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\4\1\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\24\1\37\1\40\2\uffff\1\36\12\uffff\1\35\35\uffff\1\25\1"+
            "\26",
            "\1\37\1\40\2\uffff\1\36\12\uffff\1\35\35\uffff\1\25\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1361:1: ( ( ( (lv_tk_label_at_2_0= RULE_TK_LABEL_AT ) ) ( (lv_pred_3_0= rulePred ) ) )? ( (lv_trigger_4_0= ruleTrigger ) ) (otherlv_5= ':' ( (lv_log_expr_6_0= ruleLog_expr ) ) )? (otherlv_7= '<-' | otherlv_8= ';' )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalAsl()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index31_12);
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
    static final String DFA32_eotS =
        "\32\uffff";
    static final String DFA32_eofS =
        "\32\uffff";
    static final String DFA32_minS =
        "\1\5\12\0\17\uffff";
    static final String DFA32_maxS =
        "\1\75\12\0\17\uffff";
    static final String DFA32_acceptS =
        "\13\uffff\1\2\15\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\17\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\6\1\3\1\4\2\13\1\2\7\uffff\2\13\1\uffff\1\1\1\13\2\uffff"+
            "\2\13\1\uffff\1\13\3\uffff\1\13\1\uffff\1\13\2\uffff\1\5\15"+
            "\uffff\1\7\1\10\1\13\1\uffff\3\13\2\uffff\1\11\1\12",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1446:5: ( ( (lv_literal_9_0= ruleLiteral ) ) otherlv_10= ':-' ( (lv_log_expr2_11_0= ruleLog_expr ) ) )?";
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
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalAsl()) ) {s = 25;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index32_10);
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
    static final String DFA40_eotS =
        "\64\uffff";
    static final String DFA40_eofS =
        "\1\2\63\uffff";
    static final String DFA40_minS =
        "\1\5\1\0\62\uffff";
    static final String DFA40_maxS =
        "\1\75\1\0\62\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\2\60\uffff\1\1";
    static final String DFA40_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA40_transitionS = {
            "\6\2\7\uffff\16\2\1\1\25\2\1\uffff\7\2",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "1740:3: (otherlv_3= '(' ( (lv_terms_4_0= ruleTerms ) ) otherlv_5= ')' )?";
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
                        if ( (synpred54_InternalAsl()) ) {s = 51;}

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
    static final String DFA41_eotS =
        "\64\uffff";
    static final String DFA41_eofS =
        "\1\1\63\uffff";
    static final String DFA41_minS =
        "\1\5\32\uffff\1\0\30\uffff";
    static final String DFA41_maxS =
        "\1\75\32\uffff\1\0\30\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA41_specialS =
        "\33\uffff\1\0\30\uffff}>";
    static final String[] DFA41_transitionS = {
            "\6\1\7\uffff\1\33\43\1\1\uffff\7\1",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 1766:3: ( (lv_plan_term_6_0= rulePlan_term ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_27 = input.LA(1);

                         
                        int index41_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalAsl()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_27);
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
    static final String DFA58_eotS =
        "\53\uffff";
    static final String DFA58_eofS =
        "\1\3\52\uffff";
    static final String DFA58_minS =
        "\1\5\2\0\50\uffff";
    static final String DFA58_maxS =
        "\1\75\2\0\50\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\1\2\46\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\1\1\50\uffff}>";
    static final String[] DFA58_transitionS = {
            "\6\3\7\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\1\1\2\1\uffff\13"+
            "\3\1\uffff\10\3\3\uffff\3\3\1\uffff\3\3\2\uffff\2\3",
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
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "2653:2: ( ( (lv_subadd_1_0= ruleTK_SUB_ADD ) ) ( (lv_arithm_expr_2_0= ruleArithm_expr ) ) )?";
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
                        if ( (synpred83_InternalAsl()) ) {s = 42;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred83_InternalAsl()) ) {s = 42;}

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
 

    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent88 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleAgent144 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleAgent167 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleAgent188 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleInitial_goal_in_ruleAgent213 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleAgent234 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_rulePlan_in_ruleAgent259 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleAgent280 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_ruleAgent302 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleDirective_in_entryRuleDirective341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirective351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDirective388 = new BitSet(new long[]{0x0018000000200400L});
    public static final BitSet FOLLOW_ruleTK_BEGIN_in_ruleDirective411 = new BitSet(new long[]{0x0018000000200400L});
    public static final BitSet FOLLOW_rulePred_in_ruleDirective432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDirective444 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleDirective465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_in_ruleDirective494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDirective506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleBelief600 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleBelief613 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleBelief634 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBelief648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitial_goal_in_entryRuleInitial_goal684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitial_goal694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInitial_goal731 = new BitSet(new long[]{0x30180020002004E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleInitial_goal752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInitial_goal764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_entryRulePlan800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_LABEL_AT_in_rulePlan853 = new BitSet(new long[]{0x0018000000200400L});
    public static final BitSet FOLLOW_rulePred_in_rulePlan879 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_ruleTrigger_in_rulePlan902 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_23_in_rulePlan915 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_rulePlan936 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_rulePlan951 = new BitSet(new long[]{0x33B80025166407E0L});
    public static final BitSet FOLLOW_rulePlan_body_in_rulePlan972 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePlan986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerSymbol_in_ruleTrigger1078 = new BitSet(new long[]{0x30180020002004E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTrigger1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleTrigger1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerSymbol_in_entryRuleTriggerSymbol1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerSymbol1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTriggerSymbol1215 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_26_in_ruleTriggerSymbol1234 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_27_in_ruleTriggerSymbol1253 = new BitSet(new long[]{0x0000000010400002L});
    public static final BitSet FOLLOW_22_in_ruleTriggerSymbol1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTriggerSymbol1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_in_entryRulePlan_body1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan_body1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_term_in_rulePlan_body1385 = new BitSet(new long[]{0x33B80025366407E2L});
    public static final BitSet FOLLOW_29_in_rulePlan_body1398 = new BitSet(new long[]{0x33B80025166407E2L});
    public static final BitSet FOLLOW_rulePlan_body_in_rulePlan_body1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_term_in_entryRulePlan_body_term1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan_body_term1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_factor_in_rulePlan_body_term1514 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulePlan_body_term1527 = new BitSet(new long[]{0x33B80025166407E0L});
    public static final BitSet FOLLOW_rulePlan_body_term_in_rulePlan_body_term1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_factor_in_entryRulePlan_body_factor1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan_body_factor1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmtIF_in_rulePlan_body_factor1643 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleStmtFOR_in_rulePlan_body_factor1670 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleStmtWHILE_in_rulePlan_body_factor1697 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleBody_formula_in_rulePlan_body_factor1724 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulePlan_body_factor1738 = new BitSet(new long[]{0x33B80025166407E0L});
    public static final BitSet FOLLOW_rulePlan_body_factor_in_rulePlan_body_factor1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmtIF_in_entryRuleStmtIF1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmtIF1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IF_in_ruleStmtIF1853 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStmtIF1865 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleStmtIF1886 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStmtIF1898 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleStmtIF1919 = new BitSet(new long[]{0x0040000000040002L});
    public static final BitSet FOLLOW_ruleTK_ELSE_in_ruleStmtIF1941 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleStmtIF1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmtFOR_in_entryRuleStmtFOR2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmtFOR2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FOR_in_ruleStmtFOR2057 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStmtFOR2069 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleStmtFOR2090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStmtFOR2102 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleStmtFOR2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmtWHILE_in_entryRuleStmtWHILE2159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmtWHILE2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_WHILE_in_ruleStmtWHILE2215 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStmtWHILE2227 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleStmtWHILE2248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStmtWHILE2260 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleStmtWHILE2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_formula_in_entryRuleBody_formula2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody_formula2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBody_formula2365 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_34_in_ruleBody_formula2383 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_28_in_ruleBody_formula2401 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_25_in_ruleBody_formula2420 = new BitSet(new long[]{0x32180039062407E0L});
    public static final BitSet FOLLOW_25_in_ruleBody_formula2433 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_35_in_ruleBody_formula2451 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_36_in_ruleBody_formula2469 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_26_in_ruleBody_formula2491 = new BitSet(new long[]{0x32180021062407E0L});
    public static final BitSet FOLLOW_25_in_ruleBody_formula2504 = new BitSet(new long[]{0x32180021042407E0L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleBody_formula2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleBody_formula2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_term_in_entryRulePlan_term2595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlan_term2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePlan_term2654 = new BitSet(new long[]{0x33B800251E6C07F0L});
    public static final BitSet FOLLOW_RULE_TK_LABEL_AT_in_rulePlan_term2673 = new BitSet(new long[]{0x0018000000200400L});
    public static final BitSet FOLLOW_rulePred_in_rulePlan_term2699 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_ruleTrigger_in_rulePlan_term2722 = new BitSet(new long[]{0x33B8002537EC07E0L});
    public static final BitSet FOLLOW_23_in_rulePlan_term2735 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_rulePlan_term2756 = new BitSet(new long[]{0x33B80025376C07E0L});
    public static final BitSet FOLLOW_24_in_rulePlan_term2771 = new BitSet(new long[]{0x33B80025166C07E0L});
    public static final BitSet FOLLOW_29_in_rulePlan_term2789 = new BitSet(new long[]{0x33B80025166C07E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePlan_term2815 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlan_term2827 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_rulePlan_term2848 = new BitSet(new long[]{0x33B80025166C07E0L});
    public static final BitSet FOLLOW_rulePlan_body_in_rulePlan_term2871 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePlan_term2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_in_ruleLiteral2979 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleVar_in_ruleLiteral3006 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLiteral3020 = new BitSet(new long[]{0x00180000002004E0L});
    public static final BitSet FOLLOW_RULE_TK_NEG_in_ruleLiteral3039 = new BitSet(new long[]{0x00180000002004C0L});
    public static final BitSet FOLLOW_rulePred_in_ruleLiteral3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleLiteral3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRUE_in_ruleLiteral3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FALSE_in_ruleLiteral3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_in_entryRulePred3186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePred3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_in_rulePred3243 = new BitSet(new long[]{0x0000008100040002L});
    public static final BitSet FOLLOW_ruleTK_BEGIN_in_rulePred3270 = new BitSet(new long[]{0x0000008100040002L});
    public static final BitSet FOLLOW_ruleTK_END_in_rulePred3297 = new BitSet(new long[]{0x0000008100040002L});
    public static final BitSet FOLLOW_32_in_rulePred3311 = new BitSet(new long[]{0x321800A1042407E0L});
    public static final BitSet FOLLOW_ruleTerms_in_rulePred3332 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePred3344 = new BitSet(new long[]{0x0000008000040002L});
    public static final BitSet FOLLOW_rulePlan_term_in_rulePred3367 = new BitSet(new long[]{0x0000008000040002L});
    public static final BitSet FOLLOW_ruleList_in_rulePred3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_entryRuleTerms3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerms3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms3482 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleTerms3495 = new BitSet(new long[]{0x321800A1042407E0L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms3516 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleTerm3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleTerm3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList3700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleList3759 = new BitSet(new long[]{0x321802A1042407E0L});
    public static final BitSet FOLLOW_ruleTerm_in_list_in_ruleList3781 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_38_in_ruleList3794 = new BitSet(new long[]{0x321800A1042407E0L});
    public static final BitSet FOLLOW_ruleTerm_in_list_in_ruleList3815 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_40_in_ruleList3830 = new BitSet(new long[]{0x00000080000000C0L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleList3848 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_UNNAMEDVART_in_ruleList3876 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleList_in_ruleList3908 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleList3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_list_in_entryRuleTerm_in_list3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm_in_list3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm_in_list4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_ruleTerm_in_list4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString_in_ruleTerm_in_list4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleTerm_in_list4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_in_entryRuleLog_expr4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog_expr4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_trm_in_ruleLog_expr4190 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleLog_expr4203 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleLog_expr4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_trm_in_entryRuleLog_expr_trm4262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog_expr_trm4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_factor_in_ruleLog_expr_trm4318 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleLog_expr_trm4331 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_trm_in_ruleLog_expr_trm4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLog_expr_factor_in_entryRuleLog_expr_factor4390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLog_expr_factor4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_NOT_in_ruleLog_expr_factor4447 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_factor_in_ruleLog_expr_factor4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRel_expr_in_ruleLog_expr_factor4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRel_expr_in_entryRuleRel_expr4532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRel_expr4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_ruleRel_expr4589 = new BitSet(new long[]{0x0000F81800000002L});
    public static final BitSet FOLLOW_ruleString_in_ruleRel_expr4616 = new BitSet(new long[]{0x0000F81800000002L});
    public static final BitSet FOLLOW_ruleTK_REL_OP_in_ruleRel_expr4639 = new BitSet(new long[]{0x321800A1042407E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_ruleRel_expr4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString_in_ruleRel_expr4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleRel_expr4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_term_in_ruleRel_expr4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_REL_OP_in_entryRuleTK_REL_OP4788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_REL_OP4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTK_REL_OP4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTK_REL_OP4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTK_REL_OP4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTK_REL_OP4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTK_REL_OP4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTK_REL_OP4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTK_REL_OP4956 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleTK_REL_OP4970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTK_REL_OP4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_entryRuleArithm_expr5030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithm_expr5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_trm_in_ruleArithm_expr5086 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_ruleTK_SUB_ADD_in_ruleArithm_expr5108 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_ruleArithm_expr5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_SUB_ADD_in_entryRuleTK_SUB_ADD5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_SUB_ADD5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTK_SUB_ADD5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTK_SUB_ADD5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_trm_in_entryRuleArithm_expr_trm5276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithm_expr_trm5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_factor_in_ruleArithm_expr_trm5332 = new BitSet(new long[]{0x0C03000000000002L});
    public static final BitSet FOLLOW_ruleTK_MUL_DIV_in_ruleArithm_expr_trm5355 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleTK_INTDIV_in_ruleArithm_expr_trm5382 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleTK_INTMOD_in_ruleArithm_expr_trm5409 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_trm_in_ruleArithm_expr_trm5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MUL_DIV_in_entryRuleTK_MUL_DIV5470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MUL_DIV5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTK_MUL_DIV5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTK_MUL_DIV5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_factor_in_entryRuleArithm_expr_factor5578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithm_expr_factor5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_simple_in_ruleArithm_expr_factor5634 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleTK_EXPONENTIAL_in_ruleArithm_expr_factor5656 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_factor_in_ruleArithm_expr_factor5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_EXPONENTIAL_in_entryRuleTK_EXPONENTIAL5716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_EXPONENTIAL5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTK_EXPONENTIAL5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithm_expr_simple_in_entryRuleArithm_expr_simple5803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithm_expr_simple5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleArithm_expr_simple5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_UNARY_OP_in_ruleArithm_expr_simple5887 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_simple_in_ruleArithm_expr_simple5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArithm_expr_simple5928 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_ruleArithm_expr_simple5949 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArithm_expr_simple5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleArithm_expr_simple5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_UNARY_OP_in_entryRuleTK_UNARY_OP6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_UNARY_OP6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTK_UNARY_OP6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction6113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFunction6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar6203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleVar6256 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_UNNAMEDVART_in_ruleVar6284 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleVar6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleString_in_entryRuleString6348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleString6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGT_in_ruleString6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber6445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_ruleNumber6502 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_21_in_ruleNumber6520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_ruleNumber6537 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_21_in_ruleNumber6563 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_ruleNumber6580 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_ruleNumber6610 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_in_entryRuleJASON_ATOM6663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJASON_ATOM6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_HEAD_in_ruleJASON_ATOM6725 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_TAIL_in_ruleJASON_ATOM6753 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_HEAD_in_entryRuleJASON_ATOM_HEAD6805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJASON_ATOM_HEAD6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJASON_ATOM_HEAD6855 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleJASON_ATOM_HEAD6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_TAIL_in_entryRuleJASON_ATOM_TAIL6918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJASON_ATOM_TAIL6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleJASON_ATOM_TAIL6967 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleJASON_ATOM_TAIL6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_BEGIN_in_entryRuleTK_BEGIN7028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_BEGIN7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTK_BEGIN7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_END_in_entryRuleTK_END7116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_END7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTK_END7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IF_in_entryRuleTK_IF7204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_IF7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTK_IF7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ELSE_in_entryRuleTK_ELSE7292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ELSE7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTK_ELSE7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FOR_in_entryRuleTK_FOR7380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_FOR7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTK_FOR7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_WHILE_in_entryRuleTK_WHILE7468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_WHILE7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTK_WHILE7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_NOT_in_entryRuleTK_NOT7556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_NOT7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTK_NOT7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INTDIV_in_entryRuleTK_INTDIV7644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_INTDIV7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTK_INTDIV7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INTMOD_in_entryRuleTK_INTMOD7732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_INTMOD7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTK_INTMOD7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRUE_in_entryRuleTK_TRUE7820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TRUE7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTK_TRUE7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FALSE_in_entryRuleTK_FALSE7908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_FALSE7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTK_FALSE7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred1_InternalAsl144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred2_InternalAsl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_synpred3_InternalAsl167 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred3_InternalAsl188 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred4_InternalAsl234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitial_goal_in_synpred5_InternalAsl213 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred5_InternalAsl234 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleBelief_in_synpred6_InternalAsl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred7_InternalAsl302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_in_synpred8_InternalAsl259 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleBelief_in_synpred8_InternalAsl280 = new BitSet(new long[]{0x301800200E6404F0L});
    public static final BitSet FOLLOW_ruleDirective_in_synpred8_InternalAsl302 = new BitSet(new long[]{0x301800200E6404F2L});
    public static final BitSet FOLLOW_ruleLiteral_in_synpred14_InternalAsl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_body_in_synpred20_InternalAsl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ELSE_in_synpred27_InternalAsl1941 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rulePlan_term_in_synpred27_InternalAsl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred36_InternalAsl2491 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_synpred36_InternalAsl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TK_LABEL_AT_in_synpred42_InternalAsl2673 = new BitSet(new long[]{0x0018000000200400L});
    public static final BitSet FOLLOW_rulePred_in_synpred42_InternalAsl2699 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_ruleTrigger_in_synpred42_InternalAsl2722 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_23_in_synpred42_InternalAsl2735 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_synpred42_InternalAsl2756 = new BitSet(new long[]{0x0000000021000002L});
    public static final BitSet FOLLOW_24_in_synpred42_InternalAsl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred42_InternalAsl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_synpred43_InternalAsl2815 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred43_InternalAsl2827 = new BitSet(new long[]{0x32180021042007E0L});
    public static final BitSet FOLLOW_ruleLog_expr_in_synpred43_InternalAsl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_in_synpred47_InternalAsl2979 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleVar_in_synpred47_InternalAsl3006 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_synpred47_InternalAsl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred54_InternalAsl3311 = new BitSet(new long[]{0x321800A1042407E0L});
    public static final BitSet FOLLOW_ruleTerms_in_synpred54_InternalAsl3332 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred54_InternalAsl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlan_term_in_synpred55_InternalAsl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_SUB_ADD_in_synpred83_InternalAsl5108 = new BitSet(new long[]{0x30180021042006E0L});
    public static final BitSet FOLLOW_ruleArithm_expr_in_synpred83_InternalAsl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_synpred96_InternalAsl6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_synpred97_InternalAsl6502 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_21_in_synpred97_InternalAsl6520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_synpred97_InternalAsl6537 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_synpred98_InternalAsl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBERT_in_synpred100_InternalAsl6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJASON_ATOM_TAIL_in_synpred101_InternalAsl6753 = new BitSet(new long[]{0x0000000000000002L});

}