package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub(
                new SmartAirConditioner(),
                new SmartSpeaker(),
                new SmartLight()
        );

        hub.turnOnAll();
        hub.showStatus();
        hub.turnOffAll();

        SmartAirConditioner smartAirConditioner = new SmartAirConditioner();
        smartAirConditioner.turnOn();
        smartAirConditioner.increaseTemperature();
    }
}
