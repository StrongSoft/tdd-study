package com.regur.tddstudy.one;

class Money implements Expression {

  protected String currency;
  protected int amount;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency.equals(money.currency);
  }

  String currency() {
    return currency;
  }

  @Override
  public String toString() {
    return currency + " " + amount;
  }

  Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  public Money reduce(String to) {
    return this;
  }
}
