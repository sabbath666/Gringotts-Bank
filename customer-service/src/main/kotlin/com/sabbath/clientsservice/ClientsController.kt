package com.sabbath.clientsservice

import com.sabbath.clientsservice.domains.Client
import com.sabbath.clientsservice.domains.ClientRepository
import com.sabbath.clientsservice.dto.ClientRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ClientsController(
        val clientRepository: ClientRepository
) {

    @PostMapping("/addClient")
    fun addClient(@RequestBody clientRequest: ClientRequest) {
        clientRepository.save(Client(
                clientRequest.firstname,
                clientRequest.lastname,
                Date()
        ))
    }
}