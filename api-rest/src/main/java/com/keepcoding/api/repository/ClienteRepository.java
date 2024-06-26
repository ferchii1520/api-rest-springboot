package com.keepcoding.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	List<Cliente> findByNombreAndApellido(String nombre, String apellido); // Este es un metodo 
//	@Query("SELECT c FROM Cliente c WHERE c.nombre = ?1 AND c.apellido = ?2") // Este es otro metodo por Query
	List<Cliente> findByEmailAndTelefono(String email, int telefono);
	
}
