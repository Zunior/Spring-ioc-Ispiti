package domain;

import org.springframework.stereotype.Component;

@Component(value = "ocena")
public class Ocena {
	private Vrednost ocena;
	
	enum Vrednost {
		sest(6), sedam(7), osam(8), devet(9), deset(10);
		
		private final int value;

	    private Vrednost(int value) {
	        this.value = value;
	    }
	}

	public Ocena() {
		
	}

	public Vrednost getOcena() {
		return ocena;
	}

	public void setOcena(Vrednost ocena) {
		this.ocena = ocena;
	}
	
	
	
}
