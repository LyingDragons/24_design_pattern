package springVersion;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 马 洁
 * @Date 2019/10/30 17:53
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
@RestController
public class TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/device")
    public String addOrder() {
        // 3.组装消息内容
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", "设备上线。。。.");
        DeviceEvent deviceEvent = new DeviceEvent(this, jsonObject);
        applicationContext.publishEvent(deviceEvent);
        return "success";
    }

}
