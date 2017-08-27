package au.com.itgeeks.spring.security.oidc.client.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableOAuth2Client
public class OIDCClientConnectConfig {

  @Value("${clientId}")
  private String clientId;

  @Value("${clientSecret}")
  private String clientSecret;

  @Value("${accessTokenUri}")
  private String accessTokenUri;

  @Value("${userAuthorizationUri}")
  private String userAuthorizationUri;

  @Value("${redirectUri}")
  private String redirectUri;

  @Bean
  public OAuth2ProtectedResourceDetails OIDCConfigDetails() {
    final AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
    details.setClientId(clientId);
    details.setClientSecret(clientSecret);
    details.setAccessTokenUri(accessTokenUri);
    details.setUserAuthorizationUri(userAuthorizationUri);
    details.setScope(Arrays.asList("openid", "email"));
    details.setPreEstablishedRedirectUri(redirectUri);
    details.setUseCurrentUri(false);
    return details;
  }

  @Bean
  public OAuth2RestTemplate OIDCTemplate(final OAuth2ClientContext clientContext) {
    final OAuth2RestTemplate template = new OAuth2RestTemplate(OIDCConfigDetails(), clientContext);
    return template;
  }

}