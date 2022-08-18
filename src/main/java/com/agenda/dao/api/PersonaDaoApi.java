package com.agenda.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.agenda.models.Persona;

public interface PersonaDaoApi extends CrudRepository<Persona, Long> {

}
