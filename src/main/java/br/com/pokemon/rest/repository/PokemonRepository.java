package br.com.pokemon.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pokemon.rest.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
