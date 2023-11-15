/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Santi
 */
class OperacionesPanel extends JPanel{
    private JButton botonMas;
    private JButton botonMenos;
    private JButton botonPor;
    private JButton botonEntre;
    private JButton botonIgual;
    
    public OperacionesPanel(){
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        this.setLayout(new GridLayout(5,1,3,3));
        this.setSize(500,400);
        
        botonMas = new JButton("+");
        botonMenos = new JButton("-");
        botonPor = new JButton("*");
        botonEntre = new JButton("/");
        botonIgual = new JButton("=");
        
        botonMas.setForeground(Color.BLUE);
        botonMenos.setForeground(Color.BLUE);
        botonPor.setForeground(Color.BLUE);
        botonEntre.setForeground(Color.BLUE);
        botonIgual.setForeground(Color.BLUE);
        
        add(botonMas);
        add(botonMenos);
        add(botonPor);
        add(botonEntre);
        add(botonIgual);
    }

    void addListener(Controlador.VirtualKeyListener vkl) {
        botonMas.setActionCommand("+");
        botonMenos.setActionCommand("-");
        botonPor.setActionCommand("*");
        botonEntre.setActionCommand("/");
        botonIgual.setActionCommand("=");
        
        botonMas.addActionListener(vkl);
        botonMenos.addActionListener(vkl);
        botonPor.addActionListener(vkl);
        botonEntre.addActionListener(vkl);
        botonIgual.addActionListener(vkl);
    }
}
