package edu.cnm.deepdive;

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public class CodingBatDogCat {

  public static void main(String[] args) {
    System.out.printf("for the String %s, the result is " + catDog("catdog") + ".\n", "catdog");
    System.out.printf("for the String %s, the result is " + catDog("catcat") + ".\n", "catcat");
    System.out.printf("for the String %s, the result is " + catDog("1cat1cadodog") + ".\n", "1cat1cadodog");
  }

  public static boolean catDog(String str) {
    int countDog = 0;
    int countCat = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("cat")) {
        countCat++;
      }
      if (str.substring(i, i + 3).equals("dog")) {
        countDog++;
      }
    }
    return (countCat == countDog);
  }

}
