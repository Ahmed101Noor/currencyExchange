package com.gp.currencyexchange.controller;

import com.gp.currencyexchange.feignClient.Exchange;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("")
public class currencyExchangeCont {

    private final Exchange exchange;

    /* i cant access this end point because it is not free*/
//    @GetMapping("/convert?from={from}&to={to}&amount={amount}")
//    public String getExchangeRate(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("amount") String amount) {
//        return exchange.getExchangeRate(exchange.API_KEY, from, to, amount);
//    }

    @GetMapping("/latest")
    public String getLatestExchangeRate() {
        return exchange.getLatestExchangeRate();
    }
}
