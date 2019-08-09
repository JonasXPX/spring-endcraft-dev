package dev.endcraft.rest.devrest;

import dev.endcraft.rest.devrest.repository.PluginRepository;
import dev.endcraft.rest.devrest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Base {

    @Autowired
    public PluginRepository pluginRepository;

    @Autowired
    public UsuarioRepository usuarioRepository;
}
