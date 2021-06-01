package com.company;

public class Singleton {
    public static Singleton member1;

    private Singleton(){

    }
    public static Singleton fetchInstance(){
        if ( member1 == null) {
             member1 = new Singleton();
        }
        return member1;
    }

}
