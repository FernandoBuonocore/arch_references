package br.com.buono.company.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Usuario {

    @Id
    private Long id;

    private String login;

    private String nomeCompleto;
}
