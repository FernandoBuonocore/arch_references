package br.com.buono.company.service;

import br.com.buono.company.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public boolean userValidate(Long id);

    public List<Usuario> usersPendents();

}
