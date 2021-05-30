package com.company;

public  abstract class Abstract {
    public int value1 = 3;
    public int value2 =4;

    public void rude(){
        System.out.println( value1 + value2);
    }

// abstract method do not have body and abstract methods are in abstract class, no object is required for abstract class

    public abstract void nice();


}
