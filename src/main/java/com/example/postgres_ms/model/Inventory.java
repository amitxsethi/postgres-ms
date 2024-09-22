package com.example.postgres_ms.model;

import java.util.List;

public record Inventory(List<Stock> stockList) {
}
