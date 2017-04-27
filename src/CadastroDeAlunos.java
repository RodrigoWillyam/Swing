import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroDeAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblDataDeNascimento;
	private JTextField textField_2;
	private JLabel lblEstadoCivil;
	private JComboBox comboBox_1;
	private JLabel lblEndereo;
	private JTextField textField_3;
	private JLabel lblBairro;
	private JTextField textField_4;
	private JLabel lblCidade;
	private JTextField textField_5;
	private JLabel lblTelefone;
	private JTextField textField_6;
	private JLabel lblDadosDoCurso;
	private JLabel lblCurso;
	private JTextField textField_7;
	private JLabel lblTurma;
	private JComboBox comboBox_2;
	private JLabel lblJFezCurso;
	private JComboBox comboBox_3;
	private JLabel lblQuantos;
	private JTextField textField_8;
	private JLabel lblQual;
	private JTextField textField_9;
	private JLabel lblQuando;
	private JTextField textField_10;
	private JLabel lblDadosPessoais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeAlunos frame = new CadastroDeAlunos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroDeAlunos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME :");
		lblNome.setBounds(10, 41, 50, 20);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setBounds(10, 72, 50, 20);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(70, 72, 350, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 41, 350, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("SEXO :");
		lblNewLabel.setBounds(10, 115, 50, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox <String> comboBox = new JComboBox();
		comboBox.setBounds(70, 115, 80, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		//comboBox.setSelectedIndex(1);
		//System.out.println(comboBox.getSelectedIndex());
		
		lblDataDeNascimento = new JLabel("DATA DE NASCIMENTO :");
		lblDataDeNascimento.setBounds(158, 115, 130, 20);
		contentPane.add(lblDataDeNascimento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(295, 115, 125, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblEstadoCivil = new JLabel("ESTADO CIVIL :");
		lblEstadoCivil.setBounds(10, 146, 97, 20);
		contentPane.add(lblEstadoCivil);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(158, 146, 115, 20);
		contentPane.add(comboBox_1);
		comboBox_1.addItem("Solteiro");
		comboBox_1.addItem("Comprometido");
		comboBox_1.addItem("Casado");
		comboBox_1.addItem("Divorciado");
		
		lblEndereo = new JLabel("ENDERE\u00C7O :");
		lblEndereo.setBounds(10, 177, 97, 20);
		contentPane.add(lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 177, 262, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblBairro = new JLabel("BAIRRO :");
		lblBairro.setBounds(10, 219, 60, 20);
		contentPane.add(lblBairro);
		
		textField_4 = new JTextField();
		textField_4.setBounds(70, 219, 135, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblCidade = new JLabel("CIDADE :");
		lblCidade.setBounds(215, 250, 58, 20);
		contentPane.add(lblCidade);
		
		textField_5 = new JTextField();
		textField_5.setBounds(275, 250, 145, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblTelefone = new JLabel("TELEFONE :");
		lblTelefone.setBounds(10, 250, 60, 20);
		contentPane.add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(70, 250, 135, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblDadosDoCurso = new JLabel("DADOS DO CURSO");
		lblDadosDoCurso.setBounds(158, 284, 130, 20);
		contentPane.add(lblDadosDoCurso);
		
		lblCurso = new JLabel("CURSO :");
		lblCurso.setBounds(8, 326, 62, 20);
		contentPane.add(lblCurso);
		
		textField_7 = new JTextField();
		textField_7.setBounds(70, 326, 135, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblTurma = new JLabel("TURMA :");
		lblTurma.setBounds(227, 326, 46, 20);
		contentPane.add(lblTurma);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(275, 326, 145, 20);
		contentPane.add(comboBox_2);
		comboBox_2.addItem("11.1");
		comboBox_2.addItem("11.2");
		comboBox_2.addItem("11.3");
		
		lblJFezCurso = new JLabel("J\u00C1 FEZ CURSO NA UTD ? :");
		lblJFezCurso.setBounds(10, 369, 195, 20);
		contentPane.add(lblJFezCurso);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(158, 369, 47, 20);
		contentPane.add(comboBox_3);
		comboBox_3.addItem("sim");
		comboBox_3.addItem("não");
		
		lblQuantos = new JLabel("QUANTOS :");
		lblQuantos.setBounds(215, 369, 68, 20);
		contentPane.add(lblQuantos);
		
		textField_8 = new JTextField();
		textField_8.setBounds(275, 369, 145, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblQual = new JLabel("QUAL :");
		lblQual.setBounds(10, 400, 46, 20);
		contentPane.add(lblQual);
		
		textField_9 = new JTextField();
		textField_9.setBounds(70, 400, 203, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		lblQuando = new JLabel("QUANDO :");
		lblQuando.setBounds(275, 400, 60, 20);
		contentPane.add(lblQuando);
		
		textField_10 = new JTextField();
		textField_10.setBounds(334, 400, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		lblDadosPessoais = new JLabel("DADOS PESSOAIS :");
		lblDadosPessoais.setBounds(158, 10, 115, 20);
		contentPane.add(lblDadosPessoais);
	}
}
