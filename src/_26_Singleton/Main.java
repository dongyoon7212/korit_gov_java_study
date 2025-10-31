package _26_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManager logManager1 = LogManager.getInstance();
        LogManager logManager2 = LogManager.getInstance();
        logManager1.log("첫번째 로그 메시지");
        logManager2.log("두번째 로그 메시지");
        System.out.println(logManager1 == logManager2);
    }
}
