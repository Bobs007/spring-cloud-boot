package au.com.itgeeks.authenticationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Web security configurer web
 * 
 * @author Boby Thekkanath
 *
 */
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

  @Autowired
  public void globalUserDetails(final AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("john").password("123").roles("USER").and()
        .withUser("tom").password("111").roles("ADMIN").and().withUser("user1").password("pass")
        .roles("USER").and().withUser("admin").password("nimda").roles("ADMIN");
  }

  @Override
  @Bean
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  @Override
  protected void configure(final HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/api/public/**").permitAll().antMatchers("/api/secure/**")
        .permitAll().anyRequest().authenticated().and().csrf();
  }

}
