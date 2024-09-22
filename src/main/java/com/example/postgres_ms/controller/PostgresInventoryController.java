package com.example.postgres_ms.controller;

import java.util.Arrays;


import com.example.postgres_ms.model.Item;
import com.example.postgres_ms.model.Inventory;
import com.example.postgres_ms.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PostgresInventoryController {

    @GetMapping("/postgresInventory")
    public Inventory getInventory() {
        return new Inventory(Arrays.asList(
            new Stock(Item.TV, 29990L),
            new Stock(Item.FRIDGE, 29990L),
            new Stock(Item.WASHING_MACHINE, 20L)
        ));
    }
}
