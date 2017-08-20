package com.snoweagle.console.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * Created by snoweagle on 12/10/2016.
 */
public class ValidationUtils {
    /**
     * @param o
     * @param msg
     */
    public static void fail4Null(Object o, String msg) {
        if (o == null || StringUtils.isEmpty(String.valueOf(o)))
            throw new IllegalArgumentException(msg + "不存在");
    }

    public static void fail4Null2Msg(Object o, String msg) {
        if (o == null || StringUtils.isEmpty(String.valueOf(o)))
            throw new IllegalArgumentException(msg);
    }

}
