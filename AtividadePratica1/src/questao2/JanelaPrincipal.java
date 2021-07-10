package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//ALUNA: Andréia Martins Ferreira
//ATIVIDADE PRÁTICA 1 - POII

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

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
		setTitle("JSplit Task");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		splitPane.setDividerLocation(200);
		
		JPanel painelTexto = new JPanel();
		splitPane.setRightComponent(painelTexto);
		painelTexto.setLayout(new MigLayout("", "[70px][70px]", "[15px][][][][][][]"));
		
		JLabel lblNome = new JLabel("Nome da Imagem: homer.jpg");
		painelTexto.add(lblNome, "cell 0 2,alignx left,aligny top");
		
		JLabel lblLargura = new JLabel("Largura da Imagem: 194");
		painelTexto.add(lblLargura, "cell 0 4,alignx left,aligny top");
		
		JLabel lblAltura = new JLabel("Altura da Imagem: 241");
		painelTexto.add(lblAltura, "cell 0 6");
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JLabel lblImagem = new JLabel(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/homer.jpg")));
		scrollPane.setViewportView(lblImagem);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton buttonSair = new JButton("Sair");
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  System.exit(0);
			}
		});
		panel.add(buttonSair);
	}

}
