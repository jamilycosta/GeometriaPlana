package geometriaplana;

import javax.swing.JOptionPane;


public class Quadrado extends CalcularArea{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        JOptionPane.showMessageDialog(null, "A área do Quadrado é " + Math.pow(this.getLado(), 2));
        return Math.pow(this.getLado(), 2);
    }
    
}