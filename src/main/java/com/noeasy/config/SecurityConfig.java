package com.noeasy.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

//	@Autowired
//	private CorsConfigurationSource corsConfigurationSource;
//
//	@Bean
//	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.addFilterBefore(new CorsFilter(corsConfigurationSource), ChannelProcessingFilter.class)
////				.csrf(csrf -> csrf.disable()).authorizeHttpRequests(
////						auth -> auth.requestMatchers("/public/**", "/error", "/favicon.ico", "/health", "/actuator/**")
////								.permitAll().anyRequest().authenticated());
//		http.cors(cors -> cors.configurationSource(corsConfigurationSource)) // CORS 설정 적용
//				.csrf(csrf -> csrf.disable()).authorizeHttpRequests(
//						auth -> auth.requestMatchers("/public/**", "/error").permitAll().anyRequest().authenticated());
//
//		return http.build();
//	}
}