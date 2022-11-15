package datastructures.tree;


import com.sun.source.tree.Tree;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {

  BinaryTree tree = new BinaryTree();

  @Before
  public void setup() throws Exception {
    Node node5 = new Node(5, new Node(6), null);
    Node node2 = new Node(2, new Node(4), node5);
    Node rootNode = new Node(1, node2, new Node(3));
    tree = new BinaryTree();
    tree.root = rootNode;
  }

  @Test
  public void testForPreOrder() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.preOrder().toArray());
  }

  @Test
  public void testForInPreOrder() {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.preOrder().toArray());

  }

  @Test
  public void testForPostOrder() {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    BinaryTree testTree = new BinaryTree(root);

    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(1);
    correct.add(2);
    correct.add(3);

    assertArrayEquals(correct.toArray(), testTree.postOrder().toArray());
  }


  @Test
  public void testForMaxValue() {
    Node root = new Node(2);
    root.left = new Node(7);
    root.right = new Node(5);

    root.left.left = new Node(2);
    root.left.right = new Node(6);

    root.left.right.left = new Node(5);
    root.left.right.right = new Node(12);

    root.right.right = new Node(9);

    root.right.right.left = new Node(4);

    BinaryTree testTree = new BinaryTree(root);

    assertEquals(12, testTree.findMaxValue());
  }
  @Test
  public void testBreadthFirst() {
    Node root = new Node(2);
    root.left = new Node(7);
    root.right = new Node(5);
    root.left.left = new Node(2);
    root.left.right = new Node(6);
    root.left.right.left = new Node(5);
    root.left.right.right = new Node(11);
    root.right.right = new Node(7);
    root.right.right.left = new Node(4);

    BinaryTree testTree = new BinaryTree(root);
    ArrayList<Integer> correct = new ArrayList<>();
    correct.add(2);
    correct.add(7);
    correct.add(5);
    correct.add(2);
    correct.add(6);
    correct.add(7);
    correct.add(5);
    correct.add(11);
    correct.add(4);

    assertArrayEquals(correct.toArray(), testTree.breadthFirstWrap().toArray());

  }


}
