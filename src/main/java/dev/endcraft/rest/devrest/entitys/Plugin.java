package dev.endcraft.rest.devrest.entitys;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Plugin implements EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull
    @OrderBy
    @Column(nullable = false)
    private String name;
    private String description;

    private String minVersionSuported;

    @ManyToOne(targetEntity = Usuario.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario id_user_add;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinVersionSuported() {
        return minVersionSuported;
    }

    public void setMinVersionSuported(String minVersionSuported) {
        this.minVersionSuported = minVersionSuported;
    }

    public Usuario getId_user_add() {
        return id_user_add;
    }

    public void setId_user_add(Usuario id_user_add) {
        this.id_user_add = id_user_add;
    }

    public Plugin() {}
}
