package com.sabbath.clientsservice

import com.sabbath.clientsservice.domains.Client
import com.sabbath.clientsservice.domains.ClientRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*
import javax.annotation.PostConstruct

@SpringBootApplication
class ClientsServiceApplication(
        val clientRepository: ClientRepository
){
    @PostConstruct
    fun init(){
        clientRepository.save(Client("Sergey","Zadorozhniy", Date()))
    }
}

fun main(args: Array<String>) {
    runApplication<ClientsServiceApplication>(*args)
}


