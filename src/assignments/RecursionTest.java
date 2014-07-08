package assignments;

public class RecursionTest{
	public static boolean isPrime(int number){
		if (number == 1){
			return false;
		}
		return isPrime(number, 2);
	}

	private static boolean isPrime(int number, int n){
		if (number == n){
			return true;
		}
		if (number % n == 0){
			return false;
		}
		return isPrime(number, n + 1);
	}

	public static double power(double base, int exponent){
		if (base == 0 && exponent ==0){
			return -1;
		}
		if (base == 0){
			return 0.0;
		}
		if (base == 1){
			return 1.0;
		}
		if (exponent == 0){
			return 1.0;
		}
		if (exponent == 1){
			return base;
		}
		if (exponent == -1){
			return 1.0 / base;
		}
		if (exponent < -1){
			return 1.0 / base * power(base, ++exponent);
		}
		return base* power(base, --exponent);
	}

	public static String longestWord(String sentence){
		if (sentence.equals("")){
			return null;
		}

		if (sentence.indexOf(" ") == -1){
			return sentence;
		}

		String word = sentence.substring(0, sentence.indexOf(" "));
		//System.out.println("word is: " + word);
		String thelongest = longestWord(sentence.substring(sentence.indexOf(" ") + 1));
		//System.out.println("sentence is: " + thelongest);

		if (thelongest.length() > word.length()){
			return thelongest;
		}
		else{
			return word;
		}
	}

	public static String decompress(String compressedText){
		//checks if the input has nothing in it
		if(compressedText.equals("")){
			return null;
		}
		//checks if the end of the string is a number
		if (Character.isDigit(compressedText.charAt(compressedText.length() - 1))){
			return null;
		}
		//checks if the compressed text is only one letter
		if (compressedText.length() == 1){
			return compressedText;
		}

		if (compressedText.charAt(0) == '1'){
			return decompress(compressedText.substring(1));
		}

		//checks if the character is a digit
		//if it isn't then it will return that char and call the method decompress again
		if ( ! Character.isDigit(compressedText.charAt(0))){
			return compressedText.charAt(0) + decompress(compressedText.substring(1));
		}

		char number = compressedText.charAt(0);
		char letter = compressedText.charAt(1);
		//System.out.println(number);

		number--;
		return letter + decompress(number + compressedText.substring(1));
	}
}
