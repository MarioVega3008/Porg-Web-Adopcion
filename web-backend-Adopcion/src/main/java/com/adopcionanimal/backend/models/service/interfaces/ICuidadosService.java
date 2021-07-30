package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.Cuidados;

public interface ICuidadosService {
	
	public void save(Cuidados cuidados);  //guardar -> create/Update
	public Optional<Cuidados> findById(Integer id); //consultar -> retrive
	public void delate(Integer id); //borrar ->delate
	public List<Cuidados> findAll(); //consultar

}
