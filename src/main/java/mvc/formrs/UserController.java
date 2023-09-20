package mvc.formrs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {
    private static final String[] countries = {"VietNam", "HanQuoc", "HoaKy"};
    @RequestMapping(value = "/register")
    public String showRes(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("genders", Gender.values());
        model.addAttribute("countries", countries);
        return "formrs/userForm";
    }
    @RequestMapping(value = "/result")
    public String processUser(User user) {
        return "formrs/userResult";
    }
}
