package com.snoweagle.lab.duboo;


import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by Patrick on 26/12/2017.
 */
@Activate(group = { Constants.CONSUMER})
public class LogFilter implements  com.alibaba.dubbo.rpc.Filter{

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {


        long start = TimeAnalysis.currentTimeMillis("LogFilter-"+ invocation.getMethodName());
        Result invoke = invoker.invoke(invocation);
        TimeAnalysis.printProcessingTime(start,"LogFilter");
        return invoke;
    }
}
