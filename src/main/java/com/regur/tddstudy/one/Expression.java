package com.regur.tddstudy.one;

public interface Expression {

  Money reduce(String to);

  Money reduce(Bank bank, String to);
}
