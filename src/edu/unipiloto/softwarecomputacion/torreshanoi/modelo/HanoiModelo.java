package edu.unipiloto.softwarecomputacion.torreshanoi.modelo;

public class HanoiModelo {

	protected String resultado = "";
	protected int numDiscos;
	protected int numMovimientos;

	public HanoiModelo(int numDiscos){
		this.numDiscos = numDiscos>=1?numDiscos:1;
	}
	
	public int getNumDiscos() {
		return numDiscos;
	}

	public void setNumDiscos(int numDiscos) {
		this.numDiscos = numDiscos;
	}
	
	public String getResultado() {
		numMovimientos=0;
		resultado = "";
		Hanoi(numDiscos, 1, 2, 3); // 1:origen 2:auxiliar 3:destino
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	protected void Hanoi(int n, int origen, int auxiliar, int destino) {
		numMovimientos++;
		if (n == 1){
			resultado += "mover disco "+ n +" de torre " + origen + " a torre " + destino+"\n";
		}else {
			Hanoi(n - 1, origen, destino, auxiliar);
			resultado += "mover disco "+ n +" de torre " + origen + " a torre " + destino+"\n";
			Hanoi(n - 1, auxiliar, origen, destino);
		}
	}

	public int getNumMovimientos() {
		return numMovimientos;
	}

	public void setNumMovimientos(int numMovimientos) {
		this.numMovimientos = numMovimientos;
	}

}
