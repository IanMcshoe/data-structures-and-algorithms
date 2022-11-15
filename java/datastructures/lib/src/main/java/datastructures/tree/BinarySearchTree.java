package datastructures.tree;

public class BinarySearchTree {
  private Node <Integer> root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void add(Integer value) {
    root = addNode(root, value);
  }


  private Node <Integer> addNode(Node <Integer> current, Integer value) {
    if (current == null) {
      return new Node<>(value);
    }
    if (value < current.value) {
      current.left = addNode(current.left, value);
    } else if (value > current.value) {
      current.right = addNode(current.right, value);
    } else {
      return current;
    }
    return current;
  }

  public boolean contains(int value) {
    Node <Integer> currentNode = root;
    while (!currentNode.value.equals(value)) {
      if (value < currentNode.value) {
        currentNode = currentNode.left;
      } else {
        currentNode = currentNode.right;
      }
      if (currentNode == null) {
        return false;
      }
    }
    return true;
  }
  public Node<Integer> getRoot() {
    return root;
  }
}
