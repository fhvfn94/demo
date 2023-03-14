package com.calculator.demo.Controller;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private int count;
    @Override
    public int getRequestCount() {
        return ++count;
    }
}
