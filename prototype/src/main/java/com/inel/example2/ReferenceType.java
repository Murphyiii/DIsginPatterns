package com.inel.example2;

public class ReferenceType implements Cloneable{
    private String param1;
    private String param2;

    public ReferenceType(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public ReferenceType Clone() throws CloneNotSupportedException {
        return (ReferenceType) this.clone();
    }
}
