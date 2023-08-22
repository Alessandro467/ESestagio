package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		final JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu Registros = new JMenu("Registros");
		menuBar.add(Registros);
		
		JMenuItem mntmDocumentacao = new JMenuItem("Documentação");
		mntmDocumentacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDocumentacao tela = new TelaDocumentacao();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Registros.add(mntmDocumentacao);
		
		JMenuItem mntmVagas = new JMenuItem("Vagas");
		mntmVagas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vagas tela = new Vagas();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Registros.add(mntmVagas);
		
		JMenuItem mntmRelatorios = new JMenuItem("Relatórios");
		mntmRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios tela = new Relatorios();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Registros.add(mntmRelatorios);
		
		JMenuItem mntmEstagio = new JMenuItem("Estágio");
		Registros.add(mntmEstagio);
		
		JMenuItem mntmContato = new JMenuItem("Contato");
		mntmContato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaContato tela = new TelaContato();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Registros.add(mntmContato);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAjuda tela = new TelaAjuda();
				tela.setVisible(true);
				desktopPane.add(tela);
			}
		});
		Registros.add(mntmAjuda);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
	}

}
