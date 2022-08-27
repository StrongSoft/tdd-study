package com.regur.tddstudy.one;

public abstract class Money {

  protected String currency;
  protected int amount;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  abstract Money times(int amount);

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  String currency() {
    return currency;
  }
}
