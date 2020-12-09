package pe.finan.server.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.finan.server.app.mapper.RecursoMapper;
import pe.finan.server.app.model.Recurso;
import pe.finan.server.app.repository.common.IReadable;
import pe.finan.server.app.repository.common.IWriteable;
import pe.finan.server.util.HelperJDBC;

@Repository
public class RecursoRepository  implements IReadable<Recurso>,IWriteable<Recurso> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Recurso> get(int id) {
		return null;
	}

	@Override
	public List<Recurso> getAll() {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_listar_recursos_por_asignar]");
		
		return jdbcTemplate.query(sql.toString(),args, new RecursoMapper());
	}

	@Override
	public int update(Recurso object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Recurso object) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_asignar_recurso] ?,?,?,?,?;");
		
		args  = HelperJDBC.appendValue(args,object.getIdIniciativa());
		args  = HelperJDBC.appendValue(args,object.getIdUsuario());
		args  = HelperJDBC.appendValue(args,object.getNuPorcentajeAsig());
		args  = HelperJDBC.appendValue(args,object.getFcAsignacion());
		args  = HelperJDBC.appendValue(args,object.getIdUsuarioReg());	
				
		return (Integer)jdbcTemplate.queryForObject(sql.toString(), args,Integer.class);
	}

	@Override
	public List<Recurso> getAll(Recurso object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
