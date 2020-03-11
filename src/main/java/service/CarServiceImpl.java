package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private static volatile CarServiceImpl instance;

    private CarServiceImpl() {

    }

    public static CarServiceImpl getInstance() {
        synchronized (CarService.class) {
            if (instance == null) {
                instance = new CarServiceImpl();
            }
        }
        return instance;
    }

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ferrari", "fx", 10000));
        cars.add(new Car("toyota", "corolla", 20000));
        cars.add(new Car("ford", "mustang", 30000));
        return cars;
    }
}
