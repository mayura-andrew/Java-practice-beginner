
package com.mycompany.animal;


public class Cat extends Animal {
    
    public Cat(){
        super(7);
        System.out.println("A cat has been created");
    }
    
    public void meow(){
        System.out.println("A cat is meow");
    }
    public void prance(){
        System.out.println("A cat is proncing");
    }
    
}
