package datastructures.hashtableTest;

import datastructures.hashtable.treeintersection;
import datastructures.tree.Node;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class intersectionTest {

  @Test
  public void Test1 () {


    Node root1 = new Node(150,
      new Node(100, new Node(250), new Node(75)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(300)),
      new Node(500));

    Node root2 = new Node(42,
      new Node(100, new Node(600), new Node(15)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(4)),
      new Node(160));

    HashSet<Integer> expected = new HashSet<>();
    expected.add(2);
    expected.add(5);

    System.out.println(treeintersection.treeIntersection(root1, root2));

  }

  @Test
  public void Test2 (){



    Node root1 = new Node(150,
      new Node(100, new Node(250), new Node(75)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(300)),
      new Node(500));

    Node root2 = new Node(42,
      new Node(100, new Node(600), new Node(15)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(4)),
      new Node(160));

    HashSet<Integer> expected = new HashSet<>();

    System.out.println(treeintersection.treeIntersection(root1, root2));

  }

  @Test
  public void Test3 () {


    Node root1 = new Node(150,
      new Node(100, new Node(250), new Node(75)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(300)),
      new Node(500));


    Node root2 = new Node(42,
      new Node(100, new Node(600), new Node(15)),
      new Node(160, new Node(200), new Node(350)),
      new Node(125, new Node(175), new Node(4)),
      new Node(160));

    HashSet<Integer> expected = new HashSet<>();
    expected.add(2);
    expected.add(5);
    expected.add(12);
    expected.add(17);
    expected.toArray();

    System.out.println(treeintersection.treeIntersection(root1, root2));

  }
}
