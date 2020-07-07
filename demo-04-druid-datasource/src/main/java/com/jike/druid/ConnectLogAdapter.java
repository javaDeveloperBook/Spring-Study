package com.jike.druid;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * @description: 数据库连接日志打印
 * @author: JackWu
 * @create: 2020-07-02 16:53
 **/
@Slf4j
public class ConnectLogAdapter extends FilterEventAdapter {

    @Override
    public void connection_connectBefore(FilterChain chain, Properties info) {
        log.info("connection_connectBefore...");
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("connection_connectAfter...");
    }

}
