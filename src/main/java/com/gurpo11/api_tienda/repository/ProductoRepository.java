package com.gurpo11.api_tienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurpo11.api_tienda.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    public Optional<Producto> getProductoByProductoId(Long id);

}
