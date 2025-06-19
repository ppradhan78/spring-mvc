package northwind.mvc.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getMessage() {
        return "Welcome to Spring MVC!";
    }
}