package com.michael.aircraft.jet;

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
@RequestMapping("jet")
public class JetController {
  
  @Autowired
  JetService jetService;

  @GetMapping
  public List<Aircraft> getAllJets(){
    return jetService.getAllJets();
  }

  @GetMapping("/{id}")
  public Aircraft getJet(@PathVariable int id){
    return jetService.getJetById(id);
  }

  @PostMapping
  public void addJet(@RequestBody Jet jet) {
      jetService.addJet(jet);
  }

  @PutMapping("/{id}")
  public void updateJet(@PathVariable int id, @RequestBody Jet jet){
    jetService.updateJet(id, jet);
  }
  
  
}
