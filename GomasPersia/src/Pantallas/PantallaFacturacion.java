package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class PantallaFacturacion extends JFrame {

	private JPanel contentPane;
	private JTextField textFBuscar;
	private JTable table;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaFacturacion frame = new PantallaFacturacion();
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
	public PantallaFacturacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacturacion = new JLabel("FACTURACION");
		lblFacturacion.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblFacturacion.setBounds(437, 27, 137, 26);
		contentPane.add(lblFacturacion);
		
		textFBuscar = new JTextField();
		textFBuscar.setBounds(21, 76, 783, 20);
		contentPane.add(textFBuscar);
		textFBuscar.setColumns(10);
		
		JLabel labelFBuscar = new JLabel("");
		labelFBuscar.setBounds(21, 111, 476, 20);
		contentPane.add(labelFBuscar);
		
		JLabel lblCantidadAVender = new JLabel("CANTIDAD A VENDER:");
		lblCantidadAVender.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblCantidadAVender.setBounds(507, 107, 189, 24);
		contentPane.add(lblCantidadAVender);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		comboBox.setBounds(706, 107, 98, 20);
		contentPane.add(comboBox);
		
		JLabel lblFactura = new JLabel("FACTURA");
		lblFactura.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblFactura.setBounds(373, 142, 124, 20);
		contentPane.add(lblFactura);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 161, 783, 360);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblTotalAPagar = new JLabel("TOTAL A PAGAR:");
		lblTotalAPagar.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblTotalAPagar.setBounds(28, 533, 150, 26);
		contentPane.add(lblTotalAPagar);
		
		JLabel labelTotalPagar = new JLabel("");
		labelTotalPagar.setBounds(575, 539, 229, 20);
		contentPane.add(labelTotalPagar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuscar.setBounds(856, 56, 137, 36);
		contentPane.add(btnBuscar);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBounds(856, 101, 137, 36);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(856, 148, 137, 36);
		contentPane.add(btnEliminar);
		
		JButton btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Confirmacion confirm = new Confirmacion ();
				confirm.setVisible(true);
			}
		});
		btnImprimir.setBounds(856, 522, 137, 36);
		contentPane.add(btnImprimir);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
