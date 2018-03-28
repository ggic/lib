package com.snoweagle.lab.disconf;


import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.snoweagle.console.common.utils.LogWorker;


/**
 * Created by wangshaobo on 2016-3-30.
 */
@DisconfFile(filename = "WANGSHAOBO.properties")
//@DisconfUpdateService(classes = {DemoConf.class})
public class DemoConf   {
    private static String name;
    private static String age;
    private static String addr;
    private static String city;

    @DisconfFileItem(name = "a.name", associateField = "name")
    public static String getName() {
        return name;
    }
    @DisconfFileItem(name = "a.age", associateField = "age")
    public static String getAge(String age) {
        return age;
    }

    @DisconfFileItem(name = "a.addr", associateField = "addr")
    public static String getAddr() {
        return addr;
    }
    @DisconfFileItem(name = "a.city", associateField = "city")
    public static String getCity() {
        return city;
    }


//    @Override
//    public void reload() throws Exception {
//        System.out.println("接听更新:"+LogWorker.json(this));
//    }
}
