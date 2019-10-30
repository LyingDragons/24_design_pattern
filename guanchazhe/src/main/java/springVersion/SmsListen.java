package springVersion;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author 马 洁
 * @Date 2019/10/30 17:20
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
@Component
public class SmsListen implements ApplicationListener<DeviceEvent> {

    @Override
    @Async
    public void onApplicationEvent(DeviceEvent deviceEvent) {
        System.out.println(Thread.currentThread().getName()+"发送短信成功"+deviceEvent.getJsonObject().toJSONString());
    }
}
