package catcafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatCafeTest {

  @Test
  void shouldHaveZeroCatsWhenCreated() {
    // given
    CatCafe cafe = new CatCafe();

    // when
    long result = cafe.getCatCount();

    // then
    assertEquals(0, result);
  }

  @Test
  void shouldAddOneCat() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat = new FelineOverLord("Giga Cat", 5);

    // when
    cafe.addCat(cat);

    // then
    assertEquals(1, cafe.getCatCount());
  }

  @Test
  void shouldFindCatCount() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat1 = new FelineOverLord("Omega Cat", 7);
    FelineOverLord cat2 = new FelineOverLord("Sigma Cat", 4);
    FelineOverLord cat3 = new FelineOverLord("Phi Cat", 100);
    cafe.addCat(cat1);
    cafe.addCat(cat2);
    cafe.addCat(cat3);

    // when
    long result = cafe.getCatCount();

    // then
    assertEquals(3, result);
  }

  @Test
  void shouldFindCatByName() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat = new FelineOverLord("Omega Cat", 7);
    cafe.addCat(cat);

    // when
    FelineOverLord result = cafe.getCatByName("Omega Cat");

    // then
    assertEquals(cat, result);
  }

  @Test
  void shouldReturnCatWithinWeightRange() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat1 = new FelineOverLord("Omega Cat", 7);
    FelineOverLord cat2 = new FelineOverLord("Sigma Cat", 4);
    FelineOverLord cat3 = new FelineOverLord("Phi Cat", 100);
    cafe.addCat(cat1);
    cafe.addCat(cat2);
    cafe.addCat(cat3);

    // when
    FelineOverLord result = cafe.getCatByWeight(3, 9);

    // then
    assertEquals(cat2, result);
  }

  @Test
  void shouldReturnNullWhenNameDoesNotExist() {
    // given
    CatCafe cafe = new CatCafe();
    FelineOverLord cat = new FelineOverLord("Omega Cat", 7);
    cafe.addCat(cat);

    // when
    FelineOverLord result = cafe.getCatByName("Hund");

    // then
    assertNull(result);
  }
}
