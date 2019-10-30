package myVersion;

/**
 * @Author 马 洁
 * @Date 2019/10/30 16:32
 * @DESCRIBE 24种设计模式示例
 * @QQ 1304908180
 */
public class SubjectImpl implements  Subject {


    @Override
    public void addObserver(Observer observer) {
        subjectList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        subjectList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String msg) {
        for (Observer observer : subjectList) {
            observer.update(msg);
        }
    }


}
