package com.techreturners.cats;

public class DomesticCat extends CatStats {

  public DomesticCat() {
    this.averageHeight = 23;
    this.setting = "domestic";
    this.eatSound = "Purrrrrrr";
  }

  @Override
  public String eat() {
    return super.eat();

  }
}
