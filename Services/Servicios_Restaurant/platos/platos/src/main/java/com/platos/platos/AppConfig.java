/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platos.platos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Virginia
 */
@Configuration 
public class AppConfig {
    
    @Bean("apiConsumir")
    public RestTemplate obtenerRestTemplate(){
        return new RestTemplate();
    }
}
