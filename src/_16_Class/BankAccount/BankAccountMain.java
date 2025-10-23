package _16_Class.BankAccount;

/*
* BankAccount 클래스에서 속성으로 balance 선언
* balance는 private로 제한
* 해당 객체를 생성할때 balance에 값 주입
* 객체가 생성될때 "계좌가 개설되었습니다. 현재 잔액 : ****원" 출력이 되도록
* balance의 값을 볼 수 있게 get만들기
* 메소드로 deposit, withdraw 만들기
* 이때 deposit => 입금 금액이 0원 이상일때 입금이 가능하도록
* 입금이 되었을때 "계좌에 ****원이 입금되었습니다. 현재 잔액 : ***원" 출력
* withdraw => 출금액이 0원 이상이면서 잔액이 출금액보다 이상일 경우 출금 가능하도록
* 출금액이 0원 이상이 되지 않으면 "출금액은 0원 초과이어야 합니다." 출력
* 출금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : ****" 출력
* 메인에서 계좌 개설 후 한번씩 다 테스트 해보기
* */
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        System.out.println(account.getBalance());
        account.deposit(10000);
        System.out.println(account.getBalance());
        account.deposit(0);
        account.withdraw(5000);
        account.withdraw(0);
        account.withdraw(20000);
    }
}

//문제
//WaterBottle 패키지 만들고
//WaterBottle클래스
//currentWater 물의 양 => 속성
//메소드 물 채우기 fill => 최대용량 1000으로 이상으로 채울 수 없음
//메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
//getter로 현재 물의 양 출력하기
//객체 생성시 빈병