package _19_Interface.SmartDevice;
/*
* 필드에 각 가전이 들어있음
* 고유 메소드로
* turnOnAll() => 모든 가전을 전원 킴
* turnOffAll() => 모든 가전의 전원을 끔
* showStatus() => 모든 가전의 상태 출력
* */
public class SmartHomeHub {
    private SmartAirConditioner smartAirConditioner;
    private SmartSpeaker smartSpeaker;
    private SmartLight smartLight;

    public SmartHomeHub(SmartAirConditioner smartAirConditioner, SmartSpeaker smartSpeaker, SmartLight smartLight) {
        this.smartAirConditioner = smartAirConditioner;
        this.smartSpeaker = smartSpeaker;
        this.smartLight = smartLight;
    }

    public void turnOnAll() {
        smartAirConditioner.turnOn();
        smartSpeaker.turnOn();
        smartLight.turnOn();
    }

    public void turnOffAll() {
        smartAirConditioner.turnOff();
        smartSpeaker.turnOff();
        smartLight.turnOff();
    }

    public void showStatus() {
        System.out.println("스마트 에어컨 : " + (smartAirConditioner.isTurnedOn() ? "ON" : "OFF"));
        System.out.println("스마트 스피커 : " + (smartSpeaker.isTurnedOn() ? "ON" : "OFF"));
        System.out.println("스마트 전등 : " + (smartLight.isTurnedOn() ? "ON" : "OFF"));
    }
}
