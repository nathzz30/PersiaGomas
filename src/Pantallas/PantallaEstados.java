package Pantallas;


import java.awt.EventQueue;
import javax.swing.JDialog;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;

public class PantallaEstados extends JDialog {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEstados dialog = new PantallaEstados();
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
	public PantallaEstados() {
		setBounds(100, 100, 1028, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesde = new JLabel("DESDE:");
		lblDesde.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblDesde.setBounds(22, 33, 64, 19);
		contentPane.add(lblDesde);
		
		JLabel lblDia = new JLabel("DIA");
		lblDia.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblDia.setBounds(113, 11, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("MES");
		lblMes.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblMes.setBounds(203, 11, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00D1O");
		lblAo.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblAo.setBounds(289, 8, 64, 20);
		contentPane.add(lblAo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox.setBounds(113, 32, 46, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"}));
		comboBox_1.setBounds(169, 32, 106, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027"}));
		comboBox_2.setBounds(285, 32, 68, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblHasta = new JLabel("HASTA:");
		lblHasta.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblHasta.setBounds(415, 36, 64, 19);
		contentPane.add(lblHasta);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(506, 35, 46, 20);
		contentPane.add(comboBox_3);
		
		JLabel label_1 = new JLabel("DIA");
		label_1.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		label_1.setBounds(506, 14, 46, 14);
		contentPane.add(label_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(562, 35, 106, 20);
		contentPane.add(comboBox_4);
		
		JLabel label_2 = new JLabel("MES");
		label_2.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		label_2.setBounds(596, 14, 46, 14);
		contentPane.add(label_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(678, 35, 68, 20);
		contentPane.add(comboBox_5);
		
		JLabel label_3 = new JLabel("A\u00D1O");
		label_3.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		label_3.setBounds(682, 11, 64, 20);
		contentPane.add(label_3);
		
		JLabel lblReporte = new JLabel("REPORTE");
		lblReporte.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblReporte.setBounds(266, 77, 87, 19);
		contentPane.add(lblReporte);
		
		JLabel lblTotalVendido = new JLabel("TOTAL VENDIDO:");
		lblTotalVendido.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblTotalVendido.setBounds(41, 111, 143, 19);
		contentPane.add(lblTotalVendido);
		
		JLabel lblGanancias = new JLabel("GANANCIAS:");
		lblGanancias.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblGanancias.setBounds(41, 141, 118, 19);
		contentPane.add(lblGanancias);
		
		JLabel lblPerdidas = new JLabel("PERDIDAS:");
		lblPerdidas.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblPerdidas.setBounds(41, 169, 106, 19);
		contentPane.add(lblPerdidas);
		
		JLabel lblArticuloMasVendido = new JLabel("ARTICULO MAS VENDIDO:");
		lblArticuloMasVendido.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		lblArticuloMasVendido.setBounds(41, 199, 208, 19);
		contentPane.add(lblArticuloMasVendido);
		
		JLabel labelTotalVendido = new JLabel("");
		labelTotalVendido.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		labelTotalVendido.setBounds(266, 107, 168, 19);
		contentPane.add(labelTotalVendido);
		
		JLabel labelGanancias = new JLabel("");
		labelGanancias.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		labelGanancias.setBounds(266, 137, 168, 19);
		contentPane.add(labelGanancias);
		
		JLabel labelPerdidas = new JLabel("");
		labelPerdidas.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		labelPerdidas.setBounds(266, 171, 168, 19);
		contentPane.add(labelPerdidas);
		
		JLabel labelArtMasVend = new JLabel("");
		labelArtMasVend.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
		labelArtMasVend.setBounds(266, 201, 168, 19);
		contentPane.add(labelArtMasVend);
	}
}
