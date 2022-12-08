package datastructures.hashtableTest;

import datastructures.hashtable.Hashtable;
import datastructures.hashtable.LeftJoin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class leftTest {

  Hashtable hashtable1;
  Hashtable hashtable2;


  @Test
  public void leftJoin1() {

    hashtable1 = new Hashtable();
    hashtable1.set("diligent", "employed");
    hashtable1.set("fond", "enamored");
    hashtable1.set("guide", "usher");
    hashtable1.set("outfit", "garb");
    hashtable1.set("wrath", "anger");



    hashtable2 = new Hashtable();
    hashtable2.set("diligent", "idle");
    hashtable2.set("fond", "averse");
    hashtable2.set("guide", "follow");
    hashtable2.set("flow", "jam");
    hashtable2.set("wrath", "delight");

    String[] one = {"outfit", "garb", "null"};
    String[] two = {"wrath", "anger", "delight"};
    String[] three = {"diligent", "employed", "idle"};
    String[] four = {"guide", "usher", "follow"};
    String[] five = {"fond", "enamored", "averse"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);
    expected.add(four);
    expected.add(five);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for(String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }
  }

  @Test
  public void leftJoin2() {

    hashtable1 = new Hashtable();
    hashtable1.set("diligent", "employed");
    hashtable1.set("fond", "enamored");
    hashtable1.set("guide", "usher");
    hashtable1.set("outfit", "garb");
    hashtable1.set("wrath", "anger");



    hashtable2 = new Hashtable();
    hashtable2.set("diligent", "idle");
    hashtable2.set("fond", "averse");
    hashtable2.set("guide", "follow");
    hashtable2.set("flow", "jam");
    hashtable2.set("wrath", "delight");

    String[] one = {"outfit", "garb", "null"};
    String[] two = {"wrath", "anger", "delight"};
    String[] three = {"diligent", "employed", "idle"};
    String[] four = {"guide", "usher", "follow"};
    String[] five = {"fond", "enamored", "averse"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);
    expected.add(four);
    expected.add(five);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for(String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }
  }
  @Test
  public void leftJoin3() {

    hashtable1 = new Hashtable();
    hashtable1.set("diligent", "employed");
    hashtable1.set("fond", "enamored");
    hashtable1.set("guide", "usher");
    hashtable1.set("outfit", "garb");
    hashtable1.set("wrath", "anger");



    hashtable2 = new Hashtable();
    hashtable2.set("diligent", "idle");
    hashtable2.set("fond", "averse");
    hashtable2.set("guide", "follow");
    hashtable2.set("flow", "jam");
    hashtable2.set("wrath", "delight");

    String[] one = {"outfit", "garb", "null"};
    String[] two = {"wrath", "anger", "delight"};
    String[] three = {"diligent", "employed", "idle"};
    String[] four = {"guide", "usher", "follow"};
    String[] five = {"fond", "enamored", "averse"};
    ArrayList<String[]> expected = new ArrayList<>();
    expected.add(one);
    expected.add(two);
    expected.add(three);
    expected.add(four);
    expected.add(five);

    System.out.println(LeftJoin.leftJoin(hashtable1, hashtable2));
    ArrayList<String[]> ans = LeftJoin.leftJoin(hashtable1, hashtable2);
    for(String[] arr : ans) {
      System.out.println(Arrays.toString(arr));
    }
  }
}
