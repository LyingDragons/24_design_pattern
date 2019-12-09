package com.mj;

import java.util.ArrayList;
import java.util.List;

public class LogWriteFileServiceImpl implements LogWriteFileService {
    @Override
    public void logWriteFile() {
        System.out.println(">>>将日志写入文件中...");
    }

    @Override
    public List<LogBean> readLogFile() {
        LogBean log1 = new LogBean();
        log1.setLogId("0001");
        log1.setLogText("Tomcat启动成功..");

        LogBean log2 = new LogBean();
        log2.setLogId("0002");
        log2.setLogText("Jetty启动成功..");
        List<LogBean> listArrayList = new ArrayList<LogBean>();
        listArrayList.add(log1);
        listArrayList.add(log2);
        return listArrayList;
    }


}

