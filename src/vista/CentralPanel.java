/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import modelo.CalculadoraModelo;
import modelo.Modelo;

/**
 *
 * @author Santi
 */
public class CentralPanel extends JPanel {
    
    CalculadoraModelo modelo;
    
    private PantallaPanel pantalla_panel;
    private NumerosPanel numeros_panel;
    private OperacionesPanel operaciones_panel;
    
    public CentralPanel(CalculadoraModelo _modelo)
    {
        modelo = _modelo;
        
        setLayout(new BorderLayout());
        
        pantalla_panel = new PantallaPanel(modelo);
        numeros_panel = new NumerosPanel();
        operaciones_panel = new OperacionesPanel();
        
        add(pantalla_panel, BorderLayout.NORTH);
        add(numeros_panel, BorderLayout.CENTER);
        add(operaciones_panel, BorderLayout.EAST);
    }

    void addListener(Controlador.VirtualKeyListener virtualKeyListener) {
        numeros_panel.addListener(virtualKeyListener);
        operaciones_panel.addListener(virtualKeyListener);
    }

    void actualizar() {
        pantalla_panel.actualizar();
    }

    void addListener(Controlador.RealKeyListener realKeyListener) {
        pantalla_panel.addKeyListener(realKeyListener);
    }
}
