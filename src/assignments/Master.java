package assignments;

import java.util.Scanner;

public class Master {
	public static void main(String[] args){
		Scanner scstdin = new Scanner(System.in);
		while(true){
			//options here
			
			System.out.println("\nChoose an option, or hit return to quit => ");
			String line = scstdin.nextLine();
			if (line.length() == 0) {
				return;
			}
			
			
		}
	}
}