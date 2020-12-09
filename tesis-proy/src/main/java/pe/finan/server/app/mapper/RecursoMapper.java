package pe.finan.server.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.finan.server.app.model.Recurso;

public class RecursoMapper implements RowMapper<Recurso> {
	
	public Recurso mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Recurso recurso = new Recurso();
		recurso.setIdUsuario(rs.getInt("IdUsuario"));
		recurso.setTxNombres(rs.getString("TxNombres"));
		recurso.setTotal(rs.getInt("total"));
		
		return recurso;
	}

}
