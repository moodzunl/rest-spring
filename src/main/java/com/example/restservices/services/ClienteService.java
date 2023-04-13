package com.example.restservices.services;

import com.example.restservices.models.ClienteModel;
import com.example.restservices.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes() {
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
    public ClienteModel guardarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public boolean eliminarCliente(Long id) {
         try {
             clienteRepository.deleteById(id);
             return true;
         } catch (Exception e) {
             return false;
         }
    }

    public ClienteModel buscarPorEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public ClienteModel buscarPorNombre(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }
}
