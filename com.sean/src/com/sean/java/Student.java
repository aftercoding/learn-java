package com.sean.java;

import java.util.Objects;

public class Student implements Comparable<Student>{
    final String name;
    final int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Student o) {
        int n = Integer.compare(this.score,o.score);
//        return this.score < o.score ? -1 : 1;
        return n != 0 ? n : this.name.compareTo(o.name);
    }
}
