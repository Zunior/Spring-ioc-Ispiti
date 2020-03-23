package domain;

import org.springframework.stereotype.Component;

@Component(value = "ocena")
public class Ocena {
	private Vrednost ocena;
	
	public enum Vrednost {
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

	public Ocena setOcena(Vrednost ocena) {
		this.ocena = ocena;
		return this;
	}
	
	
	
}
