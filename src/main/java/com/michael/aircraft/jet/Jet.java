package com.michael.aircraft.jet;

import com.michael.aircraft.Aircraft;

public class Jet extends Aircraft {
  
  private Integer numberOfEngines;

  public Jet(Integer id, String name, Integer speed, Integer numberOfEngines){
    super(id, name, speed);
    this.numberOfEngines = numberOfEngines;
  }

  public Integer getNumberOfEngines() {
    return numberOfEngines;
  }

  public void setNumberOfEngines(Integer numberOfEngines) {
    this.numberOfEngines = numberOfEngines;
  }

  @Override
  public String toString() {
    return super.toString() + " Jet [numberOfEngines=" + numberOfEngines + "]";
  }
}
