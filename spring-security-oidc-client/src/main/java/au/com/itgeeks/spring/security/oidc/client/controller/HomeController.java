package au.com.itgeeks.spring.security.oidc.client.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @RequestMapping("/google_login")
  @ResponseBody
  public final String home() {
      final String username = SecurityContextHolder.getContext().getAuthentication().getName();
      logger.info(username);
      return "Welcome, " + username;
  }

}
