package questao3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import questao1.JanelaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//ALUNA: Andréia Martins Ferreira
//ATIVIDADE PRÁTICA 1 - POII

public class JanelaTabbed extends JInternalFrame {
	
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textRG;
	private JTextField textEmail;
	private JTextField textcpf;
	private JTextField textNascimento;
	private JTextField textSintomas;
	private JTextField textLab;
	private JTextField textLaudo;
	private JTextField textTelefone;



	/**
	 * Create the frame.
	 */
	public JanelaTabbed() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setClosed(true);
		setTitle("Prontuário Médico");
		setBounds(100, 100, 598, 350);
		setClosable(true);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/exit.png")));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel tabDados = new JPanel();
		tabDados.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("Dados pessoais", new ImageIcon(JanelaPrincipal.class.getResource("/figuras/informacao.png")), tabDados, null);
		tabbedPane.setForegroundAt(0, new Color(0, 0, 0));
		tabbedPane.setBackgroundAt(0, new Color(70, 130, 180));
		tabDados.setLayout(new MigLayout("", "[70.00px][100.00,grow][35.00px,grow][121.00,grow]", "[19px][][][][][]"));
		
		JLabel lblNome = new JLabel("Nome:");
		tabDados.add(lblNome, "cell 0 0,alignx left,aligny center");
		
		textNome = new JTextField();
		tabDados.add(textNome, "cell 1 0 3 1,growx,aligny top");
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		tabDados.add(lblCpf, "cell 0 1,alignx left");
		
		textcpf = new JTextField();
		tabDados.add(textcpf, "cell 1 1,growx");
		textcpf.setColumns(10);
		
		JLabel lblRG = new JLabel("RG:");
		tabDados.add(lblRG, "cell 2 1");
		
		textRG = new JTextField();
		tabDados.add(textRG, "cell 3 1,growx");
		textRG.setColumns(10);
		
		JLabel lblemail = new JLabel("E-mail:");
		tabDados.add(lblemail, "cell 0 2,alignx left");
		
		textEmail = new JTextField();
		tabDados.add(textEmail, "flowx,cell 1 2,growx");
		textEmail.setColumns(10);
		
		textTelefone = new JTextField();
		tabDados.add(textTelefone, "cell 3 2,growx");
		textTelefone.setColumns(10);
		
		JLabel lblNascimento = new JLabel("Nascimento:");
		tabDados.add(lblNascimento, "cell 0 3,alignx trailing");
		
		textNascimento = new JTextField();
		tabDados.add(textNascimento, "cell 1 3,alignx left");
		textNascimento.setColumns(10);
		
		JButton btnCadastro = new JButton("Cadastrar Paciente");
		btnCadastro.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		tabDados.add(btnCadastro, "cell 1 5");
		
		JButton btnCancelar = new JButton("Cancelar Cadastro");
		btnCancelar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/clean.png")));
		tabDados.add(btnCancelar, "cell 3 5");
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		tabDados.add(lblTelefone, "cell 2 2,alignx trailing");
		
		JPanel tabAnamnese = new JPanel();
		tabAnamnese.setBackground(new Color(144, 238, 144));
		tabbedPane.addTab("Anamnese", new ImageIcon(JanelaPrincipal.class.getResource("/figuras/alerta.png")), tabAnamnese, null);
		tabbedPane.setBackgroundAt(1, new Color(0, 128, 0));
		tabAnamnese.setLayout(new MigLayout("", "[512.00px,grow][22.00px]", "[19px][103.00,grow][][98.00,grow][][]"));
		
		JLabel lblQueixa = new JLabel("Queixa");
		tabAnamnese.add(lblQueixa, "cell 0 0,alignx left,aligny center");
		
		JTextArea textAreaQueixa = new JTextArea();
		tabAnamnese.add(textAreaQueixa, "cell 0 1 2 1,grow");
		
		JLabel lblSintomas = new JLabel("Sintomas");
		tabAnamnese.add(lblSintomas, "cell 0 2");
		
		textSintomas = new JTextField();
		tabAnamnese.add(textSintomas, "cell 0 3 2 1,grow");
		textSintomas.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		tabAnamnese.add(btnCadastrar, "flowx,cell 0 4,growx");
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/clean.png")));
		tabAnamnese.add(btnLimpar, "cell 0 4,growx");
		
		JPanel tabExames = new JPanel();
		tabExames.setBackground(new Color(216, 191, 216));
		tabbedPane.addTab("Exames", new ImageIcon(JanelaPrincipal.class.getResource("/figuras/open.png")), tabExames, null);
		tabbedPane.setBackgroundAt(2, new Color(138, 43, 226));
		tabExames.setLayout(new MigLayout("", "[231.00px,grow][100px:114px][1px]", "[19px][][grow]"));
		
		JLabel lblLab = new JLabel("Laboratório:");
		tabExames.add(lblLab, "flowx,cell 0 0,alignx left,aligny center");
		
		JLabel lblExames = new JLabel("Exames Necessários");
		tabExames.add(lblExames, "cell 0 1,alignx left,aligny center");
		
		JTextArea textExames = new JTextArea();
		tabExames.add(textExames, "cell 0 2,grow");
		
		textLab = new JTextField();
		tabExames.add(textLab, "cell 0 0,growx,aligny top");
		textLab.setColumns(10);
		
		JButton btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		tabExames.add(btnSolicitar, "flowx,cell 1 2,growx");
		
		JPanel tabTratamento = new JPanel();
		tabTratamento.setBackground(new Color(255, 228, 225));
		tabbedPane.addTab("Tratamento", new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")), tabTratamento, null);
		tabbedPane.setBackgroundAt(3, new Color(255, 0, 255));
		tabTratamento.setLayout(new MigLayout("", "[100px:116.00,grow][147.00][393.00]", "[][][][grow][]"));
		
		JLabel lblLaudo = new JLabel("Laudo");
		tabTratamento.add(lblLaudo, "cell 0 0,alignx left");
		
		textLaudo = new JTextField();
		tabTratamento.add(textLaudo, "cell 1 0 2 1,growx");
		textLaudo.setColumns(10);
		
		JLabel lblTratamento = new JLabel("Receita Médica");
		tabTratamento.add(lblTratamento, "cell 0 1");
		
		JTextArea textReceita = new JTextArea();
		tabTratamento.add(textReceita, "cell 0 2 3 2,grow");
		
		JButton btnFinalizar = new JButton("Finalizar Cadastro");
		btnFinalizar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/ok1.png")));
		tabTratamento.add(btnFinalizar, "cell 0 4 2 1,grow");
		
		JButton btnLImpar = new JButton("Limpar");
		btnLImpar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/clean.png")));
		tabTratamento.add(btnLImpar, "flowx,cell 2 4,grow");
		
		JButton btnCancelarCadastro = new JButton("Cancelar Cadastro");
		btnCancelarCadastro.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/exit.png")));
		tabTratamento.add(btnCancelarCadastro, "cell 2 4,growy");
	}
}