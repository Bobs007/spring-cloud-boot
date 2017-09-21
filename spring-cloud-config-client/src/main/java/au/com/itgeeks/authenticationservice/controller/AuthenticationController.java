package au.com.itgeeks.authenticationservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Login to the system by using user name and password.
 * 
 * @author Boby Thekkanath
 *
 */
@RestController
public class AuthenticationController {

  @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }
}
