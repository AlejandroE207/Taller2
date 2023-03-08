
package solucion;

import javax.swing.JOptionPane;

public class Figura {
    private double base;
    private double altura;
    private double radio;
    private double pi=3.1416;
    private double areaCuad;
    private double areaCirc;

    
    
    public void lecturaDatos(){
        this.base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        this.radio = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite el radio"));
        this.altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la altura "));
    }
    public void calcularAreaCuadrado(){
        areaCuad = this.base * this.altura;
    }
    public void calcularAreaCirculo(){
        areaCirc = this.pi * (this.radio * this.radio);
    }
    
    public void mostrarAreas(){
        JOptionPane.showMessageDialog(null,"El área del cuadrado es: "+areaCuad);
        JOptionPane.showMessageDialog(null,"El área de la circunferencia es: "+areaCirc);
        
    }
    
    
}
