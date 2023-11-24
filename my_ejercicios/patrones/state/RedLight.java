// Clase concreta RedLight
public class RedLight implements State {
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Cambio de luz roja a luz verde");
        trafficLight.setState(new GreenLight());
    }
}