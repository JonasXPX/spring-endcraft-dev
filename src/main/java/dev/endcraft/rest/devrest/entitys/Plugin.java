package dev.endcraft.rest.devrest.entitys;

import javax.persistence.*;

@Entity
public class Plugin {

    @Id
    private Integer id;

    @OrderBy
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private String minVersionSuported;

    @OneToOne
    @JoinColumn(name = "id")
    private Usuario id_user_add;

    public Plugin() {}
}
