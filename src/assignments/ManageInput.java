package assignments;

import java.util.Scanner;

public class ManageInput {
	public String getInput(){
		Scanner scstdin = new Scanner(System.in);
		String word = scstdin.nextLine();
		while (word.equals("")){
			System.out.println("Input is empty. Please try again");
			word = scstdin.nextLine();
		}
		return word;
	}
	
	public int stringToInt(String integer){
		return Integer.parseInt(integer);
	}
	
	public double stringToDouble(String number){
		return Double.parseDouble(number);
	}
}
