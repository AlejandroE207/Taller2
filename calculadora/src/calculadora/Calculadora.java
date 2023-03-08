/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Calculadora {

    public static void main(String[] args) {
//Se instancia un objeto de la clase ObjetoCalculadora
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase
        calculadora.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Numero 1: ")));
        calculadora.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Numero 2: ")));
        
        if(calculadora.getNumero2()>0 && calculadora.getNumero1()>0){
//Se ejecutan las operaciones
//Suma
//Resta  
//Multiplicacion    
//División
        calculadora.imprimir("El resultado de la suma es: ", calculadora.calcularSuma());
        calculadora.imprimir("El resultado de la resta es: ", calculadora.calcularResta());
        calculadora.imprimir("El resultado de la multiplicacion es: ", calculadora.calcularMultiplicacion());
        calculadora.imprimir("El resultado de la division es: ", calculadora.calcularDivision());
        }
        
    }
}
