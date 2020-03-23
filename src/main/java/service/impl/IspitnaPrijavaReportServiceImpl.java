package service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.Service;

import report.impl.IspitnaPrijavaReport1;
import report.impl.IspitnaPrijavaReport2;
import report.impl.IspitnaPrijavaReport3;
import report.impl.IspitnaPrijavaReport4;
import service.IspitnaPrijavaReportService;

@Service(value = "ispitnaPrijavaReportService")
public class IspitnaPrijavaReportServiceImpl implements IspitnaPrijavaReportService {
	private IspitnaPrijavaReport1 ispitnaPrijavaReport1;
	private IspitnaPrijavaReport2 ispitnaPrijavaReport2;
	private IspitnaPrijavaReport3 ispitnaPrijavaReport3;
	private IspitnaPrijavaReport4 ispitnaPrijavaReport4;

	public void printReport(BeanFactory container, List<String> argumenti) {
		// jedan dodatni string - predmet
		if (argumenti.get(0).equalsIgnoreCase("report1")) {
			setIspitnaPrijavaReport(ispitnaPrijavaReport1);
			ispitnaPrijavaReport1.printReport(container, argumenti);
			// 2 dodatna stringa - predmet i rok
		} else if (argumenti.get(0).equalsIgnoreCase("report2")) {
			setIspitnaPrijavaReport(ispitnaPrijavaReport2);
			ispitnaPrijavaReport2.printReport(container, argumenti);
			// nema dodatnih stringova
		} else if (argumenti.get(0).equalsIgnoreCase("report3")) {
			setIspitnaPrijavaReport(ispitnaPrijavaReport3);
			ispitnaPrijavaReport3.printReport(container, argumenti);
			// 1 dodatni string - rok
		} else if (argumenti.get(0).equalsIgnoreCase("report4")) {
			setIspitnaPrijavaReport(ispitnaPrijavaReport4);
			ispitnaPrijavaReport4.printReport(container, argumenti);
		}
	}

	@Resource(name = "ispitnaPrijavaReport1")
	public void setIspitnaPrijavaReport(IspitnaPrijavaReport1 ispitnaPrijavaReport1) {
		this.ispitnaPrijavaReport1 = ispitnaPrijavaReport1;
	}

	@Resource(name = "ispitnaPrijavaReport2")
	public void setIspitnaPrijavaReport(IspitnaPrijavaReport2 ispitnaPrijavaReport2) {
		this.ispitnaPrijavaReport2 = ispitnaPrijavaReport2;
	}

	@Resource(name = "ispitnaPrijavaReport3")
	public void setIspitnaPrijavaReport(IspitnaPrijavaReport3 ispitnaPrijavaReport3) {
		this.ispitnaPrijavaReport3 = ispitnaPrijavaReport3;
	}

	@Resource(name = "ispitnaPrijavaReport4")
	public void setIspitnaPrijavaReport(IspitnaPrijavaReport4 ispitnaPrijavaReport4) {
		this.ispitnaPrijavaReport4 = ispitnaPrijavaReport4;
	}

}
