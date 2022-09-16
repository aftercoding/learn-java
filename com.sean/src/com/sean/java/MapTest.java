package com.sean.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.LockSupport;

public class MapTest {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>();
        Student s1 = new Student("Michael", 99);
        Student s2 = new Student("Bob", 88);
        Student s3 = new Student("Alice", 77);
        map.put(s1, s1.score);
        map.put(s2, 88);
        map.put(s3, 77);
        System.out.println(map.get(s1));
        Thread t = Thread.currentThread();
        LockSupport.unpark(t);
        LockSupport.park();

        System.out.println(map.get(s2));
        System.out.println(map.get(s3));
        System.out.println(s1.compareTo(s2));


    }
}
