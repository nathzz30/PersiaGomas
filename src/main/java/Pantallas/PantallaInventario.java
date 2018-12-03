package Pantallas;


import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PantallaInventario extends JDialog {

	private JPanel contentPane;
	private JTable table;
	private JTextField textFBusqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInventario dialog = new PantallaInventario();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInventario() {
		setBounds(100, 100, 958, 620);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Gotham-Medium", Font.BOLD, 18));
		lblInventario.setBounds(299, 11, 132, 26);
		contentPane.add(lblInventario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 52, 696, 497);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textFBusqueda = new JTextField();
		textFBusqueda.setBounds(730, 53, 202, 20);
		contentPane.add(textFBusqueda);
		textFBusqueda.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(790, 84, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(790, 118, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnNuevo = new JButton("NUEVO ");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistro registro = new PantallaRegistro();
				registro.setVisible(true);
			}
		});
		btnNuevo.setBounds(790, 152, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnInforme = new JButton("INFORME");
		btnInforme.setBounds(790, 186, 89, 23);
		contentPane.add(btnInforme);
		
		JButton btnArticulosPorPedir = new JButton("ARTICULOS POR PEDIR");
		btnArticulosPorPedir.setBounds(763, 490, 147, 38);
		contentPane.add(btnArticulosPorPedir);
	}
}
