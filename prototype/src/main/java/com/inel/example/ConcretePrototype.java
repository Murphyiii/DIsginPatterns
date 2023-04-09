package com.inel.example;

public class ConcretePrototype extends Prototype  implements Cloneable{
    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
