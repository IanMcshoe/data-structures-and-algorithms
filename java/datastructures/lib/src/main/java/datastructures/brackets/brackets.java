package datastructures.brackets;

import datastructures.stacksandqueues.Stack;

public class brackets {
  public static boolean bracketVal(String input) {
    Stack<String> bracketsList = new Stack<>();

    if (input.length() <2 ){
      return false;
    }

    for(int i = 0; i < input.length(); i++){
      String element = Character.toString(input.charAt(i));

      if (element.equals("(") || element.equals("[") || element.equals("{")) {
        bracketsList.push(element);

      } else if (element.equals(")")) {
        if(!bracketsList.pop().equals("(")) {
          return false;
        }
      } else if (element.equals("]")) {
        if(!bracketsList.pop().equals("[")) {
          return false;
        }
      } else if (element.equals("}")) {
        if(!bracketsList.pop().equals("{")) {
          return false;
        }
      }
    }
        return bracketsList.isEmpty();
  }
}
