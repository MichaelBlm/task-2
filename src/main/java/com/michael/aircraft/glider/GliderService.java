package com.michael.aircraft.glider;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.michael.aircraft.Aircraft;

@Service
public class GliderService {

  HashMap<Integer, Aircraft> gliders = new HashMap<>();


  public ArrayList<Aircraft> getAllGliders(){
    return new ArrayList<Aircraft>(gliders.values());
  }

  public void addGlider(Glider glider){
    Integer id = gliders.size() + 1;
    glider.setId(id);
    gliders.put(id, glider);
    System.out.println(glider);
    
  }
  public Aircraft getGliderById(int id){
    if(gliders.containsKey(id))
      return gliders.get(id);
    else
      throw new IllegalStateException("Glider not found.");
  }

}
