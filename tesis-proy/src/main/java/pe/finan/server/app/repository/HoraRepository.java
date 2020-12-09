package pe.finan.server.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.finan.server.app.mapper.HoraMapper;
import pe.finan.server.app.model.Hora;
import pe.finan.server.app.repository.common.IReadable;
import pe.finan.server.app.repository.common.IRemovable;
import pe.finan.server.app.repository.common.IWriteable;
import pe.finan.server.util.HelperJDBC;

@Repository
public class HoraRepository implements IWriteable<Hora>, IReadable<Hora>,IRemovable<Hora> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int update(Hora object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Hora object) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_insertar_hora] ?,?,?,?,?;");

		args = HelperJDBC.appendValue(args, object.getIdIniciativa());
		args = HelperJDBC.appendValue(args, object.getIdUsuario());
		args = HelperJDBC.appendValue(args, object.getNuHoras());
		args = HelperJDBC.appendValue(args, object.getFcHora());
		args = HelperJDBC.appendValue(args, object.getIdUsuarioReg());

		return (Integer) jdbcTemplate.queryForObject(sql.toString(), args, Integer.class);
	}

	@Override
	public List<Hora> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hora> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hora> getAll(Hora object) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_listar_horas] ?,?;");

		args = HelperJDBC.appendValue(args, object.getIdUsuario());
		args = HelperJDBC.appendValue(args, object.getFcFecha());

		return jdbcTemplate.query(sql.toString(), args, new HoraMapper());
	}

	@Override
	public void removebyId(int id) {

	}

	@Override
	public void remove(Hora object) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_listar_horas] ?,?;");

		args = HelperJDBC.appendValue(args, object.getIdUsuario());
		args = HelperJDBC.appendValue(args, object.getFcFecha());

		jdbcTemplate.query(sql.toString(), args, new HoraMapper());
	}

}
