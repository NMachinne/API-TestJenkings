package com.example.ejercicioDevops;

public class Operacion {
	
	private int numero1;
	private int numero2;
	private int resultado;
	
	
	
	public Operacion() {
		super();
	}

	public Operacion(int numero1, int numero2, int resultado) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Operacion [numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado + "]";
	}
	
	

}
