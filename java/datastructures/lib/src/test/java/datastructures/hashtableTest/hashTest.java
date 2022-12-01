package datastructures.hashtableTest;

import datastructures.hashtable.Entry;
import datastructures.hashtable.Hashtable;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class hashTest {
  Hashtable testHashtable;

  @Test
  public void setTest() {
    testHashtable = new Hashtable();
    assertTrue("Expected true",
      testHashtable.set("key me", "value us"));
  }

  @Test
  public void getTest() {
    testHashtable = new Hashtable();
    testHashtable.set("Big Boy", "Spaghetti man");
    assertEquals("Spaghetti man", testHashtable.get("Big Boy"));
  }
  @Test
  public void contains() {
    Entry testEntry = new Entry("cake", "pie");
    String testStringKey = "cake";
    assertTrue(testEntry.key.contains(testStringKey));
  }
  @Test
  public void testHash() {
    Hashtable testHashtable = new Hashtable();
    String toHash = "meow";
    assertEquals("index of 60", 60, testHashtable.hash(toHash));
  }
}
