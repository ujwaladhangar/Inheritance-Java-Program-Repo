package com.infogalaxy.inheritancejavacode;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void setStudent(){
        System.out.println(" Enter The Id : ");
        id = sc.nextInt();
        System.out.println(" Enter The  Name : ");
        name = sc.next();
    }
}

