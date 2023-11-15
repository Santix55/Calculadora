/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Santi
 */
class FuncionesPanel extends JPanel{
    private JButton boton;
            
    public FuncionesPanel(){
        setLayout(new GridLayout(1,1));
        
        boton = new JButton("CLEAR");
        boton.setForeground(Color.BLUE);
        
        add(boton);
    }

    void addListener(Controlador.VirtualKeyListener virtualKeyListener) {
        boton.setActionCommand("clear");
        boton.addActionListener(virtualKeyListener);
    }
}
