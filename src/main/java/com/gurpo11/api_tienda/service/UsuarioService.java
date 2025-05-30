package com.gurpo11.api_tienda.service;

import java.util.List;
import java.util.Optional;

import com.gurpo11.api_tienda.model.Usuario;

public interface UsuarioService {

    public List<Usuario> getAllUsuarios();
    public Optional<Usuario> getUsuarioById(Long id);
    public Usuario createUsuario(Usuario usuario);
    public Usuario updateUsuario(Long id, Usuario usuario);
    void deleteUsuario(Long id);


}
