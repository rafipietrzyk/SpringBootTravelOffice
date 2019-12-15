package pl.accenture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.accenture.model.*;
import pl.accenture.repository.TravelOffice;

import java.util.Map;

@RestController
public class Test {

    @Autowired
    TravelOffice travelOffice;

    @GetMapping("/get")
    public Map<Long, Customer> getAllCustomer() {

        return travelOffice.getAllCustomer();
    }

    @PostMapping("/post")
    public Customer addCustomer(@RequestBody Customer customer) {

        travelOffice.addCustomer(customer);
        return customer;
    }
}




