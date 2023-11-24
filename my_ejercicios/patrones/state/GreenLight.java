// Clase concreta GreenLight
public class GreenLight implements State {
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Cambio de luz verde a luz amarilla");
        trafficLight.setState(new YellowLight());
    }
}