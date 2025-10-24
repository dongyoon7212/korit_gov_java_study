package _17_Inheritance;

/*
* Animal 클래스를 상속 받으세요
* 고유 필드 속성으로 language 라는 속성 추가
* setter들을 이용해서 각 속성의 값을 주입
* getAnimalName을 재정의 하여 호출했을때
* "안녕하세요. 제 이름은 ___입니다."라고 출력할 수 있도록 코드를 작성
* getAnimalAge를 재정의 하여 호출했을때
* "올해 제 나이는 **살 입니다. 내년에는 ** + 1살이 됩니다." 라고 출력
* move를 재정의하여 사람이 두 발로 걷습니다.라고 재정의
* 고유메소드로 read() 선언하는데 파라미터로 bookName을 받음
* 호출시 파라미터로 받은 bookName을 이용하여 "bookName을 읽는 중 입니다." 출력
* */
public class Human {

}
/*
* Message라는 클래스 생성
* 속성으로는 String text
* Allargs 생성자
* 메소드 String 반환 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
*  ===>return "[MSG] ";
* 메소드 String 반환 format() => 모두 접근 가능
*  ===> return 접두사로 "[MSG] "가 붙고 뒤에는 메세지 텍스트가 붙어서 리턴
* 메소드 void print() => 모두 접근 가능
*  ===> format()을 호출한 값 출력
*
* 클래스 SimpleMessage => Message 상속
* 부모필드 생성자사용해서 객체 생성하도록
* 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
* ===> "[SIMPLE] " 반환하도록 재정의
* 메소드 format() => 모두 접근 가능
* ===> return 접두사로 "[SIMPLE] "가 붙고 중간에는 "내용: ", 뒤에는 메세지 텍스트가 붙어서 리턴
* ex) [SIMPLE] 내용: 가나다라마바사
*
* 클래스 FancyMessage => Message 상속
* * 부모필드 생성자사용해서 객체 생성하도록
 * 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
 * ===> "[FANCY] " 반환하도록 재정의
 * 메소드 format() => 모두 접근 가능
 * ===> return 접두사로 "[FANCY] "가 붙고 중간에는 "★ ",
 * 뒤에는 메세지 텍스트가 붙고 끝에 " ★"로 끝남
 * ex) [FANCY] ★ 가나다라마바사 ★
* */

/*
* 배송비 계산기
* 클래스 Shipment
* 속성은 출발지, 목적지
* allargs 생성자
* route() 메소드 리턴 예 => "부산 -> 서울"
* calcFee() 메소드 파라미터 무게와 거리 리턴은 그냥 0을 리턴
* calcFee는 자식클래스에서 재정의 할 예정
*
* 자식클래스 BikeShipment
* allargs 생성자
* calcFee(무게, 거리) 오버라이드 =>
* 기본금액 2000에 무게당 20 + 거리당 50 반환
* 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
*
* 자식클래스 TruckShipment
* allargs 생성자
 * calcFee(무게, 거리) 오버라이드 =>
 * 기본금액 5000에 무게당 40 + 거리당 30 반환
 * 만약 무게 또는 거리가 0미만이면 무게 또는 거리는 0으로 본다
* */






