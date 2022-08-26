package com.regur.tddstudy.base;

public class Score {

  private int scnt, bcnt;

  public Score(int scnt, int bcnt) {
    this.scnt = scnt;
    this.bcnt = bcnt;
  }

  public int strikes() {
    return scnt;
  }

  public int balls() {
    return bcnt;
  }
}
