package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student{

}

class Priorities {

}








public class Main {

    public static void main(String[] args) {
        // write your code here
        final static Scanner scan = new Scanner(System.in);
        final static Priorities priorities = new Priorities();


        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

