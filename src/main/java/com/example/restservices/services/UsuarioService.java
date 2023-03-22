package com.example.restservices.services;

import com.example.restservices.repositories.UsuarioRepository;
import com.example.restservices.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id) {
         try {
             usuarioRepository.deleteById(id);
             return true;
         } catch (Exception e) {
             return false;
         }
    }


    public UsuarioModel buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }



    public UsuarioModel buscarPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
}
