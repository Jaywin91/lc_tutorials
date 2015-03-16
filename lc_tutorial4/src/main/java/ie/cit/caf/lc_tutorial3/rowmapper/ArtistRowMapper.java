package ie.cit.caf.lc_tutorial3.rowmapper;

import ie.cit.caf.lc_tutorial3.domain.Artist;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ArtistRowMapper implements RowMapper<Artist> {

	@Override
	public Artist mapRow(ResultSet rs, int index) throws SQLException {
		Artist artist = new Artist();
			artist.setId(rs.getInt("id"));
			artist.setName(rs.getString("fullName"));
			artist.setGender(rs.getString("gender"));
		return artist;
	}

}