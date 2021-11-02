package br.com.pokemon.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pok_id")
	private Long id;

	@Column(name="pok_name")
	private String name;

	@Column(name="pok_height")
	private Integer height;

	@Column(name="pok_weight")
	private Integer weight;

	@Column(name="pok_base_experience")
	private Integer base_xp;
	
	public Pokemon(Long id, String name, Integer height, Integer weight, Integer base_xp) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.base_xp = base_xp;
	}
	
	public Pokemon() {}
	
	public Integer getBase_xp() {
		return base_xp;
	}
	
	public void setBase_xp(Integer base_xp) {
		this.base_xp = base_xp;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}
	
}
