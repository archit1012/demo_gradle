package com.example.demo.constants;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Demo {
    DRAFT("DRAFT");

    private final String demo;
}
