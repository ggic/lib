package com.snoweagle.console.common.utils;

import java.math.BigDecimal;

/**
 * Created by snoweagle on 12/10/2016.
 */
public class BigDecimalUtils {
    public static long convertYuan2Fen(long yuan) {
        return BigDecimal.valueOf(yuan).multiply(new BigDecimal(100)).longValue();
    }

    public static long convertYuan2Fen(BigDecimal yuan) {
        return yuan.multiply(new BigDecimal(100)).longValue();
    }


}
