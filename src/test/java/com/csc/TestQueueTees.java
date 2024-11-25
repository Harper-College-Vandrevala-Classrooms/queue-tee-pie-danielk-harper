package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueTees {

  QueueTees queue;

  @BeforeEach
  void setUp() {
    queue = new QueueTees();
  }

  @Test
  void sizeFunc() {
    assertEquals(0, queue.size());
  }
  
  @Test
  void enqueueing() {
    Puppy a = new Puppy();
    Crocodile b = new Crocodile();
    
    queue.enqueue(a);
    queue.enqueue(b);
    assertEquals(2, queue.size());
  }
  
  @Test
  void dequeueing() {
    Puppy a = new Puppy();
    Crocodile b = new Crocodile();
    
    queue.enqueue(a);
    queue.enqueue(b);
    Cutie c = queue.dequeue();
    
    assertEquals(a.description(), c.description());
  }
}
