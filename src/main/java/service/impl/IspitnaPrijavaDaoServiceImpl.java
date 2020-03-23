package service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IspitnaPrijavaDao;
import dao.impl.IspitnaPrijavaDaoImpl;
import domain.IspitnaPrijava;
import domain.IspitniRok;
import domain.Nastavnik;
import domain.Ocena;
import domain.Ocena.Vrednost;
import domain.Predmet;
import domain.Student;
import service.IspitnaPrijavaDaoService;

@Service(value = "ispitnaPrijavaDaoService")
public class IspitnaPrijavaDaoServiceImpl implements IspitnaPrijavaDaoService {
	@Autowired
	private IspitnaPrijavaDao ispitnaPrijavaDao;

//	public IspitnaPrijavaDaoServiceImpl() {
//		this.ispitnaPrijavaDao = new IspitnaPrijavaDaoImpl();
//	}

	public void save(BeanFactory container, 
						String sifraIspitnogRoka, 
						String sifraPredmeta,
						String sifraNastavnika,
						String brojIndeksa,
						Vrednost ocena) {
		
		IspitniRok ispitniRok = container.getBean("ispitniRok", IspitniRok.class);
		Predmet predmet = container.getBean("predmet", Predmet.class);
		Nastavnik nastavnik = container.getBean("nastavnik", Nastavnik.class);
		Student student = container.getBean("student", Student.class);
		Ocena oc = container.getBean("ocena", Ocena.class);
		
		IspitnaPrijava ispitnaPrijava = container.getBean("ispitnaPrijava", IspitnaPrijava.class);
		ispitnaPrijava.setIspitniRok(ispitniRok.setSifraIspitnogRoka(sifraIspitnogRoka));
		ispitnaPrijava.setPredmet(predmet.setSifraPredmeta(sifraPredmeta));
		ispitnaPrijava.setNastavnik(nastavnik.setSifraNastavnika(sifraNastavnika));
		ispitnaPrijava.setStudent(student.setBrojIndeksa(brojIndeksa));
		ispitnaPrijava.setOcena(oc.setOcena(ocena));
		IspitnaPrijavaDao ispitnaPrijavaDao = container.getBean("ispitnaPrijavaDao", IspitnaPrijavaDao.class);
		ispitnaPrijavaDao.save(ispitnaPrijava);
	
	}

	@Resource(name = "ispitnaPrijavaDao")
	public void setIspitnaPrijavaDao(IspitnaPrijavaDao ispitnaPrijavaDao) {
		this.ispitnaPrijavaDao = ispitnaPrijavaDao;
	}

}
