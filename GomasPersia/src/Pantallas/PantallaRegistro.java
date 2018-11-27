package Pantallas;


import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PantallaRegistro extends JDialog {

	private JPanel contentPane;
	private JTextField textFNombre;
	private JTextField textFPC;
	private JTextField textFPVSD;
	private JTextField textFPVCD;
	private JTextField textFCant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaRegistro dialog = new PantallaRegistro();
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
	public PantallaRegistro() {
		setBounds(100, 100, 627, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre Del Articulo Nuevo:");
		lblNombre.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblNombre.setBounds(46, 34, 220, 22);
		contentPane.add(lblNombre);
		
		JLabel lblTipo = new JLabel("Tipo De Articulo:");
		lblTipo.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblTipo.setBounds(46, 67, 176, 22);
		contentPane.add(lblTipo);
		
		JLabel lblPrecioDeCompra = new JLabel("Precio De Compra:");
		lblPrecioDeCompra.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblPrecioDeCompra.setBounds(47, 102, 157, 24);
		contentPane.add(lblPrecioDeCompra);
		
		JLabel lblPrecioDeVenta = new JLabel("Precio De Venta Sin Descuento:");
		lblPrecioDeVenta.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblPrecioDeVenta.setBounds(46, 137, 248, 22);
		contentPane.add(lblPrecioDeVenta);
		
		JLabel lblPrecioDeVenta_1 = new JLabel("Precio De Venta Con Descuento:");
		lblPrecioDeVenta_1.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblPrecioDeVenta_1.setBounds(46, 170, 260, 22);
		contentPane.add(lblPrecioDeVenta_1);
		
		JLabel lblCantidadEnAlmacen = new JLabel("Cantidad En Almacen:");
		lblCantidadEnAlmacen.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblCantidadEnAlmacen.setBounds(46, 204, 193, 22);
		contentPane.add(lblCantidadEnAlmacen);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(255, 249, 101, 30);
		contentPane.add(btnRegistrar);
		
		textFNombre = new JTextField();
		textFNombre.setBounds(307, 35, 269, 20);
		contentPane.add(textFNombre);
		textFNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Goma", "Accesorio Decoracion Auto", "Audio", "Limpiador", "Performance"}));
		comboBox.setBounds(307, 68, 269, 20);
		contentPane.add(comboBox);
		
		textFPC = new JTextField();
		textFPC.setBounds(307, 104, 269, 20);
		contentPane.add(textFPC);
		textFPC.setColumns(10);
		
		textFPVSD = new JTextField();
		textFPVSD.setBounds(307, 138, 269, 20);
		contentPane.add(textFPVSD);
		textFPVSD.setColumns(10);
		
		textFPVCD = new JTextField();
		textFPVCD.setBounds(307, 171, 269, 20);
		contentPane.add(textFPVCD);
		textFPVCD.setColumns(10);
		
		textFCant = new JTextField();
		textFCant.setBounds(307, 203, 269, 20);
		contentPane.add(textFCant);
		textFCant.setColumns(10);
	}
}
