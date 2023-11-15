/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Santi
 */
public class Modelo {
    private String grande;
    private String peque;
    
    private Boolean inicio;
    
    private String operacion; 
    private int resultado;
    
    // CONSTRUCTOR (INICIALIZA) //
    public Modelo() {
        grande = "0";
        peque = "0";
        inicio = false;
    }
    
    // GETTERS //
    public String getGrande() { return grande; }
    public String getPeque() { return peque; }
    
    // PULSAR //
    public void pulsar(String key) {
        // Si es el inicio y pulsa una tecla, cambia el texto grande por el peque
        if(inicio){
            peque = grande;
        }
        
        // Acción según tecla
        if("salir".equals(key)){
            // salir del programa
            System.exit(0);
        }
        else if("=".equals(key)){
            // obtener el resultado
            double op1 = 0;
            double op2 = 0;
            char operando = '?';
            int n_puntos = 0;
            Boolean error = false;
            
            // obtener primer operador
            for(int i=0; true; i++){
                // si lee todo solo hay un operador
                if(i>=grande.length()-1)
                    return;
                
                // si hay un error imprime SYNTAX ERROR en la pantalla pequeña
                if(error){
                    peque = "SYNTAX ERROR";
                    return;
                }
                
                // si hay 2 puntos en el mismo operando da error
                if(getTipo(grande.charAt(i)).equals("punto")){
                    n_puntos++;
                    if(n_puntos == 2)
                        error = true;
                }
                
                // si es número se añade la última cifra
                if(getTipo(grande.charAt(i)).equals("numero")) {
                    op1*= 10;
                    op1+= grande.charAt(i)-48;
                }
                
                // si es un operando se sale y anota el operando que es
                if(getTipo(grande.charAt(i)).equals("operando")) {
                    operando = grande.charAt(i);
                    break;
                }
            }
            
            // obtener segundo operando
            n_puntos = 0;
            for(int i=0; true; i++){
                // si termina
                if(i>=grande.length()-1)
                    break;
                
                // si hay 2 puntos en el mismo operando da error
                if(getTipo(grande.charAt(i)).equals("punto")){
                    n_puntos++;
                    if(n_puntos == 2)
                        error = true;
                }
                
                // si es número se añade la última cifra
                if(getTipo(grande.charAt(i)).equals("numero")) {
                    op2*= 10;
                    op2+= grande.charAt(i)-48;
                }
                
                // si hay otro operador o vuelven a aparecer 2 puntos
                if(error){
                    peque = "SYNTAX ERROR";
                    return;
                }
            }
            
            // obtener el resultado
            double resultado;
            switch(operando) {
                case '+':
                    resultado = op1 + op2;
                    break;
                case '-':
                    resultado = op1 - op2;
                    break;
                case '*':
                    resultado = op1 * op2;
                    break;
                case '/':
                    resultado = op1 / op2;
                    break;
                case '?':
                    System.out.println("Error operador desconocido");
            }
            
        }
        else if("C".equals(key)){
            // quita el último caracter de la operacion
            grande = grande.substring(0, grande.length() - 1);
        }
        else if("clear".equals(key)){
            // poner lo que esta escribiendo a 0
            grande = "0";
        }
        else {  
            // números signos o puntos son concatenados
            grande = grande + key;
        }
    }
    
    String getTipo(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/')
            return "operador";
        if(c=='.')
            return "punto";
        if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
            return "numero";
        return "otro";
    }
}

