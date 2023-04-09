package com.inel.example;

/*
* PrimitiveType
 * */
public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype1 = new ConcretePrototype("1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.Clone();

        System.out.println("Cloned:" + prototype2.getId());
    }
}

