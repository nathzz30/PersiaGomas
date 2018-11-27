package Pantallas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PantallaInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textFUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio frame = new PantallaInicio();
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
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblUsuario.setBounds(84, 129, 86, 30);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblContrasea.setBounds(83, 154, 97, 30);
		contentPane.add(lblContrasea);
		
		textFUsuario = new JTextField();
		textFUsuario.setBounds(194, 134, 174, 20);
		contentPane.add(textFUsuario);
		textFUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 159, 174, 20);
		contentPane.add(passwordField);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setBounds(166, 206, 107, 30);
		contentPane.add(btnAcceder);
	}
}
