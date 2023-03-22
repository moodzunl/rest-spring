package com.example.restservices.controllers;

import com.example.restservices.models.UsuarioModel;
import com.example.restservices.services.UsuarioService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioControler {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return this.usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> buscarPorId(@PathVariable Long id) {
        return this.usuarioService.buscarPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminarUsuario(@PathParam("id") Long id) {
        return this.usuarioService.eliminarUsuario(id);
    }

    @GetMapping("/")
    public UsuarioModel buscarPorEmail(@RequestParam("email") String email) {
        return this.usuarioService.buscarPorEmail(email);
    }

    @GetMapping("/nombre")
    public UsuarioModel buscarPorNombre(@RequestParam("nombre") String nombre) {
        return this.usuarioService.buscarPorNombre(nombre);
    }
}
