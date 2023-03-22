package com.example.restservices.repositories;

import com.example.restservices.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    public abstract UsuarioModel findByEmail(String email);

    public abstract UsuarioModel findByNombre(String nombre);
}