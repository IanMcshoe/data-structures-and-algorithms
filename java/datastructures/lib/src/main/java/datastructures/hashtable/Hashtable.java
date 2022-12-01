package datastructures.hashtable;

import java.util.LinkedList;


  public class Hashtable {
    LinkedList<Entry>[] hashTableArray = new LinkedList[100];

    public boolean set (String key, String value) {
      int arrIndex = hash(key);
      Entry entry = new Entry(key, value);

      if (hashTableArray[arrIndex] == null) {
        hashTableArray[arrIndex] = new LinkedList<>();
      }

      if(contains(key)) {
        return false;
      } else {
        hashTableArray[arrIndex].add(entry);
      }
      return true;
    }
    public String get (String key) {
      int arrIndex = hash(key);

      if (hashTableArray[arrIndex] == null) {
        hashTableArray[arrIndex] = new LinkedList<>();
      }
      for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
        if (hashTableArray[arrIndex].get(i).key.equals(key)){
          return hashTableArray[arrIndex].get(i).value;
        }
      }
      return null;
    }
    public boolean contains (String key) {
      int arrIndex = hash(key);

      if (hashTableArray[arrIndex] == null) {
        hashTableArray[arrIndex] = new LinkedList<>();
      }

      for (int i = 0; i < hashTableArray[arrIndex].size(); i++) {
        if (hashTableArray[arrIndex].get(i).key.equals(key)){
          return true;
        }
      }
      return false;
    }

    public int hash (String key) {
      int len = key.length();
      int addedAscii = 0;
      for (var i = 0; i < len; i ++) {
        char character = key.charAt(i);
        int ascii = (int) character;
        addedAscii += ascii;
      }
      return addedAscii * 599 % hashTableArray.length;

    }
}
