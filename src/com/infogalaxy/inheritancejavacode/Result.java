package com.infogalaxy.inheritancejavacode;

public class Result extends Student implements ISports {
    int perc;
    void setperce(){
        System.out.println("Enter The Percentage : ");
        perc = sc.nextInt();
    }
    public void calculate(){
        if(perc < 35 && perc >=30){
            perc = perc + sperc;
        }
    }
void showResult(){
    System.out.println("ID : "+id);
    System.out.println("Name : "+name);
    System.out.println("percentage : "+perc);
}
}