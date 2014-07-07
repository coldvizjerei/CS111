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
			RecursionTest Recursion = new RecursionTest();
			
			switch (intLine){
			case 1: 
				PigLatin Latinator = new PigLatin();
				String result = Latinator.PigLatinate();
				System.out.println("Pig Latin Equivalent: " + result);
				break;
				
			case 2:
				if (Recursion.isPrime()){
					System.out.println("is a prime #");
				}
				else {
					System.out.println("is not prime");
				}
				break;
				
			case 3:
				String base = scstdin.nextLine();
				System.out.println(" = ");
				break;
				
			case 4: 
				return;
			}
			
			
//			int basenumber = 2;
//			int exponentnum = -4;
//			IO.outputDoubleAnswer(pow(basenumber, exponentnum));
		}
	}
}