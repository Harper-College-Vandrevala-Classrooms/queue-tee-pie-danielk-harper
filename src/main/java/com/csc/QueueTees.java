package com.csc;

import java.util.*;

public class QueueTees {
  ArrayList<Cutie> queue;
  
  public QueueTees() {
    queue = new ArrayList<Cutie>();
  }
  
  public static void main(String[] args) {
    System.out.println("So Cute!");
  }
  
  public void enqueue(Cutie cutie) {
    queue.add(cutie);
  }
  
  public Cutie dequeue() {
    Cutie firstObject = queue.get(0);
    queue.remove(0);
    return firstObject;
  }
  
  public int size() {
    return queue.size();
  }
}
