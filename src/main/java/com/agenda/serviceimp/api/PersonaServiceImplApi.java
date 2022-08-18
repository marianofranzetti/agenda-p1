package com.agenda.serviceimp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.agenda.commons.GenericServiceImplApi;
import com.agenda.dao.api.PersonaDaoApi;
import com.agenda.models.Persona;
import com.agenda.service.api.PersonaServiceApi;

@Service
public class PersonaServiceImplApi  extends GenericServiceImplApi<Persona, Long> implements PersonaServiceApi{

	@Autowired
	private PersonaDaoApi persona;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return persona;
	}

	
}
