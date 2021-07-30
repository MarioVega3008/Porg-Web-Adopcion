package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcionanimal.backend.models.entities.Rescatista;
import com.adopcionanimal.backend.models.repositories.IRescatista;
import com.adopcionanimal.backend.models.service.interfaces.IRescatistaService;

@Service
public class RescatistaService implements IRescatistaService {

				@Autowired
				IRescatista repositorie;

				@Override
				public void save(Rescatista rescatista) {
					repositorie.save(rescatista);
					
				}

				@Override
				public Optional<Rescatista> findById(Long id) {
					return repositorie.findById(id);
				}

				@Override
				public void delate(Long id) {
					repositorie.deleteById(id);
					
				}

				@Override
				public List<Rescatista> findAll() {
					return (List<Rescatista>)repositorie.findAll();
				}

}
