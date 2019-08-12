package dev.endcraft.rest.devrest.entitys;

import javax.persistence.*;

@Entity
public class Usuario implements EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String nome;
    private String email;
    private String sobreNome;
    private String password;



    public Usuario() {}
    public Usuario(Long id) {this.id = id;}

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobreNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobreNome = sobrenome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "username: " + userName + " password: " + password + " nome: " + nome + " sobrenome: " + sobreNome + " email: " + email;
    }
}
