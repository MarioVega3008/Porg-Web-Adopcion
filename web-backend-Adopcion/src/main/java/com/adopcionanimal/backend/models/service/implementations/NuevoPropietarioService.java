package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcionanimal.backend.models.entities.NuevoPropietario;
import com.adopcionanimal.backend.models.repositories.INuevoPropietario;
import com.adopcionanimal.backend.models.service.interfaces.INuevoPropietarioService;

@Service
public class NuevoPropietarioService implements INuevoPropietarioService {
		

			@Autowired
			INuevoPropietario repositorie;

			@Override
			public void save(NuevoPropietario nuevopropietario) {
				repositorie.save(nuevopropietario);
				
			}

			@Override
			public Optional<NuevoPropietario> findById(Long id) {
				return repositorie.findById(id);
			}

			@Override
			public void delate(Long id) {
				repositorie.deleteById(id);
				
			}

			@Override
			public List<NuevoPropietario> findAll() {
				return (List<NuevoPropietario>)repositorie.findAll();
			}
}
