package kg.itacademy.lovelycars.service;

import kg.itacademy.lovelycars.entity.Car;

import java.util.List;

public interface CarService {
    Car createOrUpdate(Car car);
    List<Car> getAllCars();
    Car findById(Long id);
    Car deleteId(Long id);
}
