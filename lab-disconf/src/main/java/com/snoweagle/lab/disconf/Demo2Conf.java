package com.snoweagle.lab.disconf;


import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wangshaobo on 2016-3-30.
 */

@DisconfFile(filename = "WANGSHAOBO_KEY")
@Setter
public class Demo2Conf {
    private String name;

    @DisconfFileItem(name = "name", associateField = "name")
    public String getName() {
        return name;
    }

}
