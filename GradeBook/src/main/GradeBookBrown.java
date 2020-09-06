package main;

import java.util.Scanner;
import model.GradeBook;

public class GradeBookBrown {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		String tName = "";
		int numScores = 0;
		int[] scores;
		char[] lGrades;
		
		GradeBook gb = new GradeBook();
		
		System.out.println("Enter a test name: ");
		tName = in.nextLine();

		while (!valid) {
			System.out.println("Enter the number of scores: ");
			if (in.hasNextInt()) {
				valid = true;
				numScores = in.nextInt();
			} else {
				System.out.println("Invalid input, Please use an Integer \n");
				in.nextLine();
			} 
		}
		valid = false;
		
		scores = new int[numScores];
		
		for(int i = 0; i < scores.length; i++) {
			while(!valid) {
				System.out.println("Enter test score " + (i+1));
				if(in.hasNextInt()) {
					valid = true;
					scores[i] = in.nextInt();
				}else {
					System.out.println("Invalid input, please use an Integer \n");
					in.nextLine();
				}
			}
			valid = false;
		}
		
		gb.setName(tName);
		gb.setScores(scores);
		gb.setLetterGrades();
		
		System.out.println("\n" + gb.getName() + " Scores\n");
		System.out.println("Score-----Grade\n");
		for(int i=0; i < gb.getScores().length;i++) {
			System.out.println("  " + gb.getScores()[i] + "------" + gb.getLetters()[i] + "\n");
		}		
		
		in.close();
	}

}
