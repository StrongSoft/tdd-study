package com.regur.tddstudy.base;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BaseBallTest {

  @Test
  public void noMatch() {
    Game game = new Game(479);

    //0 스트라이크, 0 볼
    assertNoMatch(game.guess(123));
    assertNoMatch(game.guess(568));
    assertNoMatch(game.guess(321));
  }

  @Test
  public void allStrikes() {
    Game game = new Game(479);
    allStrikesMatch(game.guess(479));
    Game game1 = new Game(123);
    allStrikesMatch(game1.guess(123));
  }

  @Test
  public void someStrikes() {
    Game game = new Game(479);
    assertMatch(game.guess(359), 0, 1);
    assertMatch(game.guess(372), 0, 1);
    assertMatch(game.guess(486), 0, 1);

    assertMatch(game.guess(478), 0, 2);
    assertMatch(game.guess(379), 0, 2);
    assertMatch(game.guess(489), 0, 2);
  }

  private void assertMatch(Score s, int bcnt, int scnt) {
    assertThat(s.strikes()).isEqualTo(scnt);
    assertThat(s.balls()).isEqualTo(bcnt);
  }

  private void allStrikesMatch(Score s) {
    assertThat(s.strikes()).isEqualTo(3);
    assertThat(s.balls()).isEqualTo(0);
  }

  private void assertNoMatch(Score s) {
    assertThat(s.strikes()).isEqualTo(0);
    assertThat(s.balls()).isEqualTo(0);
  }
}
