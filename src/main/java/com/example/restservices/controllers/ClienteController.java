package com.example.restservices.controllers;

import com.example.restservices.models.ClienteModel;
import com.example.restservices.services.ClienteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes() {
        return this.clienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel usuario) {
        return this.clienteService.guardarCliente(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> buscarPorId(@PathVariable Long id) {
        return this.clienteService.buscarPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminarCliente(@PathVariable("id") Long id) {
        return this.clienteService.eliminarCliente(id);
    }

    @GetMapping("/")
    public ClienteModel buscarPorEmail(@RequestParam("email") String email) {
        return this.clienteService.buscarPorEmail(email);
    }

    @GetMapping("/nombre")
    public ClienteModel buscarPorNombre(@RequestParam("nombre") String nombre) {
        return this.clienteService.buscarPorNombre(nombre);
    }
}
