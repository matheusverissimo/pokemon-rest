package br.com.pokemon.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon.rest.dto.PokemonDTO;
import br.com.pokemon.rest.model.Pokemon;
import br.com.pokemon.rest.repository.PokemonRepository;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonRepository pokemonRepository;

	@RequestMapping("/pokemons")
	public List<PokemonDTO> getPokemons () {
		List<Pokemon> pokemons = pokemonRepository.findAll();
		return PokemonDTO.converter(pokemons);
	}
}
