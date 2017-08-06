package au.com.itgeeks.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigurationServer {

  public static void main(final String[] args) {
    SpringApplication.run(SpringCloudConfigurationServer.class, args);
  }
}
