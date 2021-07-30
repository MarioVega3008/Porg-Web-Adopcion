package com.adopcionanimal.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopcionanimal.backend.models.entities.Mascota;
import com.adopcionanimal.backend.models.repositories.IMascota;
import com.adopcionanimal.backend.models.service.interfaces.IMascotaService;

@Service
public class MascotaService implements IMascotaService {
	

		@Autowired
		IMascota repositorie;

		@Override
		public void save(Mascota mascota) {
			repositorie.save(mascota);
			
		}

		@Override
		public Optional<Mascota> findById(Integer id) {
			return repositorie.findById(id);
		}

		@Override
		public void delate(Integer id) {
			repositorie.deleteById(id);
			
		}

		@Override
		public List<Mascota> findAll() {
			return (List<Mascota>)repositorie.findAll();
		}

}
