package ie.cit.caf.lc_tutorial3.repository;

import java.util.List;

import ie.cit.caf.lc_tutorial3.domain.Artist;

public interface ArtistRepository {

	Artist get(int id);
	
	void save(Artist artist);

	void remove(Artist artist);
	
	List<Artist> findAll();
	
}
