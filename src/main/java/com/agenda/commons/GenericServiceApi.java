package com.agenda.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceApi<T, ID extends Serializable> {

	T Save(T entity);
	
	void delete(ID id);
	
	T get(ID id);
	
	List<T> getAll();
	
	void update(T entity);

}
