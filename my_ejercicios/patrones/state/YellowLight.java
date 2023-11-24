// Clase concreta YellowLight
public class YellowLight implements State {
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Cambio de luz amarilla a luz roja");
        trafficLight.setState(new RedLight());
    }
}
