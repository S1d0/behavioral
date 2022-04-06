package pattern;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements IObservable{
    private List<IObserver> observers;
   
    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);        
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(IObserver::update);        
    }

    public String getTempeture() {
        return "20C";
    }
    
}
