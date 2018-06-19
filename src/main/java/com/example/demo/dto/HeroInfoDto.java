package com.example.demo.dto;

import java.util.List;

import com.example.demo.models.SuperHero;

public class HeroInfoDto {
	public HeroInfoDto() {}	
	
	public HeroInfoDto(List<SuperHero> heroes) {
		super();
		this.heroes = heroes;
	}

	private List<SuperHero> heroes;

	public List<SuperHero> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<SuperHero> heroes) {
		this.heroes = heroes;
	}

}
