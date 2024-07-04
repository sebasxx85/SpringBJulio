package com.desafioCliente.desafio.servicies;


import com.desafioCliente.desafio.entities.Client;
import com.desafioCliente.desafio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client save(Client client){
        return repository.save(client);
    }

    public List<Client> readAll(){
        return repository.findAll();
    }

    public Optional<Client> readOne(Long id){
        return repository.findById(id);
    }


    public Client findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
