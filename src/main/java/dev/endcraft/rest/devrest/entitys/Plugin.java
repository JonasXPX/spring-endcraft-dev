package dev.endcraft.rest.devrest.entitys;

import javax.persistence.*;

@Entity
public class Plugin implements EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OrderBy
    private String name;
    private String description;

    private String minVersionSuported;

    @OneToOne
    @JoinColumn(name = "id")
    private Usuario id_user_add;

    public Plugin() {}
}
