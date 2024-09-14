package com.driver;

public class Main {
  static class A{
  static String meth(){
    return "Invoking method from class A";
  }
 public static class B extends A{
   
   static String meth(){
      return "Method is overridden in Extended class B";
}
 public static void main(SString args[]){
   B b = new B();
   b.meth();
}
