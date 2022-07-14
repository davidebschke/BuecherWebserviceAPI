package com.example.buecherwebserviceapi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Repository
public class BuecherRepo {

    private final Map<Integer,Buecher> buecher =Map.of( 1, new Buecher(1, "Faust","0345391802"),
            2, new Buecher(2, "Harry Potter","0345388802"),
            3, new Buecher(3, "Herr der Ringe","0399391802"),
            4, new Buecher(4, "Grundkurs Java","0345111802"));

    public List<Buecher> listBuecher() {
        return new ArrayList<>(buecher.values());
    }

    public Buecher getBuecher(String isbn) {

        Buecher bueche = buecher.get(isbn);
        if (buecher == null) {
            throw new NoSuchElementException("No product with id " + isbn + " found in this product repo.");
        }
        return bueche;


    }
}


