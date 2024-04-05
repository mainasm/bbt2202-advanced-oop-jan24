package Observer_Pattern;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.setTemperature(25.3f);  // This will notify the temperatureDisplay to update
    }
}
