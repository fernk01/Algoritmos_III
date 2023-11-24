// Clase TrafficLight (Context)
public class TrafficLight {
    private State state;
    public TrafficLight() {
        state = new RedLight();
    }
    public void setState(State state) {
        this.state = state; 
    }
    public void changeLight() {
        state.changeLight(this);
    }
}