package pe.finan.server.app.model;

import java.io.Serializable;
import java.util.Date;

public class Recurso implements Serializable {

	private static final long serialVersionUID = 1L;
	private int IdUsuario;
	private String TxNombres;
	private int Total;

	private int IdIniciativa;
	private int NuPorcentajeAsig;
	private Date FcAsignacion;
	private int IdUsuarioReg;

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getTxNombres() {
		return TxNombres;
	}

	public void setTxNombres(String txNombres) {
		TxNombres = txNombres;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public int getIdIniciativa() {
		return IdIniciativa;
	}

	public void setIdIniciativa(int idIniciativa) {
		IdIniciativa = idIniciativa;
	}

	public int getNuPorcentajeAsig() {
		return NuPorcentajeAsig;
	}

	public void setNuPorcentajeAsig(int nuPorcentajeAsig) {
		NuPorcentajeAsig = nuPorcentajeAsig;
	}

	public Date getFcAsignacion() {
		return FcAsignacion;
	}

	public void setFcAsignacion(Date fcAsignacion) {
		FcAsignacion = fcAsignacion;
	}

	public int getIdUsuarioReg() {
		return IdUsuarioReg;
	}

	public void setIdUsuarioReg(int idUsuarioReg) {
		IdUsuarioReg = idUsuarioReg;
	}

}
