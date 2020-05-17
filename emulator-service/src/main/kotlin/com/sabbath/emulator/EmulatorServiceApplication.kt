package com.sabbath.emulator

import com.sabbath.emulator.client.CustomersClient
import com.sabbath.emulator.dto.ClientRequest
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import javax.annotation.PostConstruct

@SpringBootApplication
class EmulatorServiceApplication

@Configuration
@EnableFeignClients
class Config(
        val customersClient: CustomersClient
){
    @Bean
    fun restTemplate() = RestTemplate()

    @PostConstruct
    fun init() {
        repeat(10) {
            customersClient.addClient(ClientRequest("asaas","fde"))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<EmulatorServiceApplication>(*args)
}


