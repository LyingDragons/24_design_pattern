package springVersion;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationEvent;

/**
 * @Author 马 洁
 * @Date 2019/10/30 17:00
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
public class DeviceEvent extends ApplicationEvent {

    private String name;
    private JSONObject jsonObject;

    public DeviceEvent(Object source,JSONObject jsonObject) {
        super(source);
        this.jsonObject=jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
