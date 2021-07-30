package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.Mascota;

public interface IMascotaService {
	
	public void save(Mascota mascota);  //guardar -> create/Update
	public Optional<Mascota> findById(Integer id); //consultar -> retrive
	public void delate(Integer id); //borrar ->delate
	public List<Mascota> findAll(); //consultar

}
