package northwind.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CourseController {
    @GetMapping("/course")
    public String course(Model model) {
        List<String> courseList = Arrays.asList("Java", "Python", "C#", "SQL Server");
        model.addAttribute("courseList", courseList);
        return "course";
    }
}
