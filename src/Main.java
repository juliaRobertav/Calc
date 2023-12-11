import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main () {
        // ta funfando

        super("Calculadora de Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(-484, 49, 990, 1015);
        getContentPane().setBackground(new Color(217,217,243));

//        ImageIcon fundo = new ImageIcon("src/Imagens/fundo.png");
//        JLabel tela_calc = new JLabel(fundo);
//        tela_calc.setBounds(0, 182, 916, 505);
//        add(tela_calc);

        JLabel titulo = new JLabel();
        titulo.setBounds(250, 100, 600, 200);
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setText("Calcule sua Média");
        titulo.setForeground(new Color(50,153,204));
        add(titulo);

        JTextField nota1 = new JTextField();
        nota1.setBackground(new Color(192,217,217));
        nota1.setBounds(80, 400, 273, 50);
        nota1.setBorder(nota1.getBorder());
        nota1.setText("Nota 1");
        add(nota1);

        JTextField nota2 = new JTextField();
        nota2.setBackground(new Color(192,217,217));
        nota2.setBounds(500, 400, 273, 50);
        nota2.setBorder(nota2.getBorder());
        nota2.setText("Nota 2");
        add(nota2);

        JTextField nota3 = new JTextField();
        nota3.setBackground(new Color(192,217,217));
        nota3.setBounds(80, 550, 273, 50);
        nota3.setBorder(nota3.getBorder());
        nota3.setText("Nota 3");
        add(nota3);

        JTextField nota4 = new JTextField();
        nota4.setBackground(new Color(192,217,217));
        nota4.setBounds(500, 550, 273, 50);
        nota4.setBorder(nota4.getBorder());
        nota4.setText("Nota 4");
        add(nota4);


        JButton calcular = new JButton();
        calcular.setBackground(new Color(112,219,219));
        calcular.setBounds(250, 700, 273, 50);
        calcular.setBorder(calcular.getBorder());
        calcular.setText("CALCULAR");
        add(calcular);

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double n1 = Double.parseDouble(nota1.getText());
                double n2 = Double.parseDouble(nota2.getText());
                double n3 = Double.parseDouble(nota3.getText());
                double n4 = Double.parseDouble(nota4.getText());
                double media = (n1 + n2 + n3 + n4) / 4;

                JOptionPane.showMessageDialog(null, "Média " + media, ".", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Média = " + media);
                System.exit(0);
            }
        });

        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Main();


    }

}
