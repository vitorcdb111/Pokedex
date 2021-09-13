package com.pokedex.pokedex.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {
    private String id;
    private String name;
    private String[] type;
    private Double height;
    private Double weight;
}
