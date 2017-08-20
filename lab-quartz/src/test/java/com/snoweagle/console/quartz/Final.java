package com.snoweagle.console.quartz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by snoweagle on 5/4/16.
 */
public class Final {
    private final List list;

    public Final(List list) {
        this.list = list;
    }

    public static void main(String[] args) {
        Final f = new Final(Arrays.asList(111, 23232));
        f.change1();
        System.out.println(f.list);
    }

    public void change() {

    }

    public void change1() {
        list.add(11111);
    }
}
