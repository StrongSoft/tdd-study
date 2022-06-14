package com.regur.tddstudy.one;

public abstract class Money {

  abstract Money times(int multiplier);

  protected int amount;
  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount);
  }

  public boolean equals(Object object){
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
