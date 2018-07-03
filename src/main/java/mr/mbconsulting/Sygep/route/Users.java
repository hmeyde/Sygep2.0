package mr.mbconsulting.Sygep.route;

import javafx.application.Application;
import mr.mbconsulting.Sygep.model.User;
import mr.mbconsulting.Sygep.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/users")
public class Users {

    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping(value = "/signin", produces = {"application/json"})
    public ResponseEntity<Map> login(@RequestBody User user){
        String username = "admin";
        String password = "admin";
        System.out.println("User ---------------"+user.getUsername());
        Map<String, String> tokenMap = new HashMap<>();

        String token = userService.signin(username, password);
        tokenMap.put("token", token);
        return ResponseEntity.ok(tokenMap);
    }
}
