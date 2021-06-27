package br.com.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon.model.Pokemon;
import br.com.pokemon.service.PokemonService;

@RestController
public class PokemonController {

	@Autowired
	PokemonService service;
	
	
	 @RequestMapping(path = "/pokemons", method = RequestMethod.GET, produces = "application/json")
	 public List<Pokemon> getPokemons(){
		 return service.listAll(); 
	 }
}
