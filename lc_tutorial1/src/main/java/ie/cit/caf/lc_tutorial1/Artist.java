package ie.cit.caf.lc_tutorial1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
	
	@JsonProperty("fc")
	private String fullName;
	private int birthYear;
	private String totalWorks;
	private String url;
	private String gender;
	
	@Override
	public String toString() {
		String artistAsString = "Name: " + fullName 
							+ "\nBorn: " + birthYear 
							+ "\nTotal: " + totalWorks 
							+ "\nURL: " + url
							+ "\nGender: " + gender;
		return artistAsString;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getTotalWorks() {
		return totalWorks;
	}

	public void setTotalWorks(String totalWorks) {
		this.totalWorks = totalWorks;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String url) {
		this.url = url;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}