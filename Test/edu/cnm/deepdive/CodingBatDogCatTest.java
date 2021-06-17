package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatDogCatTest {

  private static String[] testParams = {
      "catdog",
      "catcat",
      "1cat1cadodog",
      "catxxdogxxxdog",
      "catxdogxdogxcat",
      "catxdogxdogxca",
      "dogdogcat",
      "dogogcat",
      "dog",
      "cat",
      "ca",
      "c",
      ""
  };

  private static boolean[] testExpected = {
      true, false, true,
      false,true, false,
      false, true, false,
      false, true, true, true
  };

  @Test
  void test() {
    for (int i = 0; i < testParams.length; i++) {
      boolean actual = CodingBatDogCat.catDog(testParams[i]);
      Assertions.assertEquals(actual, testExpected[i]);

    }
  }

}