package au.com.itgeeks.loginservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class UsernamePassword {
  
  @RequestMapping("/")
  public String home() {
      return "Hello World!";
  }

  public static void main(final String[] args) {
    SpringApplication.run(UsernamePassword.class, args);
  }
}