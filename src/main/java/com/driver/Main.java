package com.driver;
class A{
  String meth(){
    return "Invoking method from class A";
  }
  class B extends A{
    @override
    String meth(){
      return "Method is overridden in Extended class B";
}
public class Main {
 public static void main(SString args[]){
   B b = new B();
   b.meth();
}
