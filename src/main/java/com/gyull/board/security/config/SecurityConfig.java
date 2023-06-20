package com.gyull.board.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.RequestCacheConfigurer;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@EnableWebSecurity
public class SecurityConfig {

  @Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.cors().disable();
    http.csrf().disable();          
    http.authorizeRequests()
        .antMatchers("/resources/**","/static/**", "/img/**", "/css/**", "/js/**").permitAll()
        .antMatchers("/", "/policy/**", "/expolore/**", "/notice/**", "/reservation/**", "/community/**", "/admin/**", "/admin/**/**", "/**", "/**/**").permitAll()
        .antMatchers("/mylibrary", "/mypage").hasAuthority("user")
        .anyRequest()                     
        .authenticated();

    http.formLogin()
        .loginPage("/login").permitAll()
        .successHandler(new SavedRequestAwareAuthenticationSuccessHandler())
        .defaultSuccessUrl("/")
        .failureUrl("/login?failure=true")
        .and()
        .logout()
        .logoutSuccessUrl("/")
        .and()
        .exceptionHandling().accessDeniedHandler(new AccessDeniedHandlerImpl());

    return http.build();
	}

  @Bean
  public Argon2PasswordEncoder passwordEncoder(){
    return new Argon2PasswordEncoder();
  }

}
