package ie.cit.caf.lc_tutorial3.repository;

import java.util.List;

import ie.cit.caf.lc_tutorial3.domain.Artist;

public interface ArtistRepository {

	Artist get(int id);

	List<Artist> findAll();

	void save(Artist artist);

	void remove(Artist artist);

}
