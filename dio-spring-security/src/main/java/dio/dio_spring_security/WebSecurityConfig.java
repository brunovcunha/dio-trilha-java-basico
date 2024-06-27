package dio.dio_spring_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import dio.dio_spring_security.config.SecurityDatabaseService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {

    @Autowired
    private SecurityDatabaseService securityService;

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    // @Bean
    // public InMemoryUserDetailsManager userDetailsService() {
    //     var user = User.withUsername("user")
    //             .password("{noop}user123")
    //             .roles("USERS")
    //             .build();

    //     var admin = User.withUsername("admin")
    //             .password("{noop}master123")
    //             .roles("MANAGERS")
    //             .build();

    //     return new InMemoryUserDetailsManager(user, admin);
    // }

     @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http.authorizeHttpRequests(authorizeRequests ->
                 authorizeRequests
                     .requestMatchers("/").permitAll()
                     .requestMatchers("/login").permitAll()
                     .requestMatchers("/managers").hasAnyRole("MANAGERS")
                     .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS")
                     .anyRequest().authenticated()
             )
             .httpBasic();
         return http.build();
     }
}
