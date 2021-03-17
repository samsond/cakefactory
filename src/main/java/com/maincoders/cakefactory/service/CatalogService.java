package com.maincoders.cakefactory.service;

import com.maincoders.cakefactory.domain.Item;
import com.maincoders.cakefactory.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.stream.StreamSource;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CatalogService {

    @Autowired
    private ItemRepo itemRepo;


    public Iterable<Item> getItems() {
        return StreamSupport.stream(itemRepo.findAll().spliterator(), false)
                .map(itemEntity -> new Item(itemEntity.getTitle(), itemEntity.getPrice()))
                .collect(Collectors.toList());
    }
}
