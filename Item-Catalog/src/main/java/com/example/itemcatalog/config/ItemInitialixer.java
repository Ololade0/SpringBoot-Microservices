package com.example.itemcatalog.config;

import com.example.itemcatalog.dao.model.Item;
import com.example.itemcatalog.dao.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ItemInitialixer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    public ItemInitialixer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan"
        , "Nike").forEach(item -> itemRepository.save(new Item(item)));
        itemRepository.findAll().forEach(System.out::println);



    }
}
