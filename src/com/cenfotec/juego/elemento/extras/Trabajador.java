package com.cenfotec.juego.elemento.extras;

import com.cenfotec.juego.elemento.Elemento;
import com.cenfotec.juego.utils.enums.TipoObjeto;

public class Trabajador extends DecoradorElemento {
	Elemento elemento;
    
    public Trabajador(Elemento pElemento, String pNombre) {
    		this.elemento = pElemento;
    		this.nombre = pNombre;
        this.nivelVida = 25;
        this.nivelAtaque = 10;
        this.nivelMagia = 10;
        this.nivelDefensa = 10;
    }
    
    @Override
    public String getTipo() {
        return "Trabajador";
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
			this.nivelMagia = this.getNivelMagia();
			break;
		}
	}

}
