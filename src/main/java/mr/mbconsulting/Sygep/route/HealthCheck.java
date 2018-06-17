package mr.mbconsulting.Sygep.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/healthcheck")
public class HealthCheck {

    @GetMapping
    public String getHelthCheck(){
        return String.format("Health check");

    }

}
