package com.example.restservices.repositories;

import com.example.restservices.models.ClienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Long> {

    public abstract ClienteModel findByEmail(String email);

    public abstract ClienteModel findByNombre(String nombre);
}