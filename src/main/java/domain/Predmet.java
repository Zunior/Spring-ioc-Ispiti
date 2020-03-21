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
	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	
	
	
}
