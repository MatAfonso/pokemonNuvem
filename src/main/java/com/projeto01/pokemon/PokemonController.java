package com.projeto01.pokemon;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PokemonController {

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() {
        return Arrays.asList(
            new Pokemon("Pikachu", 35, "Elétrico"),
            new Pokemon("Charmander", 39, "Fogo"),
            new Pokemon("Bulbasaur", 45, "Grama/Veneno"),
            new Pokemon("Squirtle", 44, "Água")
        );
    }
}