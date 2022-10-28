package geometriaplana;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaPrincipal extends JanelaSecundaria{
    
    ImageIcon imagem1 = new ImageIcon(getClass().getResource("quadrado.png"));
    JLabel img1 = new JLabel(imagem1);
    ImageIcon imagem2 = new ImageIcon(getClass().getResource("retangulo.png"));
    JLabel img2 = new JLabel(imagem2);
    ImageIcon imagem3 = new ImageIcon(getClass().getResource("trapezio.png"));
    JLabel img3 = new JLabel(imagem3);
    ImageIcon imagem4 = new ImageIcon(getClass().getResource("losango.png"));
    JLabel img4 = new JLabel(imagem4);
    ImageIcon imagem5 = new ImageIcon(getClass().getResource("triangulo.png"));
    JLabel img5 = new JLabel(imagem5);
    ImageIcon imagem6 = new ImageIcon(getClass().getResource("circulo.png"));
    JLabel img6 = new JLabel(imagem6);
    
    JButton b1 = new JButton("QUADRADO");
    JButton b2 = new JButton("RETÂNGULO");
    JButton b3 = new JButton("TRAPÉZIO");
    JButton b4 = new JButton("LOSANGO");
    JButton b5 = new JButton("TRIÂNGULO");
    JButton b6 = new JButton("CÍRCULO");

    JLabel legenda = new JLabel("Clique no botão correspondente à 'FORMA");
    JLabel legenda2 = new JLabel(" GEOMÉTRICA' desejada:");
    
    public JanelaPrincipal() {
        JFrame janela = new JFrame();
        janela.setTitle("Geometria Plana");
        janela.setSize(500, 550);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        
        janela.setLayout(new GridLayout(7, 2));
        
        janela.add(legenda);
        janela.add(legenda2);
        
        janela.add(img1);
        janela.add(img2);
        
        janela.add(b1);
        b1.addActionListener((ActionEvent ae) -> {
            NovaJanelaB1();
        });
        janela.add(b2);
        b2.addActionListener((ActionEvent ae) -> {
            NovaJanelaB2();
        });
        
        janela.add(img3);
        janela.add(img4);
        
        janela.add(b3);
        b3.addActionListener((ActionEvent ae) -> {
            NovaJanelaB3();
        });
        janela.add(b4);
        b4.addActionListener((ActionEvent ae) -> {
            NovaJanelaB4();
        });
        
        janela.add(img5);
        janela.add(img6);
        
        janela.add(b5);
        b5.addActionListener((ActionEvent ae) -> {
            NovaJanelaB5(); 
        });
        janela.add(b6);
        b6.addActionListener((ActionEvent ae) -> {
            NovaJanelaB6();
        });
        
        janela.setVisible(true);
        
    }

}
