package io.purgil.gateway.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.security.web.server.header.XFrameOptionsServerHttpHeadersWriter

@Configuration
@EnableWebFluxSecurity
class SecurityConfig {
    @Bean
    fun filterChain(http: ServerHttpSecurity): SecurityWebFilterChain =
            http
                .formLogin { it.disable() }
                .csrf { it.disable() }
                .cors { it.disable() }
                .authorizeExchange{
                    it.anyExchange().permitAll()
                }
                .headers {
                    it.frameOptions { it.mode(XFrameOptionsServerHttpHeadersWriter.Mode.SAMEORIGIN) }
                }
                .build()

}
