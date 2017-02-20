/**
 * Created by daniel on 2/20/17.
 */
package HW6.observer;
public class StockerConditionsDisplay {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StockerConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Stocker Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
