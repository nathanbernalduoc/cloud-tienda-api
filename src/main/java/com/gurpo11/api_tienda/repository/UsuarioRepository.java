package com.gurpo11.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gurpo11.api_tienda.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
