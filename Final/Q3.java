class Q3 {

	public static boolean assign(char c) {
		if (var(c)) {
			if (next == '=') {
				if (expr(c)) {
					i++;
					next = charArray(i);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean var(char c) {
		if (letter(c)) {
			if (var(c)) {
				i++;
				next = charArray(i);
				return true;
			}
		}
		if (digit(c)) {
			if (var(c)) {
				i++;
				next = charArray(i);
				return true;
			}
		}
		return false;
	}

	public static boolean expr(char c) {
		if (next == '(') {
			if (expr(c)) {
				if (next == ')') {
					i++;
					next = charArray(i);
					return true;
				}
			}
		} else if (number(c)) {
			if (operator(c)) {
				if (expr(c)) {
					i++;
					next = charArray(i);
					return true;
				}
			} else {
				i++;
				next = charArray(i);
				return true;
			}
		}
		return false;
	}

	public static boolean operator(char c) {
		if (next == '+' || next == '-' || next == '*' || next == '/' || next == '=' || next == '>' || next == '<'
				|| next == '%') {
			i++;
			next = charArray(i);
			return true;
		}
		return false;
	}

	public static boolean number(char c) {
		if (integer_literal(c)) {
			i++;
			next = charArray(i);
			return true;
		}
		if (float_literal(c)) {
			i++;
			next = charArray(i);
			return true;
		}
		return false;
	}

	public static boolean integer_literal(char c) {
		if (digit(c)) {
			if (integer_literal(c)) {
				i++;
				next = charArray(i);
				return true;
			} else {
				i++;
				next = charArray(i);
				return true;
			}
		}
		return false;
	}

	public static boolean float_literal(char c) {
		if (integer_literal(c)) {
			if (next == '.') {
				if (integer_literal(c)) {
					i++;
					next = charArray(i);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean digit(char c) {
		if (next == '0' || next == '1' || next == '2' || next == '3' || next == '4' || next == '5' || next == '6'
				|| next == '7' || next == '8' || next == '9') {
			i++;
			next = charArray(i);
			return true;
		}
		return false;
	}

	public static boolean letter(char c) {
		if (next == 'a' || next == 'b' || next == 'c' || next == 'd' || next == 'e' || next == 'f' || next == 'g'
				|| next == 'h' || next == 'i' || next == 'j' || next == 'k' || next == 'l' || next == 'm' || next == 'n'
				|| next == 'o' || next == 'p' || next == 'q' || next == 'r' || next == 's' || next == 't' || next == 'u'
				|| next == 'v' || next == 'w' || next == 'x' || next == 'y' || next == 'z' || next == 'A' || next == 'B'
				|| next == 'C' || next == 'D' || next == 'E' || next == 'F' || next == 'G' || next == 'H' || next == 'I'
				|| next == 'J' || next == 'K' || next == 'L' || next == 'M' || next == 'N' || next == 'O' || next == 'P'
				|| next == 'Q' || next == 'R' || next == 'S' || next == 'T' || next == 'U' || next == 'V' || next == 'W'
				|| next == 'X' || next == 'Y' || next == 'Z') {
			i++;
			next = charArray(i);
			return true;
		}

		return false;
	}

	static String s = "var=7+45";
	static char[] charArray = s.toCharArray();
	static int i = 0;
	static char next = charArray(i);

	private static char charArray(int i) {
		return 0;
	}
}