package com.gurpo11.api_tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gurpo11.api_tienda.model.Carro;
import com.gurpo11.api_tienda.service.CarroService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/carro/{id}")
    public List<Carro> getCarro(@PathVariable String id) {
        return carroService.getCarroByUsuarioId(id);
    }

    @PostMapping("/carro")
    public Carro setCarroProducto(@RequestBody Carro carro) {
        return carroService.createCarro(carro);
    }

}
