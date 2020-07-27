package UI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame{
    private final int WIDTH = 750;
    private final int  HEIGHT = 450;
    private JPanel mainPanel, inputPanel, buttonPanel;
    JLabel resultado;

    public UI(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alto = tamanoPantalla.height;
        int ancho = tamanoPantalla.width;
        this.setSize(1*(ancho/5), 2*(alto/5));
        //setResizable(false);
        resultado = new JLabel("¿?");
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        JLabel s1 = new JLabel("Secuencia 1: ");
        JLabel s2 = new JLabel("Secuencia 2: ");
        JTextField secuence1 = new JTextField();
        JTextField secuence2 = new JTextField();
        JButton botoncito = new JButton("VERIFICAR");
        inputPanel.add(s1);
        inputPanel.add(secuence1);
        inputPanel.add(s2);
        inputPanel.add(secuence2);
        buttonPanel.add(botoncito, BorderLayout.NORTH);
        buttonPanel.add(resultado, Label.CENTER);
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DNA Decoder");
        mainPanel.setFont(new Font("Nuevo",1,20));
        this.setContentPane(mainPanel);
        SwingUtilities.updateComponentTreeUI(mainPanel);

        botoncito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Revise que los campo estén llenos");
                }
            }
        });
    }

    public static void main(String[] args) {
        UI ui = new UI();
    }
}
