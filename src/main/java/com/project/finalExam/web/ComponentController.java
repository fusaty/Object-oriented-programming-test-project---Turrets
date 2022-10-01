package com.project.finalExam.web;

import com.project.finalExam.app.item.domain.*;
import com.project.finalExam.components.Component;
import com.project.finalExam.components.KolesovyPodvozok;
import com.project.finalExam.components.Veza;
import com.project.finalExam.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/component")
public class ComponentController {
    private final BasicService basicService;

    @Autowired
    public ComponentController( BasicService basicService) {
        this.basicService = basicService;
    }


    @GetMapping("/")
    public String all(Model model) {
        model.addAttribute("components", basicService.findAllComponents());
        return "component/all";
    }



    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("component", new Component() {
            @Override
            public long getId() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }
        });
        return "component/add";
    }

    @PostMapping("/add")
    public String addSubmit(@ModelAttribute Component component, Model model) {
        basicService.addComponent(component);
        model.addAttribute("components", basicService.findAllComponents());
        return "component/all";
    }





    @GetMapping("/id/{id}")
    public String byId(@PathVariable long id, Model model) {
        Optional<Component> componentById = basicService.findComponentById(id);
        if (componentById.isPresent()) {
            Component component = componentById.get();
            model.addAttribute("components", basicService.findAllComponents());
            model.addAttribute("component", component);
        }
        return "component/one";
    }


}
