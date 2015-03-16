package ie.cit.caf.lc_tutorial3.domain;

import java.util.Collections;
import java.util.List;

public class Movement {

	public Movement() {
		artists = Collections.<Artist>emptyList();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	private String name;

	private List<Artist> artists;
	
	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	
	@Override
	public String toString() {
		String out = "Movement [id=" + id + ", name=" + getName() + ", artists=[";
		for (Artist a : artists) {
			out += a.toString() + ",";
		}
		out += "]]";
		return out;
	}
	
}