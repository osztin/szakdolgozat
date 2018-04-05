package com.szakdolgozat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.szakdolgozat.entity.Car;
import com.szakdolgozat.repository.CarRepository;

@Controller
public class IndexController {
	
	@Autowired
	CarRepository carRepo;

	@RequestMapping("/")
	public String index(){
		return "szevasz teszt" + getAllCars().toString();
	}
	
	public List<Car> getAllCars(){
		List<Car> cars = carRepo.findAll();
		
		return cars;
	}
}
