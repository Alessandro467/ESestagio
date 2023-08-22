package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class TelaEstagio extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstagio frame = new TelaEstagio();
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
	public TelaEstagio() {
		setBounds(100, 100, 603, 361);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Estagio");
		lblTitulo.setBounds(22, 45, 100, 14);
		panel.add(lblTitulo);
		
		JLabel lblDocumento2 = new JLabel("Documento 2");
		lblDocumento2.setBounds(22, 108, 100, 14);
		panel.add(lblDocumento2);
		
		JLabel lblDocumento3 = new JLabel("Documento 3");
		lblDocumento3.setBounds(22, 166, 100, 14);
		panel.add(lblDocumento3);
		
		JLabel lblDocumento4 = new JLabel("Documento 4");
		lblDocumento4.setBounds(22, 227, 100, 14);
		panel.add(lblDocumento4);
		
		JButton btnEnviarDocumento1 = new JButton("Enviar Arquivo");
		btnEnviarDocumento1.setBounds(133, 41, 139, 23);
		panel.add(btnEnviarDocumento1);
		
		JButton btnBaixarTemplate1 = new JButton("Baixar Template");
		btnBaixarTemplate1.setBounds(317, 41, 146, 23);
		panel.add(btnBaixarTemplate1);
		
		JButton btnBaixarTemplate2 = new JButton("Baixar Template");
		btnBaixarTemplate2.setBounds(317, 104, 146, 23);
		panel.add(btnBaixarTemplate2);
		
		JButton btnEnviarDocumento2 = new JButton("Enviar Arquivo");
		btnEnviarDocumento2.setBounds(132, 104, 140, 23);
		panel.add(btnEnviarDocumento2);
		
		JButton btnBaixarTemplate3 = new JButton("Baixar Template");
		btnBaixarTemplate3.setBounds(317, 162, 146, 23);
		panel.add(btnBaixarTemplate3);
		
		JButton btnEnviarDocumento3 = new JButton("Enviar Arquivo");
		btnEnviarDocumento3.setBounds(132, 162, 140, 23);
		panel.add(btnEnviarDocumento3);
		
		JButton btnBaixarTemplate4 = new JButton("Baixar Template");
		btnBaixarTemplate4.setBounds(317, 223, 146, 23);
		panel.add(btnBaixarTemplate4);
		
		JButton btnEnviarDocumento4 = new JButton("Enviar Arquivo");
		btnEnviarDocumento4.setBounds(132, 223, 140, 23);
		panel.add(btnEnviarDocumento4);
		
		JLabel lblNewLabel = new JLabel("Arquivo não carregado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(48, 70, 307, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Arquivo não carregado");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(48, 133, 307, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Arquivo não carregado");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(48, 191, 307, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Arquivo não carregado");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(48, 256, 307, 14);
		panel.add(lblNewLabel_1_2);

	}

}
