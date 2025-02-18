//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
}