package com.techreturners.cats;

public abstract class CatStats implements Cat {
  protected boolean sleeping = false;
  protected int averageHeight = 300;
  protected String setting = "domestic";
  protected String eatSound = "yum";

  public void goToSleep() {
    sleeping = true;
  }

  public boolean isAsleep() {
    return sleeping;
  }

  public void wakeUp() {
    sleeping = false;
  }

  public String getSetting() {
    return setting;
  }

  public int getAverageHeight() {
    return averageHeight;
  }

  public String eat() {
    return eatSound;
  }
}
