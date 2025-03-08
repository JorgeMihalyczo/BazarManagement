package com.bazar.backend.service;

import com.bazar.backend.model.Cliente;

import java.util.List;

public interface IClienteService {

    // Crear nuevo cliente
    public void saveCliente(Cliente cli);

    // Listar todos los clientes
    public List<Cliente> getAllClientes();

    // Obtener cliente especifico
    public Cliente getCliente(Long id);

    // Eliminar cliente
    public void deleteCliente(Long id);

    // Editar Cliente
    public Cliente editCliente(Long idClienteBuscado,
                               Long idNuevo,
                               String nombreNuevo,
                               String apellidoNuevo,
                               String dniNuevo);
}
