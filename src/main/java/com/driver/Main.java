package com.driver;

public class Main {
 
  static class A {
    static String meth() {
    return "Invoking method from class A";
  }
}
 
  static class B extends A {
      static String meth() {
      return "Method is overridden in Extended class B";
  }
}
 public static void main(String[] args) {
   B objB = new B();
   System.out.println(objB.meth());
  }
}
