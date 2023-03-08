/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

public class ObjetoCalculadora {
//DECLARACION DE LAS VARIABLES O ATRIBUTOS DE LA CLASE

    private double numero1;
    private double numero2;
//LLAMA E INICIALIZA EL CONSTRUCTOR DE LA CLASE PADRE (OBJECT)

    public ObjetoCalculadora() {
        super();
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
         if(numero1>0)this.numero1 = numero1;
        else{
            JOptionPane.showMessageDialog(null, "HAS DIGITADO EL NUMERO 0, NO SE PODRA HACER OPERACIONES");
        }
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        if(numero2>0)this.numero2 = numero2;
        else{
            JOptionPane.showMessageDialog(null, "HAS DIGITADO EL NUMERO 0, NO SE PODRA HACER OPERACIONES");
        }
        
    }

//CREACION DE METODO DE CALCULAR SUMA
    public double calcularSuma() {
        return (numero1 + numero2);
    }

    public double calcularResta() {
        return (numero1 - numero2);
    }

    public double calcularMultiplicacion() {
        return (numero1 * numero2);
    }

    public double calcularDivision() {
        double resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return (resultado);
    }
    
    public void imprimir(String msg, double valor){
        String val = Double.toString(valor);
        JOptionPane.showMessageDialog(null,msg+" "+val);
    }
}

