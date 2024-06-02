package com.subprj.controller;

import com.subprj.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/order")
    public String order(){
        orderService.order();
        return "order";
    }

    @GetMapping("/cancel")
    public String cancel(){
        orderService.cancel();
        return "cancel";
    }

    @GetMapping("/stock")
    public int stock(){
        return orderService.getStock().get();
    }
}
