package com.agenda.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericServiceImplApi<T, ID extends Serializable> implements GenericServiceApi<T, ID> {

	@Override
	public T Save(T entity) {
		// TODO Auto-generated method stub
		
		return getDao().save(entity);
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		getDao().deleteById(id);
	}

	@Override
	public T get(ID id) {
		// TODO Auto-generated method stub
		
		Optional<T> obj = getDao().findById(id);
		
		T elem = obj.isPresent() ? obj.get() : null ;
		
		return elem;
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		List<T> lista = new ArrayList<>();
		getDao().findAll().forEach(obj -> lista.add(obj));
		
		return lista;
	}
	
	public void update(T entity) {
		
		//getDao().save
		//no se puede con jpa
		
	}
	
	
	public abstract CrudRepository<T, ID> getDao();

}
