package Pantallas;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class PantallaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal frame = new PantallaPrincipal();
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
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 619);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEstados = new JMenu("Estados");
		menuBar.add(mnEstados);
		
		JMenuItem mntmGeneral = new JMenuItem("General");
		mntmGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEstados estados = new PantallaEstados();
				estados.setVisible(true);
			}
		});
		mnEstados.add(mntmGeneral);
		
		JMenuItem mntmGraficas = new JMenuItem("Graficas");
		mnEstados.add(mntmGraficas);
		
		JMenuItem mntmInformes = new JMenuItem("Informes");
		mnEstados.add(mntmInformes);
		
		JMenu mnArticulos = new JMenu("Articulos");
		menuBar.add(mnArticulos);
		
		JMenuItem mntmNuevoArticulo = new JMenuItem("Nuevo Articulo");
		mntmNuevoArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistro registro = new PantallaRegistro();
				registro.setVisible(true);
			}
		});
		mnArticulos.add(mntmNuevoArticulo);
		
		JMenuItem mntmInventario = new JMenuItem("Inventario");
		mntmInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInventario inventario = new PantallaInventario();
				inventario.setVisible(true);
			}
		});
		
		mnArticulos.add(mntmInventario);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
