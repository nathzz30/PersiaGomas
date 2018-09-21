package Pantallas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Confirmacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Confirmacion dialog = new Confirmacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Confirmacion() {
		setBounds(100, 100, 450, 217);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Esta seguro de imprimir esta factura? \r\n");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
			lblNewLabel.setBounds(66, 23, 307, 39);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblSiDeseaHacerlo = new JLabel("Si desea hacerlo clickee Aceptar");
			lblSiDeseaHacerlo.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
			lblSiDeseaHacerlo.setBounds(76, 60, 272, 31);
			contentPanel.add(lblSiDeseaHacerlo);
		}
		{
			JLabel lblDeLoContrario = new JLabel("De lo contrario Cancelar");
			lblDeLoContrario.setFont(new Font("Gotham-Medium", Font.BOLD, 15));
			lblDeLoContrario.setBounds(76, 94, 272, 31);
			contentPanel.add(lblDeLoContrario);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("ACEPTAR");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("CANCELAR");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Confirmacion.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
