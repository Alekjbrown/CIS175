package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Author {
	private String firstname;
	private String lastname;
	private int numTitlesWritten;
	
	public Author(String firstname, String lastname, int numTitlesWritten) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.numTitlesWritten = numTitlesWritten;
	}

	public Author() {
		super();
		//  Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getNumTitlesWritten() {
		return numTitlesWritten;
	}

	public void setNumTitlesWritten(int numTitlesWritten) {
		this.numTitlesWritten = numTitlesWritten;
	}

	@Override
	public String toString() {
		return "Author [firstname=" + firstname + ", lastname=" + lastname + ", numTitlesWritten=" + numTitlesWritten
				+ "]";
	}
	
	
	
}
