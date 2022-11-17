package datastructures.FizzTree;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

public class buzzTree {
  Node<String> root;

  public buzzTree(Node<String> root) {
    this.root = root;
  }

  public void fizzWrap() {
    fizzBuzzer(root);
  }
  private void fizzBuzzer(Node<String> current) {
    if (current != null) {
      fizzBuzzer(current.left);
      current.value = findFizzBuzz(current.value);
      fizzBuzzer(current.right);
    }
  }

  private String findFizzBuzz(String input) {
    int value = Integer.parseInt(input);

    if (value % 3 == 0 && value % 5 == 0) {
      return "FizzBuzz";
    } else if (value % 3 == 0) {
      return "Fizz";
    } else if (value % 5 == 0) {
      return "Buzz";
    } else {
      return input;
    }
  }
  public static BinaryTree<String> fizzBuzz(BinaryTree<Integer> input) {
    BinaryTree<String> correct = new BinaryTree<>();
    correct.root = fizzBuzzHelp(input.root);
    return correct;
  }
  private static Node<String> fizzBuzzHelp(Node<Integer> node) {
    if (node == null) {
      return null;
    } else {
      Node<String> correct = new Node<>();
      if (node.value % 15 == 0) {
        correct.value = "fizzbuzz";
      } else if (node.value % 5 == 0) {
        correct.value = "buzz";
      } else if (node.value % 3 == 0) {
        correct.value = "fizz";
      } else {
        correct.value = node.value.toString();
      }
      correct.left = fizzBuzzHelp(node.left);
      correct.right = fizzBuzzHelp(node.right);
      return correct;
    }
    }
  }

