package au.com.itgeeks.authenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * Entry for Authentication Service
 * 
 * @author Boby Thekkanath
 *
 */
@SpringBootApplication
public class AuthenticationServiceApplication extends SpringBootServletInitializer {


  public static void main(final String[] args) {
    SpringApplication.run(AuthenticationServiceApplication.class, args);
  }
}

