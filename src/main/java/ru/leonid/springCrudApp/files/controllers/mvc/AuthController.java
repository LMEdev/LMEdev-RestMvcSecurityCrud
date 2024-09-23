package ru.leonid.springCrudApp.files.controllers.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.leonid.springCrudApp.files.entities.User;
import ru.leonid.springCrudApp.files.services.RegistrationService;
import ru.leonid.springCrudApp.files.services.UserService;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    private final RegistrationService registrationService;

    @Autowired
    public AuthController(UserService userService, RegistrationService registrationService) {
        this.userService = userService;
        this.registrationService = registrationService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    @GetMapping("/registration")
    public String registrationPage(@ModelAttribute("user") User user){
        return "auth/registration";
    }

    @PostMapping("/registration")
    public String performRegistration(@ModelAttribute("user") User user){
        registrationService.register(user);
        return "redirect:/auth/login";
    }
}
