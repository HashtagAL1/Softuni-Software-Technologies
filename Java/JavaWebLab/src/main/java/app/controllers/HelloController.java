package app.controllers;

import app.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        List<Student> students = loadStudents();
        model.addAttribute("title", "This is the title");
        model.addAttribute("students", students);
        return "hello";

    }

    private List<Student> loadStudents() {

        List<Student> res = new ArrayList<>();
        res.add(new Student("st1", "age1"));
        res.add(new Student("st2", "age2"));
        res.add(new Student("st3", "age3"));
        return res;
    }
}
