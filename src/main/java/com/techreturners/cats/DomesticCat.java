package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatStats {

  private String eatingComment = "It will do I suppose.";

  public DomesticCat() {
    this.averageHeight = 23;
    this.setting = "domestic";
    this.eatSound = "Purrrrrrr";
  }

  @Override
  public String eat() {
    boolean randomComment = new Random().nextBoolean();

    return (randomComment ? eatSound + ". " + eatingComment : eatSound);
  }
}
