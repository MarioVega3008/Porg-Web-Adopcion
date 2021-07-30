package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcionanimal.backend.models.entities.Cuidados;
import com.adopcionanimal.backend.models.repositories.ICuidados;
import com.adopcionanimal.backend.models.service.interfaces.ICuidadosService;

@Service
public class CuidadosService implements ICuidadosService {

	@Autowired
	ICuidados repositorie;

	@Override
	public void save(Cuidados cuidados) {
		repositorie.save(cuidados);
		
	}

	@Override
	public Optional<Cuidados> findById(Integer id) {
		return repositorie.findById(id);
	}

	@Override
	public void delate(Integer id) {
		repositorie.deleteById(id);
		
	}

	@Override
	public List<Cuidados> findAll() {
		return (List<Cuidados>)repositorie.findAll();
	}
}
