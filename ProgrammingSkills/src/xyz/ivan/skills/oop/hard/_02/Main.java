package xyz.ivan.skills.oop.hard._02;

import java.util.List;
import java.util.ArrayList;

/**
 * Design a Weather Monitoring System (Observer Pattern)
 * 
 * Description:
 * 
 * Create a WeatherStation class that represents a weather station, 
 * containing the current temperature and a list of observers.
 * 
 * Provide methods:
 * - add_observer(observer)
 * - remove_observer(observer)
 * - notify_observers()
 * 
 * Create an Observer interface with a method update(temperature) 
 * that subclasses must implement.
 * 
 * Create two observer subclasses, such as PhoneDisplay and WebDisplay, 
 * that print the updated temperature.
 * 
 * Ensure all are called.
 */

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        Observer phoneDisplay = new PhoneDisplay();
        Observer webDisplay = new WebDisplay();
        
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(webDisplay);
        
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}

interface Observer {
    void update(int temperature);
}

class WeatherStation {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature updated to " + temperature);
    }
}

class WebDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Web Display: Temperature updated to " + temperature);
    }
}
