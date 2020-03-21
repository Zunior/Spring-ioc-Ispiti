package dao;

import java.util.ArrayList;
import java.util.List;

import domain.IspitnaPrijava;

public interface IspitnaPrijavaDao {
	public void save(IspitnaPrijava ispitnaPrijava);
	
	public List<IspitnaPrijava> getIspitnePrijave();
	
}
