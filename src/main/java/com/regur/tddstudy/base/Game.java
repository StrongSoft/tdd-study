package com.regur.tddstudy.base;

public class Game {

  private int value;

  public Game(int value) {
    this.value = value;
  }

  public Score guess(int guess) {
    int scnt = 0;
    if (value % 10 == guess % 10) {
      scnt += 1;
    }
    if (value / 10 % 10 == guess / 10 % 10) {
      scnt += 1;
    }
    if (value / 100 == guess / 100) {
      scnt += 1;
    }
    return new Score(scnt, 0);
  }
}
