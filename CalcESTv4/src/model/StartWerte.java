package model;

public class StartWerte {

	public static StartWerte sw = new StartWerte();
	
	private int steuerJahr;
	private int buttonGehaltsSchein;
	private int buttonSpenden;
	private int buttonKrankheitsKosten;

	public StartWerte() {
//		steuerJahr = 0;
//		buttonGehaltsSchein = 0;
//		buttonSpenden = 0;
//		buttonKrankheitsKosten = 0;
	}
/*
	public StartWerte (int steuerJahr, int buttonGehaltsSchein, int buttonSpenden, int buttonKrankheitsKosten) {
		this.steuerJahr = steuerJahr; 
		this.buttonGehaltsSchein = buttonGehaltsSchein;
		this.buttonSpenden = buttonSpenden;
		this.buttonKrankheitsKosten = buttonKrankheitsKosten;
	}
*/
	public int getSteuerJahr() {
		return steuerJahr;
	}

	public void setSteuerJahr(int steuerJahr) {
		this.steuerJahr = steuerJahr;
	}

	public int getButtonGehaltsSchein() {
		return buttonGehaltsSchein;
	}

	public void setButtonGehaltsSchein(int buttonGehaltsSchein) {
		this.buttonGehaltsSchein = buttonGehaltsSchein;
	}

	public int getButtonSpenden() {
		return buttonSpenden;
	}

	public void setButtonSpenden(int buttonSpenden) {
		this.buttonSpenden = buttonSpenden;
	}

	public int getButtonKrankheitsKosten() {
		return buttonKrankheitsKosten;
	}

	public void setButtonKrankheitsKosten(int buttonKrankheitsKosten) {
		this.buttonKrankheitsKosten = buttonKrankheitsKosten;
	}
	
}