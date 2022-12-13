package datastructures.graph;

import datastructures.Graph.Graph;
import datastructures.Graph.GraphNode;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class graphTest {
  public Graph<Integer> testGraph;

  @Before
  public void setUpGraph() {
    this.testGraph = new Graph<Integer>();
  }

  @Test
  public void testInstantiate() {
    Graph graph = new Graph();
  }

  @Test
  public void testAddNode() {
    this.testGraph.addNode(2);
  }

  @Test
  public void testAddTwoNodes() {
    this.testGraph.addNode(2);
    this.testGraph.addNode(3);
  }

  @Test
  public void testGetNeighborsNone() {
    this.testGraph.addNode(4);
    this.testGraph.addNode(5);

    GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
    GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
    HashMap<GraphNode<Integer>, Integer> empty = new HashMap<GraphNode<Integer>, Integer>();

    assertTrue(this.testGraph.getNeighbors(node1).equals(empty),
      "Should return the neighbors which are none"
        );
    assertTrue(this.testGraph.getNeighbors(node2).equals(empty),
      "Should return the neighbors which are none"
        );
  }

  @Test
  public void testAddEdgeAndGetNeighborsSome() {
    this.testGraph.addNode(6);
    this.testGraph.addNode(7);
    this.testGraph.addNode(8);

    GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
    GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
    GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);
    this.testGraph.addEdge(node1, node2, 22);
    this.testGraph.addEdge(node1, node3, 33);
    HashMap<GraphNode<Integer>, Integer> neighbors = new HashMap<GraphNode<Integer>, Integer>();
    neighbors.put(node2, 22);
    neighbors.put(node3, 33);


    assertTrue(this.testGraph.getNeighbors(node1).equals(neighbors),
      "Should return the neighbors"
        );
  }

  @Test
  public void testGetNodes() {
    this.testGraph.addNode(11);
    this.testGraph.addNode(22);
    this.testGraph.addNode(33);

    ArrayList<GraphNode<Integer>> nodes = new ArrayList<GraphNode<Integer>>();
    GraphNode<Integer> node1 = this.testGraph.getNodes().get(0);
    GraphNode<Integer> node2 = this.testGraph.getNodes().get(1);
    GraphNode<Integer> node3 = this.testGraph.getNodes().get(2);
    nodes.add(node1);
    nodes.add(node2);
    nodes.add(node3);

    assertTrue(this.testGraph.getNodes().equals(nodes),
      "Should return all the nodes"
        );
  }

//  @Test
//  public void testGetSize() {
//    this.testGraph.addNode(55);
//    this.testGraph.addNode(66);
//    this.testGraph.addNode(77);
//
//    assertEquals(Float.parseFloat("Should return the neighbors"),
//      3,
//      this.testGraph.size()
//    );
//  }
}
