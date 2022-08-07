package geometriaplana;

import javax.swing.JOptionPane;

public class Triangulo extends CalcularArea{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        JOptionPane.showMessageDialog(null, "A área do Triângulo é " + (this.getBase() * this.getAltura()) / 2);
        return (this.getBase() * this.getAltura()) / 2;
    }
    
}