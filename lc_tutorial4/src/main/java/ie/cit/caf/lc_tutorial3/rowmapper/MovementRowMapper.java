package ie.cit.caf.lc_tutorial3.rowmapper;

import ie.cit.caf.lc_tutorial3.domain.Movement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovementRowMapper implements RowMapper<Movement> {

	@Override
	public Movement mapRow(ResultSet rs, int index) throws SQLException {
		Movement movement = new Movement();
			movement.setId(rs.getInt("id"));
			movement.setName(rs.getString("name"));	
		return movement;
	}

}