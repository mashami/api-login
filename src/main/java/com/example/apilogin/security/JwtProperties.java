package com.example.apilogin.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties("security.jwt")
public class JwtProperties {

    /**
     * Secrete key used for issuing JWT
     */
    private String secretKey;
}
