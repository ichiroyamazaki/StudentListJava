package com.mycompany.studentlist;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "", name = "";

        HashMap<String, String> students = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student number " + (i + 1) + ": ");
            id = sc.next();
            System.out.print("Enter first name " + (i + 1) + ": ");
            name = sc.next();
            students.put(id, name);
        }
        System.out.println("Student List:");
        for (String s : students.keySet())
        {
            System.out.println(s + " " + students.get(s));
        }
        students.remove(id);
        System.out.print("Enter your student number: ");
        id = sc.next();
        System.out.print("Enter your first name: ");
        name = sc.next();
        students.put(id, name);

        System.out.println("Student List:");
        for (String s : students.keySet())
        {
            System.out.println(s + " " + students.get(s));
        }
    }
}
