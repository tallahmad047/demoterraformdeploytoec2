package com.example.demoterraformdeploytoec2;

import com.example.demoterraformdeploytoec2.model.Produit;
import com.example.demoterraformdeploytoec2.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demoterraformdeploytoec2Application implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(Demoterraformdeploytoec2Application.class, args);
    }
    @Override
    public  void run (String... args)  throws Exception{
        produitRepository.save(new Produit(null,"splina",22760,30,
                "liquide chlorophyle","splina.jpg","Boison"));
        produitRepository.save(new Produit(null,"Mocha",42760,10,
                "cafe resistance","mocha.jpg","Cafe"));
        produitRepository.save(new Produit(null,"Cocollagen",12760,06,
                "chocolat chaud","c.jpg","Chocolat"));
        produitRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
    }

}
