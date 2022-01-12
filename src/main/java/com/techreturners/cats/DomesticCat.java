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
    return (new Random().nextBoolean() ? eatSound + ". " + eatingComment : eatSound);
  }
}
