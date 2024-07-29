package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping()
    public String listCarsByCount(@RequestParam(value = "count", defaultValue = "5") String count, ModelMap model) {
        model.addAttribute("carslist", carService.getCars(Integer.parseInt(count)));
        return "cars";
    }
}
