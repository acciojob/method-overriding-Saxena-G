package com.driver;
 default class A {
      
        public String meth()
      {
            return "Invoking method from class A";
        }
    }
   
      default class B extends A {
        public String meth() 
        {
            return "Method is overridden in Extended class B";
        }
    }

public class Main {
    public static void main(String[] args) {
        B obj = new B();
           obj.meth();
        B obj1 = new B();
           obj1.meth();
    }
}
