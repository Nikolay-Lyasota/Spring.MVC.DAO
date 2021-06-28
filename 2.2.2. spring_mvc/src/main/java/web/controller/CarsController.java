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
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count != null) {
            model.addAttribute("listCars",carService.getCars(count).toString());
           // model.addAttribute("carsMessage", String.format("%d Selected Cars: ",count) + carService.getCars(count).toString());
            System.out.println(String.format("%d Selected Cars: ",count) + carService.getCars(count).toString().replaceAll("[\\[\\]]","").replaceAll(",","\n"));
        } return "cars";
    }
}
