package _19_Interface.SmartDevice;
/*
* 인터페이스 상속받고 에어컨이랑 똑같이
* 속성으로 turnedOn이랑 brightness = 50
* 고유 메소드로 밝기를 올리는거 하나 내리는 거 하나
* 올리거나 내릴때 전원이 켜져있어야 하며 10씩 증감
* */
public class SmartLight implements SmartDevice {
    private boolean turnedOn;
    private int brightness = 50;

    @Override
    public String getName() {
        return "스마트 전등";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "을 켭니다. 현재 밝기: " + brightness + "%");
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다.");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void dim() {
        if (!turnedOn) {
            System.out.println(getName() + "이 꺼져있습니다.");
            return;
        }
        brightness -= 10;
        System.out.println("밝기를 줄입니다. 현재 밝기: " + brightness + "%");
    }

    public void brighten() {
        if (!turnedOn) {
            System.out.println(getName() + "이 꺼져있습니다.");
            return;
        }
        brightness += 10;
        System.out.println("밝기를 높입니다. 현재 밝기: " + brightness + "%");
    }
}
