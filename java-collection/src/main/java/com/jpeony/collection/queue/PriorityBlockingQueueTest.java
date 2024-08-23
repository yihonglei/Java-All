package com.jpeony.collection.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<String> priorityQueue = new PriorityBlockingQueue<>(2);

        priorityQueue.offer("one");
        priorityQueue.offer("two");
        priorityQueue.offer("three");

        System.out.println(priorityQueue.take());
    }
}
