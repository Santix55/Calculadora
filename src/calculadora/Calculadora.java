/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import controlador.Controlador;
import modelo.CalculadoraModelo;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Santi
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Modelo modelo = new Modelo();
        Vista vista = new Vista(modelo);
        Controlador controlador = new Controlador(modelo, vista);
        */
        
        CalculadoraModelo modelo = new CalculadoraModelo();
        Vista vista = new Vista(modelo);
        Controlador controlador = new Controlador(modelo, vista);
    }
}
