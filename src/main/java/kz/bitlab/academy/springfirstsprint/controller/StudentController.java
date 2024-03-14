package kz.bitlab.academy.springfirstsprint.controller;

import kz.bitlab.academy.springfirstsprint.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("students", StudentService.findAll());
        return "index";
    }

}
