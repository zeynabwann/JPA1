package com.example.services;

import com.example.entities.Client;

public interface ClientService<T> extends Service<T> {
    Client searchClient(String telephone);

    Client searchClientBySurname(String surname);

}
