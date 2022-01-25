package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {

  private String eatingComment = "It will do I suppose.";

  public DomesticCat() {
    super(23,"domestic", "Purrrrrrr");
  }

  @Override
  public String eat() {
    return (new Random().nextBoolean() ? eatSound + ". " + eatingComment : eatSound);
  }
}
