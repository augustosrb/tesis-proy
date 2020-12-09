package pe.finan.server.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.finan.server.app.model.Hora;

public class HoraMapper implements RowMapper<Hora> {
	
	public Hora mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Hora hora = new Hora();
		hora.setIdUsuario(rs.getInt("IdUsuario"));
		hora.setFcFecha(rs.getDate("FcFecha"));
		
		return hora;
	}

}
