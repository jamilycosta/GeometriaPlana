package geometriaplana;

import javax.swing.JOptionPane;

public class Trapezio extends CalcularArea{
    private double base1;
    private double base2;
    private double altura;

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        JOptionPane.showMessageDialog(null, "A área do Trapézio é " + ((this.getBase1() + this.getBase2()) * this.getAltura()) / 2);
        return ((this.getBase1() + this.getBase2()) * this.getAltura()) / 2;
    }
    
}