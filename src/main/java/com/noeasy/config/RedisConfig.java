package com.noeasy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

	@Bean
	RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);

		// Key serializer (String)
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new StringRedisSerializer());

		// Value serializer (JSON)
		Jackson2JsonRedisSerializer<Object> jacksonSerializer = new Jackson2JsonRedisSerializer<>(Object.class);

		// Optional: ObjectMapper 설정
		/*
		 * ObjectMapper om = new ObjectMapper(); om.setVisibility(PropertyAccessor.ALL,
		 * JsonAutoDetect.Visibility.ANY);
		 * om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		 * jacksonSerializer.setObjectMapper(om);
		 */

		template.setValueSerializer(jacksonSerializer);
		template.setHashValueSerializer(jacksonSerializer);

		template.afterPropertiesSet();
		return template;
	}
}