package domain;

import org.springframework.stereotype.Component;

@Component(value = "predmet")
public class Predmet {
	private String sifraPredmeta;
	private String nazivPredmeta;
	public Predmet() {

	}
	public String getSifraPredmeta() {
		return sifraPredmeta;
	}
	public Predmet setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
		return this;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	
	
	
}
