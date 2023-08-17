package com.michael.aircraft;

public abstract class Aircraft {
  private Integer id;
  private String name;
  private Integer speed;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getSpeed() {
    return speed;
  }
  public void setSpeed(Integer speed) {
    this.speed = speed;
  }
  public Aircraft(Integer id, String name, Integer speed) {
    this.id = id;
    this.name = name;
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Aircraft [id=" + id + ", name=" + name + ", speed=" + speed + "]";
  }

}
