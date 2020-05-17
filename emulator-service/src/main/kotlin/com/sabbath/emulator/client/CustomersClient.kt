package com.sabbath.emulator.client

import com.sabbath.emulator.dto.ClientRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "client-service",url = "http://localhost:8081")
interface CustomersClient {
    @PostMapping("/addClient")
    fun addClient(@RequestBody request:ClientRequest)
}