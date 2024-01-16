import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField text_1;
    private JTextField text_2;
    private JTextField text_3;
    JPanel panel_main;
    private JLabel tittle_1;
    private JLabel tittle_2;
    private JLabel tittle_3;
    private JButton okButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button5;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;

    public form1() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                /*String n1;
                n1 = text_1.getText();
                String n2 = text_2.getText();
                int resultado, numero_1, numero_2;
                numero_1 = Integer.parseInt(n1);
                numero_2 = Integer.parseInt(n2);
                resultado = numero_1 + numero_2;
                String r3;
                r3 = Integer.toString(resultado);*/

                text_3.setText("Resultado: "+Integer.toString(Integer.parseInt(text_1.getText())+Integer.parseInt(text_2.getText())));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_3.setText("Resultado: "+Integer.toString(Integer.parseInt(text_1.getText())-Integer.parseInt(text_2.getText())));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_3.setText("Resultado: "+Integer.toString(Integer.parseInt(text_1.getText())*Integer.parseInt(text_2.getText())));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    text_3.setText("Resultado: "+Integer.toString(Integer.parseInt(text_1.getText())/Integer.parseInt(text_2.getText())));
                } catch (ArithmeticException ex) {
                    System.out.println("Ingrese un valor diferente de 0");
                }
            }
        });
    }
}
