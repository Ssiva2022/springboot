package SS.Spring.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value={"","/","/Home"})
    public String displayHomePage()
    {
       // model.addAttribute("username","saravanasiva Arumugam");
        return "Home.html";
    }
}
