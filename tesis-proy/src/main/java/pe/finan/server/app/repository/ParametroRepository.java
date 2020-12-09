package pe.finan.server.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.finan.server.app.mapper.ParametroMapper;
import pe.finan.server.app.model.Parametro;
import pe.finan.server.app.repository.common.IReadable;
import pe.finan.server.util.HelperJDBC;

@Repository
public class ParametroRepository implements IReadable<Parametro> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Parametro> get(int tipoIni) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_listar_parametros] ?");
		
		args  = HelperJDBC.appendValue(args,tipoIni);
		
		return jdbcTemplate.query(sql.toString(), args, new ParametroMapper());
	}

	@Override
	public List<Parametro> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parametro> getAll(Parametro object) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
