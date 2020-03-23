package service;

import org.springframework.beans.factory.BeanFactory;

import domain.IspitnaPrijava;
import domain.Ocena.Vrednost;

public interface IspitnaPrijavaDaoService {
	void save(BeanFactory container, 
			String sifraIspitnogRoka, 
			String sifraPredmeta,
			String sifraNastavnika,
			String brojIndeksa,
			Vrednost ocena);
}
