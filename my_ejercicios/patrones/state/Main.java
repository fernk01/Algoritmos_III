// Clase principal
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeLight();  // Cambio de luz roja a luz verde
        trafficLight.changeLight();  // Cambio de luz verde a luz amarilla
        trafficLight.changeLight();  // Cambio de luz amarilla a luz roja
    }
}