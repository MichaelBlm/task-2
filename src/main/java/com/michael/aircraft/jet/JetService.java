package com.michael.aircraft.jet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.michael.aircraft.Aircraft;

@Service
public class JetService {
  HashMap<Integer, Aircraft> jets = new HashMap<>();

  public List<Aircraft> getAllJets(){
    return new ArrayList<Aircraft>(jets.values());
  }

  public void addJet(Jet jet){
      Integer id = jets.size() + 1;
      jet.setId(id);
      jets.put(id, jet);
      System.out.println(jet);
  }

  public Aircraft getJetById(int id){
    if(jets.containsKey(id))
    return jets.get(id);
  else
    throw new IllegalStateException("Jet not found.");
  }

  public void updateJet(int id, Aircraft jet){
    jets.remove(id);
    jet.setId(id);
    jets.put(id, jet);
    System.out.println(jet);
  }
}
