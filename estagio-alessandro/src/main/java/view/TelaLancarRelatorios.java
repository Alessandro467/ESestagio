package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class TelaLancarRelatorios extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLancarRelatorios frame = new TelaLancarRelatorios();
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
	public TelaLancarRelatorios() {
		setBounds(100, 100, 603, 361);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblRelatorio1 = new JLabel("Relatório 1");
		lblRelatorio1.setBounds(22, 45, 100, 14);
		panel.add(lblRelatorio1);
		
		JLabel lblRelatorio2 = new JLabel("Relatório 2");
		lblRelatorio2.setBounds(22, 108, 100, 14);
		panel.add(lblRelatorio2);
		
		JLabel lblRelatorio3 = new JLabel("Relatório 3"); 
		lblRelatorio3.setBounds(22, 166, 100, 14);
		panel.add(lblRelatorio3);
		
		JLabel lblRelatorio4 = new JLabel("Relatório 4");
		lblRelatorio4.setBounds(22, 227, 100, 14);
		panel.add(lblRelatorio4);
		
		JButton btnEnviarRelatorio1 = new JButton("Enviar Arquivo");
		btnEnviarRelatorio1.setBounds(133, 41, 139, 23);
		panel.add(btnEnviarRelatorio1);
		
		JButton btnEnviarRelatorio2 = new JButton("Enviar Arquivo");
		btnEnviarRelatorio2.setBounds(132, 104, 140, 23);
		panel.add(btnEnviarRelatorio2);
		
		JButton btnEnviarRelatorio3 = new JButton("Enviar Arquivo");
		btnEnviarRelatorio3.setBounds(132, 162, 140, 23);
		panel.add(btnEnviarRelatorio3);
		
		JButton btnEnviarRelatorio4 = new JButton("Enviar Arquivo");
		btnEnviarRelatorio4.setBounds(132, 223, 140, 23);
		panel.add(btnEnviarRelatorio4);
		
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
