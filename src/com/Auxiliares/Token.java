
package com.Auxiliares;

public class Token {
	
  // Constantes para tipos de token
	
  public static final int CHAR = 0;
  public static final int ELSE = 1;
  public static final int FALSE = 2; //false 6/6
  public static final int IF = 3;
  public static final int INT = 4;
  public static final int MAIN = 5;
  public static final int OUT = 6;
  public static final int PRINTF = 7;
  public static final int RETURN = 8;
  public static final int STATIC  = 9;
  public static final int VOID = 10;
  public static final int WHILE = 11;
  public static final int ID = 12;
  public static final int LITERALNUMERICO = 13;
  public static final int AT = 14;
  public static final int OP = 15;
  public static final int LOG = 16;
  public static final int RELOP = 17;
  public static final int LITERALSTRING  = 18;
  public static final int LITERALCHAR = 19;
  public static final int PONTUACAO = 20;
  //novo
  public static final int LITERALFLOAT = 21; // token literal float
  public static final int TRUE = 22; // token true
  public static final int BITWISE = 23;

  
  // Valor fim de Arquivo
  
  public static final int EOF   = 100;

  // Valores para tokens RELOP
    //Token RELOP representa operadores
    // relacionais: <, <=, >, >=, ==, !=

  public static final int LT = 1;
  public static final int LE = 2;
  public static final int GT = 3;
  public static final int GE = 4;
  public static final int EQ = 5;
  public static final int NE = 6;

  // Valores para tokens AUX
    //Token AUX representa o operador de atribui��o '='

  public static final int ATR = 1;
  
  // Valores para tokens OP
    //Token OP representa
    // operadores aritm�ticos: +, -, *, /,
    // %, ++, --, +=, -=

  public static final int AD = 1;
  public static final int SUB = 2;
  public static final int DIV = 3;
  public static final int MUL = 4;

  //novo
  public static final int MOD = 5;         // '%'
  public static final int INC = 6;         // '++'
  public static final int DEC = 7;         // '--'
  public static final int AD_ASSIGN = 8;         // '+='
  public static final int SUB_ASSIGN = 9;         // '-='
  public static final int EXP = 12;         // '**' 2/6 exponencia��o

  // Valores para tokens LOG
    //Token LOG representa operadores l�gicos: &&, ||, !

  public static final int AND = 1;
  public static final int OR = 2;
  public static final int NOT = 3;

  // Valores para tokens PONTUACAO
    //Token PONTUACAO representa sinais de pontua��o: ( ) { } ; ,
	
  public static final int AP = 1;
  public static final int FP = 2;
  public static final int AC = 3;
  public static final int FC = 4;
  public static final int PV = 5;
  public static final int VG = 6;

  public static final int SHL = 1; // <<
  public static final int SHR = 2; // >>

  
  // Atributos
  
  private int tipo;
  private Object valor;

  // Construtores

  public Token(int tipo, Object valor) {
		
    this.tipo = tipo;
    this.valor = valor;
  
  }

  public Token(int tipo) {
		
    this( tipo, null );
  
  }

  // M�todos para criar tokens

  public static Token EOF() {
	
    return new Token(EOF);
	
  }
  
  public int getTipo() {
	  
    return this.tipo;
    
  }

  public Object getValor() {
	  
    return this.valor;
	
  }

  public String toString()  {
	 
    String valorString = "-";

    switch( tipo ) {
   
      case RELOP: valorString = tipoRelop( (Integer) valor);
          		   break;
    
      case AT: valorString = "ATR";
               break;
     
      case OP: valorString = tipoOP( (Integer) valor );
     		   break;
     
      case LOG: valorString = tipoLog( (Integer) valor );  
	            break;  
	
      case PONTUACAO: valorString = tipoPontuacao( (Integer) valor );  
                break;

      case BITWISE:
          valorString = tipoBitwise((Integer) valor);
                break;

      default: {

	    if( valor != null ) {
		 
	      valorString = valor.toString().trim();
	   	  
	    }
	 
      }
	
    } 
   
    return "<" + tipoString() + ", " + valorString + ">";

  }

