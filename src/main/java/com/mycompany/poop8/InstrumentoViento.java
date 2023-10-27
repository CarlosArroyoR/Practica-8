/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author Equipo2
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    
    
/**
 * Metodo que avisa si toca el instrumento, mediante impresion de pantalla
 */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }
/**
 * Metodo que avisa si afina el instrumento, mediante impresion de pantalla
 */
    @Override
    public void afinar() {
        System.out.println("Afinar un instrumento de viento");
    }
/**
 * Metodo que devuelve una cadena 
 */
    @Override
    public String tipoInstrument() {
        return "Instrumento de viento";
    }
    
}
