package dev.endcraft.rest.devrest.cont;

import dev.endcraft.rest.devrest.Base;
import dev.endcraft.rest.devrest.entitys.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
public class UsuarioController extends Base {

    @GetMapping(path = "/v1/usuario/{id}")
    @ResponseBody
    public Usuario getUsuarioById(@PathVariable("id") Long id, HttpServletResponse response) {
        Optional<Usuario> byId = this.usuarioRepository.findById(id);
        if(!byId.isPresent()) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }
        return byId.get();
    }

    @PostMapping(path = "/v1/usuario/set/")
    @ResponseBody
    public Iterable<Usuario> setUsuario(@RequestBody Usuario req) {
        this.usuarioRepository.save(req);
        return this.usuarioRepository.findAll();
    }
}
