package datastructures.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  @Test
  public void testForPushToStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    assertEquals(10,stackTest.top.data);
  }
  @Test
  public void testForPushToMultiStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20,stackTest.top.data);
  }
  @Test
  public void testForPopFromStack() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20,stackTest.pop());
    assertEquals(10, stackTest.top.data);
  }
  @Test
  public void testForPopEmpty() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    stackTest.pop();
    stackTest.pop();
    assertTrue(stackTest.isEmpty());
  }
  @Test
  public void testForPeekTop() {
    Stack stackTest = new Stack();
    stackTest.push(10);
    stackTest.push(20);
    assertEquals(20, stackTest.peek());
  }
  @Test
  public void testForInstantiateEmptyStack() {
    Stack stackTest = new Stack();
    assertEquals(null, stackTest.top);
    assertTrue(stackTest.isEmpty());
  }


  @Test
  public void testForEmptyException() {
    Stack stackTest = new Stack();
    assertThrows(EmptyStackException.class, ()-> stackTest.pop());
    assertThrows(EmptyStackException.class, ()->stackTest.peek());
  }
}
