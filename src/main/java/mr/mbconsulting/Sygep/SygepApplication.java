package mr.mbconsulting.Sygep;

import mr.mbconsulting.Sygep.model.Role;
import mr.mbconsulting.Sygep.model.User;
import mr.mbconsulting.Sygep.repository.UserRepository;
import mr.mbconsulting.Sygep.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"mr.mbconsulting.Sygep.controller","mr.mbconsulting.Sygep.services"})
@EntityScan("mr.mbconsulting.Sygep.model")
@EnableJpaRepositories("mr.mbconsulting.Sygep.repository")
public class SygepApplication  implements CommandLineRunner{

	@Autowired
	UserService userService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SygepApplication.class, args);
	}


	/*@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}*/

	@Override
	public void run(String... params) throws Exception {
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setEmail("admin@email.com");
		admin.setRoles(new ArrayList<>(Arrays.asList(Role.ROLE_ADMIN)));

		userService.signup(admin);

		User client = new User();
		client.setUsername("client");
		client.setPassword("client");
		client.setEmail("client@email.com");
		client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_CLIENT)));

		userService.signup(client);
	}
}
