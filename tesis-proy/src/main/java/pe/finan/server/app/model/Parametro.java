package pe.finan.server.app.model;

import java.io.Serializable;

public class Parametro implements Serializable {

	private static final long serialVersionUID = 1L;

	private int NuValor;
	private String TxDescripcion;

	public int getNuValor() {
		return NuValor;
	}

	public void setNuValor(int nuValor) {
		NuValor = nuValor;
	}

	public String getTxDescripcion() {
		return TxDescripcion;
	}

	public void setTxDescripcion(String txDescripcion) {
		TxDescripcion = txDescripcion;
	}

}
