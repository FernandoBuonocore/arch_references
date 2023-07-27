package br.com.buono.company.http;

import br.com.buono.company.http.api.UsuarioApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController implements UsuarioApi {


    @Override
    @GetMapping("/{id}")
    public boolean getValidate(@PathVariable int id) {
        return true;
    }
}
