package com.example.services;

import java.util.List;

import com.example.entities.Client;
import com.example.repository.Repository;

public class ClientServiceImpl implements ClientService<Client> {
    private final Repository<Client> clientRepository = null;

  
    @Override
    public void create(Client client) {
        clientRepository.insert(client);
    }

    @Override
    public List<Client> show() {
        return clientRepository.selectAll();
    }

    @Override
    public Client searchClient(String telephone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchClient'");
    }

    @Override
    public Client searchClientBySurname(String surname) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchClientBySurname'");
    }
}