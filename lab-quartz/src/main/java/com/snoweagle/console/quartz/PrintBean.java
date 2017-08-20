package com.snoweagle.console.quartz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wangshaobo on 2016-3-31.
 */
public class PrintBean {
    public static void  main(String[] args){
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("investorLufaxAccNo","投资人陆金所账户");
        map.put("investorInstAccNo","投资人机构账户");
        map.put("isNewInvestor","是否新投资人");
        map.put("investApplyId","投资申请流水号");
        map.put("investApplyTime","投资申请时间");
        map.put("paymentId","支付流水号");
        map.put("payAmount","支付金额");
        map.put("currency","币种");
        map.put("paySuccessTime","支付成功时间");
        map.put("instNo","机构号");
        map.put("instPrdNo","机构产品编码");
        map.put("instPrdName","机构产品名称");
        map.put("investApplyAmount","投资申请金额");
        map.put("lufaxFee","陆金所端手续费");
        map.put("extension","扩展字段");



        for (Map.Entry<String, String> entry : map.entrySet()) {

            print("/**");
            print("* "+entry.getValue());
            print("*/");
            print("private String "+entry.getKey() +";");



        }

    }

    public static void print(String s){
        System.out.println(s);
    }
}
