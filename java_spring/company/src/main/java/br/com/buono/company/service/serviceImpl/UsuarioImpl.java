package br.com.buono.company.service.serviceImpl;

import br.com.buono.company.Model.Usuario;
import br.com.buono.company.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService {

    @Override
    public boolean userValidate(Long id) {
        return false;
    }

    @Override
    public List<Usuario> usersPendents() {
        return null;
    }
}
