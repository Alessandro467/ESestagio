package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TelaAjuda extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAjuda frame = new TelaAjuda();
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
	public TelaAjuda() {
		setBounds(100, 100, 603, 361);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblContatos = new JLabel("Ajuda");
		lblContatos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContatos.setBounds(256, 11, 100, 14);
		panel.add(lblContatos);
		
		JButton btnEnviar_1 = new JButton("Enviar");
		btnEnviar_1.setBounds(407, 292, 89, 23);
		panel.add(btnEnviar_1);
		
		JTextArea txtrEsseProgramaFoi = new JTextArea();
		txtrEsseProgramaFoi.setLineWrap(true);
		txtrEsseProgramaFoi.setText("Esse programa foi desenvolvido para gerencia os Estagios. Para entrar em contato com o seu professor orientador ou coordenador acesse o menu superior e clique em Contato, para enviar a documentação necessária selecione Documentação, para enviar relatórios selecione Relatorios e para se canditar a uma vaga de estágio selecione vagas.");
		txtrEsseProgramaFoi.setBounds(63, 58, 466, 203);
		panel.add(txtrEsseProgramaFoi);

	}
}
