package com.michael.aircraft.glider;

import com.michael.aircraft.Aircraft;

public class Glider extends Aircraft{
  
  private Boolean hasWings;

  public Glider(Integer id, String name, Integer speed, Boolean hasWings){
    super(id, name, speed);
    this.hasWings = hasWings;
  }

  public Boolean getHasWings() {
    return hasWings;
  }

  public void setHasWings(Boolean hasWings) {
    this.hasWings = hasWings;
  }

  @Override
  public String toString() {
    return super.toString() + " Glider [hasWings=" + hasWings + "]";
  }
  
}
