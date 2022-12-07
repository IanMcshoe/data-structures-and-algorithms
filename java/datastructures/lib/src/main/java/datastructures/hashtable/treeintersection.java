package datastructures.hashtable;

import datastructures.tree.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class treeintersection {
    public static Set<Integer> treeIntersection(Node root1, Node root2) {
      HashSet<Integer> answer = new HashSet<>();
      HashMap<Integer, Boolean> value1 = new HashMap<>();
      LinkedList<Node> nodes = new LinkedList<>();

      nodes.add(root1);
      while(!nodes.isEmpty()) {
        Node current = nodes.removeFirst();
        value1.put((Integer) current.value, null);

        if (current.left != null) {
          nodes.add(current.left);
        }
        if (current.right != null) {
          nodes.add(current.right);
        }
      }
      nodes.add(root2);

      while(!nodes.isEmpty()) {
        Node current = nodes.removeFirst();
        if(value1.containsKey(current.value)) {
          answer.add((Integer) current.value);
        }
        if (current.left != null) {
          nodes.add(current.left);
        }
        if (current.right != null) {
          nodes.add(current.right);
        }
      }
      return answer;
    }
}
