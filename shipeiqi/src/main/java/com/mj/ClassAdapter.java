package com.mj;

import java.util.List;

public class ClassAdapter  implements LogWriteDbService {

    private LogWriteFileServiceImpl logWriteFileService;

    public ClassAdapter(LogWriteFileServiceImpl logWriteFileService) {
        this.logWriteFileService = logWriteFileService;
    }

    @Override
    public void writeDbFile(LogBean logBean) {
        // 1.从文件中读取日志文件
        List<LogBean> logBeans = logWriteFileService.readLogFile();
        // 2.写入到数据库中
        logBeans.add(logBean);
        System.out.println(">>>将数据写入到数据库中..");
        // 3.写入到本地文件中
        logWriteFileService.logWriteFile();
    }
}
