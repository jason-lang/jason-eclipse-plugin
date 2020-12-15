package jasonide.xtext.asl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAslLexer extends Lexer {
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

    public InternalAslLexer() {;} 
    public InternalAslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:11:7: ( '{' )
            // InternalAsl.g:11:9: '{'
            {
            match('{'); 

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
            // InternalAsl.g:12:7: ( '}' )
            // InternalAsl.g:12:9: '}'
            {
            match('}'); 

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
            // InternalAsl.g:13:7: ( ':-' )
            // InternalAsl.g:13:9: ':-'
            {
            match(":-"); 


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
            // InternalAsl.g:14:7: ( '.' )
            // InternalAsl.g:14:9: '.'
            {
            match('.'); 

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
            // InternalAsl.g:15:7: ( '!' )
            // InternalAsl.g:15:9: '!'
            {
            match('!'); 

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
            // InternalAsl.g:16:7: ( ':' )
            // InternalAsl.g:16:9: ':'
            {
            match(':'); 

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
            // InternalAsl.g:17:7: ( '<-' )
            // InternalAsl.g:17:9: '<-'
            {
            match("<-"); 


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
            // InternalAsl.g:18:7: ( '+' )
            // InternalAsl.g:18:9: '+'
            {
            match('+'); 

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
            // InternalAsl.g:19:7: ( '-' )
            // InternalAsl.g:19:9: '-'
            {
            match('-'); 

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
            // InternalAsl.g:20:7: ( '^' )
            // InternalAsl.g:20:9: '^'
            {
            match('^'); 

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
            // InternalAsl.g:21:7: ( '?' )
            // InternalAsl.g:21:9: '?'
            {
            match('?'); 

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
            // InternalAsl.g:22:7: ( ';' )
            // InternalAsl.g:22:9: ';'
            {
            match(';'); 

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
            // InternalAsl.g:23:7: ( '|||' )
            // InternalAsl.g:23:9: '|||'
            {
            match("|||"); 


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
            // InternalAsl.g:24:7: ( '|&|' )
            // InternalAsl.g:24:9: '|&|'
            {
            match("|&|"); 


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
            // InternalAsl.g:25:7: ( '(' )
            // InternalAsl.g:25:9: '('
            {
            match('('); 

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
            // InternalAsl.g:26:7: ( ')' )
            // InternalAsl.g:26:9: ')'
            {
            match(')'); 

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
            // InternalAsl.g:27:7: ( '!!' )
            // InternalAsl.g:27:9: '!!'
            {
            match("!!"); 


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
            // InternalAsl.g:28:7: ( '>' )
            // InternalAsl.g:28:9: '>'
            {
            match('>'); 

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
            // InternalAsl.g:29:7: ( '<' )
            // InternalAsl.g:29:9: '<'
            {
            match('<'); 

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
            // InternalAsl.g:30:7: ( '::' )
            // InternalAsl.g:30:9: '::'
            {
            match("::"); 


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
            // InternalAsl.g:31:7: ( ',' )
            // InternalAsl.g:31:9: ','
            {
            match(','); 

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
            // InternalAsl.g:32:7: ( '[' )
            // InternalAsl.g:32:9: '['
            {
            match('['); 

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
            // InternalAsl.g:33:7: ( '|' )
            // InternalAsl.g:33:9: '|'
            {
            match('|'); 

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
            // InternalAsl.g:34:7: ( ']' )
            // InternalAsl.g:34:9: ']'
            {
            match(']'); 

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
            // InternalAsl.g:35:7: ( '&' )
            // InternalAsl.g:35:9: '&'
            {
            match('&'); 

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
            // InternalAsl.g:36:7: ( '<=' )
            // InternalAsl.g:36:9: '<='
            {
            match("<="); 


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
            // InternalAsl.g:37:7: ( '>=' )
            // InternalAsl.g:37:9: '>='
            {
            match(">="); 


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
            // InternalAsl.g:38:7: ( '==' )
            // InternalAsl.g:38:9: '=='
            {
            match("=="); 


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
            // InternalAsl.g:39:7: ( '\\\\==' )
            // InternalAsl.g:39:9: '\\\\=='
            {
            match("\\=="); 


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
            // InternalAsl.g:40:7: ( '=' )
            // InternalAsl.g:40:9: '='
            {
            match('='); 

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
            // InternalAsl.g:41:7: ( '*' )
            // InternalAsl.g:41:9: '*'
            {
            match('*'); 

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
            // InternalAsl.g:42:7: ( '/' )
            // InternalAsl.g:42:9: '/'
            {
            match('/'); 

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
            // InternalAsl.g:43:7: ( '**' )
            // InternalAsl.g:43:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:44:7: ( 'begin' )
            // InternalAsl.g:44:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:45:7: ( 'end' )
            // InternalAsl.g:45:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:46:7: ( 'if' )
            // InternalAsl.g:46:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:47:7: ( 'else' )
            // InternalAsl.g:47:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:48:7: ( 'elif' )
            // InternalAsl.g:48:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:49:7: ( 'for' )
            // InternalAsl.g:49:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:50:7: ( 'while' )
            // InternalAsl.g:50:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:51:7: ( 'not' )
            // InternalAsl.g:51:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:52:7: ( 'div' )
            // InternalAsl.g:52:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:53:7: ( 'mod' )
            // InternalAsl.g:53:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:54:7: ( 'true' )
            // InternalAsl.g:54:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:55:7: ( 'false' )
            // InternalAsl.g:55:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "RULE_TK_LABEL_AT"
    public final void mRULE_TK_LABEL_AT() throws RecognitionException {
        try {
            int _type = RULE_TK_LABEL_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:3998:18: ( '@' )
            // InternalAsl.g:3998:20: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_LABEL_AT"

    // $ANTLR start "RULE_TK_NEG"
    public final void mRULE_TK_NEG() throws RecognitionException {
        try {
            int _type = RULE_TK_NEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4000:13: ( '~' )
            // InternalAsl.g:4000:15: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TK_NEG"

    // $ANTLR start "RULE_ATOM"
    public final void mRULE_ATOM() throws RecognitionException {
        try {
            int _type = RULE_ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4002:11: ( RULE_LCLETTER ( RULE_CH )* )
            // InternalAsl.g:4002:13: RULE_LCLETTER ( RULE_CH )*
            {
            mRULE_LCLETTER(); 
            // InternalAsl.g:4002:27: ( RULE_CH )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAsl.g:4002:27: RULE_CH
            	    {
            	    mRULE_CH(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATOM"

    // $ANTLR start "RULE_ATOMAPOST"
    public final void mRULE_ATOMAPOST() throws RecognitionException {
        try {
            int _type = RULE_ATOMAPOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4004:16: ( '\\'' (~ ( '\\'' ) )* '\\'' )
            // InternalAsl.g:4004:18: '\\'' (~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // InternalAsl.g:4004:23: (~ ( '\\'' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAsl.g:4004:23: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
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

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATOMAPOST"

    // $ANTLR start "RULE_VART"
    public final void mRULE_VART() throws RecognitionException {
        try {
            int _type = RULE_VART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4006:11: ( RULE_UCLETTER ( RULE_CH )* )
            // InternalAsl.g:4006:13: RULE_UCLETTER ( RULE_CH )*
            {
            mRULE_UCLETTER(); 
            // InternalAsl.g:4006:27: ( RULE_CH )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAsl.g:4006:27: RULE_CH
            	    {
            	    mRULE_CH(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VART"

    // $ANTLR start "RULE_UNNAMEDVART"
    public final void mRULE_UNNAMEDVART() throws RecognitionException {
        try {
            int _type = RULE_UNNAMEDVART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4008:18: ( '_' ( RULE_CH )* )
            // InternalAsl.g:4008:20: '_' ( RULE_CH )*
            {
            match('_'); 
            // InternalAsl.g:4008:24: ( RULE_CH )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAsl.g:4008:24: RULE_CH
            	    {
            	    mRULE_CH(); 

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
    // $ANTLR end "RULE_UNNAMEDVART"

    // $ANTLR start "RULE_STRINGT"
    public final void mRULE_STRINGT() throws RecognitionException {
        try {
            int _type = RULE_STRINGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4010:14: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAsl.g:4010:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAsl.g:4010:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalAsl.g:4010:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalAsl.g:4010:62: ~ ( ( '\\\\' | '\"' ) )
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
    // $ANTLR end "RULE_STRINGT"

    // $ANTLR start "RULE_NUMBERT"
    public final void mRULE_NUMBERT() throws RecognitionException {
        try {
            int _type = RULE_NUMBERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4012:14: ( '0' .. '9' )
            // InternalAsl.g:4012:16: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBERT"

    // $ANTLR start "RULE_CH"
    public final void mRULE_CH() throws RecognitionException {
        try {
            // InternalAsl.g:4014:18: ( ( RULE_LCLETTER | RULE_UCLETTER | RULE_DIGIT | '_' ) )
            // InternalAsl.g:4014:20: ( RULE_LCLETTER | RULE_UCLETTER | RULE_DIGIT | '_' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_CH"

    // $ANTLR start "RULE_LCLETTER"
    public final void mRULE_LCLETTER() throws RecognitionException {
        try {
            // InternalAsl.g:4016:24: ( 'a' .. 'z' )
            // InternalAsl.g:4016:26: 'a' .. 'z'
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
            // InternalAsl.g:4018:24: ( 'A' .. 'Z' )
            // InternalAsl.g:4018:26: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UCLETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalAsl.g:4020:21: ( '0' .. '9' )
            // InternalAsl.g:4020:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAsl.g:4022:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAsl.g:4022:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAsl.g:4022:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAsl.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalAsl.g:4024:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAsl.g:4024:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAsl.g:4024:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAsl.g:4024:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalAsl.g:4026:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAsl.g:4026:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAsl.g:4026:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAsl.g:4026:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalAsl.g:4026:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAsl.g:4026:41: ( '\\r' )? '\\n'
                    {
                    // InternalAsl.g:4026:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAsl.g:4026:41: '\\r'
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
        // InternalAsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_TK_LABEL_AT | RULE_TK_NEG | RULE_ATOM | RULE_ATOMAPOST | RULE_VART | RULE_UNNAMEDVART | RULE_STRINGT | RULE_NUMBERT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt11=56;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalAsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalAsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalAsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalAsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalAsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalAsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalAsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalAsl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalAsl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalAsl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalAsl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalAsl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalAsl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalAsl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalAsl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalAsl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalAsl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalAsl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalAsl.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalAsl.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalAsl.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalAsl.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalAsl.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalAsl.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalAsl.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalAsl.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalAsl.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalAsl.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalAsl.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalAsl.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalAsl.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalAsl.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalAsl.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalAsl.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalAsl.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalAsl.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalAsl.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalAsl.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // InternalAsl.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // InternalAsl.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // InternalAsl.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // InternalAsl.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // InternalAsl.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // InternalAsl.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // InternalAsl.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // InternalAsl.g:1:280: RULE_TK_LABEL_AT
                {
                mRULE_TK_LABEL_AT(); 

                }
                break;
            case 47 :
                // InternalAsl.g:1:297: RULE_TK_NEG
                {
                mRULE_TK_NEG(); 

                }
                break;
            case 48 :
                // InternalAsl.g:1:309: RULE_ATOM
                {
                mRULE_ATOM(); 

                }
                break;
            case 49 :
                // InternalAsl.g:1:319: RULE_ATOMAPOST
                {
                mRULE_ATOMAPOST(); 

                }
                break;
            case 50 :
                // InternalAsl.g:1:334: RULE_VART
                {
                mRULE_VART(); 

                }
                break;
            case 51 :
                // InternalAsl.g:1:344: RULE_UNNAMEDVART
                {
                mRULE_UNNAMEDVART(); 

                }
                break;
            case 52 :
                // InternalAsl.g:1:361: RULE_STRINGT
                {
                mRULE_STRINGT(); 

                }
                break;
            case 53 :
                // InternalAsl.g:1:374: RULE_NUMBERT
                {
                mRULE_NUMBERT(); 

                }
                break;
            case 54 :
                // InternalAsl.g:1:387: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalAsl.g:1:395: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // InternalAsl.g:1:411: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\1\54\1\uffff\1\56\1\61\5\uffff\1\64\2\uffff\1\66\4\uffff\1\70\1\uffff\1\72\1\75\11\43\35\uffff\3\43\1\115\10\43\1\126\2\43\1\uffff\1\131\2\43\1\134\1\135\1\136\2\43\1\uffff\1\141\1\142\1\uffff\2\43\3\uffff\1\145\1\146\2\uffff\1\147\1\150\4\uffff";
    static final String DFA11_eofS =
        "\151\uffff";
    static final String DFA11_minS =
        "\1\11\2\uffff\1\55\1\uffff\1\41\1\55\5\uffff\1\46\2\uffff\1\75\4\uffff\1\75\1\uffff\2\52\1\145\1\154\1\146\1\141\1\150\1\157\1\151\1\157\1\162\35\uffff\1\147\1\144\1\151\1\60\1\162\1\154\1\151\1\164\1\166\1\144\1\165\1\151\1\60\1\145\1\146\1\uffff\1\60\1\163\1\154\3\60\1\145\1\156\1\uffff\2\60\1\uffff\2\145\3\uffff\2\60\2\uffff\2\60\4\uffff";
    static final String DFA11_maxS =
        "\1\176\2\uffff\1\72\1\uffff\1\41\1\75\5\uffff\1\174\2\uffff\1\75\4\uffff\1\75\1\uffff\1\52\1\57\1\145\1\156\1\146\1\157\1\150\1\157\1\151\1\157\1\162\35\uffff\1\147\1\144\1\163\1\172\1\162\1\154\1\151\1\164\1\166\1\144\1\165\1\151\1\172\1\145\1\146\1\uffff\1\172\1\163\1\154\3\172\1\145\1\156\1\uffff\2\172\1\uffff\2\145\3\uffff\2\172\2\uffff\2\172\4\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\2\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\1\20\1\uffff\1\25\1\26\1\30\1\31\1\uffff\1\35\13\uffff\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\3\1\24\1\6\1\21\1\5\1\7\1\32\1\23\1\15\1\16\1\27\1\33\1\22\1\34\1\36\1\41\1\37\1\67\1\70\1\40\17\uffff\1\44\10\uffff\1\43\2\uffff\1\47\2\uffff\1\51\1\52\1\53\2\uffff\1\45\1\46\2\uffff\1\54\1\42\1\55\1\50";
    static final String DFA11_specialS =
        "\151\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\5\1\47\3\uffff\1\23\1\44\1\15\1\16\1\26\1\7\1\20\1\10\1\4\1\27\12\50\1\3\1\13\1\6\1\24\1\17\1\12\1\41\32\45\1\21\1\25\1\22\1\11\1\46\1\uffff\1\43\1\30\1\43\1\36\1\31\1\33\2\43\1\32\3\43\1\37\1\35\5\43\1\40\2\43\1\34\3\43\1\1\1\14\1\2\1\42",
            "",
            "",
            "\1\52\14\uffff\1\53",
            "",
            "\1\55",
            "\1\57\17\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "\1\63\125\uffff\1\62",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "\1\71",
            "\1\73\4\uffff\1\74",
            "\1\76",
            "\1\100\1\uffff\1\77",
            "\1\101",
            "\1\103\15\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
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
            "\1\111",
            "\1\112",
            "\1\114\11\uffff\1\113",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\127",
            "\1\130",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\132",
            "\1\133",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\137",
            "\1\140",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | RULE_TK_LABEL_AT | RULE_TK_NEG | RULE_ATOM | RULE_ATOMAPOST | RULE_VART | RULE_UNNAMEDVART | RULE_STRINGT | RULE_NUMBERT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}