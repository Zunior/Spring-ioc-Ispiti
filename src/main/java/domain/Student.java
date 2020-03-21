package domain;

import org.springframework.stereotype.Component;

@Component(value = "student")
public class Student {
	private String brojIndeksa;
	private String imeStudenta;
	
	public Student() {
		
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}
	
	
}
