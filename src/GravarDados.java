import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Francisco de Assis de Souza Rodrigues. 10/02/2014
 *         www.clubedosgeeks.com.br
 * 
 *         Refer�ncia Bibliografica: Livro Java7 Ensino Did�tico (Sergio
 *         Furgeri).
 */

public class GravarDados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel labelCodigo, labelNome, labelEmail;
	private JButton btnAbrir, btnGravar, btnLimpar;
	private JTextField tfCodigo, tfNome, tfEmail;

	public static void main(String args[]) {
		// Inst�cia do Objeto da Class JFrame.
		JFrame frame = new GravarDados();

		// Permite Fechar a JFrame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Define JFrame Visivel.
		frame.setVisible(true);
	}

	// Construtor da Class.
	public GravarDados() {
		// Chamada dos M�todos.
		inicializarComponentes();
		definirEventos();
	}

	/**
	 * M�todo inicializarComponentes, contem todos os componetes da JFrame.
	 */
	public void inicializarComponentes() {
		// Define T�tulo da JFrame.
		setTitle("Cadastro usando Arquivo de Texto");

		//
		setBounds(250, 50, 350, 160);

		//
		setBackground(new Color(150, 150, 150));

		// Inst�ncia dos objetos JLabel, JButton, JTextField.
		labelCodigo = new JLabel("C�digo");
		labelNome = new JLabel("Nome");
		labelEmail = new JLabel("Email");

		btnAbrir = new JButton("Abrir");
		btnGravar = new JButton("Gravar");
		btnLimpar = new JButton("Limpar");

		tfCodigo = new JTextField();
		tfEmail = new JTextField();
		tfNome = new JTextField();

		//
		setLayout(null);

		// Coordenadas das posi��es dos Componentes JLabel, JButton, JTextField.
		labelCodigo.setBounds(10, 15, 50, 20);
		labelNome.setBounds(10, 40, 45, 20);
		labelEmail.setBounds(10, 65, 45, 20);

		btnAbrir.setBounds(70, 100, 75, 20);
		btnGravar.setBounds(155, 100, 75, 20);
		btnLimpar.setBounds(240, 100, 75, 20);

		tfCodigo.setBounds(70, 15, 55, 20);
		tfNome.setBounds(70, 40, 255, 20);
		tfEmail.setBounds(70, 65, 255, 20);

		// Adiciona Componentes JLabel, JButton, JTextField, a JFrame.
		add(labelCodigo);
		add(labelNome);
		add(labelEmail);

		add(btnAbrir);
		add(btnGravar);
		add(btnLimpar);

		add(tfCodigo);
		add(tfEmail);
		add(tfNome);
	}

	/**
	 * Define Eventos que ser� executado por cada componete JButton.
	 */
	public void definirEventos() {
		// Evento do Bot�o Limpar.
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Limpa todos os Campos.
				tfCodigo.setText("");
				tfNome.setText("");
				tfEmail.setText("");
			}
		});

		// Evento do Bot�o Gravar.
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Condi��o, verifica se os campo est�o vazios.
				if (tfCodigo.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null,
							"O C�digo n�o pode est� vazio!");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					tfCodigo.requestFocus();

				} else if (tfNome.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null,
							"O Nome n�o pode est� vazio!");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					tfNome.requestFocus();

				} else if (tfEmail.getText().equals("")) {
					// Exibe caixa de Dialogo.
					JOptionPane.showMessageDialog(null, "");

					// Fornece o foco ao cursor da caixa de Texto
					// correspondente.
					tfEmail.requestFocus();

				} else {
					// Tratamento de Erros.
					try {
						// Inst�ncia de um Objeto da Class Java(PrintWriter
						// "para Grava��o do Arquivo").
						PrintWriter out = new PrintWriter(tfCodigo.getText()
								+ ".txt");// Define o extens�o do arquivo que
											// deseja criar.

						// Captura o Texto dos JTextField.
						out.println(tfCodigo.getText());
						out.println(tfNome.getText());
						out.println(tfEmail.getText());
						
						//testar limpar dados
						tfCodigo.setText("");
						tfNome.setText("");
						tfEmail.setText("");

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
							"Infome o C�digo a abrir:");

					// Inst�ncia de um Objeto da Class java(BufferedReader
					// "Para Leitura do Arquivo"), que Inst�ncia um Objeto da
					// Class java(FileReader) referenciando o arquivo a ser
					// aberto.
					BufferedReader br = new BufferedReader(new FileReader(
							arquivo + ".txt"));

					// Ler o conte�do do arquivo e exibe nos JTextField.
					tfCodigo.setText(br.readLine());
					tfNome.setText(br.readLine());
					tfEmail.setText(br.readLine());

				} catch (IOException Erro) {
					JOptionPane.showMessageDialog(null,	Erro);

				}
			}
		});

	}
}