/**
 * Created by Murphy on 2/21/17.
 */
package HW6.observer;

public class MurphyConditionsDisplay implements Observer, DisplayElement
    {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public MurphyConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("Murphy Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
