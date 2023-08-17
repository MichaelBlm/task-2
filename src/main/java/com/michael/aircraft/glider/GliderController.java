package com.michael.aircraft.glider;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.aircraft.Aircraft;

@RestController
@RequestMapping("/glider")
public class GliderController {

  @Autowired
  GliderService gliderService;

  @GetMapping
  public List<Aircraft> getGliders(){
    return gliderService.getAllGliders();
  }

  @PostMapping
  public void addGlider(@RequestBody Glider glider){
    gliderService.addGlider(glider);
  }

  @GetMapping("/{id}")
  public Aircraft Glider(@PathVariable int id){
    return gliderService.getGliderById(id);
  }
}
