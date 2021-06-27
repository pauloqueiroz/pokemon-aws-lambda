package br.com.pokemon.repository;

import java.util.Arrays;
import java.util.List;

import br.com.pokemon.model.Pokemon;

public class PokemonListRepository {


	private static List<Pokemon> pokemons = Arrays.asList(new Pokemon("Charmander"), new Pokemon("Bulbasaur"), new Pokemon("Pikachu"));
	
	public List<Pokemon> getAll(){
		return pokemons;
	}
	
}
