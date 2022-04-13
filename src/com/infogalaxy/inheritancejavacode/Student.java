package com.infogalaxy.inheritancejavacode;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;

    void setStudent() {
        System.out.println("Enter Student Id : ");
        id = sc.nextInt();
        System.out.println("Enter Student Name : ");
        name = sc.next();

    }
}

class Internal extends Student {
    int m1;
    int m2;

    void setMarks() {
        System.out.println("Enter The M1 Mark : ");
        m1 = sc.nextInt();
        System.out.println("Enter The M2 Mark : ");
        m2 = sc.nextInt();
    }
}