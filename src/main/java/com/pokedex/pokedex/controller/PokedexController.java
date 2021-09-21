package com.pokedex.pokedex.controller;

import com.pokedex.pokedex.model.PokemonDTO;
import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value="/pokedex")
public class PokedexController {

    @Autowired
    private PokemonService service;

    //Accept id or name
    @GetMapping(value="/{pokemon}")
    public PokemonDTO findPokemon(@PathVariable String pokemon, HttpServletResponse response)
    {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return service.getPokemon(pokemon);
    }

}
