package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TelaVagas extends JInternalFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVagas frame = new TelaVagas();
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
	public TelaVagas() {
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblIntituicao1 = new JLabel("Instituição 1");
		lblIntituicao1.setBounds(41, 86, 101, 14);
		panel.add(lblIntituicao1);
		
		JLabel lblVaga = new JLabel("Título da Vaga");
		lblVaga.setBounds(41, 111, 101, 14);
		panel.add(lblVaga);
		
		textField = new JTextField();
		textField.setBounds(160, 108, 184, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSelecionar1 = new JButton("Salvar");
		btnSelecionar1.setBounds(255, 139, 89, 23);
		panel.add(btnSelecionar1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 82, 184, 22);
		panel.add(comboBox);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(160, 139, 89, 23);
		panel.add(btnCancelar);

	}
}
