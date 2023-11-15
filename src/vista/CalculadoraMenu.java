/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Santi
 */
class CalculadoraMenu extends JMenuBar {
   // private JMenuBar menu_bar;
    private JMenu menu;
    private JMenuItem salir;
    
    CalculadoraMenu(){
        //menu_bar = new JMenuBar();
        
        menu = new JMenu("Calculadora");
        add(menu);
        
        salir = new JMenuItem("Salir");
        menu.add(salir);
        
        //add(menu_bar);
    }

    void addListener(Controlador.VirtualKeyListener vlk) {
        salir.setActionCommand("salir");
        salir.addActionListener(vlk);
    }
}
