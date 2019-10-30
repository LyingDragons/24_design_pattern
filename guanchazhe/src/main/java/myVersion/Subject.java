package myVersion;


import java.util.ArrayList;

/**
 * @Author 马 洁
 * @Date 2019/10/30 16:25
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 *
 * 主题
 */
public interface Subject {

    ArrayList<Observer> subjectList=new ArrayList();


    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyAllObserver(String msg);
}
