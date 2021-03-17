package com.maincoders.cakefactory.controller;

import com.maincoders.cakefactory.domain.Item;
import com.maincoders.cakefactory.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/")
    public ModelAndView index() {
        Iterable<Item> items = catalogService.getItems();

        return new ModelAndView("catalog", Map.of("items", items));
//        return "catalog";
    }
}
