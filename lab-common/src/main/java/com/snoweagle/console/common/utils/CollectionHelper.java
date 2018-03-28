package com.snoweagle.console.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 2017/6/2.
 */
public class CollectionHelper {
    /**
     * 返回list头元素,如果list是null,返回null
     * @param list
     * @param <E>
     * @return
     */
    public static <E> E getHeadElement(List<E> list){
        return  list==null || list.size()==0?null:list.get(0);
    }
    public static <E> List<E> getList(E t){
        List list =new ArrayList();
        if(t!=null){
            list.add(t);
        }
        return  list;
    }

}
