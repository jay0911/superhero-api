package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HeroInfoDto;
import com.example.demo.service.SuperHeroService;

@RestController
public class SuperHeroController {

	private final SuperHeroService superHeroService;
	
	@Autowired
	public SuperHeroController(SuperHeroService superHeroService) {
		this.superHeroService = superHeroService;
	}
	
	@GetMapping("/heroes")
	public HeroInfoDto getSuperHeroes() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return superHeroService.getHeroesInfo();
	}
}
