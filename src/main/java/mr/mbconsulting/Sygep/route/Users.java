package mr.mbconsulting.Sygep.route;

import javafx.application.Application;
import mr.mbconsulting.Sygep.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Users")
public class Users {

    @Autowired
    UserService userService;

    @PostMapping("/signin")
    public String login(){
        String username = "admin";
        String password = "admin";
        System.out.println("rentré ici");
        return userService.signin(username, password);
    }
}
