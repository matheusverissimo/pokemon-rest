package br.com.pokemon.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moves")
public class Move {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="move_id")
	private Long id;

	@Column(name="move_name")
	private String name;
	
	@Column(name="move_pp")
	private Integer powerPoints;
	
	@Column(name="move_power")
	private Integer power;
	
	@Column(name="move_accuracy")
	private Integer accuracy;
	
	
	public Move() {}
	
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
	public Integer getPowerPoints() {
		return powerPoints;
	}
	public void setPowerPoints(Integer powerPoints) {
		this.powerPoints = powerPoints;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Integer getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accuracy == null) ? 0 : accuracy.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((power == null) ? 0 : power.hashCode());
		result = prime * result + ((powerPoints == null) ? 0 : powerPoints.hashCode());
		return result;
	}
}
