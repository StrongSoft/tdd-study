package com.regur.tddstudy.one;

import java.util.Hashtable;

public class Bank {

  private Hashtable rates = new Hashtable();

  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  public void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), new Integer(rate));
  }

  int rate(String from, String to) {
    if (from.equals(to)) {
      return 1;
    }
    Integer rate = (Integer) rates.get(new Pair(from, to));
    return rate.intValue();
  }

  private class Pair {

    private String from;
    private String to;

    public Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    @Override
    public boolean equals(Object o) {
      Pair pair = (Pair) o;
      return from.equals(pair.from) && to.equals(pair.to);
    }

    @Override
    public int hashCode() {
      return 0;
    }
  }
}
