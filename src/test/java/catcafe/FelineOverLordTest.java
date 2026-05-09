package catcafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FelineOverLordTest {

  /**
   * Warum sollte ich die return values von FelineOverLord testen wenn ich diese quasi in
   * CatCafeTest auch überprüfe? Erschien mir am Anfang etwas redundant aber in CatCafeTest
   * überprüfe ich nur ob die Verwaltung von CatCafe funktioniert und nicht ob die einzelnen Objekte
   * von FelineOverLord funktionieren.
   */
  @Test
  void shouldReturnName() {
    // given
    FelineOverLord cat = new FelineOverLord("Alpha Cat", 5);

    // when
    String result = cat.name();

    // then
    assertEquals("Alpha Cat", result);
  }

  @Test
  void shouldReturnWeight() {
    // given
    FelineOverLord cat = new FelineOverLord("Alpha Cat", 5);

    // when
    int result = cat.weight();

    // then
    assertEquals(5, result);
  }

  @Test
  void shouldReturnNegativeValueWhenCatIsLighter() {
    // given
    FelineOverLord cat1 = new FelineOverLord("Omega Cat", 7);
    FelineOverLord cat2 = new FelineOverLord("Feuerzeug", 4);

    // when
    int result = cat2.compareTo(cat1);

    // then
    assertTrue(result < 0, "Cat should be lighter");
  }

  @Test
  void shouldReturnPositiveValueWhenCatIsHeavier() {
    // given
    FelineOverLord cat1 = new FelineOverLord("Omega Cat", 7);
    FelineOverLord cat2 = new FelineOverLord("Alpha Cat", 4);

    // when
    int result = cat1.compareTo(cat2);

    // then
    assertTrue(result > 0, "Cat should be hefty");
  }

  @Test
  void shouldReturnCorrectToString() {
    // given
    FelineOverLord cat = new FelineOverLord("Alpha Cat", 5);

    // when
    String result = cat.toString();

    // then
    assertEquals("FelineOverLord[name=Alpha Cat, weight=5]", result);
  }

  @Test
  void shouldStoreLargeWeightCorrectly() {
    // given
    FelineOverLord cat = new FelineOverLord("Massive Cat", 999999999);

    // when
    int result = cat.weight();

    // then
    assertEquals(999999999, result);
  }
}
