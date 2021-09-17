package com.pokedex.pokedex.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {
    private String id;
    private String name;
    private List<Object> abilities;
    private List<Object> types;
    private List<Object> stats;
    private Double height;
    private Double weight;
}
