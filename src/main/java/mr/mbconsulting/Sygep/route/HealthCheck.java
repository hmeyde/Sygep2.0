package mr.mbconsulting.Sygep.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("/api/healthcheck")
public class HealthCheck {

    @PostMapping
    public String getHelthCheck(){
        return String.format("Health check");

    }

}
