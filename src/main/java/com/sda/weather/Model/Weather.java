package com.sda.weather.Model;

public class Weather {

    private String city;
    private String iconURL;
    private double temperature;
    private double feelsLikeC;
    private String conditionText;

    public Weather(){

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", iconURL='" + iconURL + '\'' +
                ", temperature=" + temperature +
                ", feelsLikeC=" + feelsLikeC +
                ", conditionText='" + conditionText + '\'' +
                '}';
    }
}
