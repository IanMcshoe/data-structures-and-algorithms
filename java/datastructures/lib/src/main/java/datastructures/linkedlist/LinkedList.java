package datastructures.linkedlist;

public class LinkedList
{
  Node head;
  private int size;

  public void insert(int value)
  {
    Node node = new Node();
    node.value = value;

    if (head != null) {
      node.next = head;
    }
    head = node;
  }

  public void insertBefore (int value, int newNodeValue) {
    Node newNode = new Node();
    Node current = head;
    newNode.value = newNodeValue;

    if (head.value == value) {
      newNode.next = head;
      head = newNode;
    }
    while (current.next !=null && current.next.value != value) {
      current = current.next;
    }

    if (current.next != null) {
      Node lead = current.next;
      current.next = newNode;
      newNode.next = lead;
    }
  }

  public void insertAfter (int num1, int num2) {
    Node current = head;
    Node newNode = new Node();
    newNode.value = num2;

    while (current !=null & current.value != num1) {
      current = current.next;
    }

    if (current != null) {
      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public void append(int num) {
    Node newNode = new Node();
    newNode.value = num;
    Node current;

    if (head == null) {
      head = newNode;
    } else {
      current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public boolean includes(int value)
  {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      } else {
        current = current.next;
      }
    }
    return false;
  }

  public static LinkedList linkedListZip(LinkedList a, LinkedList b) {
      Node i = a.head;
      Node j = b.head;
      Node tmpi = i.next;
      Node tmpj = j.next;

      while (tmpi != null || tmpj != null) {
        i.next = j;
        j.next = tmpi;

        i = tmpi;
        tmpi = tmpi.next;

        j = tmpj;
        tmpj = tmpj.next;
      }
      i.next = j;
      j.next = null;
      return a;
  }




  @Override
  public String toString()
  {
    Node current = head;
    String outputString = "";
    while (current != null) {
      outputString += current;
      current = current.next;
    }
      return outputString;
  }
}
