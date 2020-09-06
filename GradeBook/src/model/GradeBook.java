package model;

public class GradeBook {
	
	private String name;
	private int[] scores;
	private char[] letters;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public char[] getLetters() {
		return letters;
	}
	
	
	
	public GradeBook() {
		super();
		this.letters = new char[0];
	}
	
	public GradeBook(String name, int[] scores) {
		super();
		this.name = name;
		this.scores = scores;
		this.letters = new char[0];
	}
	
	public void setLetterGrades() {
		letters = new char[scores.length];
		final int TIER_1 = 89;
		final int TIER_2 = 79;
		final int TIER_3 = 69;
		final int TIER_4 = 59;
		final char T1_VAL = 'A';
		final char T2_VAL = 'B';
		final char T3_VAL = 'C';
		final char T4_VAL = 'D';
		final char T5_VAL = 'F';
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > TIER_1) {
				letters[i] = T1_VAL;
			}else if(scores[i] > TIER_2) {
				letters[i] = T2_VAL;
			}else if(scores[i] > TIER_3) {
				letters[i] = T3_VAL;
			}else if(scores[i] > TIER_4) {
				letters[i] = T4_VAL;
			}else {
				letters[i] = T5_VAL;
			}
		}
	}
	
}
