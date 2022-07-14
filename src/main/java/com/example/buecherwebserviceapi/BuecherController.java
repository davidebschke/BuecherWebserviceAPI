package com.example.buecherwebserviceapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="/Buecher")
public class BuecherController {


    private final BuecherService buecherService;

    public BuecherController(BuecherService buecherService) {
        this.buecherService = buecherService;
    }

    @GetMapping()

    public List<Buecher> getAllBuecher(){


        return buecherService.listBuecher();
    }

    @GetMapping("{isbn}")
    public Buecher getBuecher(@PathVariable String isbn) {
        return buecherService.getBuecher(isbn);
    }
}
