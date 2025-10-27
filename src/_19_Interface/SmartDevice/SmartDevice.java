package _19_Interface.SmartDevice;

/*
* interface
* getName => String
* turnOn, turnOff => void
* isTurnedOn => boolean
*

* */
public interface SmartDevice {
    String getName();
    void turnOn();
    void turnOff();
    boolean isTurnedOn();
}
