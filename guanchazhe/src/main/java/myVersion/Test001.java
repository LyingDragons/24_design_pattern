package myVersion;

/**
 * @Author 马 洁
 * @Date 2019/10/30 16:43
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
public class Test001 {

    public static void main(String[] args) {
        Subject subject=new SubjectImpl();

        String msg="恭喜您获得200万元大礼包！！";
        subject.addObserver(new SmsObserverImpl("老王"));
        subject.addObserver(new EmailObserverImpl("小李"));

        subject.notifyAllObserver(msg);
    }
}
