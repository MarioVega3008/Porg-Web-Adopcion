package com.adopcionanimal.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adopcionanimal.backend.models.entities.Cuidados;

public interface ICuidados extends CrudRepository<Cuidados, Integer> {
	

}
