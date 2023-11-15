/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.CalculadoraModelo;
import modelo.Modelo;

/**
 *
 * @author Santi
 */
class PantallaPanel extends JPanel {

    private CalculadoraModelo modelo;
    private JLabel pantallaG;
    private JLabel pantallaP;
    static final Color VERDE_LED = new Color(161,168,106);

    
    public PantallaPanel(CalculadoraModelo _modelo){
        this.setFocusable(true);
        
        setBorder(
         BorderFactory.createLineBorder(Color.BLACK, 10, false)
        );
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        modelo = _modelo;
        
        pantallaG = new JLabel(modelo.getValor());
        pantallaP = new JLabel(modelo.getStatus());
        
        JPanel panelG=new JPanel();
        panelG.setLayout(new BorderLayout());
        panelG.add(pantallaG, BorderLayout.EAST);
        panelG.setBackground(VERDE_LED);
        panelG.setOpaque(true);
       
        JPanel panelP=new JPanel();
        panelP.setLayout(new BorderLayout());
        panelP.add(pantallaP, BorderLayout.WEST);
        panelP.setBackground(VERDE_LED);
        panelP.setOpaque(true);
       
        add(panelG);
        add(panelP);
        
        pantallaG.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
    }
    
    
    /*
    @Override
    public void paintComponent(Graphics g){
        // Cast a graphics 2D
        Graphics g2d = (Graphics2D) g;
        super.paintComponent(g);
      
        // Dibujar Fonodo
        g2d.setColor(VERDE_LED);
//      g2d.setStroke(new BasicStroke(20.0f));
        g2d.fillRect(0,0, this.getWidth(), this.getHeight());
        
        // Dibujar Borde
        g2d.setColor(Color.BLACK);
        g2d.drawRect(0,0, this.getWidth(), this.getHeight());
       
        // Dibujar en grande
        g2d.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 55));
        g2d.drawString(modelo.getGrande(), 25, 100);
        
        // Dibujar en mas pequeño en el resultado
        g2d.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        g2d.drawString(modelo.getPeque(), 60, 25);

    }
    */

    void actualizar() {
        pantallaG.setText(modelo.getValor());
        pantallaP.setText(modelo.getStatus());
    }
}
