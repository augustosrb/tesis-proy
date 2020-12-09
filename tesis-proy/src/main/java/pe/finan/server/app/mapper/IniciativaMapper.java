package pe.finan.server.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.finan.server.app.model.Iniciativa;

public class IniciativaMapper implements RowMapper<Iniciativa> {
	
	public Iniciativa mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Iniciativa iniciativa = new Iniciativa();
		iniciativa.setIdIniciativa(rs.getInt("IdIniciativa"));
		iniciativa.setTxNuInterno(rs.getString("NuInterno"));
		iniciativa.setTxTitulo(rs.getString("TxTitulo"));
		iniciativa.setDescCategoria(rs.getString("DescCategoria"));
		iniciativa.setUsuLiderNom(rs.getString("usuLiderNom"));
		iniciativa.setTxFcRegistro(rs.getString("FcRegistro"));
		iniciativa.setNuHorasEst(rs.getInt("NuHorasEst"));
		iniciativa.setDescEtapa(rs.getString("DescEtapa"));
		
		return iniciativa;
	}

}
