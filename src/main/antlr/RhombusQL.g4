grammar RhombusQL;

@header {
import java.util.HashMap;
import java.util.Map;
}

program
    : statement+
    ;

statement
    : functionCall SEMICOLON
    ;

functionCall returns [Map<String, Object> fcArgs]
    @init {
        $fcArgs = new HashMap<>();
    }
    : ID { $fcArgs.put("_fcName", $ID.text); } '(' arguments=argumentsList? ')' { $fcArgs.put("args", $arguments.args); }
    ;

argumentsList returns [Map<String, Object> args]
    : (argumentList=argument { $args = new HashMap<>(); $args.put($argumentList.name, $argumentList.value); }) 
      (',' argumentList=argument { $args.put($argumentList.name, $argumentList.value); })*
    ;

argument returns [String name, Object value]
    : ID '=' (
        val=STRING { $value = $val.text; } 
        | val=INTEGER { $value = Integer.parseInt($val.text); } 
        | val=BOOLEAN { $value = Boolean.parseBoolean($val.text); }
        | functionCall { $value = $functionCall.fcArgs; }
    ) 
    { $name = $ID.text; }
    ;

STRING: '"' ~["]* '"';
INTEGER: [0-9]+;
BOOLEAN: 'True' | 'False';

ID: [a-zA-Z]+;

SEMICOLON: ';';
WS: [ \t\r\n]+ -> skip;