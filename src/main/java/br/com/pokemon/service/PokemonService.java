package br.com.pokemon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pokemon.model.Pokemon;
import br.com.pokemon.repository.PokemonListRepository;

@Service
public class PokemonService {

	public List<Pokemon> listAll(){
		return new PokemonListRepository().getAll();
	}
}
