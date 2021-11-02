package br.com.pokemon.rest.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.pokemon.rest.model.Pokemon;

public class PokemonDTO {
	
	private long id;
	private String name;
	private int height;
	private int weight;
	private int base_xp;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getBase_xp() {
		return base_xp;
	}

	public PokemonDTO(Pokemon pokemon) {
		this.id = pokemon.getId();
		this.name = pokemon.getName();
		this.height = pokemon.getHeight();
		this.weight = pokemon.getWeight();
		this.base_xp = pokemon.getBase_xp();
	}

	public static List<PokemonDTO> converter(List<Pokemon> pokemons) {
		return pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList());
	}
	
}
