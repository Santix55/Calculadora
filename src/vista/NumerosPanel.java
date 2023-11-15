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
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Santi
 */
class NumerosPanel extends JPanel{
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonP;
    private JButton botonC;
    
    public NumerosPanel(){
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setLayout(new GridLayout(3,4,5,5));
        
        boton0 = new JButton("0");
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        botonP = new JButton(".");
        botonC = new JButton("C");
        
        botonC.setForeground(Color.BLUE);
        
        add(boton0);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(botonP);
        add(botonC);
    }

    void addListener(Controlador.VirtualKeyListener virtualKeyListener) {
        boton0.setActionCommand("0");
        boton1.setActionCommand("1");
        boton2.setActionCommand("2");
        boton3.setActionCommand("3");
        boton4.setActionCommand("4");
        boton5.setActionCommand("5");
        boton6.setActionCommand("6");
        boton7.setActionCommand("7");
        boton8.setActionCommand("8");
        boton9.setActionCommand("9");
        botonP.setActionCommand(".");
        botonC.setActionCommand("C");
        
        boton0.addActionListener(virtualKeyListener);
        boton1.addActionListener(virtualKeyListener);
        boton2.addActionListener(virtualKeyListener);
        boton3.addActionListener(virtualKeyListener);
        boton4.addActionListener(virtualKeyListener);
        boton5.addActionListener(virtualKeyListener);
        boton6.addActionListener(virtualKeyListener);
        boton7.addActionListener(virtualKeyListener);
        boton8.addActionListener(virtualKeyListener);
        boton9.addActionListener(virtualKeyListener);
        botonP.addActionListener(virtualKeyListener);
        botonC.addActionListener(virtualKeyListener);
    }
}
