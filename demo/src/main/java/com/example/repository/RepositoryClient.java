package com.example.repository;

public interface RepositoryClient<T> extends Repository<T>{
    T selectByTelephone(String telephone);
    T selectBySurname(String surname);
}