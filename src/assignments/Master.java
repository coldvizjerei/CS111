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
			System.out.println("4) Quit");
			
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
				return;
			}
		}
	}
}