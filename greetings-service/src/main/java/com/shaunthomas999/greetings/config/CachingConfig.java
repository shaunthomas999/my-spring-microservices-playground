package com.shaunthomas999.greetings.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Ref: https://www.baeldung.com/spring-cache-tutorial
 */
@Configuration
@EnableCaching
public class CachingConfig {

//  @Bean
//  public CacheManager cacheManager() {
//    return new ConcurrentMapCacheManager("greetings");
//  }
}
