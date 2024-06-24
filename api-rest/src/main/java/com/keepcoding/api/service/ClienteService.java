package com.keepcoding.api.service;

import java.util.List;

import com.keepcoding.api.entity.Cliente;

public interface ClienteService {
	public List<Cliente> buscarTodos(); // Metodo para devolver todos los clientes
	public Cliente buscarPorId(Long id); // Metodo que devuelve un cliente por id
	public Cliente guardar(Cliente cliente); // Metodo para registrat un cliente
}
