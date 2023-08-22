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

public class TelaContato extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContato frame = new TelaContato();
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
	public TelaContato() {
		setBounds(100, 100, 603, 361);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblContatos = new JLabel("Contatos");
		lblContatos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContatos.setBounds(256, 11, 100, 14);
		panel.add(lblContatos);
		
		JLabel lbTexto1 = new JLabel("Entre em contato com o seu professor orientador:");
		lbTexto1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTexto1.setVerticalAlignment(SwingConstants.TOP);
		lbTexto1.setHorizontalAlignment(SwingConstants.LEFT);
		lbTexto1.setBounds(98, 36, 398, 21);
		panel.add(lbTexto1);
		
		textField = new JTextField();
		textField.setBounds(98, 60, 398, 86);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(407, 150, 89, 23);
		panel.add(btnEnviar);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(98, 202, 398, 86);
		panel.add(textField_1);
		
		JButton btnEnviar_1 = new JButton("Enviar");
		btnEnviar_1.setBounds(407, 292, 89, 23);
		panel.add(btnEnviar_1);
		
		JLabel lbTexto1_1 = new JLabel("Entre em contato com o seu professor coordenador:");
		lbTexto1_1.setVerticalAlignment(SwingConstants.TOP);
		lbTexto1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbTexto1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbTexto1_1.setBounds(98, 178, 398, 21);
		panel.add(lbTexto1_1);

	}
}
