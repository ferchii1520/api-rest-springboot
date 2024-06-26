package com.keepcoding.api.service;

import java.util.List;

import com.keepcoding.api.entity.Cliente;

public interface ClienteService {
	
	public Cliente buscarPorId(Long id); // Metodo que devuelve un cliente por id
	public Cliente guardar(Cliente cliente); // Metodo para registrat un cliente
	public List<Cliente> buscarTodos(); // Metodo para devolver todos los clientes
	public List<Cliente> buscarPorNombreApellido(String nombre, String apellido); // Metodo que devuelve un cliente por nombre y apellido
	public List<Cliente> buscarPorEmailTelefono(String email, Integer telefono); // Metodo que devuelve un cliente por email y telefono

}
