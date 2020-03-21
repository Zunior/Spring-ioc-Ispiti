package report;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;

import domain.IspitnaPrijava;

public interface IspitnaPrijavaReport {
	public void printReport(BeanFactory container, List<String> argumenti);
}
