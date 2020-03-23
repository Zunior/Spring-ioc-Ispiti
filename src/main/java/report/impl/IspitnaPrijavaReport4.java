package report.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.IspitnaPrijavaDao;
import dao.impl.IspitnaPrijavaDaoImpl;
import domain.IspitnaPrijava;
import report.IspitnaPrijavaReport;


//broj studenata koji su polozili neki predmet
@Repository(value = "ispitnaPrijavaReport4")
public class IspitnaPrijavaReport4 implements IspitnaPrijavaReport{
	@Autowired
	private IspitnaPrijavaDao ispitnaPrijavaDao;
	
//	public IspitnaPrijavaReport4() {
//		this.ispitnaPrijavaDao = new IspitnaPrijavaDaoImpl();
//	}

	public void printReport(BeanFactory container, List<String> argumenti) {
		
	}
	
	
	
	
}
