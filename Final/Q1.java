class Q1 {

	public static String variable(String x) {
		int index = x.indexOf("=");
		String subString = null;
		if (index != -1) {
			subString = x.substring(0, index);
		}
		return subString;
	}

	public static String literal(String y) {
		int index = y.indexOf("=");
		String literal = y.substring(index + 1, y.length());
		return literal;
	}

	public static String type(String z) {
		if (z.charAt(0) == '\"') {
			if (z.charAt(z.length() - 1) == '\"') {
				return "String Literal";
			} else {
				return "Invalid String Literal: string should be in double quotes";
			}
		}
		if (Character.isLetter(z.charAt(0))) {
			return "Invalid String Literal: missing quotation mark";
		}
		if (Character.isDigit(z.charAt(0))) {
			int decimalCounter = 0;
			for (int i = 0; i < z.length(); i++) {
				char c = z.charAt(i);
				if (c == '.') {
					decimalCounter++;
				} else if (!Character.isDigit(c)) {
					return "Invalid Integer or Float Literal: non-digit character found";
				}
			}
			if (decimalCounter == 1) {
				return "Float Literal";
			}
			if (decimalCounter > 1) {
				return "Invalid Float Literal: inaccurate number of decimal points";
			} else {
				return "Integer Literal";
			}
		} else {
			return "Error";
		}
	}

	public static void main(String[] args) {

		String s1 = "var1=917";
		String s2 = "var2=3.195";
		String s3 = "var3=\"Final Exam\"";
		String s4 = "invalid Var1=89k";
		String s5 = "invalid Var2=9.3.0.0";
		String s6 = "invalid Var3=3.#98";
		String s7 = "invalid Var4=Final Exam";

		printer(s1);
		printer(s2);
		printer(s3);
		printer(s4);
		printer(s5);
		printer(s6);
		printer(s7);

	}

	public static void printer(String str) {
		System.out.println("Name: " + variable(str));
		System.out.println("Literal: " + literal(str));
		System.out.println("Type: " + type(literal(str)));
		System.out.println();
	}
}
