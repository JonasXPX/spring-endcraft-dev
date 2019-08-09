package dev.endcraft.rest.devrest.cont;

import dev.endcraft.rest.devrest.entitys.Customer;
import dev.endcraft.rest.devrest.repository.CustumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @Autowired
    private CustumerRepository cr;

    @RequestMapping({"/api/add/{name}", "/api/add/{name}/{email}"})
    public void add(@PathVariable("name") String name, @PathVariable("email") String email) {
        cr.save(new Customer(name, email != null && !email.equals("") ? email : ""));
    }

    @ResponseBody
    @RequestMapping(path = "/api/list", method = RequestMethod.GET)
    public Iterable<Customer> getAllCostumers() {
        return cr.findAll();
    }



}