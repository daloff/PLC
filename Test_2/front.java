import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class front {

	int charClass;

	String lexeme;

	char nextChar;

	int lexLen;

	int token;

	int nextToken;
	static File file;
	static BufferedReader br;


	final int LETTER = 0;

	final int DIGIT = 1;

	final int UNKNOWN = 99;

	/* Token Codes */

	final int INT_LIT = 10;

	final int IDENT = 11;

	final int ASSIGN_OP = 20;

	final int ADD_OP = 21;

	final int SUB_OP = 22;

	final int MULT_OP = 23;

	final int DIV_OP = 24;

	final int LEFT_PAREN = 25;

	final int RIGHT_PAREN = 26;

	public static void main(String[] args) throws Exception {
		// path of input file
		File f = new File("C:\\dev\\aloff\\test2\\src\\front.txt"); 

		if (f == null)

			System.out.println("ERROR - cannot open front.in \n");

		else {

			FileReader fr = new FileReader(f); 
			br = new BufferedReader(fr); 

			front obj = new front();
			obj.getChar();

			do {

				obj.lex();

			} while (obj.nextToken != -1);

		}
	}
	

	int lookup(char ch) {

		switch (ch) {

		case '(':

			addChar();

			nextToken = LEFT_PAREN;

			break;

		case ')':

			addChar();

			nextToken = RIGHT_PAREN;

			break;

		case '+':

			addChar();

			nextToken = ADD_OP;

			break;

		case '-':

			addChar();

			nextToken = SUB_OP;

			break;

		case '*':

			addChar();

			nextToken = MULT_OP;

			break;

		case '/':

			addChar();

			nextToken = DIV_OP;

			break;

		default:

			addChar();

			nextToken = -1;

			break;

		}

		return nextToken;

	}

	/* **************************************** */

	/* addChar - a function to add nextChar to lexeme */

	void addChar() {

		if (lexLen <= 98) {

			lexeme += Character.toString(nextChar);
			lexLen++;

		}

		else

			System.out.println("Error - lexeme is too long \n");

	}


	void getChar() throws IOException {
		int x;

		if ((x = br.read()) != -1) {
			nextChar = (char) x;
			if (Character.isLetter(nextChar))

				charClass = LETTER;

			else if (Character.isDigit(nextChar))

				charClass = DIGIT;

			else
				charClass = UNKNOWN;

		}

		else

			charClass = -1;

	}

	/* **************************************** */

	/*
	 * getNonBlank - a function to call getChar until it
	 * 
	 * returns a non-whitespace character
	 */

	void getNonBlank() throws IOException {

		while (this.nextChar == ' ')

			getChar();

	}

	/* **************************************** */

	/*
	 * lex - a simple lexical analyzer for arithmetic
	 * 
	 * expressions
	 */

	int lex() throws IOException {

		lexLen = 0;
		lexeme = "";
		getNonBlank();

		switch (charClass) {

		/* parse identifiers */

		case LETTER:

			addChar();

			getChar();

			while (charClass == LETTER || charClass == DIGIT) {

				addChar();

				getChar();

			}

			nextToken = IDENT;

			break;

		/* parse integer literals and integers */

		case DIGIT:

			addChar();

			getChar();

			while (charClass == DIGIT) {

				addChar();

				getChar();

			}

			nextToken = INT_LIT;

			break;

		/* parentheses and operators */

		case UNKNOWN:

			lookup(nextChar);

			getChar();

			break;

		/* EOF */

		case -1:

			nextToken = -1;

			lexeme = "EOF";

			break;

		} /* end of switch */

		System.out.println("Next token is: " + +nextToken + " Next lexeme is \n" + lexeme);

		return nextToken;

	} /* end of function lex */
}