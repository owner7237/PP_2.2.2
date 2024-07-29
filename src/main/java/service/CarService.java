package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();
    public CarService() {
        cars.add(new Car("Jobber", 1800, "Rusty"));
        cars.add(new Car("Porsche", 2000, "Red"));
        cars.add(new Car("Ford", 1930, "Black"));
        cars.add(new Car("Jobber", 1800, "Rusty"));
        cars.add(new Car("Jobber", 1800, "Rusty"));
        cars.add(new Car("Teleport", 3005, "Invisible"));
    }

    public List<Car> getCars(int count) {
        ArrayList<Car> temp = new ArrayList<>();

        if (count >= 5) return cars;

        for (int i = 0; i < count; i++) {
            temp.add(cars.get(i));
        }
        return temp;
    }
}
