package com.example.springLaptop2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

        @Bean
        public InMemoryUserDetailsManager userDetailService(){
            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("user").password("12345").roles("USER").build();
            UserDetails user2 = User.withDefaultPasswordEncoder()
                    .username("admin").password("67890").roles("USER","ADMIN").build();

            return new InMemoryUserDetailsManager(user, user2);
        }

}
