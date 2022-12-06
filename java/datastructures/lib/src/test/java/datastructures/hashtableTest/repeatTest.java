package datastructures.hashtableTest;

import datastructures.hashtable.RepeatedWord;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class repeatTest {

  @Test
  public void repeatedWord() throws UnsupportedEncodingException {
    RepeatedWord testRepeat = new RepeatedWord();
    String testString = "It was the best of times, it was the worst of times, it was the age of wisdom, it " +
      "was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was " +
      "the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter " +
      "of despair, we had everything before us, we had nothing before us, we were all going direct to " +
      "Heaven, we were all going direct the other way – in short, the period was so far like the present " +
      "period, that some of its noisiest authorities insisted on its being received, for good or for evil, " +
      "in the superlative degree of comparison only...";
    assertEquals("it",
      "it",
      testRepeat.repeatedWord(testString)
    );
  }

  @Test
  public void repeat2() throws UnsupportedEncodingException {
    RepeatedWord testRepeatedWord = new RepeatedWord();
    String testString = "Once upon a time, there was a brave princess who...";
    assertEquals("a",
      "a",
      testRepeatedWord.repeatedWord(testString)
    );
  }

  @Test
  public void repeat3() throws UnsupportedEncodingException {
    RepeatedWord testRepeatedWord = new RepeatedWord();
    String testString = "It was a queer, sultry summer , the summer they electrocuted the Rosenbergs, and I " +
      "didn’t know what I was doing in New York...";
    assertEquals("summer",
      "summer",
      testRepeatedWord.repeatedWord(testString)
    );
  }


}
