package com.company;
//Description
//        People usually take a home loan to buy a new house, and almost every bank offers home loans but the rate of interest varies across banks. You need to suggest a bank to a user on the basis of the interest rate charged to suit their needs. Create an abstract class 'Homeloan' with two abstract methods 'getRateOfIntererst' and ‘getSimpleInterest’. Also, create classes 'Bank1' and 'Bank2' where you can implement the two abstract classes. The rate of interest for Bank 1 is 7.2 and for Bank 2 is 8.1. Using this, you can calculate the simple interest and suggest a bank to the user.
//        Note: Simple Interest = (principle*rate*time)/100
//
//        Input: Your program should take two lines of input:
//        The amount of loan that they want from the bank
//        The time for which they want to take the loan (in years)
//
//        Output: The output of your program must consist of two lines:
//        If Bank1 provides the loan at a lower rate of interest, print “File for a loan in Bank1”; else, print “File for a loan in Bank2”.
//        The amount that they have to pay back to the bank, i.e. principal + interest.
//
//        Note: If a user inputs a negative/0 loan amount or time, print “invalid input”.

import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    //Write your code here
    abstract double simpleInterest();
}

class Bank1 extends Homeloan {

    //Write your code here
    double si;
    double returnAmount;
    public Bank1(double amount, int time){
        setAmount(amount);
        setTime(time);
    }
    public void setAmount(double amount){
        if(amount <= 0){
            System.out.println("invalid input");
            System.exit(0);
        }else{
            this.amount = amount;
        }
    }
    public void setTime(int time){
        if(time <= 0){
            System.out.println("invalid input");
            System.exit(0);
        }else{
            this.time = time;
        }
    }
    double simpleInterest() {

        //Write your code here
        si = (this.amount * this.time * 7.2) / 100;
        return (this.amount + si);
    }

}

class Bank2 extends Homeloan {

    //Write your code here
    double si;
    double returnAmount;
    public Bank2(double amount, int time){
        setAmount(amount);
        setTime(time);
    }
    public void setAmount(double amount){
        if(amount <= 0){
            System.out.println("invalid input");
            System.exit(0);
        }else{
            this.amount = amount;
        }
    }
    public void setTime(int time){
        if(time <= 0){
            System.out.println("invalid input");
            System.exit(0);
        }else{
            this.time = time;
        }
    }
    double simpleInterest() {

        //Write your code here
        si = (this.amount * this.time * 8.1) / 100;
        return (this.amount + si);
    }

}

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}
