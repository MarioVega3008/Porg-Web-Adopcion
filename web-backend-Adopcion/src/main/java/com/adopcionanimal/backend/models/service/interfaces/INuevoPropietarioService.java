package com.adopcionanimal.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.adopcionanimal.backend.models.entities.NuevoPropietario;

public interface INuevoPropietarioService {
	
	public void save(NuevoPropietario nuevopropietario);  //guardar -> create/Update
	public Optional<NuevoPropietario> findById(Long id); //consultar -> retrive
	public void delate(Long id); //borrar ->delate
	public List<NuevoPropietario> findAll(); //consultar

}
