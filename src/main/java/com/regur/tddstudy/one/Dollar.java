package com.regur.tddstudy.one;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  @Override
  Money times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

}
