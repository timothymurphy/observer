/**
 * Created by Peeke on 2/20/17.
 */
package HW6.observer;

public class PeekeConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public PeekeConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Peeke Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
