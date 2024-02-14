package com.ecommerce.orderservice.controller;


import com.ecommerce.orderservice.dto.OrderRequest;
import com.ecommerce.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    private final WebClient webClient;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Orders placed succussfully";
    }

    @GetMapping("tt")
    public String weee(){
     return webClient.get()
             .uri("http://localhost:8082/api/inventory/test")
             .retrieve()
             .bodyToMono(String.class)
             .block();
    }
}
