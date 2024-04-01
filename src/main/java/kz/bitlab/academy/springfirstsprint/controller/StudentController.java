package kz.bitlab.academy.springfirstsprint.controller;

import kz.bitlab.academy.springfirstsprint.entity.StudentEntity;
import kz.bitlab.academy.springfirstsprint.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "index";
    }

    @GetMapping("/addStudentForm")
    public String showAddStudentForm() {
        return "add-student";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam String name, @RequestParam String surname, @RequestParam int exam, @RequestParam String mark) {
        StudentEntity student = new StudentEntity();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        student.setMark(mark);
        studentService.save(student);
        return "redirect:/";
    }
}
