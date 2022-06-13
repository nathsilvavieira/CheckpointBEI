package com.dh.catalog.repository;


import com.dh.catalog.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    Catalog findByNome(String nome);
}
