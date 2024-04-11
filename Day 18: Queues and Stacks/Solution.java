import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

class StackQueue {
  Stack<Character> stack;
  LinkedList<Character> queue;

  StackQueue() {
    stack = new Stack<>();
    queue = new LinkedList<>();
  }

  void pushCharacter(char ch) {
    stack.push(ch);
    queue.addLast(ch);
  }

  char popCharacter() {
    return stack.pop();
  }

  char dequeueCharacter() {
    return queue.removeFirst();
  }
}

public class Solution {

  public static boolean isPalindrome(String s) {
    StackQueue stackQueue = new StackQueue();

    // Push and enqueue each character
    for (char ch : s.toCharArray()) {
      stackQueue.pushCharacter(ch);
    }

    // Dequeue and pop characters, comparing them
    while (!stackQueue.queue.isEmpty()) {
      if (stackQueue.dequeueCharacter() != stackQueue.popCharacter()) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

    if (isPalindrome(s)) {
      System.out.println("The word, " + s + ", is a palindrome.");
    } else {
      System.out.println("The word, " + s + ", is not a palindrome.");
    }
  }
}
