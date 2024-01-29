package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private final List<Car> cars = Arrays.asList(initCarsList());

    private Car[] initCarsList() {
        Car[] carsArray = new Car[5];
        String[] carModels = {"Audi TT", "BMW 8 Sport Coupe", "Ford Cougar", "Fiat 124 Sport Coupe", "Opel Gran Turismo Coupé Concept"};
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            carsArray[i] = new Car(carModels[i], random.nextInt(999999 - 100000) + 100000);
        }
        return carsArray;
    }
    @Override
    public List<Car> getSpecifiedNumberOfCars(int number) {
        return cars.stream().limit(Math.max(number, 0)).collect(Collectors.toList());
    }
}
