package cn.wilmar.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yin Guo Wei 2018/3/31.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "pages/login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "pages/login";
    }

    @RequestMapping("/register")
    public String register() {
        return "pages/register";
    }
}
