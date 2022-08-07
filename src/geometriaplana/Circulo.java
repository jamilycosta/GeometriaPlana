package geometriaplana;

import javax.swing.JOptionPane;

public class Circulo extends CalcularArea{
    private double raio;
    public double pi = 3.1415;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        JOptionPane.showMessageDialog(null, "A área do Círculo é " + pi * Math.pow(this.getRaio(), 2));
        return pi * Math.pow(this.getRaio(), 2);
    }
    
}