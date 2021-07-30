package com.adopcionanimal.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adopcionanimal.backend.models.entities.NuevoPropietario;

public interface INuevoPropietario extends CrudRepository<NuevoPropietario, Long> {

}