  private String tipoString() {
	 
    String resultado = "Erro";
	
      switch ( tipo ) {
   
	    case CHAR: resultado = "char";
			       break;
	
	    case ELSE: resultado = "else";
			       break;
		
	    case FALSE: resultado = "false"; // false 6/6
				    break;
	 
	    case IF: resultado = "if";
	             break;

	    case INT: resultado = "int";
				  break;

	    case MAIN: resultado = "main";
				   break;
	
	    case OUT: resultado = "out";
			      break;			
	  
	    case PRINTF: resultado = "printf";
	                 break;			

	    case RETURN: resultado = "return";
	    	         break;			

	    case STATIC: resultado = "static";
	                  break;			

	    case VOID: resultado = "void";
	  			   break;	
	  
	    case WHILE: resultado = "while";
	                break;			

	    case ID: resultado = "id";
	             break;			

	    case LITERALNUMERICO: resultado = "literalNumerico";
	    		              break;			

	    case LITERALSTRING: resultado = "literalString";
					        break;
	
	    case LITERALCHAR: resultado = "literalChar";
				          break;
	
	    case AT: resultado = "at";
	    		 break;			

	    case OP: resultado = "op";
	    	     break;		

	    case LOG: resultado = "log";
	    	      break;	
	   
	    case RELOP: resultado = "relop";
	    		    break;			

	    case PONTUACAO: resultado = "pontua��o";
	    	        break;
        //NOVO
        case LITERALFLOAT: resultado = "literalFloat"; // literal float 1/6
                    break;

        case TRUE: resultado = "true"; // true 5/6
                    break;
        case BITWISE: resultado = "bitwise"; // bitwise 3/6 4/6
                    break;
      }
	
      return resultado;

  }

  private String tipoRelop(Integer tipo1) {
		
    String resultado = "Erro";
	
    switch ( tipo1.intValue() ) {
		
      case LT: resultado = "LT";
			   break;
	
      case LE: resultado = "LE";
			   break;
	
      case GT: resultado = "GT";
			   break;
	
      case GE: resultado = "GE";
			   break;

      case EQ: resultado = "EQ";
			   break;
	
      case NE: resultado = "NE";
			   break;			

    }
	
    return resultado;

  }	
 
  private String tipoOP(Integer tipo1) {
	 
    String resultado = "Erro";
   
    switch ( tipo1.intValue() ) {

      case AD: resultado = "+";
			   break;

      case SUB: resultado = "-";
			    break;

      case MUL: resultado = "*";
			    break;

      case DIV: resultado = "/";
			    break;
        //NOVO
      case EXP: resultado = "**"; // exponencia��o op 2/6
                break;
      case MOD: resultado = "%"; // modulo(resto) op 1/3
                break;
      case INC: resultado = "++";// incremento op 2/3
                break;
      case DEC: resultado = "--"; // decremento op 3/3
                break;
      case AD_ASSIGN: resultado = "+="; // op de atribui��o de soma 4/3
                break;
      case SUB_ASSIGN: resultado = "-="; // op de atribui��o de subtra��o 5/3
                break;
      }

    return resultado;

  }

  private String tipoLog(Integer tipo1) {
	 
    String resultado = "Erro";

    switch ( tipo1.intValue() ) {

      case AND: resultado = "&&";
		    	break;
	
      case OR: resultado = "||";
			   break;

      case NOT: resultado = "!";
			    break;

   }

    return resultado;

  }
    private String tipoBitwise(Integer bitwise) {

        String resultado = "Erro";
        switch (bitwise.intValue()) {
            case SHL:
                resultado = "<<";
                break;
            case SHR:
                resultado = ">>";
                break;
        }
        return resultado;
    }
 
  private String tipoPontuacao(Integer valor2) {

    String resultado = "Erro";
	
    switch ( valor2.intValue() ) {
		
	  case AP: resultado = "(";
		       break;
	
	  case FP: resultado = ")";
			   break;
		
	  case AC: resultado = "{";
			   break;
		
	  case FC: resultado = "}";
			   break;

	  case PV: resultado = ";";
	           break;

	  case VG: resultado = ",";
	           break;

    }

    return resultado;

  }

}
