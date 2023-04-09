package com.inel.example2;

import com.inel.example.ConcretePrototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        ReferenceType referenceType1 = new ReferenceType("1", "1");
        Prototype prototype1 = new Prototype("1", referenceType1);
        System.out.println("未修改数据：");
        System.out.println("prototype1:" + prototype1.toString());
//        浅复制
        Prototype prototype2 = (Prototype) prototype1.ShallowClone();
//        深复制
        Prototype prototype3 = (Prototype) prototype1.DeepClone();
//        修改referenceType1
        referenceType1.setParam1("Changed");
        System.out.println("修改数据中的引用部分，修改后数据：");
        System.out.println("原数据 prototype1:" + prototype1.toString());
        System.out.println("浅复制 prototype2:" + prototype2.toString());
        System.out.println("深复制 prototype3:" + prototype3.toString());
    }
}

