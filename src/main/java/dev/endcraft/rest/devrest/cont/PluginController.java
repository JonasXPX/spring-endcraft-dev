package dev.endcraft.rest.devrest.cont;

import dev.endcraft.rest.devrest.Base;
import dev.endcraft.rest.devrest.entitys.Plugin;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class PluginController extends Base {

    @ResponseBody
    @GetMapping(path = "/v1/plugin/{id}")
    public Plugin getPlugin(@PathVariable("id") Long id) {
        return this.pluginRepository.findById(id).get();
    }

    @ResponseBody
    @GetMapping(path = "/v1/plugin/name/{name}")
    public List<Plugin> getPluginsByName(@PathVariable String name) {
        return this.pluginRepository.findByName(name);
    }

    @ResponseBody
    @PostMapping(path = "/v1/plugin/delete/{id}")
    public ResponseEntity<?> deletePluginById(@PathVariable Long id, HttpServletResponse response) throws IOException {

        if(this.pluginRepository.existsById(id)){
            this.pluginRepository.deleteById(id);
            return ResponseEntity.ok("done");
        }
        return ResponseEntity.status(HttpServletResponse.SC_FORBIDDEN).body(Stream.of("Plugin Não encontrado"));
    }

    @ResponseBody
    @PostMapping(path = "/v1/plugin/add")
    public Plugin addPlugin(@RequestBody Plugin plugin){
        Plugin save = this.pluginRepository.save(plugin);
        return save;
    }

}
