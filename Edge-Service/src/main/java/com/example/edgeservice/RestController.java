package com.example.edgeservice;

import com.example.itemcatalog.dao.model.Item;

import java.util.Collection;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final ItemClient itemClient;

    public RestController(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    public Collection<Item>goodItem(){
        return itemClient.readItems()
                .getContent()
                .stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Item item) {
        return !item.getName().equals("Nike") &&
                !item.getName().equals("Adidas") &&
                !item.getName().equals("Reebok");
    }
}
