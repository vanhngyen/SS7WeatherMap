package com.example.ss7apiweatherrecyclerview.model;

public class Weather {
    private String DateTime;
    private String WeatherIcon;
    private String IconPhrase;
    private Temperature temperature;

    public Weather() {
    }

    public Weather(String dateTime, String weatherIcon, String iconPhrase, Temperature temperature) {
        DateTime = dateTime;
        WeatherIcon = weatherIcon;
        IconPhrase = iconPhrase;
        this.temperature = temperature;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}
