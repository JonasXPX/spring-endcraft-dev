package dev.endcraft.rest.devrest.cont;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.endcraft.rest.devrest.entitys.Customer;
import dev.endcraft.rest.devrest.repository.CustumerRepository;

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