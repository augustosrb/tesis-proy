package pe.finan.server.app.model;

import java.io.Serializable;
import java.util.Date;

public class Iniciativa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int IdIniciativa;
	private int NuInterno;
	private String TxTitulo;
	private Date FcRegistro;
	private Date FcInicio;
	private Date FcFin;
	private int IdUsuarioRes;
	private int IdUsuarioSol;
	private int NuHorasEst;
	private int IdEtapa;
	private int IdCategoria;
	private int IdPrioridad;
	private int IdArea;
	private int IdTipoAte;
	private int IdSistema;
	private String TxObjetivoPri;
	private String TxObjetivoSec;
	private int IdUsuarioReg;
	private Date FcRegistroAud;
	private int IdUsuarioMod;
	private Date FcModificacionAud;
	private String DescCategoria;
	private String usuLiderNom;
	private String DescEtapa;
	private String TxFcRegistro;
	private String TxNuInterno;

	public int getIdIniciativa() {
		return IdIniciativa;
	}

	public void setIdIniciativa(int idIniciativa) {
		IdIniciativa = idIniciativa;
	}

	public int getNuInterno() {
		return NuInterno;
	}

	public void setNuInterno(int nuInterno) {
		NuInterno = nuInterno;
	}

	public String getTxTitulo() {
		return TxTitulo;
	}

	public void setTxTitulo(String txTitulo) {
		TxTitulo = txTitulo;
	}

	public Date getFcRegistro() {
		return FcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		FcRegistro = fcRegistro;
	}

	public Date getFcInicio() {
		return FcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		FcInicio = fcInicio;
	}

	public Date getFcFin() {
		return FcFin;
	}

	public void setFcFin(Date fcFin) {
		FcFin = fcFin;
	}

	public int getIdUsuarioRes() {
		return IdUsuarioRes;
	}

	public void setIdUsuarioRes(int idUsuarioRes) {
		IdUsuarioRes = idUsuarioRes;
	}

	public int getIdUsuarioSol() {
		return IdUsuarioSol;
	}

	public void setIdUsuarioSol(int idUsuarioSol) {
		IdUsuarioSol = idUsuarioSol;
	}

	public int getNuHorasEst() {
		return NuHorasEst;
	}

	public void setNuHorasEst(int nuHorasEst) {
		NuHorasEst = nuHorasEst;
	}

	public int getIdEtapa() {
		return IdEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		IdEtapa = idEtapa;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public int getIdPrioridad() {
		return IdPrioridad;
	}

	public void setIdPrioridad(int idPrioridad) {
		IdPrioridad = idPrioridad;
	}

	public int getIdArea() {
		return IdArea;
	}

	public void setIdArea(int idArea) {
		IdArea = idArea;
	}

	public int getIdTipoAte() {
		return IdTipoAte;
	}

	public void setIdTipoAte(int idTipoAte) {
		IdTipoAte = idTipoAte;
	}

	public String getTxObjetivoPri() {
		return TxObjetivoPri;
	}

	public void setTxObjetivoPri(String txObjetivoPri) {
		TxObjetivoPri = txObjetivoPri;
	}

	public String getTxObjetivoSec() {
		return TxObjetivoSec;
	}

	public void setTxObjetivoSec(String txObjetivoSec) {
		TxObjetivoSec = txObjetivoSec;
	}

	public int getIdUsuarioReg() {
		return IdUsuarioReg;
	}

	public void setIdUsuarioReg(int idUsuarioReg) {
		IdUsuarioReg = idUsuarioReg;
	}

	public Date getFcRegistroAud() {
		return FcRegistroAud;
	}

	public void setFcRegistroAud(Date fcRegistroAud) {
		FcRegistroAud = fcRegistroAud;
	}

	public int getIdUsuarioMod() {
		return IdUsuarioMod;
	}

	public void setIdUsuarioMod(int idUsuarioMod) {
		IdUsuarioMod = idUsuarioMod;
	}

	public Date getFcModificacionAud() {
		return FcModificacionAud;
	}

	public void setFcModificacionAud(Date fcModificacionAud) {
		FcModificacionAud = fcModificacionAud;
	}

	public String getDescCategoria() {
		return DescCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		DescCategoria = descCategoria;
	}

	public String getUsuLiderNom() {
		return usuLiderNom;
	}

	public void setUsuLiderNom(String usuLiderNom) {
		this.usuLiderNom = usuLiderNom;
	}

	public String getDescEtapa() {
		return DescEtapa;
	}

	public void setDescEtapa(String descEtapa) {
		DescEtapa = descEtapa;
	}

	public int getIdSistema() {
		return IdSistema;
	}

	public void setIdSistema(int idSistema) {
		IdSistema = idSistema;
	}

	public String getTxFcRegistro() {
		return TxFcRegistro;
	}

	public void setTxFcRegistro(String txFcRegistro) {
		TxFcRegistro = txFcRegistro;
	}

	public String getTxNuInterno() {
		return TxNuInterno;
	}

	public void setTxNuInterno(String txNuInterno) {
		TxNuInterno = txNuInterno;
	}	
	
}
