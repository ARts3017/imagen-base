/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagen.base.demo.reddis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 *
 * @author Arturo
 */
@Configuration
public class RedisConfiguration {
    
   
    @Bean
    JedisConnectionFactory jdisConnectionFactory(){
        return new JedisConnectionFactory();
    }
    
    @Bean
    RedisTemplate<String,String> redidTemplate(){
        final RedisTemplate<String,String> redisTemplate=new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jdisConnectionFactory());
        return redisTemplate;
    }
   
}
