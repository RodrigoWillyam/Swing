import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroDeAlunos00 {
    public static void main ( String [] args ) {
        JFrame frame = new JFrame ("Cadastro De Alunos");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        frame.setLayout(null);

        JPanel panel = new JPanel ();

        JLabel label1 = new JLabel ("NOME: ");
        // label1.setFont(new Font("Arial", Font.BOLD,30));
        label1.setBounds(10,10,200,40);
        JTextField textField = new JTextField (20) ;

        JLabel label2 = new JLabel ("CPF: ");
        
        JPasswordField passwordField = new JPasswordField (20) ;
        
        JLabel label3 = new JLabel ("Data de Nascimento: ");
      
        JTextField textField0 = new JTextField (20) ;

        JButton button1 = new JButton ("Logar");
        //button1.setBounds(100, 100, 400, 300);
        JButton button2 = new JButton ("Cancelar");
        //button2.setBounds(100, 100, 400, 300);

        panel.add (label1);
        panel.add (textField);
        panel.add (label2);
        panel.add (passwordField);
        panel.add (label3);
        panel.add (textField0);
        panel.add (button1);
        panel.add (button2);

        frame.setContentPane (panel);

        frame.pack ();
        frame.setVisible (true);
    }
}