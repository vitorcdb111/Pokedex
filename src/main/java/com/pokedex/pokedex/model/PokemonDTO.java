package com.pokedex.pokedex.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO implements Serializable {
    private String id;
    private String name;
    private List<Object> types;
    private Double height;
    private Double weight;
}
