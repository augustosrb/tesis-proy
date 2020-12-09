package pe.finan.server.app.model;

import java.io.Serializable;
import java.util.Date;

public class Hora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int IdIniciativa;
	private int IdUsuario;
	private int NuHoras;
	private Date FcHora;
	private int IdUsuarioReg;
	private Date FcFecha;

	public int getIdIniciativa() {
		return IdIniciativa;
	}

	public void setIdIniciativa(int idIniciativa) {
		IdIniciativa = idIniciativa;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public int getNuHoras() {
		return NuHoras;
	}

	public void setNuHoras(int nuHoras) {
		NuHoras = nuHoras;
	}

	public Date getFcHora() {
		return FcHora;
	}

	public void setFcHora(Date fcHora) {
		FcHora = fcHora;
	}

	public int getIdUsuarioReg() {
		return IdUsuarioReg;
	}

	public void setIdUsuarioReg(int idUsuarioReg) {
		IdUsuarioReg = idUsuarioReg;
	}

	public Date getFcFecha() {
		return FcFecha;
	}

	public void setFcFecha(Date fcFecha) {
		FcFecha = fcFecha;
	}
	
}
