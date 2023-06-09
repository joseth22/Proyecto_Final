package com.proyecto;


import com.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter { 

    @Autowired
    private UserService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();              
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    @Bean
    DaoAuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());                        
        daoAuthenticationProvider.setUserDetailsService(getUserService());                      
        return daoAuthenticationProvider;                                                       
    }

    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler() {
        return new AppAuthenticationSuccessHandler();
    }

    public SecurityConfig(UserService userPrincipalDetailsService) {                            
        this.userDetailsService = userPrincipalDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
     

        http.authorizeRequests()
                .antMatchers("/admin", "/login","/historiales","/compraR",
                        "/compras", "/home", "/inicio", "/resCompra", "/partidoAdmin", "/teatroAdmin", 
                        "/teatro", "/partidos", "/conciertos", "/conciertoN", "/partidoN", "/teatroN")                           
                .hasRole("ADMIN")                                                            
                .antMatchers("/login", "/historiales", "/compraR", "/compras",
                        "/home", "/inicio", "/resCompra", "/teatro", "/partidos", "/conciertos")                             
                .hasAnyRole("USER", "ADMIN")                                                 
                .anyRequest().authenticated()                                               
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/home", true);           
    } 
    
    

}
