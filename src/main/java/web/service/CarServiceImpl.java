package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getSpecifiedNumberOfCars(int number) {
        List<Car> cars = new ArrayList<>();
        String[] carModels = {"Audi TT", "BMW 8 Sport Coupe", "Ford Cougar", "Fiat 124 Sport Coupe", "Opel Gran Turismo Coupé Concept"};
        Random random = new Random();
        if (number <= 0) {
            return new ArrayList<>();
        }
        if (number > 5) {
            number = 5;
        }
        Car.resetNextId();
        for (int i = 0; i < number; i++) {
            cars.add(new Car(carModels[i], random.nextInt(999999 - 100000) + 100000));
        }
        return cars;
    }
}
