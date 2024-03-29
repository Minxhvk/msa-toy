package com.example.userservice.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class WebSecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        http.csrf { obj: CsrfConfigurer<HttpSecurity> -> obj.disable() }

        http.authorizeHttpRequests {
            it.requestMatchers("/catalog-service/**", "/health_check").permitAll()
                .anyRequest().authenticated()
        }

        return http.build()
    }


    @Bean
    fun password(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }
}