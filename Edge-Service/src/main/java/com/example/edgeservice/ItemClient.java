package com.example.edgeservice;


import com.example.itemcatalog.dao.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("item-catalogue-service")
public interface ItemClient {
    @GetMapping("/items")
    CollectionModel<Item>readItems();

}


