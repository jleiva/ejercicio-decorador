package com.cenfotec.juego.elemento.extras;

import com.cenfotec.juego.elemento.Elemento;
import com.cenfotec.juego.utils.enums.TipoObjeto;

public class Guerrero extends DecoradorElemento {
	Elemento elemento;
    
    public Guerrero(Elemento pElemento, String pNombre) {
        this.elemento = pElemento;
        this.nombre = pNombre;
        this.nivelVida = 20;
        this.nivelAtaque = 30;
        this.nivelMagia = 20;
        this.nivelDefensa = 30;
    }
    
    @Override
    public String getTipo() {
        return "Guerrero";
    }

	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public int getNivelVida() {
		return this.nivelVida;
	}

	@Override
	public int getNivelAtaque() {
		return this.nivelAtaque;
	}

	@Override
	public int getNivelMagia() {
		return this.nivelMagia;
	}

	@Override
	public int getNivelDefensa() {
		return this.nivelDefensa;
	}
	
	@Override
	public void cargarTipoObjeto(TipoObjeto tipo) {
		switch(tipo) {
		case ESPADA:
			this.nivelAtaque = this.getNivelAtaque() + 10;
			this.nivelDefensa = this.getNivelDefensa() + 10;
			this.nivelVida = this.getNivelVida() + 1;
			break;
		case ARMADURA:
			this.nivelDefensa = this.getNivelDefensa() + 20;
			this.nivelVida = this.getNivelVida() + 20;
			break;
		case ESCUDO:
			this.nivelDefensa = this.getNivelDefensa() + 40;
			this.nivelVida = this.getNivelVida() + 10;
			break;
		case AMULETO:
			this.nivelMagia = this.getNivelMagia() + 10;
			break;
		}
	}

}
