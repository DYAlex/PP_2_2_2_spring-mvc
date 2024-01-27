package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap model) {
        List<Car> cars = carService.getSpecifiedNumberOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
