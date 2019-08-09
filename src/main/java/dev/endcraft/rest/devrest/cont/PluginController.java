package dev.endcraft.rest.devrest.cont;

import com.google.common.collect.Lists;
import dev.endcraft.rest.devrest.entitys.Plugin;
import dev.endcraft.rest.devrest.repository.PluginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PluginController {

    @Autowired
    private PluginRepository pr;

    @ResponseBody
    @GetMapping(path = "/v1/plugin/{id}")
    public Plugin getPlugin(@PathVariable("id") Long id) {
        return pr.findById(id).get();
    }

    @ResponseBody
    @GetMapping(path = "/v1/plugin/name/{name}")
    public List<Plugin> getPluginsByName(@PathVariable String name) {
        //Em andamento.
        return Lists.newArrayList();
    }

}
