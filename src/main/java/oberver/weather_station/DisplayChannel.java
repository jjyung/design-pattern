package oberver.weather_station;

public class DisplayChannel implements Observer, DisplayElement {
    private final String channelName;
    private float temperature;
    private float humidity;
    private float pressure;

    public DisplayChannel(String channelName, Subject subject) {
        this.channelName = channelName;
        subject.registerObserver(this);
    }

    @Override public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override public void display() {
        String format = "%s: %.2f C degrees, %.2f%% humidity and %.2f Pa\n";
        System.out.printf(format, this.channelName, this.temperature, this.humidity, this.pressure);
    }
}
