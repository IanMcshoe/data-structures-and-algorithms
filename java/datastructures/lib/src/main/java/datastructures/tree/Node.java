package datastructures.tree;

public class Node <T> {
  public Node <T> left;
  public Node <T> right;
  public T value;

  public Node() {};

  public Node(T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }


  public Node(int i, Node node, Node node1, Node node2) {
  }

  public Node(int i, Node node, Node node1, Node node2, Node node3) {
  }
}
