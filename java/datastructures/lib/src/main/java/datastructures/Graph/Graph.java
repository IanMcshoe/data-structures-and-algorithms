package datastructures.Graph;


import java.util.*;

public class Graph<T> {
  private ArrayList<GraphNode<T>> nodes;

  public Graph() {
    this.setNodes(new ArrayList<GraphNode<T>>());
  }

  public GraphNode addNode(T value) {
    GraphNode<T> newNode = new GraphNode<T>(value);
    ArrayList<GraphNode<T>> nodes = this.getNodes();
    nodes.add(newNode);
    this.setNodes(nodes);
    return newNode;
  }

  public void addEdge(GraphNode<T> nodeA, GraphNode<T> nodeB, int weight) {
    if (this.getNodes().contains(nodeA) && this.getNodes().contains(nodeB)) {
      nodeA.addNeighbor(nodeB, weight);
      nodeB.addNeighbor(nodeA, weight);
    }
  }

  public HashMap<GraphNode<T>, Integer> getNeighbors(GraphNode<T> node) {
    return node.getNeighbors();
  }

  public int size() {
    return this.getNodes().size();
  }

  public ArrayList<GraphNode<T>> getNodes() {
    return new ArrayList<GraphNode<T>>(this.nodes);
  }

  public void setNodes(ArrayList<GraphNode<T>> nodes) {
    this.nodes = new ArrayList<GraphNode<T>>(nodes);
  }
}
