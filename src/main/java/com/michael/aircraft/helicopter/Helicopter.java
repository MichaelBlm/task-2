package com.michael.aircraft.helicopter;

import com.michael.aircraft.Aircraft;

public class Helicopter extends Aircraft {

  private Boolean hasRotor;

  public Helicopter(Integer id, String name, Integer speed, Boolean hasRotor) {
    super(id, name, speed);
    this.hasRotor = hasRotor;
  }

  public Boolean getHasRotor() {
    return hasRotor;
  }

  public void setHasRotor(Boolean hasRotor) {
    this.hasRotor = hasRotor;
  }

  @Override
  public String toString() {
    return super.toString() + " Helicopter [hasRotor=" + hasRotor + "]";
  }
  
}
