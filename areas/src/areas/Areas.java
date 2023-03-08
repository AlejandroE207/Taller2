/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areas;

import javax.swing.JOptionPane;

public class Areas {

    public static void main(String[] args) {
        double base = 0.0;
        double altura = 0.0;
        double radio = 0.0;
        double areaCuadrado = 0.0;
        double areaCirculo = 0.0;
        double pi = 3.1416;
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura "));
        areaCuadrado = base * altura;
        areaCirculo = pi * (radio * radio);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + areaCuadrado);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + areaCirculo);
    }
}
