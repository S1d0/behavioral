package pattern;

class MobileWeatherDisplay implements IObserver{
    private final WeatherStation station;

    public MobileWeatherDisplay(WeatherStation station) {
        this.station = station;
    }
    
    @Override
    public void update() {
        refreshDisplay();   
    }

    private void refreshDisplay() {
        String currentTemp = station.getTempeture();
        System.out.println(currentTemp);
    }
}
