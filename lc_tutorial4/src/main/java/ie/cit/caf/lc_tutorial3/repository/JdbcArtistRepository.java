package ie.cit.caf.lc_tutorial3.repository;

import ie.cit.caf.lc_tutorial3.domain.Artist;
import ie.cit.caf.lc_tutorial3.rowmapper.ArtistRowMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcArtistRepository implements ArtistRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcArtistRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Artist get(int id) {
		String sql = "SELECT * FROM artists WHERE id = ?";
		Artist artist = jdbcTemplate.queryForObject(sql, new Object[] { id },
				new ArtistRowMapper());
		return artist;
	}

	@Override
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Artist artist) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(Artist artist) {
		// TODO Auto-generated method stub
	}

	// public int getCount() {
	// String sql = "SELECT COUNT(*) FROM artists";
	// return = 0;
	// }

}
