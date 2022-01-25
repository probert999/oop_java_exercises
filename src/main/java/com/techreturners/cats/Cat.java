package com.techreturners.cats;

public abstract class Cat implements Animal {
  protected boolean sleeping = false;
  protected int averageHeight;
  protected String setting;
  protected String eatSound;

  public Cat(int averageHeight, String setting, String eatSound)
  {
    this.averageHeight = averageHeight;
    this.setting = setting;
    this.eatSound = eatSound;
  }

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
