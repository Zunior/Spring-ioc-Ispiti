package report.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import config.MyConfig;
import dao.IspitnaPrijavaDao;
import dao.impl.IspitnaPrijavaDaoImpl;
import domain.IspitnaPrijava;
import report.IspitnaPrijavaReport;


//broj studenata koji su polozili neki predmet
@Component(value = "report2")
public class IspitnaPrijavaReport2 implements IspitnaPrijavaReport{
	@Autowired
	private IspitnaPrijavaDao ispitnaPrijavaDao;
	
	public IspitnaPrijavaReport2() {
		this.ispitnaPrijavaDao = new IspitnaPrijavaDaoImpl();
	}

	public void printReport(BeanFactory container, List<String> argumenti) {
		IspitnaPrijavaDao ispitnaPrijavaDao = container.getBean("ispitnaPrijavaDao", IspitnaPrijavaDao.class);
		List<IspitnaPrijava> ispitnePrijave = ispitnaPrijavaDao.getIspitnePrijave();
		int count = 0;
		for (IspitnaPrijava ispitnaPrijava : ispitnePrijave) {
			if(ispitnaPrijava.getPredmet().getSifraPredmeta().equalsIgnoreCase(argumenti.get(1))
					&& ispitnaPrijava.getIspitniRok().getSifraIspitnogRoka().equalsIgnoreCase(argumenti.get(2)))
				count++;
		}
		System.out.println("Predmet: " + argumenti.get(0) + " je polozilo " + count + " studenata u zadatom roku");
	}
	
	
	
	
}
