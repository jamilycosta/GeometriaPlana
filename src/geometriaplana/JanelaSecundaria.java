package geometriaplana;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaSecundaria {
    
    Quadrado quadrado = new Quadrado();
    Retangulo retangulo = new Retangulo();
    Trapezio trapezio = new Trapezio();
    Losango losango = new Losango();
    Triangulo triangulo = new Triangulo();
    Circulo circulo = new Circulo();
    
    public void NovaJanelaB1() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB1 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor do lado:");
        JTextField lado = new JTextField(15);
        JButton q = new JButton("Calcular");
        
        painelB1.add(legenda);
        painelB1.add(lado);
        painelB1.add(q);
        janela2.add(painelB1);
        
        q.addActionListener((ActionEvent ae) -> {
            quadrado.setLado(Double.valueOf(lado.getText()));
            quadrado.area();
        });
        
        janela2.setVisible(true);
    }
    
    public void NovaJanelaB2() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB2 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor da base:");
        JTextField base = new JTextField(15);
        JLabel legenda2 = new JLabel("Insira o valor da altura:");
        JTextField altura = new JTextField(15);
        JButton r = new JButton("Calcular");
        
        painelB2.add(legenda);
        painelB2.add(base);
        painelB2.add(legenda2);
        painelB2.add(altura);
        painelB2.add(r);
        janela2.add(painelB2);

        r.addActionListener((ActionEvent ae) -> {
            retangulo.setBase(Double.valueOf(base.getText()));
            retangulo.setAltura(Double.valueOf(altura.getText()));
            retangulo.area();
        });
        
        janela2.setVisible(true);
    }
    
    public void NovaJanelaB3() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB3 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor da base maior:");
        JTextField base1 = new JTextField(15);
        JLabel legenda2 = new JLabel("Insira o valor da base menor:");
        JTextField base2 = new JTextField(15);
        JLabel legenda3 = new JLabel("Insira o valor da altura:");
        JTextField altura = new JTextField(15);
        JButton t = new JButton("Calcular");
        
        painelB3.add(legenda);
        painelB3.add(base1);
        painelB3.add(legenda2);
        painelB3.add(base2);
        painelB3.add(legenda3);
        painelB3.add(altura);
        painelB3.add(t);
        janela2.add(painelB3);
        
        t.addActionListener((ActionEvent ae) -> {
            trapezio.setBase1(Double.valueOf(base1.getText()));
            trapezio.setBase2(Double.valueOf(base2.getText()));
            trapezio.setAltura(Double.valueOf(altura.getText()));
            trapezio.area();
        });
        
        janela2.setVisible(true);
    }
    
    public void NovaJanelaB4() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB4 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor da diagonal maior:");
        JTextField diagonal1 = new JTextField(15);
        JLabel legenda2 = new JLabel("Insira o valor da diagonal menor:");
        JTextField diagonal2 = new JTextField(15);
        JButton l = new JButton("Calcular");
        
        painelB4.add(legenda);
        painelB4.add(diagonal1);
        painelB4.add(legenda2);
        painelB4.add(diagonal2);
        painelB4.add(l);
        janela2.add(painelB4);
        
        l.addActionListener((ActionEvent ae) -> {
            losango.setDiagonal1(Double.valueOf(diagonal1.getText()));
            losango.setDiagonal2(Double.valueOf(diagonal2.getText()));
            losango.area();
        });
        
        janela2.setVisible(true);
    }
    
    public void NovaJanelaB5() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB5 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor da base:");
        JTextField base = new JTextField(15);
        JLabel legenda2 = new JLabel("Insira o valor da altura:");
        JTextField altura = new JTextField(15);
        JButton t = new JButton("Calcular");
        
        painelB5.add(legenda);
        painelB5.add(base);
        painelB5.add(legenda2);
        painelB5.add(altura);
        painelB5.add(t);
        janela2.add(painelB5);
        
        t.addActionListener((ActionEvent ae) -> {
            triangulo.setBase(Double.valueOf(base.getText()));
            triangulo.setAltura(Double.valueOf(altura.getText()));
            triangulo.area();
        });
        
        janela2.setVisible(true);
    }
    
    public void NovaJanelaB6() {
        JFrame janela2 = new JFrame();
        
        janela2.setTitle("Calcular");
        janela2.setSize(400, 300);
        janela2.setLocationRelativeTo(null);
        
        JPanel painelB6 = new JPanel();
        JLabel legenda = new JLabel("Insira o valor do raio:");
        JTextField raio = new JTextField(15);
        JButton c = new JButton("Calcular");
        
        painelB6.add(legenda);
        painelB6.add(raio);
        painelB6.add(c);
        janela2.add(painelB6);
        
        c.addActionListener((ActionEvent ae) -> {
            circulo.setRaio(Double.valueOf(raio.getText()));
            circulo.area();
        });
        
        janela2.setVisible(true);
    }
}