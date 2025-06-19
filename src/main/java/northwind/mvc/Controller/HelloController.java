package northwind.mvc.Controller;
import northwind.mvc.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    //@RequestMapping("/hello")
    public String hello(Model model) {
        String message = helloService.getMessage();
        model.addAttribute("message", message);
        return "hello";
    }

    @GetMapping("/fruits")
    public String showFruits(Model model) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
        model.addAttribute("fruits", fruits);
        return "fruits";

    }
}