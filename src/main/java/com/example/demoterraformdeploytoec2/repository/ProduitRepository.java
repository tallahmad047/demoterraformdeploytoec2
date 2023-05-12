package com.example.demoterraformdeploytoec2.repository;

import com.example.demoterraformdeploytoec2.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


//@RepositoryRestResource
@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
/* @RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
} */