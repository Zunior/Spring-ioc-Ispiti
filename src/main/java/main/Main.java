package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import config.MyConfig;
import service.IspitnaPrijavaService;

@Component(value = "main")
public class Main {
	@Autowired
	IspitnaPrijavaService ispitnaPrijavaService;
	
	public Main() {

	}
	
	public static void main(String[] args) {
		BeanFactory container = new AnnotationConfigApplicationContext(MyConfig.class);
		Main main = container.getBean("main", Main.class);
		
		
		
		
		List<String> report1 = new ArrayList<String>() {{
			add("report1");
			add("Matematika");
		}};
		
		main.ispitnaPrijavaService.printReport(container, report1);
	}
	
	
	
}
