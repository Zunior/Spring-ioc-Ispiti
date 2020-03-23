package domain;

import org.springframework.stereotype.Component;

@Component(value = "nastavnik")
public class Nastavnik {
	private String sifraNastavnika;
	private String imeNastavnika;
	
	public Nastavnik() {

	}

	public String getSifraNastavnika() {
		return sifraNastavnika;
	}

	public Nastavnik setSifraNastavnika(String sifraNastavnika) {
		this.sifraNastavnika = sifraNastavnika;
		return this;
	}

	public String getImeNastavnika() {
		return imeNastavnika;
	}

	public void setImeNastavnika(String imeNastavnika) {
		this.imeNastavnika = imeNastavnika;
	}
	
	
	
}
