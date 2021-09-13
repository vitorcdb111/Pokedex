package com.pokedex.pokedex.controller;

import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/pokedex")
public class PokedexController {

    @Autowired
    private PokemonService service;

    //Accept id or name
    @GetMapping(value="/{pokemon}")
    public String findPokemon(@PathVariable String pokemon)
    {
        return service.getPokemon(pokemon);
    }

}
