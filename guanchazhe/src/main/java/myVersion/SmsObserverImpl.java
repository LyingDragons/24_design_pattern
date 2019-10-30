package myVersion;

/**
 * @Author 马 洁
 * @Date 2019/10/30 16:40
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
public class SmsObserverImpl implements Observer {

    private String name;

    public  SmsObserverImpl(String name){
        this.name=name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+",短信发送成功,"+msg);
    }
}
