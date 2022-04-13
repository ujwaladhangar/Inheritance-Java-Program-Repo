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
    void getStudent(){
        System.out.println("Student ID is : "+id);
        System.out.println("Student Name is : "+name);
    }
}
class Internal extends Student {
    int Im1;
    int Im2;

    void setInternalMarks() {
        System.out.println("Enter The Im1 Mark : ");
        Im1 = sc.nextInt();
        System.out.println("Enter The Im2 Mark : ");
        Im2 = sc.nextInt();
    }
    void getInternalMarks(){
        System.out.println(" M1 Marks are :"+ Im1);
        System.out.println(" M2 Marks are :"+ Im2);
    }
}
class External extends Student{
    int eM1;
    int eM2;
    void setExternalMarks(){
        System.out.println("Enter the EM1 Marks : ");
        eM1 = sc.nextInt();
        System.out.println("Enter the EM2 Marks : ");
        eM2 = sc.nextInt();

    }
    void getExternalMarks(){
        System.out.println("EM1 Marks are : "+eM1);
        System.out.println("EM2 Marks are : "+eM2);
    }
}
class Main{
    public static void main(String[] args) {
        External external = new External();
        Internal internal = new Internal();
        internal.setStudent();
        internal.setInternalMarks();
        internal.getStudent();
        internal.getInternalMarks();
        external.setStudent();
        external.setExternalMarks();
        external.getStudent();
        external.getExternalMarks();
    }
}