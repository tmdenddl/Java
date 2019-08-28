package PokemonGo;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        // If no corresponding ArrayList exist, create one
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        // PokemonList with the corresponding name
        ArrayList<Pokemon> pokemonList = getPokemons(name);

        if (pokemonList == null) {
            return null;
        }

        Pokemon strongest = null;

        for (Pokemon pokemon : getPokemons(name)) {
            if (strongest == null || pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }

        return strongest;
    }

    public Pokemon getStrongest() {
        Pokemon strongest = null;

        // Search through HashMap
        for (String key : pokemons.keySet()) {
            // Find the strongest Pokemon with the name(key)
            Pokemon p = getStrongest(key);

            // Find which one is stronger
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
            }
        }

        return strongest;
    }
}