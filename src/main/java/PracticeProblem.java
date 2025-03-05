public class PracticeProblem {
	public static int calculate(int one, int two, char op) {
		int result = 0;

		switch (op) {
			case '+':
				result = one + two;
				break;
			case '-':
				result = one - two;
				break;
			case '*':
				result = one * two;
				break;
			case '/':
				if (two != 0) {
					result = one / two;
				}
				break;
			case '%':
				if (two != 0) {
					result = one % two;
				}
				break;
			case '^':
				result = (int) Math.pow(one, two);
		}
		return result;
	}

	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String line) {
        if (line.trim().isEmpty()) {
            return true;
        }

        int wordCount = 0;
        boolean word = false;

        for (int i = 0; i < line.toLowerCase().trim().length(); i++) {
            char c = line.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || (c == '\'' && i > 0 && i < line.length() - 1)) {
                if (!word) {
                    wordCount++;
                    word = true;
                    if (wordCount > MAXIMUM) {
                        return false;
                    }
                }
            } else {
                word = false;
            }
        }
        System.out.println(wordCount);
        return wordCount <= MAXIMUM;
    }
    public static String minString(String first, String second, String third) {

        String small = first.toLowerCase();
        if (second.toLowerCase().compareTo(small) < 0) {
            small = second;
        }
        if (third.toLowerCase().compareTo(small) < 0) {
            small = third;
        }
        if (small.equals(first)) {
            return first;
        } else if (small.equals(second)) {
            return second;
        } else {
            return third;
        }
    }
}

