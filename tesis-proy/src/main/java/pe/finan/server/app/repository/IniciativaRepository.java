package pe.finan.server.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.finan.server.app.mapper.IniciativaMapper;
import pe.finan.server.app.model.Iniciativa;
import pe.finan.server.app.repository.common.IReadable;
import pe.finan.server.app.repository.common.IWriteable;
import pe.finan.server.util.HelperJDBC;

@Repository
public class IniciativaRepository implements IReadable<Iniciativa>,IWriteable<Iniciativa> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int update(Iniciativa t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Iniciativa object) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_registrar_iniciativa] ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?;");
		
		args  = HelperJDBC.appendValue(args,object.getNuInterno());
		args  = HelperJDBC.appendValue(args,object.getTxTitulo());
		args  = HelperJDBC.appendValue(args,object.getFcRegistro());
		args  = HelperJDBC.appendValue(args,object.getFcInicio());
		args  = HelperJDBC.appendValue(args,object.getFcFin());
		args  = HelperJDBC.appendValue(args,object.getIdUsuarioRes());
		args  = HelperJDBC.appendValue(args,object.getIdUsuarioSol());
		args  = HelperJDBC.appendValue(args,object.getNuHorasEst());
		args  = HelperJDBC.appendValue(args,object.getIdEtapa());
		args  = HelperJDBC.appendValue(args,object.getIdCategoria());
		args  = HelperJDBC.appendValue(args,object.getIdPrioridad());
		args  = HelperJDBC.appendValue(args,object.getIdArea());
		args  = HelperJDBC.appendValue(args,object.getIdTipoAte());
		args  = HelperJDBC.appendValue(args,object.getIdSistema());
		args  = HelperJDBC.appendValue(args,object.getTxObjetivoPri());
		args  = HelperJDBC.appendValue(args,object.getTxObjetivoSec());
		args  = HelperJDBC.appendValue(args,object.getIdUsuarioReg());
				
		return (Integer)jdbcTemplate.queryForObject(sql.toString(), args,Integer.class);
	}

	@Override
	public List<Iniciativa> get(int id) {
		Object[] args = new Object[] {};
		StringBuilder sql = new StringBuilder("exec [dbo].[fc_sp_listar_iniciativa] ?");
		
		args  = HelperJDBC.appendValue(args,id);
		
		return jdbcTemplate.query(sql.toString(), args, new IniciativaMapper());
	}

	@Override
	public List<Iniciativa> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Iniciativa> getAll(Iniciativa object) {
		// TODO Auto-generated method stub
		return null;
	}

}
