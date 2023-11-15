/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.Controlador.RealKeyListener;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.CalculadoraModelo;
import modelo.Modelo;

/**
 *
 * @author Santi
 */
public class Vista extends JFrame{
    private CalculadoraModelo modelo;
    
    private CalculadoraMenu calculadora_menu;
    private CentralPanel central_panel;
    private FuncionesPanel funciones_panel;
    
    public Vista(CalculadoraModelo _modelo){
        modelo = _modelo;
        
        calculadora_menu = new CalculadoraMenu();
        central_panel = new CentralPanel(modelo);
        funciones_panel = new FuncionesPanel();
        
        //add(calculadora_menu, BorderLayout.NORTH);
        this.setJMenuBar(calculadora_menu);
        add(central_panel, BorderLayout.CENTER);
        add(funciones_panel, BorderLayout.SOUTH);
        
        this.setTitle("Calculadora");
        this.setVisible(true);
        this.setSize(300,350);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addListener(Controlador.VirtualKeyListener virtualKeyListener) {
        calculadora_menu.addListener(virtualKeyListener);
        central_panel.addListener(virtualKeyListener);
        funciones_panel.addListener(virtualKeyListener);
    }
    
    public void actualizar() {
        central_panel.actualizar();
    }
    
    public void addListener(Controlador.RealKeyListener realKeyListener) {
        central_panel.addListener(realKeyListener);
    }
}
