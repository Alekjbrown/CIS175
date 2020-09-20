package model;

public class StatBlock {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int strScore;
	private int dexScore;
	private int conScore;
	private int intScore;
	private int wisScore;
	private int chaScore;

	public StatBlock() {
		super();
		// Auto-generated constructor stub
	}

	public StatBlock(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		super();
		setStrScore(strength);
		setDexScore(dexterity);
		setConScore(constitution);
		setIntScore(intelligence);
		setWisScore(wisdom);
		setChaScore(charisma);
		setModifiers();
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	
	public int getStrScore() {
		return strScore;
	}

	public void setStrScore(int strScore) {
		this.strScore = strScore;
	}

	public int getDexScore() {
		return dexScore;
	}

	public void setDexScore(int dexScore) {
		this.dexScore = dexScore;
	}

	public int getConScore() {
		return conScore;
	}

	public void setConScore(int conScore) {
		this.conScore = conScore;
	}

	public int getIntScore() {
		return intScore;
	}

	public void setIntScore(int intScore) {
		this.intScore = intScore;
	}

	public int getWisScore() {
		return wisScore;
	}

	public void setWisScore(int wisScore) {
		this.wisScore = wisScore;
	}

	public int getChaScore() {
		return chaScore;
	}

	public void setChaScore(int chaScore) {
		this.chaScore = chaScore;
	}

	
	@Override
	public String toString() {
		return "StatBlock [strength=" + strength + ", dexterity=" + dexterity + ", constitution=" + constitution
				+ ", intelligence=" + intelligence + ", wisdom=" + wisdom + ", charisma=" + charisma + ", strScore="
				+ strScore + ", dexScore=" + dexScore + ", conScore=" + conScore + ", intScore=" + intScore
				+ ", wisScore=" + wisScore + ", chaScore=" + chaScore + "]";
	}

	public void setModifiers() {
		setStrength(calcMod(strScore));
		setDexterity(calcMod(dexScore));
		setConstitution(calcMod(conScore));
		setIntelligence(calcMod(intScore));
		setWisdom(calcMod(wisScore));
		setCharisma(calcMod(chaScore));
	}

	public int calcMod(int score) {
		// score modifier
		// 1 -5
		// 2-3 -4
		// 4-5 -3
		// 6-7 -2
		// 8-9 -1
		// 10-11 0
		// 12-13 1
		// 14-15 2
		// 16-17 3
		// 18-19 4
		// 20-21 5
		// 22-23 6
		// 24-25 7
		// 26-27 8
		// 28-29 9
		// 30 10

		int modifier = -5;

		for (int i = 1; i <= score; i++) {
			if (i % 2 == 0) {
				modifier++;
			} else {
				continue;
			}
		}
		return modifier;
	}
}
