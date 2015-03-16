package ie.cit.caf.lc_tutorial3.service;

import java.util.List;

import ie.cit.caf.lc_tutorial3.domain.Artist;

public interface ArtistService {

	void save(Artist artist); 
	Artist get(int id);
	void remove(Artist artist); 
	List<Artist> findAll();
	
}
