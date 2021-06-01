package com.company;

public class Main {

    public static void main(String[] args) {
        Class siwangi = new Class();
        Class siwi = new Class();
        Class Sweta = new Class();
        siwangi.var1 = 23;
        siwi.var1 = 43;
        Class.var2 = 3;
        Class.var2 = 4;
        Class.var2 = 6;
        siwangi.rude();
        Class.arg(); //4
        Class.arg(); //4
        siwangi.func(); // 23 & 4
        siwi.func(); // 43 & 4
        Singleton.fetchInstance();

    }
}
