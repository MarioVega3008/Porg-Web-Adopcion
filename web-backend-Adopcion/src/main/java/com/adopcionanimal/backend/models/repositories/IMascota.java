package com.adopcionanimal.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adopcionanimal.backend.models.entities.Mascota;

public interface IMascota extends CrudRepository<Mascota, Integer>{

}
