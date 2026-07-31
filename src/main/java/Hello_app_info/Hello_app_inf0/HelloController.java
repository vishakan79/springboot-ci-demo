package Hello_app_info.Hello_app_inf0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String SayHello(){
        return "Hello i am vishakan";
    }
}
