package _18_Abstraction;

/*
* 문제
* Factory 추상 클래스 상속받을것
* 고유 메소드로 upgrade(String model)을 정의
* 예) 객체명.upgrade("아이패드 프로 13인치 8세대");로 호출하면
* "아이패드 프로 13인치 8세대로 업그레이드 합니다"출력
* produce()/manage()메소드를 태블릿 공장에 맞게 적절히 수정할 것
* (PhoneFactory 참고)
* 메인 실행부에서 tabletFactory1 객체 생성하고 애플 태블릿 공장으로 이름짓기
* produce("아이패드 미니 6세대")를 호출
* manage()호출
* upgrade("아이패드 미니 7세대")호출
* */
public class TabletFactory {
}
//상속 - 다형성(캐스팅) - 추상클래스 - 인터페이스 - 내부클래스 - 익명