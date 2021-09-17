package com.pokedex.pokedex.controller;

import com.pokedex.pokedex.model.PokemonDTO;
import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping(value="/pokedex")
public class PokedexController implements Serializable {

    @Autowired
    private PokemonService service;

    //Accept id or name
    @GetMapping(value="/{pokemon}")
    public PokemonDTO findPokemon(@PathVariable String pokemon) throws Exception
    {
        return service.getPokemon(pokemon);
    }

}
