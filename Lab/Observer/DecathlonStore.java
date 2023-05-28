import java.util.*;

public class DecathlonStore implements Subject {
    private List<Observer> observers;

    public DecathlonStore() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Discount discount) {
        System.out.println("Announcing discount: " + discount.getDescription());
        for (Observer observer : observers) {
            observer.update(discount);
        }
    }
}
