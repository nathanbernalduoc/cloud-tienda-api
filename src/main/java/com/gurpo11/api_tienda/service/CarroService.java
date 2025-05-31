package com.gurpo11.api_tienda.service;

import java.util.List;
import java.util.Optional;

import com.gurpo11.api_tienda.model.Carro;

public interface CarroService {

    List<Carro> getAllCarros();
    Optional<Carro> getCarroById(Long id);
    Carro createCarro(Carro carro);
    Carro updateCarro(Long id, Carro carro);
    void deleteCarro(Long id);


}
