/**
 * @author zambeezy
 */

package HW6.observer;

public class ZambelliConditionsDisplay implements Observer, DisplayElement
{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ZambelliConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Schaper Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
