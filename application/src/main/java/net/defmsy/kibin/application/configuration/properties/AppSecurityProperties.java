package net.defmsy.kibin.application.configuration.properties;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "app.security")
public class AppSecurityProperties {

  @NotNull
  private OAuth2Properties oauth2;

  public OAuth2Properties getOauth2() {
    return oauth2;
  }

  public void setOauth2(
      OAuth2Properties oauth2) {
    this.oauth2 = oauth2;
  }

  public static class OAuth2Properties {

    @NotBlank
    private String issuerUri;
    @NotBlank
    private String jwkSetUri;

    public String getIssuerUri() {
      return issuerUri;
    }

    public void setIssuerUri(String issuerUri) {
      this.issuerUri = issuerUri;
    }

    public String getJwkSetUri() {
      return jwkSetUri;
    }

    public void setJwkSetUri(String jwkSetUri) {
      this.jwkSetUri = jwkSetUri;
    }
  }
}
