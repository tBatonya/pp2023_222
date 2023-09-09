package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final List<Car> makeCars = List.of(new Car(), new Car(), new Car(), new Car(), new Car());

    private final int MAX_NUMBER_OF_CARS = 5;

    @Override
    public List<Car> listCar(Integer number) {
        if (number == null || number >= MAX_NUMBER_OF_CARS) {
            return makeCars;
        }
        if (number <= 0) {
            return null;
        }
        return makeCars.subList(0, number);
    }
}