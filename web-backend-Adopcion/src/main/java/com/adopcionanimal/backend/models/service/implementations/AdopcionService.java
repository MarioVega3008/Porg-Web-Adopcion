package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcionanimal.backend.models.entities.Adopcion;
import com.adopcionanimal.backend.models.repositories.IAdopcion;
import com.adopcionanimal.backend.models.service.interfaces.IAdopcionService;

@Service
public class AdopcionService implements IAdopcionService {
@Autowired
IAdopcion repositorie;
	
	@Override
	public void save(Adopcion adopcion) {
		repositorie.save(adopcion);
		
	}

	@Override
	public Optional<Adopcion> findById(Integer id) {
		return repositorie.findById(id);
		
	}

	@Override
	public void delate(Integer id) {
		repositorie.deleteById(id);
		
	}

	@Override
	public List<Adopcion> findAll() {
		
		return (List<Adopcion>) repositorie.findAll();
	}
	
	

}
