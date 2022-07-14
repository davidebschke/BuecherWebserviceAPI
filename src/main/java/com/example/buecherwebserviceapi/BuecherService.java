package com.example.buecherwebserviceapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuecherService {

    private final BuecherRepo buecherRepo;


    public BuecherService(BuecherRepo buecherRepo) {
        this.buecherRepo = buecherRepo;
    }

    public List<Buecher> listBuecher(){


        return buecherRepo.listBuecher();
    }
    public Buecher getBuecher(String isbn) {
        return buecherRepo.getBuecher(isbn);
    }
}
