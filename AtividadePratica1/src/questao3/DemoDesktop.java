package questao3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//ALUNA: Andréia Martins Ferreira
//ATIVIDADE PRÁTICA 1 - POOII
public class DemoDesktop extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoDesktop frame = new DemoDesktop();
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
	public DemoDesktop() {
		setTitle("JInternalFrame Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Adicionar");
		menuBar.add(mnNewMenu);
		
		JMenuItem itemSplit = new JMenuItem("JSplitPaneDemo");
		itemSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame split = new JanelaSplit();
				split.setBounds(80, 80, 450, 300);
				split.setVisible(true);
				split.setClosable(true);
				desktopPane.add(split);
				
				
			}
		});
		mnNewMenu.add(itemSplit);
		
		JMenuItem itemTabbed = new JMenuItem("JTabbedDemo");
		itemTabbed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame tabbed = new JanelaTabbed();
				tabbed.setBounds(50, 50, 598, 350);
				tabbed.setVisible(true);
				tabbed.setClosable(true);
				desktopPane.add(tabbed);
			}
		});
		
		mnNewMenu.add(itemTabbed);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
		
		
}
