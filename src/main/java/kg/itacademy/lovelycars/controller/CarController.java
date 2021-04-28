package kg.itacademy.lovelycars.controller;

import kg.itacademy.lovelycars.entity.Car;
import kg.itacademy.lovelycars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping
    public Car creatOrUpdate(@RequestBody Car car){
        return carService.createOrUpdate(car);
    }

    @GetMapping("/{carId}")
    public Car getById(@PathVariable Long carId){
        return carService.findById(carId);
    }

    @DeleteMapping("/{carId}")
    public Car deleteById(@PathVariable Long carId){
        return carService.deleteId(carId);
    }
}
