package com.adopcionanimal.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adopcionanimal.backend.models.entities.Condicion;

public interface ICondicion extends CrudRepository<Condicion, Integer> {
	

}
