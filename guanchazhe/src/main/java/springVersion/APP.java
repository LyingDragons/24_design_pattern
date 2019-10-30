package springVersion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author 马 洁
 * @Date 2019/10/30 17:54
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
@SpringBootApplication
@EnableAsync
public class APP {
    public static void main(String[] args) {
        SpringApplication.run(APP.class);
    }
}
