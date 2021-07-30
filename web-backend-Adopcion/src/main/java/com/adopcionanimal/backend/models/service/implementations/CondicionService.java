package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.adopcionanimal.backend.models.entities.Condicion;
import com.adopcionanimal.backend.models.repositories.ICondicion;
import com.adopcionanimal.backend.models.service.interfaces.ICondicionService;


@Service
public class CondicionService implements ICondicionService {
	@Autowired
	ICondicion repositorie;
	@Override
	public void save(Condicion condicion) {
		repositorie.save(condicion);
		
	}

	@Override
	public Optional<Condicion> findById(Integer id) {
		return repositorie.findById(id);
	}

	@Override
	public void delate(Integer id) {
		repositorie.deleteById(id);
		
	}

	@Override
	public List<Condicion> findAll() {
		return (List<Condicion>)repositorie.findAll();
	}

		

}
