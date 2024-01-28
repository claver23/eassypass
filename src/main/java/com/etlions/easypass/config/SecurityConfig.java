package com.etlions.easypass.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception {
      return  http
          .authorizeHttpRequests( auth -> {
            auth
                .requestMatchers("/"
                    ,"/home"
                    ,"/about-us"
                    ,"/services"
                    ,"/contact"
                    ,"/scripts/**"
                    ,"/styles/**"
                    ,"/img/**"
                )
                .permitAll();
            auth.anyRequest().authenticated();
          })
          .oauth2Login(oauthLogin -> {
            oauthLogin.defaultSuccessUrl("/me", true);
          })
          .formLogin(formLogin -> {
            formLogin.loginPage("/loginEP")
                .defaultSuccessUrl("/me")
                .permitAll();
          })
          .build();
    }


}
