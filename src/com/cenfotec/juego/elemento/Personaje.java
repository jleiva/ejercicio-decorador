package com.cenfotec.juego.elemento;

public class Personaje extends Elemento {
	String nombre;
	int nivelVida;
	int nivelAtaque;
	int nivelMagia;
	int nivelDefensa;
	
	 public Personaje() {
		 this.nombre = "Sinnombre";
		 this.tipo = "Personaje Desconocido";
	}

	public int getNivelVida() {
		return nivelVida;
	}

	public int getNivelAtaque() {
		return nivelAtaque;
	}

	public int getNivelMagia() {
		return nivelMagia;
	}

	public int getNivelDefensa() {
		return nivelDefensa;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

}
