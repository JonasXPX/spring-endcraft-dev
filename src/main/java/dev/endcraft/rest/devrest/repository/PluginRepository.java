package dev.endcraft.rest.devrest.repository;

import dev.endcraft.rest.devrest.entitys.Plugin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PluginRepository extends CrudRepository<Plugin, Long> {

    List<Plugin> findByName(String name);

}
