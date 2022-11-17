package datastructures.FizzTree;

import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzyTest {
    @Test
    public void testForFizzBuzz() {
      Node<String> root = new Node<>("1");
      root.left = new Node<>("2");

      root.left.left = new Node<>("6");
      root.left.right = new Node<>("7");

      root.right = new Node<>("3");

      buzzTree sut = new buzzTree(root);
      sut.fizzWrap();
      assertEquals("Fizz", sut.root.right.value);
    }


    @Test
    public void testForFizzBuzz2() {
      Node<String> root = new Node<>("1");
      root.left = new Node<>("2");

      root.left.left = new Node<>("6");
      root.left.right = new Node<>("7");

      root.right = new Node<>("3");

      buzzTree sut = new buzzTree(root);
      sut.fizzWrap();
      assertEquals("7", sut.root.left.right.value);
    }


    @Test
    public void testForFizzBuzz3() {
      Node<String> root = new Node<>("1");
      root.left = new Node<>("2");

      root.left.left = new Node<>("6");
      root.left.right = new Node<>("7");

      root.right = new Node<>("3");

      root.right.right = new Node<>("15");

      buzzTree sut = new buzzTree(root);
      sut.fizzWrap();
      assertEquals("FizzBuzz", sut.root.right.right.value);
    }

}
