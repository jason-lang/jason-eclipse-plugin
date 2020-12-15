package jasonide.xtext.mas2j.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMas2jLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_LCLETTER=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int RULE_ID_WITH_STARTING_UCLETTER=7;
    public static final int RULE_HEXPREFIX=11;
    public static final int RULE_HEXDIGIT=12;
    public static final int RULE_UCLETTER=9;
    public static final int RULE_INT_LITERAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID_WITH_STARTING_LCLETTER=4;
    public static final int RULE_WS=13;
    public static final int RULE_INTEGERNUMBER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMas2jLexer() {;} 
    public InternalMas2jLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMas2jLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMas2j.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:11:7: ( 'MAS' )
            // InternalMas2j.g:11:9: 'MAS'
            {
            match("MAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:12:7: ( '{' )
            // InternalMas2j.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:13:7: ( '}' )
            // InternalMas2j.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:14:7: ( '.' )
            // InternalMas2j.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:15:7: ( 'infrastructure' )
            // InternalMas2j.g:15:9: 'infrastructure'
            {
            match("infrastructure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:16:7: ( ':' )
            // InternalMas2j.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:17:7: ( 'environment' )
            // InternalMas2j.g:17:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:18:7: ( 'at' )
            // InternalMas2j.g:18:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:19:7: ( 'executionControl' )
            // InternalMas2j.g:19:9: 'executionControl'
            {
            match("executionControl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:20:7: ( 'classpath' )
            // InternalMas2j.g:20:9: 'classpath'
            {
            match("classpath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:21:7: ( ';' )
            // InternalMas2j.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:22:7: ( 'aslSourcePath' )
            // InternalMas2j.g:22:9: 'aslSourcePath'
            {
            match("aslSourcePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:23:7: ( '[' )
            // InternalMas2j.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:24:7: ( ',' )
            // InternalMas2j.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:25:7: ( ']' )
            // InternalMas2j.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:26:7: ( '(' )
            // InternalMas2j.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:27:7: ( ')' )
            // InternalMas2j.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:28:7: ( 'directives' )
            // InternalMas2j.g:28:9: 'directives'
            {
            match("directives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:29:7: ( '=' )
            // InternalMas2j.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:30:7: ( 'agents' )
            // InternalMas2j.g:30:9: 'agents'
            {
            match("agents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:31:7: ( 'events' )
            // InternalMas2j.g:31:9: 'events'
            {
            match("events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:32:7: ( 'discard' )
            // InternalMas2j.g:32:9: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:33:7: ( 'requeue' )
            // InternalMas2j.g:33:9: 'requeue'
            {
            match("requeue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:34:7: ( 'retrieve' )
            // InternalMas2j.g:34:9: 'retrieve'
            {
            match("retrieve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:35:7: ( 'intBels' )
            // InternalMas2j.g:35:9: 'intBels'
            {
            match("intBels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:36:7: ( 'sameFocus' )
            // InternalMas2j.g:36:9: 'sameFocus'
            {
            match("sameFocus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:37:7: ( 'newFocus' )
            // InternalMas2j.g:37:9: 'newFocus'
            {
            match("newFocus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:38:7: ( 'nrcbp' )
            // InternalMas2j.g:38:9: 'nrcbp'
            {
            match("nrcbp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:39:7: ( 'verbose' )
            // InternalMas2j.g:39:9: 'verbose'
            {
            match("verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:40:7: ( 'beliefs' )
            // InternalMas2j.g:40:9: 'beliefs'
            {
            match("beliefs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:41:7: ( 'goals' )
            // InternalMas2j.g:41:9: 'goals'
            {
            match("goals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:42:7: ( 'mindinspector' )
            // InternalMas2j.g:42:9: 'mindinspector'
            {
            match("mindinspector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:43:7: ( 'agentArchClass' )
            // InternalMas2j.g:43:9: 'agentArchClass'
            {
            match("agentArchClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:44:7: ( 'beliefBaseClass' )
            // InternalMas2j.g:44:9: 'beliefBaseClass'
            {
            match("beliefBaseClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:45:7: ( 'agentClass' )
            // InternalMas2j.g:45:9: 'agentClass'
            {
            match("agentClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:46:7: ( '#' )
            // InternalMas2j.g:46:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_ID_WITH_STARTING_LCLETTER"
    public final void mRULE_ID_WITH_STARTING_LCLETTER() throws RecognitionException {
        try {
            int _type = RULE_ID_WITH_STARTING_LCLETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2183:32: ( ( '^' )? ( RULE_LCLETTER | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMas2j.g:2183:34: ( '^' )? ( RULE_LCLETTER | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMas2j.g:2183:34: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMas2j.g:2183:34: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMas2j.g:2183:59: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMas2j.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_WITH_STARTING_LCLETTER"

    // $ANTLR start "RULE_ID_WITH_STARTING_UCLETTER"
    public final void mRULE_ID_WITH_STARTING_UCLETTER() throws RecognitionException {
        try {
            int _type = RULE_ID_WITH_STARTING_UCLETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2185:32: ( ( '^' )? ( RULE_UCLETTER | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMas2j.g:2185:34: ( '^' )? ( RULE_UCLETTER | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMas2j.g:2185:34: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMas2j.g:2185:34: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMas2j.g:2185:59: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMas2j.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_WITH_STARTING_UCLETTER"

    // $ANTLR start "RULE_LCLETTER"
    public final void mRULE_LCLETTER() throws RecognitionException {
        try {
            // InternalMas2j.g:2187:24: ( 'a' .. 'z' )
            // InternalMas2j.g:2187:26: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCLETTER"

    // $ANTLR start "RULE_UCLETTER"
    public final void mRULE_UCLETTER() throws RecognitionException {
        try {
            // InternalMas2j.g:2189:24: ( 'A' .. 'Z' )
            // InternalMas2j.g:2189:26: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UCLETTER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2191:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMas2j.g:2191:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMas2j.g:2191:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMas2j.g:2191:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalMas2j.g:2191:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT_LITERAL"
    public final void mRULE_INT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2193:18: ( RULE_INTEGERNUMBER )
            // InternalMas2j.g:2193:20: RULE_INTEGERNUMBER
            {
            mRULE_INTEGERNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_LITERAL"

    // $ANTLR start "RULE_INTEGERNUMBER"
    public final void mRULE_INTEGERNUMBER() throws RecognitionException {
        try {
            // InternalMas2j.g:2195:29: ( ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ ) )
            // InternalMas2j.g:2195:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            {
            // InternalMas2j.g:2195:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt9=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    alt9=1;}

            }
            else if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMas2j.g:2195:32: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalMas2j.g:2195:36: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalMas2j.g:2195:45: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMas2j.g:2195:46: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMas2j.g:2195:57: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // InternalMas2j.g:2195:61: ( '0' .. '7' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='7')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMas2j.g:2195:62: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalMas2j.g:2195:73: RULE_HEXPREFIX ( RULE_HEXDIGIT )+
                    {
                    mRULE_HEXPREFIX(); 
                    // InternalMas2j.g:2195:88: ( RULE_HEXDIGIT )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='F')||(LA8_0>='a' && LA8_0<='f')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMas2j.g:2195:88: RULE_HEXDIGIT
                    	    {
                    	    mRULE_HEXDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGERNUMBER"

    // $ANTLR start "RULE_HEXPREFIX"
    public final void mRULE_HEXPREFIX() throws RecognitionException {
        try {
            // InternalMas2j.g:2197:25: ( ( '0x' | '0X' ) )
            // InternalMas2j.g:2197:27: ( '0x' | '0X' )
            {
            // InternalMas2j.g:2197:27: ( '0x' | '0X' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='x') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='X') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMas2j.g:2197:28: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMas2j.g:2197:33: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXPREFIX"

    // $ANTLR start "RULE_HEXDIGIT"
    public final void mRULE_HEXDIGIT() throws RecognitionException {
        try {
            // InternalMas2j.g:2199:24: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalMas2j.g:2199:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXDIGIT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2201:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMas2j.g:2201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMas2j.g:2201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMas2j.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2203:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMas2j.g:2203:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMas2j.g:2203:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMas2j.g:2203:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMas2j.g:2205:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMas2j.g:2205:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMas2j.g:2205:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMas2j.g:2205:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMas2j.g:2205:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMas2j.g:2205:41: ( '\\r' )? '\\n'
                    {
                    // InternalMas2j.g:2205:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMas2j.g:2205:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalMas2j.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_ID_WITH_STARTING_LCLETTER | RULE_ID_WITH_STARTING_UCLETTER | RULE_STRING | RULE_INT_LITERAL | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt16=43;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMas2j.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalMas2j.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalMas2j.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalMas2j.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalMas2j.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalMas2j.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalMas2j.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalMas2j.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalMas2j.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalMas2j.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalMas2j.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalMas2j.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalMas2j.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalMas2j.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalMas2j.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalMas2j.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalMas2j.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalMas2j.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalMas2j.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalMas2j.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalMas2j.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalMas2j.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalMas2j.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalMas2j.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalMas2j.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalMas2j.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalMas2j.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalMas2j.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalMas2j.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalMas2j.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalMas2j.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalMas2j.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalMas2j.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalMas2j.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalMas2j.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalMas2j.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalMas2j.g:1:226: RULE_ID_WITH_STARTING_LCLETTER
                {
                mRULE_ID_WITH_STARTING_LCLETTER(); 

                }
                break;
            case 38 :
                // InternalMas2j.g:1:257: RULE_ID_WITH_STARTING_UCLETTER
                {
                mRULE_ID_WITH_STARTING_UCLETTER(); 

                }
                break;
            case 39 :
                // InternalMas2j.g:1:288: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalMas2j.g:1:300: RULE_INT_LITERAL
                {
                mRULE_INT_LITERAL(); 

                }
                break;
            case 41 :
                // InternalMas2j.g:1:317: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalMas2j.g:1:325: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalMas2j.g:1:341: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\35\3\uffff\1\34\1\uffff\3\34\6\uffff\1\34\1\uffff\7\34\2\uffff\1\34\6\uffff\1\35\4\34\1\75\15\34\2\uffff\1\114\5\34\1\uffff\16\34\1\uffff\41\34\1\u0083\2\34\1\u0086\5\34\1\u008c\1\34\1\u008e\11\34\1\uffff\2\34\1\uffff\2\34\1\u009d\2\34\1\uffff\1\34\1\uffff\4\34\1\u00a5\1\u00a6\3\34\1\u00aa\1\u00ab\3\34\1\uffff\7\34\2\uffff\1\u00b6\1\34\1\u00b8\2\uffff\10\34\1\u00c1\1\34\1\uffff\1\u00c3\1\uffff\7\34\1\u00cb\1\uffff\1\u00cc\1\uffff\3\34\1\u00d0\3\34\2\uffff\3\34\1\uffff\7\34\1\u00de\2\34\1\u00e1\1\u00e2\1\34\1\uffff\1\u00e4\1\34\2\uffff\1\34\1\uffff\1\u00e7\1\u00e8\2\uffff";
    static final String DFA16_eofS =
        "\u00e9\uffff";
    static final String DFA16_minS =
        "\1\11\1\101\3\uffff\1\156\1\uffff\1\156\1\147\1\154\6\uffff\1\151\1\uffff\1\145\1\141\3\145\1\157\1\151\1\uffff\1\101\1\60\5\uffff\1\52\1\123\1\146\1\166\2\145\1\60\1\154\1\145\1\141\1\162\1\161\1\155\1\167\1\143\1\162\1\154\1\141\1\156\1\60\2\uffff\1\60\1\162\1\102\1\151\1\143\1\156\1\uffff\1\123\1\156\1\163\1\145\1\143\1\165\1\162\1\145\1\106\2\142\1\151\1\154\1\144\1\uffff\1\141\1\145\1\162\1\165\1\164\1\157\1\164\1\163\1\143\1\141\1\145\1\151\1\106\1\157\1\160\1\157\1\145\1\163\1\151\1\163\1\154\1\157\1\164\1\163\1\165\1\101\1\160\1\164\1\162\1\165\1\145\1\157\1\143\1\60\1\163\1\146\1\60\1\156\1\164\1\163\1\156\1\151\1\60\1\162\1\60\1\162\1\154\1\141\1\151\1\144\1\145\1\166\1\143\1\165\1\uffff\1\145\1\102\1\uffff\1\163\1\162\1\60\1\155\1\157\1\uffff\1\143\1\uffff\1\143\1\141\1\164\1\166\2\60\1\145\1\165\1\163\2\60\1\141\1\160\1\165\1\uffff\1\145\1\156\1\145\1\150\1\163\1\150\1\145\2\uffff\1\60\1\163\1\60\2\uffff\1\163\1\145\1\143\1\156\1\103\1\120\1\103\1\163\1\60\1\163\1\uffff\1\60\1\uffff\1\145\1\143\2\164\1\157\1\141\1\154\1\60\1\uffff\1\60\1\uffff\1\103\1\164\1\165\1\60\1\156\1\164\1\141\2\uffff\1\154\1\157\1\162\1\uffff\1\164\1\150\1\163\1\141\1\162\1\145\1\162\1\60\2\163\2\60\1\157\1\uffff\1\60\1\163\2\uffff\1\154\1\uffff\2\60\2\uffff";
    static final String DFA16_maxS =
        "\1\175\1\101\3\uffff\1\156\1\uffff\1\170\1\164\1\154\6\uffff\1\151\1\uffff\1\145\1\141\1\162\2\145\1\157\1\151\1\uffff\2\172\5\uffff\1\57\1\123\1\164\1\166\2\145\1\172\1\154\1\145\1\141\1\163\1\164\1\155\1\167\1\143\1\162\1\154\1\141\1\156\1\172\2\uffff\1\172\1\162\1\102\1\151\1\143\1\156\1\uffff\1\123\1\156\1\163\1\145\1\143\1\165\1\162\1\145\1\106\2\142\1\151\1\154\1\144\1\uffff\1\141\1\145\1\162\1\165\1\164\1\157\1\164\1\163\1\143\1\141\1\145\1\151\1\106\1\157\1\160\1\157\1\145\1\163\1\151\1\163\1\154\1\157\1\164\1\163\1\165\1\163\1\160\1\164\1\162\1\165\1\145\1\157\1\143\1\172\1\163\1\146\1\172\1\156\1\164\1\163\1\156\1\151\1\172\1\162\1\172\1\162\1\154\1\141\1\151\1\144\1\145\1\166\1\143\1\165\1\uffff\1\145\1\163\1\uffff\1\163\1\162\1\172\1\155\1\157\1\uffff\1\143\1\uffff\1\143\1\141\1\164\1\166\2\172\1\145\1\165\1\163\2\172\1\141\1\160\1\165\1\uffff\1\145\1\156\1\145\1\150\1\163\1\150\1\145\2\uffff\1\172\1\163\1\172\2\uffff\1\163\1\145\1\143\1\156\1\103\1\120\1\103\1\163\1\172\1\163\1\uffff\1\172\1\uffff\1\145\1\143\2\164\1\157\1\141\1\154\1\172\1\uffff\1\172\1\uffff\1\103\1\164\1\165\1\172\1\156\1\164\1\141\2\uffff\1\154\1\157\1\162\1\uffff\1\164\1\150\1\163\1\141\1\162\1\145\1\162\1\172\2\163\2\172\1\157\1\uffff\1\172\1\163\2\uffff\1\154\1\uffff\2\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\3\uffff\1\13\1\15\1\16\1\17\1\20\1\21\1\uffff\1\23\7\uffff\1\44\2\uffff\1\45\1\46\1\47\1\50\1\51\24\uffff\1\52\1\53\6\uffff\1\10\16\uffff\1\1\66\uffff\1\34\2\uffff\1\37\5\uffff\1\25\1\uffff\1\24\16\uffff\1\31\7\uffff\1\26\1\27\3\uffff\1\35\1\36\12\uffff\1\30\1\uffff\1\33\10\uffff\1\12\1\uffff\1\32\7\uffff\1\43\1\22\3\uffff\1\7\15\uffff\1\14\2\uffff\1\40\1\5\1\uffff\1\41\2\uffff\1\42\1\11";
    static final String DFA16_specialS =
        "\u00e9\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\uffff\1\36\1\31\4\uffff\1\16\1\17\2\uffff\1\14\1\uffff\1\4\1\41\12\37\1\6\1\12\1\uffff\1\21\3\uffff\14\35\1\1\15\35\1\13\1\uffff\1\15\1\32\1\33\1\uffff\1\10\1\26\1\11\1\20\1\7\1\34\1\27\1\34\1\5\3\34\1\30\1\24\3\34\1\22\1\23\2\34\1\25\4\34\1\2\1\uffff\1\3",
            "\1\42",
            "",
            "",
            "",
            "\1\43",
            "",
            "\1\44\7\uffff\1\46\1\uffff\1\45",
            "\1\51\13\uffff\1\50\1\47",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\1\56\14\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\32\35\4\uffff\1\33\1\uffff\32\34",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "\1\65\4\uffff\1\66",
            "\1\67",
            "\1\70\15\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101\1\102",
            "\1\103\2\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\1\uffff\1\173\57\uffff\1\171",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0084",
            "\1\u0085",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008d",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u009a\60\uffff\1\u0099",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009e",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b7",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c2",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00df",
            "\1\u00e0",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e3",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_ID_WITH_STARTING_LCLETTER | RULE_ID_WITH_STARTING_UCLETTER | RULE_STRING | RULE_INT_LITERAL | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}