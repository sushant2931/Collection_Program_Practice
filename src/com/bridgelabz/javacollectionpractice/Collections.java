package com.bridgelabz.javacollectionpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Collections {
    private static void doListDemo() {
        System.out.println("----- List Demo -----");
        List<String> list = new LinkedList<String>();

        list.add("Ravi");
        list.add("Vjay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void doStackDemo() {
        System.out.println("----- Stack Demo -----");

        Stack<String> stack = new Stack<String>();

        stack.push("Ravi");
        stack.push("Amit");
        stack.push("Garima");
        stack.push("Ashish");

        String topElement = stack.pop();
        System.out.println("Popped Element : " + topElement);
        System.out.println("Head : " + stack.peek());

        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void doQueueDemo() {
        System.out.println("----- Queue Demo -----");

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");

        System.out.println("Head : " + queue.element());
        System.out.println("Head : " + queue.peek());

        System.out.println("Queue Elememts : ");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("Queue Elememts after removing two elements : ");
        iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static void doSetDemo() {

        System.out.println("----- Set Demo -----");
        Set<String> set = new LinkedHashSet<String>();

        set.add("Ravi");
        set.add("Vjay");
        set.add("Ravi");
        set.add("Ajay");

        System.out.println("Iterating using iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating using For Loop: ");
        for(String element : set) {
            System.out.println(element);
        }
    }

    private static void doMapDemo() {

        System.out.println("----- Map Demo -----");
        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(100,"Ravi");
        map.put(99,"Vjay");
        map.put(102,"Ravi");
        map.put(104,"Ajay");


        System.out.println("Iterating using For Loop: ");
        for(Map.Entry<Integer, String> mapElement : map.entrySet()) {
            System.out.println(mapElement.getKey()+" - "+mapElement.getValue());
        }
    }
    public static void main(String[] args) {
        System.out.println("...... Welcome On Collection Program Practice.....");
        doListDemo();
        doStackDemo();
        doQueueDemo();
        doSetDemo();
        doMapDemo();
    }
}
