package com.mj;

import java.util.List;

public interface LogWriteFileService {


    /**
     * 将日志写入到文件中
     */
    void logWriteFile();


    /**
     * 从本地文件中读取日志
     *
     * @return
     */
    List<LogBean> readLogFile();
}