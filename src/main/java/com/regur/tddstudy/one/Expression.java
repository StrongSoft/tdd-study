package com.regur.tddstudy.one;

public interface Expression {

  Money reduce(Bank bank, String to);

  Expression plus(Expression addend);
}
