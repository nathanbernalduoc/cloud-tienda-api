package com.gurpo11.api_tienda.service;

import java.util.List;
import java.util.Optional;

import com.gurpo11.api_tienda.model.Carro;

public interface CarroService {

    public List<Carro> getAllCarros();
    public Optional<Carro> getCarroById(Long id);
    public Carro createCarro(Carro carro);
    public Carro updateCarro(Long id, Carro carro);
    void deleteCarro(Long id);

    public List<Carro> getCarroByUsuarioId(Long usuarioId);

}
