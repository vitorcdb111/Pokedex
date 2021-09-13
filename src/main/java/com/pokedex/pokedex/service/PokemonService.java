package com.pokedex.pokedex.service;

import com.pokedex.pokedex.model.PokemonDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    public String getPokemon(String pokemon)
    {
        System.out.println("Entrou no service");

        RestTemplate restTemplate = new RestTemplate();
        PokemonDTO pokemonDTO = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + pokemon, PokemonDTO.class);
        System.out.println("Pokemon " + pokemonDTO);
        //return getPokemon(pokemon);
        return "";
    }
}
