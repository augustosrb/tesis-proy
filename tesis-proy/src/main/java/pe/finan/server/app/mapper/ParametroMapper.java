package pe.finan.server.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.finan.server.app.model.Parametro;

public class ParametroMapper implements RowMapper<Parametro> {
	
	public Parametro mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Parametro parametro = new Parametro();
		parametro.setNuValor(rs.getInt("NuValor"));
		parametro.setTxDescripcion(rs.getString("TxDescripcion"));
		
		return parametro;
	}

}
