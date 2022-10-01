package com.project.finalExam.web;

import com.project.finalExam.app.item.domain.*;
import com.project.finalExam.components.KolesovyPodvozok;
import com.project.finalExam.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    private final BasicService basicService;

    @Autowired
    public VehicleController( BasicService basicService) {
        this.basicService = basicService;
    }


    @GetMapping("/")
    public String all(Model model) {
        model.addAttribute("vehicles", basicService.findAllVehicles());
        return "vehicle/all";
    }

    @GetMapping("/addLightTank")
    public String addLightForm(Model model) {
        model.addAttribute("vehicle", new LightTank());
        model.addAttribute("nationality", Nationality.values());
        model.addAttribute("kolesovyPodvozok", KolesovyPodvozok.class);
        model.addAttribute("kolesovy", basicService.findAllComponents());
        model.addAttribute("veza", basicService.findAllComponents());

        return "vehicle/addLightTank";
    }

    @PostMapping("/addLightTank")
    public String addSubmit(@ModelAttribute LightTank vehicle, Model model) {
        basicService.addVehicle(vehicle);
        model.addAttribute("vehicles", basicService.findAllVehicles());
        return "vehicle/all";
    }

    @GetMapping("/addHardTank")
    public String addHardForm(Model model) {
        model.addAttribute("vehicle", new HardTank());
        model.addAttribute("nationality", Nationality.values());
        model.addAttribute("pasovy", basicService.findAllComponents());
        model.addAttribute("veza", basicService.findAllComponents());
        return "vehicle/addHardTank";
    }

    @PostMapping("/addHardTank")
    public String addSubmit(@ModelAttribute HardTank vehicle, Model model) {
        basicService.addVehicle(vehicle);
        model.addAttribute("vehicles", basicService.findAllVehicles());
        return "vehicle/all";
    }


    @GetMapping("/addArtillery")
    public String addArtilleryForm(Model model) {
        model.addAttribute("vehicle", new HardTank());
        model.addAttribute("nationality", Nationality.values());
        model.addAttribute("pasovy", basicService.findAllComponents());
        model.addAttribute("delo", basicService.findAllComponents());
        return "vehicle/addArtillery";
    }

    @PostMapping("/addArtillery")
    public String addSubmit(@ModelAttribute Artillery vehicle, Model model) {
        basicService.addVehicle(vehicle);
        model.addAttribute("vehicles", basicService.findAllVehicles());

        return "vehicle/all";
    }

    @GetMapping("/id/{id}")
    public String byId(@PathVariable long id, Model model) {
        Optional<Vehicle> vehicleById = basicService.findVehicleById(id);
        if (vehicleById.isPresent()) {
            Vehicle vehicle = vehicleById.get();
            model.addAttribute("vehicles", basicService.findAllVehicles());
            model.addAttribute("vehicle", vehicle);
        }
        return "vehicle/one";
    }
}
