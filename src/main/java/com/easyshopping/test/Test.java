package com.easyshopping.test;

import javassist.tools.reflect.Sample;

/**
 * Created by wencong on 2017/2/8.
 */
public class Test {

    public native  int intMethod(int n);
    public native  boolean booleanMethod(boolean bool);
    public native  String stringMethod(String text);
    public native  int intArrayMethod(int[] intArray);

    public static void main(String[] args) {
      System.loadLibrary("Sample");
      Test sample=new Test();
        int a=sample.intMethod(1);
        boolean b=sample.booleanMethod(true);
        String c=sample.stringMethod("textSample");
        int d=sample.intArrayMethod(new int[]{1,2,3,4,5});
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
