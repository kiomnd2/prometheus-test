package com.subprj.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Service
public class OrderService {
    private AtomicInteger stock = new AtomicInteger(100); //재고량 : 100개 ( 멀티스레드 환경 MUTEX구현 )
    public void order() {
        log.info("주문...");
        stock.decrementAndGet(); //재고감소
    }

    public void cancel() {
        log.info("주문취소...");
        stock.incrementAndGet(); //재고증가
    }

    public AtomicInteger getStock() {
        return stock;
    }
}
