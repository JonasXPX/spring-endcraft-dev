package dev.endcraft.rest.devrest.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private Integer id;
    private String userName;
    private String nome;
    private String sobrenome;
    private String password;

    public Usuario() {}
}
