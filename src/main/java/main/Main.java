package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import config.MyConfig;
import domain.Ocena;
import service.IspitnaPrijavaDaoService;
import service.IspitnaPrijavaReportService;

@Component(value = "main")
public class Main {
	@Autowired
	IspitnaPrijavaReportService ispitnaPrijavaReportService;
	@Autowired
	IspitnaPrijavaDaoService ispitnaPrijavaDaoService;
	
	public Main() {

	}
	
	public static void main(String[] args) {
		BeanFactory container = new AnnotationConfigApplicationContext(MyConfig.class);
		Main main = container.getBean("main", Main.class);
		
		main.ispitnaPrijavaDaoService.save(container, "jun1", "mat01", "fr02", "0098", Ocena.Vrednost.osam);
		
		
		List<String> report1 = new ArrayList<String>() {{
			add("report1");
			add("mat01");
		}};
		List<String> report2 = new ArrayList<String>() {{
			add("report2");
			add("mat01");
			add("jun1");
		}};
		
		System.out.println("Report1");
		main.ispitnaPrijavaReportService.printReport(container, report1);
		System.out.println("Report2");
		main.ispitnaPrijavaReportService.printReport(container, report2);
	}
	
	
	
}
