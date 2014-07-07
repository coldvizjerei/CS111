package assignments;

import java.util.Scanner;

public class PigLatin {
	public String PigLatin() {
		System.out.println("Enter a word to get the Pig Latin equivalent");
		Scanner scstdin = new Scanner(System.in);

		String word = scstdin.nextLine();
		while (word.equals("")){
			System.out.println("Word is empty. Enter a word");
			word = scstdin.nextLine();
		}
		//more error checks needed

		word = word.toLowerCase();
		String first_letter = word.substring(0, 1);

		if (first_letter.equalsIgnoreCase("a") || first_letter.equalsIgnoreCase("e")
				|| first_letter.equalsIgnoreCase("i") || first_letter.equalsIgnoreCase("o")
				|| first_letter.equalsIgnoreCase("u")){
			word = word + "way";
		}

		else{
			String wordpart = word.substring(1);
			word = wordpart + first_letter + "ay";
		}

		return word;
	}
}
