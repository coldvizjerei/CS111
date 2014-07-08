package assignments;

import java.util.Scanner;

public class Master {
	public static void main(String[] args){
		Scanner scstdin = new Scanner(System.in);
		while(true){
			//options here
			System.out.println("\n1) PigLatinator");
			System.out.println("2) Primality Test (recursively done)");
			System.out.println("3) Raising # to Exponent (recursively done)");
			System.out.println("4) Find Longest Word In Sentence (recursively done)");
			System.out.println("5) String Decompression");
			System.out.println("6) Data Analysis On Numbers In Array");
			System.out.println("7) Quit");

			System.out.println("\nChoose an option, or hit return to quit => ");
			String line = scstdin.nextLine();
			if (line.length() == 0) {
				return;
			}

			int intLine = Integer.parseInt(line);
			ManageInput input = new ManageInput();
			RecursionTest Recursion = new RecursionTest();

			switch (intLine){
			case 1: 
				PigLatin Latinator = new PigLatin();
				System.out.println("Enter a word to get the Pig Latin equivalent");
				String result = Latinator.PigLatinate(input.getInput());
				System.out.println("Pig Latin Equivalent: " + result);
				break;

			case 2:
				System.out.println("Enter a # to check if it is prime");
				String stringNum = input.getInput();
				int num = input.stringToInt(stringNum);

				if (Recursion.isPrime(num)){
					System.out.println("is a prime #");
				}
				else {
					System.out.println("is not prime #");
				}
				break;

			case 3:
				System.out.println("Enter exponent's base");
				String sBase = input.getInput();
				double base = input.stringToDouble(sBase);
				System.out.println("Enter the exponent");
				String sExp = input.getInput();
				int exp = input.stringToInt(sExp);

				System.out.println("(" + sBase + ")^(" + sExp + ") = " + Recursion.power(base, exp));
				break;

			case 4:
				System.out.println("Enter a sentence & find the longest word in it");
				String sentence = input.getInput();

				System.out.println("Longest word in the given sentence is: " + Recursion.longestWord(sentence));
				break;

			case 5:
				System.out.println("Enter a compressed string to decompress it");
				System.out.println("Ex. q9w5e2rt5y4qw2Er3T");
				String compressed = input.getInput();
				System.out.println("Decompressed string is: " + Recursion.decompress(compressed));
				break;

			case 6:
				System.out.println("Enter # of entries in array");
				String slength = input.getInput();
				int len = input.stringToInt(slength);
				double[] data = DataAnalysis.getData(len);
				
				//sorting data
				data = DataAnalysis.sort(len, data);
								
				System.out.println("Min value is: " + DataAnalysis.min(data));
				System.out.println("Max value is: " + DataAnalysis.max(len, data));
				System.out.println("Sum of all entries is: " + DataAnalysis.sum(len, data));
				System.out.println("Mean of data is: " + DataAnalysis.mean(len, data));
				System.out.println("Median of data is: " + DataAnalysis.median(len, data));
				double mode = DataAnalysis.mode(len, data);
				if (mode == -9000){
					System.out.println("There is no mode");
				}
				else{
					System.out.println("Mode of data is: " + mode);
				}
				break;

			case 7: 
				return;
			}
		}
	}
}