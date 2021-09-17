package com.pokedex.pokedex.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokedex.pokedex.model.PokemonDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService{

    public PokemonDTO getPokemon(String pokemon)
    {
        System.out.println("Entrou no service");

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        PokemonDTO pokemonDTO = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + pokemon,  PokemonDTO.class);

        System.out.println("Pokemon " + pokemonDTO);
        return pokemonDTO;
    }
}
