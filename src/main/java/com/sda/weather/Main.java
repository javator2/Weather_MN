package com.sda.weather;

import com.sda.weather.Model.Weather;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miejscowość: ");
        String name = scanner.nextLine();
        //System.out.println(name);


        String url = "http://api.apixu.com/v1/current.json?key=d48c0d5e40054b6a9e571834181808&q=" + name;
        try {
            //System.out.println(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));




            JSONObject json = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));

            System.out.println(name + ", Temperatura w dniu " + json.getJSONObject("current").get("last_updated") +
                    " wynosi: " + json.getJSONObject("current").get("temp_c") + "*C, odczuwalna: " +
                    json.getJSONObject("current").get("feelslike_c") + "*C");

            Weather weather = new Weather();
            weather.setCity(json.getJSONObject("location").get("name").toString());
            weather.setTemperature((Double) json.getJSONObject("current").get("temp_c"));
            weather.setFeelsLikeC((Double) json.getJSONObject("current").get("feelslike_c"));
            weather.setConditionText((String) json.getJSONObject("current").getJSONObject("condition").get("text"));
            weather.setIconURL((String) json.getJSONObject("current").getJSONObject("condition").get("icon"));

            System.out.println(weather.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
