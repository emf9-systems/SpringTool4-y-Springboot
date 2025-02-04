package com.company.objective;

public class Vehiculo {
	private int ano;
	private String marca;
	private String modelo;
	private String color;
	private int ruedas;
	protected int velocidad = 0;
	
	public Vehiculo() {}


	public Vehiculo(String color) {
		this.color = color;
	}


	public Vehiculo(int ano, String marca, String modelo, String color, int ruedas) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ruedas = ruedas;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void imprimeMarcaModelo() {
		if(this.marca == null) {
			System.out.println("Color: "+this.color);
		} else {
			System.out.println("Marca: "+this.marca+" Modelo: "+this.modelo+" Color: "+this.color);
		}
	}
	
	@Override
	public String toString() {
		return "Vehiculo [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ruedas="
				+ ruedas + "]";
	}
	
	
	
	
	
	
	
	
	
}
