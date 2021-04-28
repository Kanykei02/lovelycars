package kg.itacademy.lovelycars.service;

import kg.itacademy.lovelycars.entity.Car;
import kg.itacademy.lovelycars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public Car createOrUpdate(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car deleteId(Long id) {
        Car car = findById(id);
        if(car != null){
            carRepository.delete(car);
            return car;
        }
        return null;
    }
}
