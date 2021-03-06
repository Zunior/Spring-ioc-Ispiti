package report.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import config.MyConfig;
import dao.IspitnaPrijavaDao;
import dao.impl.IspitnaPrijavaDaoImpl;
import domain.IspitnaPrijava;
import report.IspitnaPrijavaReport;


//broj studenata koji su polozili neki predmet

@Repository(value = "ispitnaPrijavaReport1")
public class IspitnaPrijavaReport1 implements IspitnaPrijavaReport{
	@Autowired
	private IspitnaPrijavaDao ispitnaPrijavaDao;
	
//	public IspitnaPrijavaReport1() {
//		this.ispitnaPrijavaDao = new IspitnaPrijavaDaoImpl();
//	}
	
	
	//posto se ne loguje ocena 5, jednostavno se broji broj prijava po predmetu
	public void printReport(BeanFactory container, List<String> argumenti) {
		IspitnaPrijavaDao ispitnaPrijavaDao = container.getBean("ispitnaPrijavaDao", IspitnaPrijavaDao.class);
		List<IspitnaPrijava> ispitnePrijave = ispitnaPrijavaDao.getIspitnePrijave();
		int count = 0;
		for (IspitnaPrijava ispitnaPrijava : ispitnePrijave) {
			if(ispitnaPrijava.getPredmet().getSifraPredmeta().equalsIgnoreCase(argumenti.get(1)))
				count++;
		}
		System.out.println("Predmet: " + argumenti.get(1) + " je polozilo " + count + " studenata");
	}

	
	
	
	
}
