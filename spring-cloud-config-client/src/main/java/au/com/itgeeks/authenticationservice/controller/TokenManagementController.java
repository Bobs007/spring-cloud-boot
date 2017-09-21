package au.com.itgeeks.authenticationservice.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 */
@RequestMapping(value = "/api/secure/token/**")
public class TokenManagementController {

  @RequestMapping(method = RequestMethod.GET, value = "/accessToken")
  @ResponseBody
  public String getTokens(@PathVariable String accessTokenId) {
    return accessTokenId;
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/refreshTokenId")
  @ResponseBody
  public String revokeRefreshToken(@PathVariable String refreshTokenId) {
    return refreshTokenId;
  }

}
