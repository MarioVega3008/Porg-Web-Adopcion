package com.adopcionanimal.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adopcionanimal.backend.models.entities.Adopcion;

public interface IAdopcion extends CrudRepository<Adopcion, Integer>{
	
	
}
