package com.cenfotec.juego;

import com.cenfotec.juego.elemento.Personaje;
import com.cenfotec.juego.elemento.extras.Guerrero;
import com.cenfotec.juego.elemento.extras.Mago;
import com.cenfotec.juego.elemento.extras.Trabajador;
import com.cenfotec.juego.utils.enums.TipoObjeto;

public class EjercicioDecorador {
    public static void main(String[] args) {
    		Personaje personajeDesconocido = new Personaje();
    		
    		Mago Merlin = new Mago(new Personaje(), "Merlin");
    		Guerrero Ragnar = new Guerrero(new Personaje(), "Ragnar");
    		Trabajador Juan = new Trabajador(new Personaje(), "Juan");
    		
    		System.out.println("Nombre: " + personajeDesconocido.getNombre() + " {\n " + 
    				"Tipo Personaje: " + personajeDesconocido.getTipo() + ", \n " +
    				"Niveles [V: " + personajeDesconocido.getNivelVida() + ", A: " + personajeDesconocido.getNivelAtaque() + ", D: " + personajeDesconocido.getNivelDefensa() + ", M: " + personajeDesconocido.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Nombre: " + Merlin.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Merlin.getTipo() + ", \n " +
    				"Niveles [V: " + Merlin.getNivelVida() + ", A: " + Merlin.getNivelAtaque() + ", D: " + Merlin.getNivelDefensa() + ", M: " + Merlin.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Nombre: " + Ragnar.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Ragnar.getTipo() + ", \n " +
    				"Niveles [V: " + Ragnar.getNivelVida() + ", A: " + Ragnar.getNivelAtaque() + ", D: " + Ragnar.getNivelDefensa() + ", M: " + Ragnar.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Nombre: " + Juan.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Juan.getTipo() + ", \n " +
    				"Niveles [V: " + Juan.getNivelVida() + ", A: " + Juan.getNivelAtaque() + ", D: " + Juan.getNivelDefensa() + ", M: " + Juan.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Cargar Espada a Merlin ->");
    		Merlin.cargarTipoObjeto(TipoObjeto.ESPADA);
    		System.out.println("Nombre: " + Merlin.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Merlin.getTipo() + ", \n " +
    				"Niveles [V: " + Merlin.getNivelVida() + ", A: " + Merlin.getNivelAtaque() + ", D: " + Merlin.getNivelDefensa() + ", M: " + Merlin.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Cargar Escudo a Juan ->");
    		Juan.cargarTipoObjeto(TipoObjeto.ESCUDO);
    		System.out.println("Nombre: " + Juan.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Juan.getTipo() + ", \n " +
    				"Niveles [V: " + Juan.getNivelVida() + ", A: " + Juan.getNivelAtaque() + ", D: " + Juan.getNivelDefensa() + ", M: " + Juan.getNivelMagia() + "] \n" +
    				"}; \n");
    		
    		System.out.println("Cargar Amuleto a Ragnar ->");
    		Ragnar.cargarTipoObjeto(TipoObjeto.AMULETO);
    		System.out.println("Nombre: " + Ragnar.getNombre() + " {\n " + 
    				"Tipo Personaje: " + Ragnar.getTipo() + ", \n " +
    				"Niveles [V: " + Ragnar.getNivelVida() + ", A: " + Ragnar.getNivelAtaque() + ", D: " + Ragnar.getNivelDefensa() + ", M: " + Ragnar.getNivelMagia() + "] \n" +
    				"}; \n");
    }    
}
