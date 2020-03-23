package dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dao.IspitnaPrijavaDao;
import domain.IspitnaPrijava;

@Repository(value = "ispitnaPrijavaDao")
public class IspitnaPrijavaDaoImpl implements IspitnaPrijavaDao{
private List<IspitnaPrijava> ispitnePrijave;
	
	public IspitnaPrijavaDaoImpl() {
		this.ispitnePrijave = new ArrayList<IspitnaPrijava>();
	}
	
	public void save(IspitnaPrijava ispitnaPrijava) {
		ispitnePrijave.add(ispitnaPrijava);
	}

	public List<IspitnaPrijava> getIspitnePrijave() {
		return ispitnePrijave;
	}
	
	
	
}
