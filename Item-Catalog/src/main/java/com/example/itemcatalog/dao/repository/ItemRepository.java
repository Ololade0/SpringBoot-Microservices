package com.example.itemcatalog.dao.repository;

import com.example.itemcatalog.dao.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {
}
