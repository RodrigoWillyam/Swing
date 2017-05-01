import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CadastroDeAlunos extends JFrame {

	private static final long serialVersionUID = 1L;
	//private JLabel labelCodigo, labelNome, labelEmail;
	//private JButton btnAbrir, btnGravar, btnLimpar;
	//private JTextField tfCodigo, tfNome, tfEmail;
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
	private JButton btnLimpar;
	private JButton btnAbrir;
	private JButton btnGravar;


	public static void main(String args[]) {
		// Inst�cia do Objeto da Class JFrame.
		JFrame frame = new CadastroDeAlunos();

		// Permite Fechar a JFrame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Define JFrame Visivel.
		frame.setVisible(true);
	}

	// Construtor da Class.
	public CadastroDeAlunos() {
		// Chamada dos M�todos.
		inicializarComponentes();
		definirEventos();
	}

	/**
	 * M�todo inicializarComponentes, contem todos os componetes da JFrame.
	 */
	public void inicializarComponentes() {
		// Define T�tulo da JFrame.
		//setTitle("Cadastro usando Arquivo de Texto");

		//
		//setBounds(250, 50, 350, 160);

		//
		//setBackground(new Color(150, 150, 150));
		setTitle("Cadastro De Alunos");
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
		textField.setBounds(70, 41, 350, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 72, 350, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("SEXO :");
		lblNewLabel.setBounds(10, 115, 50, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox <String> comboBox = new JComboBox();
		comboBox.setBounds(70, 115, 86, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		//comboBox.setSelectedIndex(1);
		//System.out.println(comboBox.getSelectedIndex());
		
		lblDataDeNascimento = new JLabel("DATA DE NASCIMENTO :");
		lblDataDeNascimento.setBounds(158, 115, 145, 20);
		contentPane.add(lblDataDeNascimento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 115, 115, 20);
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
		lblTelefone.setBounds(10, 250, 70, 20);
		contentPane.add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(80, 250, 125, 20);
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
		lblTurma.setBounds(215, 326, 58, 20);
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
		comboBox_3.addItem("n�o");
		
		lblQuantos = new JLabel("QUANTOS :");
		lblQuantos.setBounds(215, 369, 80, 20);
		contentPane.add(lblQuantos);
		
		textField_8 = new JTextField();
		textField_8.setBounds(305, 369, 115, 20);
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
		
		btnAbrir = new JButton("ABRIR");
		btnAbrir.setBounds(10, 431, 89, 23);
		contentPane.add(btnAbrir);
		
		btnGravar = new JButton("GRAVAR");
		btnGravar.setBounds(158, 431, 89, 23);
		contentPane.add(btnGravar);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(310, 431, 89, 23);
		contentPane.add(btnLimpar);

		// Inst�ncia dos objetos JLabel, JButton, JTextField.
		//labelCodigo = new JLabel("C�digo");
		//labelNome = new JLabel("Nome");
		//labelEmail = new JLabel("Email");

		//btnAbrir = new JButton("Abrir");
		//btnGravar = new JButton("Gravar");
		//btnLimpar = new JButton("Limpar");

		//tfCodigo = new JTextField();
		//tfEmail = new JTextField();
		//tfNome = new JTextField();

		//
		//setLayout(null);

		// Coordenadas das posi��es dos Componentes JLabel, JButton, JTextField.
		//labelCodigo.setBounds(10, 15, 50, 20);
		//labelNome.setBounds(10, 40, 45, 20);
		//labelEmail.setBounds(10, 65, 45, 20);

		//btnAbrir.setBounds(70, 100, 75, 20);
		//btnGravar.setBounds(155, 100, 75, 20);
		//btnLimpar.setBounds(240, 100, 75, 20);

		//tfCodigo.setBounds(70, 15, 55, 20);
		//tfNome.setBounds(70, 40, 255, 20);
		//tfEmail.setBounds(70, 65, 255, 20);

		// Adiciona Componentes JLabel, JButton, JTextField, a JFrame.
		//add(labelCodigo);
		//add(labelNome);
		//add(labelEmail);

		//add(btnAbrir);
		//add(btnGravar);
		//add(btnLimpar);

		//add(tfCodigo);
		//add(tfEmail);
		//add(tfNome);
	}

	/**
	 * Define Eventos que ser� executado por cada componete JButton.
	 */
	public void definirEventos() {
		// Evento do Bot�o Limpar.
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Limpa todos os Campos.
				//tfCodigo.setText("");
				//tfNome.setText("");
				//tfEmail.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
			}
		});

		// Evento do Bot�o Gravar.
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Condi��o, verifica se os campo est�o vazios.
				if (textField.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null,
							"O Nome n�o pode est� vazio!");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					textField.requestFocus();

				} else if (textField_1.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null,
							"O Cpf n�o pode est� vazio!");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					textField_1.requestFocus();

				} else if (textField_6.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null, 
							"O Telefone n�o pode est� vazio!");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					textField_6.requestFocus();

				} else {
					// Tratamento de Erros.
					try {
						// Inst�ncia de um Objeto da Class Java(PrintWriter
						// "para Grava��o do Arquivo").
						PrintWriter out = new PrintWriter(textField.getText()
								+ ".txt");// Define o extens�o do arquivo que
											// deseja criar.

						// Captura o Texto dos JTextField.
						//out.println(tfCodigo.getText());
						//out.println(tfNome.getText());
						//out.println(tfEmail.getText());
						out.println(textField.getText());
						out.println(textField_1.getText());
						out.println(textField_2.getText());
						out.println(textField_3.getText());
						out.println(textField_4.getText());
						out.println(textField_5.getText());
						out.println(textField_6.getText());
						out.println(textField_7.getText());
						out.println(textField_8.getText());
						out.println(textField_9.getText());
						out.println(textField_10.getText());
						
						//testar limpar dados
						//tfCodigo.setText("");
						//tfNome.setText("");
						//tfEmail.setText("");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						textField_10.setText("");

						// Fecha Conex�o.
						out.close();

						// Exibe caixa de Dialogo.
						JOptionPane.showMessageDialog(null,
								"Arquivo Gravado com Sucesso!");

					} catch (IOException Erro) {
						JOptionPane.showMessageDialog(null,
								"Erro ao Gravar no Arquivo" + Erro);
					}
				}
			}
		});

		// Evento do Bot�o Abrir.
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tratamento de Erros
				try {
					// Solicita ao usu�rio que informe qual o arquivo deseja
					// abrir.
					String arquivo = JOptionPane.showInputDialog(null,
							"Infome o Nome do aluno a exibir:");

					// Inst�ncia de um Objeto da Class java(BufferedReader
					// "Para Leitura do Arquivo"), que Inst�ncia um Objeto da
					// Class java(FileReader) referenciando o arquivo a ser
					// aberto.
					BufferedReader br = new BufferedReader(new FileReader(
							arquivo + ".txt"));

					// Ler o conte�do do arquivo e exibe nos JTextField.
					//tfCodigo.setText(br.readLine());
					//tfNome.setText(br.readLine());
					//tfEmail.setText(br.readLine());
					textField.setText (br.readLine());
					textField_1.setText (br.readLine());
					textField_2.setText (br.readLine());
					textField_3.setText (br.readLine());
					textField_4.setText (br.readLine());
					textField_5.setText (br.readLine());
					textField_6.setText (br.readLine());
					textField_7.setText (br.readLine());
					textField_8.setText (br.readLine());
					textField_9.setText (br.readLine());
					textField_10.setText (br.readLine());

				} catch (IOException Erro) {
					JOptionPane.showMessageDialog(null,	Erro);

				}
			}
		});

	}
}