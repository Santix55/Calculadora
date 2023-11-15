/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.CalculadoraModelo;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Santi
 */
public class Controlador{
    private CalculadoraModelo modelo;
    private Vista vista;

    public Controlador(CalculadoraModelo _modelo, Vista _vista){
        modelo = _modelo;
        vista = _vista;
        
        vista.addListener(new VirtualKeyListener());
        vista.addListener(new RealKeyListener());
    }
    
    public class RealKeyListener implements KeyListener{
        public void keyTyped(KeyEvent e){
            System.out.println(e.getKeyChar());
        }
        
        @Override
        public void keyReleased(KeyEvent ke) {}
        
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyChar());
        }
    }
    
    public class VirtualKeyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            String cmd = ae.getActionCommand();
            System.out.println(ae.getActionCommand());
            
            if(cmd.equals("+") || cmd.equals("-") || cmd.equals("*") ||cmd.equals("/") || cmd.equals("=")) {
                modelo.calc(cmd);
            }
            else if (cmd.equals("P")) {
                modelo.addPoint();
            }
            else if (cmd.equals("C")) {
                modelo.deleteChar();
            }
            else if (cmd.equals("clear")) {
                modelo.reset();
            }
            else if(cmd.equals("salir")) {
                System.exit(0);
            }
            else {
                modelo.addDigit(cmd);
            }
            
            vista.actualizar();
        }
    }
}
