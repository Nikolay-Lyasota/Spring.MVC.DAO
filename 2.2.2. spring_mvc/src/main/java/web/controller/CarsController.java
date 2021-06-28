package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false) Integer count, Model model) {
        if(count == null || count > 5) {
            count = 5;
        }
        model.addAttribute("listCars",carService.getCars(count));
        return "cars";
    }
}
