package com.inel.example2;

// Reference Type
public class Prototype implements Cloneable{
    private String id;
    private ReferenceType referenceType;

    public Prototype(String id) {
        this.id = id;
    }

    public Prototype(String id, ReferenceType referenceType) {
        this.id = id;
        this.referenceType = referenceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReferenceType getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(ReferenceType referenceType) {
        this.referenceType = referenceType;
    }

//    浅复制
    public Prototype ShallowClone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }

//    深复制
    public Prototype DeepClone() throws CloneNotSupportedException {
        String id = this.getId();
        ReferenceType referenceType = (ReferenceType) this.getReferenceType().Clone();
        return new Prototype(id, referenceType);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "id='" + id + '\'' +
                ", referenceTypeParam1='" + referenceType.getParam1() + '\'' +
                ", referenceTypeParam2='" + referenceType.getParam2() + '\'' +
                '}';
    }
}
