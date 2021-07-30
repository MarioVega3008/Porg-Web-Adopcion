package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.Adopcion;

public interface IAdopcionService {
	
	public void save(Adopcion adopcion);  //guardar -> create/Update
	public Optional<Adopcion> findById(Integer id); //consultar -> retrive
	public void delate(Integer id); //borrar ->delate
	public List<Adopcion> findAll(); //consultar

}
