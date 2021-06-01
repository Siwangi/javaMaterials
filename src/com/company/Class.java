package com.company;


public class Class extends Abstract {
    public int var1;
  public   static int var2;

   public static void arg() {
       System.out.println(var2);

    }
    public void func() {
        System.out.println(var1);
        System.out.println(var2);
    }

    public void nice() {
        System.out.println(value1 - value2);
    }
   /* public void rude() {
        System.out.println(value1 * value2);
    }
    */

    public Class() {
        this.var1 = 4;
    }

}
