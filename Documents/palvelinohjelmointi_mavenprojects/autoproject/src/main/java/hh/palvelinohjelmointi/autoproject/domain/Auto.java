package hh.palvelinohjelmointi.autoproject.domain;

public class Auto { // kaikki luokat periytyy Object-luokasta

	// attribuutit
	private String merkki;
	private int valmistusvuosi;
	// kontstruktorit

	// parametrillinen
	public Auto(String merkki, int valmistusvuosi) {
		super();
		this.merkki = merkki;
		this.valmistusvuosi = valmistusvuosi;
	}

	// parametriton
	public Auto() {
		super();
		this.merkki = null;
		this.valmistusvuosi = 0;
	}
	// setterit

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public void setValmistusvuosi(int valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}

	// getterit

	public String getMerkki() {
		return merkki;
	}

	public int getValmistusvuosi() {
		return valmistusvuosi;
	}
	// toString

	@Override
	public String toString() {
		return "Auto [merkki=" + merkki + ", valmistusvuosi=" + valmistusvuosi + "]";
	}

}
