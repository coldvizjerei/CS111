package assignments;

public class PigLatin {
	public String PigLatinate(String word) {
		//more error checks needed in case there are numbers in the input
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
