package com.bazar.backend.service;

import com.bazar.backend.model.Cliente;
import com.bazar.backend.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public void saveCliente(Cliente cli) {
        clienteRepo.save(cli);
    }

    @Override
    public List<Cliente> getAllClientes() {
        List<Cliente> listaClientes = clienteRepo.findAll();
        return listaClientes;
    }

    @Override
    public Cliente getCliente(Long id) {
        Cliente clienteBuscado = clienteRepo.findById(id).orElse(null);
        return clienteBuscado;
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente editCliente(Long idClienteBuscado, Long idNuevo, String nombreNuevo, String apellidoNuevo, String dniNuevo) {
        Cliente clienteParaModificar = this.getCliente(idClienteBuscado);

        if(clienteParaModificar != null) {
            clienteParaModificar.setId_cliente(idNuevo);
            clienteParaModificar.setNombre(nombreNuevo);
            clienteParaModificar.setApellido(apellidoNuevo);
            clienteParaModificar.setDni(dniNuevo);

            this.saveCliente(clienteParaModificar);
        }
        return clienteParaModificar;
    }

}
