package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldEndereco;
	private JTextField fieldSalario;
	private JButton buttonCadastrar;
	private JButton buttonAtualizar;
	private JButton buttonRemover;
	private JButton buttonConsultar;
	private JTextField fieldNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Empregado CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][5.00][][78.00][][grow][]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("CPF");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "cell 1 0 3 1,growx");
		fieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "cell 4 0,alignx center");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 5 0 2 1,growx");
		fieldNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 1 1 6 1,growx");
		fieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sal\u00E1rio");
		contentPane.add(lblNewLabel_2, "cell 0 2");
		
		fieldSalario = new JTextField();
		contentPane.add(fieldSalario, "cell 1 2 6 1,growx");
		fieldSalario.setColumns(10);
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(buttonCadastrar, "cell 0 4");
		
		buttonRemover = new JButton("Remover");
		contentPane.add(buttonRemover, "cell 2 4");
		
		buttonConsultar = new JButton("Consultar");
		contentPane.add(buttonConsultar, "cell 3 4");
		
		buttonAtualizar = new JButton("Atualizar");
		contentPane.add(buttonAtualizar, "cell 4 4");
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JTextField getFieldSalario() {
		return fieldSalario;
	}

	public void setFieldSalario(JTextField fieldSalario) {
		this.fieldSalario = fieldSalario;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonAtualizar() {
		return buttonAtualizar;
	}

	public void setButtonAtualizar(JButton buttonAtualizar) {
		this.buttonAtualizar = buttonAtualizar;
	}

	public JButton getButtonRemover() {
		return buttonRemover;
	}

	public void setButtonRemover(JButton buttonRemover) {
		this.buttonRemover = buttonRemover;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}
	
	public void limpaTela()
	{
		fieldCPF.setText("");
		fieldNome.setText("");
		fieldEndereco.setText("");
		fieldSalario.setText("");
	}

}
