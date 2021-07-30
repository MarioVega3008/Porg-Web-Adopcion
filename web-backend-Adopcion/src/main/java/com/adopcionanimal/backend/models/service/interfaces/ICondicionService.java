package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.Condicion;

public interface ICondicionService {

	public void save(Condicion condicion);  //guardar -> create/Update
	public Optional<Condicion> findById(Integer id); //consultar -> retrive
	public void delate(Integer id); //borrar ->delate
	public List<Condicion> findAll(); //consultar
}
