package oberver.weather_station;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayChannel newspaper = new DisplayChannel("newspaper", weatherData);
        DisplayChannel mobilePhone = new DisplayChannel("mobilePhone", weatherData);
        DisplayChannel web = new DisplayChannel("web", weatherData);

        weatherData.setMeasurements(26, 65, 30.4f);
        weatherData.setMeasurements(30, 70, 29.2f);
        weatherData.setMeasurements(40, 90, 29.2f);
    }
}
