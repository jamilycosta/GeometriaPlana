package geometriaplana;

import javax.swing.JOptionPane;

public class Losango extends CalcularArea{
    private double diagonal1;
    private double diagonal2;

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        JOptionPane.showMessageDialog(null, "A área do Losango é " + (this.getDiagonal1() * this.getDiagonal2()) / 2);
        return (this.getDiagonal1() * this.getDiagonal2()) / 2;
    }
    
}