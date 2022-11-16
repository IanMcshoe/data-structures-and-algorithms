package datastructures.tree;

import java.util.*;

public class BinaryTree<T> {
  public Node<T> root;

  public BinaryTree() {
    root = null;
  }

  public BinaryTree(Node<T> root) {
    this.root = root;
  }



  public ArrayList<T> preOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();
    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> preOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    valuesArray.add((T) root.value);

    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    if (root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    return valuesArray;
  }

  public ArrayList<T> inOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();
    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> inOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    valuesArray.add((T) root.value);

    if(root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    return valuesArray;

  }

  public ArrayList<T> postOrder() {
    ArrayList<T> valuesArray = new ArrayList<>();

    preOrderHelp(this.root, valuesArray);
    return valuesArray;
  }

  private ArrayList<T> postOrderHelp(Node<T> root, ArrayList<T> valuesArray) {
    if (root == null) {
      return valuesArray;
    }
    if (root.left != null) {
      valuesArray = preOrderHelp(root.left, valuesArray);
    }
    if (root.right != null) {
      valuesArray = preOrderHelp(root.right, valuesArray);
    }
    valuesArray.add((T) root.value);
    return valuesArray;
  }

  public int findMaxValue() {
    if (this.root.value instanceof Integer) {
      return preOrderMaxFind((Node<Integer>) this.root, Integer.MIN_VALUE);
    } else {
      throw new IllegalStateException();
    }

  }
  private int preOrderMaxFind(Node <Integer> current, int highest) {
      if (current == null) {
      return highest;
      }
      if (current.value > highest) {
        highest = current.value;
      }
      if (current.left != null) {
        highest = preOrderMaxFind(current.left, highest);
      }
      if (current.right != null) {
        highest = preOrderMaxFind(current.right, highest);
      }
      return highest;
    }

    public ArrayList<T> breadthFirstWrap() {
    return breadthFirstTraverse(this.root);
    }

    public ArrayList<T> breadthFirstTraverse(Node<T> root) {
      Queue<Node<T>> storage = new LinkedList<>();
      ArrayList<T> result = new ArrayList<>();

      if (root == null) {
        throw new NoSuchElementException();

      } else {
        storage.add(root);
      }
      while (!storage.isEmpty()) {
        Node<T> current = storage.remove();
        result.add(current.value);

        System.out.println("result is " + result);
        System.out.println("queue has " + storage);
        System.out.println("node is " + current.value);

        if (current != null && current.left != null) {
          storage.add(current.left);
        }
        if (current != null && current.right != null) {
          storage.add(current.right);
        }
      }
      return result;
    }


  }


