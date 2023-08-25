package edu.lemon.DemoInternetStore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    @Order(1)
    public SecurityFilterChain adminFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .securityMatcher("/admin/**")
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().hasRole("ADMIN")) // prefix "ROLE_" will be added automatically
                .formLogin(withDefaults())
                .build();
    }

    @Bean
    @Order(2)
    public SecurityFilterChain oauthFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated())
                .oauth2Login(withDefaults())
                .build();
    }

//    @Bean
//    @Order(3)
//    public SecurityFilterChain formLoginFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll())
//                .formLogin(withDefaults())
//                .build();
//    }

/*
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
*/

}
