package com.example.demo.runtimeconfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Pessoa {
    private String nome;
    private int idade;
}