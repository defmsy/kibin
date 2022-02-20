package net.defmsy.kibin.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class WebSecurityConfiguration {

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
    disableCsrf(http);
    permitAllExchangesToActuatorEndpoints(http);
    secureEndpointsByDefault(http);
    configureOAuthResourceServer(http);
    return http.build();
  }

  private void disableCsrf(ServerHttpSecurity http) {
    http.csrf().disable();
  }

  private void permitAllExchangesToActuatorEndpoints(ServerHttpSecurity http) {
    http.authorizeExchange().pathMatchers("/actuator/**").permitAll();
  }

  private void secureEndpointsByDefault(ServerHttpSecurity http) {
    http.authorizeExchange().anyExchange().authenticated();
  }

  private void configureOAuthResourceServer(ServerHttpSecurity http) {
    http.oauth2ResourceServer().jwt();
  }

}
