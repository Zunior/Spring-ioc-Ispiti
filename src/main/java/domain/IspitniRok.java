package domain;

import org.springframework.stereotype.Component;

@Component(value = "ispitniRok")
public class IspitniRok {
	private String sifraIspitnogRoka;
	private String nazivIspitnogRoka;

	public IspitniRok() {

	}

	public String getSifraIspitnogRoka() {
		return sifraIspitnogRoka;
	}

	public void setSifraIspitnogRoka(String sifraIspitnogRoka) {
		this.sifraIspitnogRoka = sifraIspitnogRoka;
	}

	public String getNazivIspitnogRoka() {
		return nazivIspitnogRoka;
	}

	public void setNazivIspitnogRoka(String nazivIspitnogRoka) {
		this.nazivIspitnogRoka = nazivIspitnogRoka;
	}

	@Override
	public String toString() {
		return "IspitniRok [sifraIspitnogRoka=" + sifraIspitnogRoka + ", nazivIspitnogRoka=" + nazivIspitnogRoka + "]";
	}

}
