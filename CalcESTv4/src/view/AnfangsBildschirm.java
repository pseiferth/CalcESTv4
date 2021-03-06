package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.StartWerte;

public class AnfangsBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6889707067785278018L;
	private JPanel contentPane;
	private JTextField txtSteuerJahr;

	/*
	 * Initialisierung CheckBoxButtons mit Default 0 = NOcheck
	 */
	int buttonGehaltsschein = 0;
	int buttonSpenden = 0;
	int buttonKrankheitsKosten = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnfangsBildschirm frame = new AnfangsBildschirm();
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
	public AnfangsBildschirm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBerechnungDerEinkommesteuer = new JLabel(
				"Berechnung der Einkommesteuer");
		lblBerechnungDerEinkommesteuer
				.setHorizontalAlignment(SwingConstants.CENTER);
		lblBerechnungDerEinkommesteuer.setFont(new Font("Tahoma", Font.PLAIN,
				14));
		lblBerechnungDerEinkommesteuer.setBounds(10, 10, 464, 20);
		contentPane.add(lblBerechnungDerEinkommesteuer);

		final JLabel lblSteuerjahr = new JLabel("Steuerjahr:");
		lblSteuerjahr.setBounds(10, 50, 133, 14);
		contentPane.add(lblSteuerjahr);

		txtSteuerJahr = new JTextField();
		txtSteuerJahr.setHorizontalAlignment(SwingConstants.CENTER);
		txtSteuerJahr.setBounds(153, 47, 140, 20);
		contentPane.add(txtSteuerJahr);
		txtSteuerJahr.setColumns(10);

		final JCheckBox chckbxGehaltsschein = new JCheckBox("Gehaltsschein");
		chckbxGehaltsschein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				/*
				 * Checkbox auf 1 setzen, wenn gecheckt + Wertuebergabe an StartWerte.java
				 */
 	            buttonGehaltsschein = 1;
				StartWerte.sw.setButtonGehaltsSchein(buttonGehaltsschein);
			}
		});
		chckbxGehaltsschein.setBounds(6, 80, 133, 23);
		contentPane.add(chckbxGehaltsschein);

		final JCheckBox chckbxSpenden = new JCheckBox("Spenden");
		chckbxSpenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Checkbox auf 1 setzen, wenn gecheckt + Wertuebergabe an StartWerte.java
				 */			
	            buttonSpenden = 1;
				StartWerte.sw.setButtonSpenden(buttonSpenden);
			}
		});
		chckbxSpenden.setBounds(6, 110, 137, 23);
		contentPane.add(chckbxSpenden);

		final JCheckBox chckbxKrankheitskosten = new JCheckBox(
				"Krankheitskosten");
		chckbxKrankheitskosten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				/*
				 * Checkbox auf 1 setzen, wenn gecheckt + Wertuebergabe an StartWerte.java
				 */
                buttonKrankheitsKosten = 1;
				StartWerte.sw.setButtonKrankheitsKosten(buttonKrankheitsKosten);
			}
		});
		chckbxKrankheitskosten.setBounds(6, 140, 137, 23);
		contentPane.add(chckbxKrankheitskosten);

		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				/*
				 * Wertuebergabe an StartWerte.java
				 */
				StartWerte.sw.setSteuerJahr(Integer.parseInt(txtSteuerJahr.getText()));
				/*
				 * pruefen bei buttonClick "weiter" ob checkboxen geclickt, mindestens gehaltsschein muss 1 sein um zur naechsten GUI zu kommen, ansonsten InfoMeldung
				 */
				if ((buttonGehaltsschein == 1) | (buttonGehaltsschein == 1) & (buttonSpenden == 1) & (buttonKrankheitsKosten == 1)) {
					GehaltsscheinBildschirm gsb = new GehaltsscheinBildschirm();
					gsb.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,"eine / mehrere Angabe(n) fehlen", "Information",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnWeiter.setBounds(10, 258, 89, 23);
		contentPane.add(btnWeiter);
	}
}
