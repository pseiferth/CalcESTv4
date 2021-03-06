package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.WerbungsKosten;

import controller.OpenURL;

public class WerbungskostenBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7451850392206958408L;
	private JPanel contentPane;
	private JTextField txtEntfernungWA;
	private JTextField txtArbeitstage;
	private JTextField txtSpenden;
	private JTextField txtKrankheitskosten;
	private JTextField txtArbeitsmittel;
	private JTextField txtTelefonkosten;

	/**
	 * Create the frame.
	 */
	public WerbungskostenBildschirm() {
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngabenZuWerbungskosten = new JLabel("Angaben zu Werbungskosten");
		lblAngabenZuWerbungskosten.setHorizontalAlignment(SwingConstants.CENTER);
		lblAngabenZuWerbungskosten.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngabenZuWerbungskosten.setBounds(10, 11, 464, 20);
		contentPane.add(lblAngabenZuWerbungskosten);
		
		JLabel lblEntfernungWA = new JLabel("Entfernung Wohnung / Arbeit");
		lblEntfernungWA.setBounds(10, 40, 200, 14);
		contentPane.add(lblEntfernungWA);
		
		JLabel lblArbeitstage = new JLabel("Arbeitstage:");
		lblArbeitstage.setBounds(10, 70, 160, 14);
		contentPane.add(lblArbeitstage);
		
		JLabel lblSpenden = new JLabel("Spenden:");
		lblSpenden.setBounds(10, 100, 160, 14);
		contentPane.add(lblSpenden);
		
		JLabel lblKrankheitskosten = new JLabel("Krankheitskosten:");
		lblKrankheitskosten.setBounds(10, 130, 160, 14);
		contentPane.add(lblKrankheitskosten);
		
		JLabel lblArbeitsmittel = new JLabel("Arbeitsmittel:");
		lblArbeitsmittel.setBounds(10, 160, 160, 14);
		contentPane.add(lblArbeitsmittel);
		
		JLabel lblTelefonkosten = new JLabel("Telefonkosten:");
		lblTelefonkosten.setBounds(10, 190, 160, 14);
		contentPane.add(lblTelefonkosten);
		
		txtEntfernungWA = new JTextField();
		txtEntfernungWA.setColumns(10);
		txtEntfernungWA.setBounds(220, 37, 140, 20);
		contentPane.add(txtEntfernungWA);
		
		txtArbeitstage = new JTextField();
		txtArbeitstage.setColumns(10);
		txtArbeitstage.setBounds(220, 67, 140, 20);
		contentPane.add(txtArbeitstage);
		
		txtSpenden = new JTextField();
		txtSpenden.setColumns(10);
		txtSpenden.setBounds(220, 97, 140, 20);
		contentPane.add(txtSpenden);
		
		txtKrankheitskosten = new JTextField();
		txtKrankheitskosten.setColumns(10);
		txtKrankheitskosten.setBounds(220, 127, 140, 20);
		contentPane.add(txtKrankheitskosten);
		
		txtArbeitsmittel = new JTextField();
		txtArbeitsmittel.setColumns(10);
		txtArbeitsmittel.setBounds(220, 157, 140, 20);
		contentPane.add(txtArbeitsmittel);
		
		txtTelefonkosten = new JTextField();
		txtTelefonkosten.setColumns(10);
		txtTelefonkosten.setBounds(220, 187, 140, 20);
		contentPane.add(txtTelefonkosten);
		
		JButton btnWeiter = new JButton("weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Wertuebergabe der Werbungskoten an WerbungsKosten.java durch ButtonClick "weiter"
				 */	
				WerbungsKosten.wk.setArbeitsTage(Integer.parseInt(txtArbeitstage.getText()));
				WerbungsKosten.wk.setEntfernungsKMWA(Double.parseDouble(txtEntfernungWA.getText()));
				WerbungsKosten.wk.setSpendenGezahlt(Double.parseDouble(txtSpenden.getText()));
				WerbungsKosten.wk.setKrankheitsKostenGezahlt(Double.parseDouble(txtKrankheitskosten.getText()));
				WerbungsKosten.wk.setArbeitsMittelGezahlt(Double.parseDouble(txtArbeitsmittel.getText()));;
				WerbungsKosten.wk.setTelefonKostenGezahlt(Double.parseDouble(txtTelefonkosten.getText())); 
				/*
				 * neue GUI oeffnen
				 */	
				AuswertungsBildschirm aw = new AuswertungsBildschirm();
				aw.setVisible(true); 
				
			}
		});
		btnWeiter.setBounds(10, 258, 89, 23);
		contentPane.add(btnWeiter);
		
		JButton btnGoogleMaps = new JButton("Google Maps");
		btnGoogleMaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OpenURL ourl = new OpenURL();
				ourl.openURL("https://maps.google.de/maps?hl=de&tab=wl"); 
				
			}
		});
		btnGoogleMaps.setBounds(347, 258, 127, 23);
		contentPane.add(btnGoogleMaps);
		
		JButton btnWerbungskostenAbc = new JButton("Werbungskosten ABC");
		btnWerbungskostenAbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OpenURL ourl2 = new OpenURL();
				ourl2.openURL("http://www.steuernsparen.de/steuerwiki/index.php/Werbungskosten");
			}
		});
		btnWerbungskostenAbc.setBounds(163, 258, 160, 23);
		contentPane.add(btnWerbungskostenAbc);
	
	}
}
