import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Main {

    // Não funciona ainda

    JPanel windowContent;
    JTextField displayField;
    JButton buttons[];
    JButton buttonPoint;
    JButton buttonAdd;
    JButton buttonEqual;
    JPanel pl;

    Main() {
        windowContent= new JPanel();
        buttons = new JButton[10];

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayField = new JTextField(30);
        windowContent.add("North",displayField);

        for(int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }

        buttonAdd=new JButton("+");
        buttonPoint = new JButton(".");
        buttonEqual=new JButton("=");

        pl = new JPanel ();
        GridLayout gl =new GridLayout(4,3);
        pl.setLayout(gl);

        for(int i = 0; i < 10; i++) {
            pl.add(buttons[i]);
        }
        pl.add(buttonAdd);
        pl.add(buttonPoint);
        pl.add(buttonEqual);


        windowContent.add("Center",pl);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main calc = new Main();
    }
}