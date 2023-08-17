package com.michael.aircraft.helicopter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.michael.aircraft.Aircraft;

@Service
public class HelicopterService {
  HashMap<Integer, Aircraft> helicopters = new HashMap<>();

  public List<Aircraft> getAllHelicopters(){
    return new ArrayList<Aircraft>(helicopters.values());
  }

  public void addHelicopter(Helicopter helicopter){
      Integer id = helicopters.size() + 1;
      helicopter.setId(id);
      helicopters.put(id, helicopter);
      System.out.println(helicopter);
  }

  public Aircraft getHelicopterById(int id){
    if(helicopters.containsKey(id))
    return helicopters.get(id);
  else
    throw new IllegalStateException("Helicopter not found.");
  }

  public void updateHelicopter(int id, Aircraft helicopter){
    helicopters.remove(id);
    helicopter.setId(id);
    helicopters.put(id, helicopter);
    System.out.println(helicopter);
  }
}
