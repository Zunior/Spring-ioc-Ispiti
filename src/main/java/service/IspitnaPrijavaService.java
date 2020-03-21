package service;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;

public interface IspitnaPrijavaService {
	public void printReport(BeanFactory container, List<String> argumenti);
}
