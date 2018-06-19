package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.HeroInfoDto;
import com.example.demo.models.SuperHero;
import com.example.demo.service.SuperHeroService;

@Service
public class SuperHeroServiceImpl implements SuperHeroService{

	@Override
	public HeroInfoDto getHeroesInfo() {
		return new HeroInfoDto(getSuperHeroes());
	}
	
	private List<SuperHero> getSuperHeroes(){
		
		List<SuperHero> heroes = new ArrayList<SuperHero>();
		
		heroes.add(new SuperHero("captain america", "strong super soldier", "http://news.toyark.com/wp-content/uploads/sites/4/2018/03/NECA-Civil-War-Captain-America-003.jpg"));
		heroes.add(new SuperHero("iron man", "rich and intelligent", "https://i.ytimg.com/vi/HpX1mDEw1gk/hqdefault.jpg"));
		heroes.add(new SuperHero("spiderman", "little kid", "https://i.kinja-img.com/gawker-media/image/upload/s--GmQPldmJ--/c_scale,f_auto,fl_progressive,q_80,w_800/e0aprurs0qsetk9ud48d.jpg"));
		
		return heroes;		
	}

}
