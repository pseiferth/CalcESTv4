package model;

public class DataGehalt {

	public static DataGehalt dg = new DataGehalt();
	
	private double bruttoGehalt;
	private double lohnSteuer;
	private double soliZuschlag;
	private double krankenVers;
	private double pflegeVers;
	private double arbeitslosenVers;
	private double rentenVers;


/*
* Monatswert einlesen
*/	
	
	public double getBruttoGehalt() {
		return bruttoGehalt;
	}

/*
* Jahreswert ausgeben
*/

	public void setBruttoGehalt(double bruttoGehalt) {
		this.bruttoGehalt = bruttoGehalt * 12;
	}

/*
* Monatswert einlesen
*/

	public double getLohnSteuer() {
		return lohnSteuer;
	}


/*
* Jahreswert ausgeben
*/

	public void setLohnSteuer(double lohnSteuer) {
		this.lohnSteuer = lohnSteuer * 12;
	}

/*
* Monatswert einlesen
*/

	public double getSoliZuschlag() {
		return soliZuschlag;
	}

/*
* Jahreswert ausgeben
*/

	public void setSoliZuschlag(double soliZuschlag) {
		this.soliZuschlag = soliZuschlag * 12;
	}

/*
* Monatswert einlesen
*/

	public double getKrankenVers() {
		return krankenVers;
	}

/*
* Jahreswert ausgeben
*/

	public void setKrankenVers(double krankenVers) {
		this.krankenVers = krankenVers * 12;
	}

/*
* Monatswert einlesen
*/

	public double getPflegeVers() {
		return pflegeVers;
	}

/*
* Jahreswert ausgeben
*/

	public void setPflegeVers(double pflegeVers) {
		this.pflegeVers = pflegeVers * 12;
	}
	
/*
* Monatswert einlesen
*/

	public double getArbeitslosenVers() {
		return arbeitslosenVers;
	}

/*
* Jahreswert ausgeben
*/

	public void setArbeitslosenVers(double arbeitslosenVers) {
		this.arbeitslosenVers = arbeitslosenVers * 12;
	}

/*
* Monatswert einlesen
*/

	public double getRentenVers() {
		return rentenVers;
	}

/*
* Jahreswert ausgeben
*/

	public void setRentenVers(double rentenVers) {
		this.rentenVers = rentenVers;
	}
	
	
}
