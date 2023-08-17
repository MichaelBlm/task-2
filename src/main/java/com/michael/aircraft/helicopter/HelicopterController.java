package com.michael.aircraft.helicopter;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.aircraft.Aircraft;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("helicopter")
public class HelicopterController {
  
  @Autowired
  HelicopterService helicopterService;

  @GetMapping
  public List<Aircraft> getAllHelicopters(){
    return helicopterService.getAllHelicopters();
  }

  @GetMapping("/{id}")
  public Aircraft getHelicopter(@PathVariable int id){
    return helicopterService.getHelicopterById(id);
  }

  @PostMapping
  public void addHelicopter(@RequestBody Helicopter helicopter) {
      helicopterService.addHelicopter(helicopter);
  }

  @PutMapping("/{id}")
  public void updateHelicopter(@PathVariable int id, @RequestBody Helicopter helicopter){
    helicopterService.updateHelicopter(id, helicopter);
  }
  
  
}
