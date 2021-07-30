package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.Rescatista;

public interface IRescatistaService {
	
	public void save(Rescatista rescatista);  //guardar -> create/Update
	public Optional<Rescatista> findById(Long id); //consultar -> retrive
	public void delate(Long id); //borrar ->delate
	public List<Rescatista> findAll(); //consultar

}
