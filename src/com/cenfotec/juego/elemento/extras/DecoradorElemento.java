package com.cenfotec.juego.elemento.extras;

import com.cenfotec.juego.elemento.Elemento;
import com.cenfotec.juego.utils.enums.TipoObjeto;

public abstract class DecoradorElemento extends Elemento {
	String nombre;
	int nivelVida;
	int nivelAtaque;
	int nivelMagia;
	int nivelDefensa;
	
	public abstract String getNombre();

	public abstract int getNivelVida();

	public abstract int getNivelAtaque();
	
	public abstract int getNivelMagia();

	public abstract int getNivelDefensa();
	
	public abstract void cargarTipoObjeto(TipoObjeto tipo);

	@Override
    public abstract String getTipo();
}
