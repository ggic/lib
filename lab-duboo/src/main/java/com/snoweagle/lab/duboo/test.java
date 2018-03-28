package com.snoweagle.lab.duboo;

import java.util.ArrayList;

/**
 * Created by Patrick on 08/01/2018.
 */
public class test {
    public static void main(String[] args) {
        String a = "12345";
        String b = new String("12345");
        ArrayList c = new ArrayList();
        ArrayList d = new ArrayList();
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode()==b.hashCode());
        System.out.println(a.hashCode()+"-"+b.hashCode());

        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.hashCode()+d.hashCode());
    }
}
