package br.com.buono.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsuarioController {

    @GetMapping("/{id}")
    public boolean getValidate(@PathVariable int id) {
        return true;
    }

}
