package com.maincoders.cakefactory.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class Item {
    final private String title;
    final private BigDecimal price;
}
