package com.night.sinara_learn_java.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(jsr250Enabled = true)
public class SesurityConf {

    @Bean
    public UserDetailsService userDetailsService() {
        var support = User
                .username("support_skb")
                .password(passwordEnc().encode("support"))
                .roles("support")
                .build();

        var admin = User
                .username("admin_skb")
                .password(passwordEnc().encode("admin"))
                .roles("admin")
                .build();

        var user = User
                .username("user")
                .password(passwordEnc().encode("user"))
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(support, admin, user);
    }

    @Bean
    public PasswordEncoder passwordEnc(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/public/api")
                        .permitAll()
                        .requestMatchers("/support/api")
                        .hasRole("support")
                        .requestMatchers("/admin/api")
                        .hasRole("admin")
                )
                .httpBasic(Customizer.withDefaults())
                .build();
    }

}
