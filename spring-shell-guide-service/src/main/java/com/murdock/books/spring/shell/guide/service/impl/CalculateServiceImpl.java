package com.murdock.books.spring.shell.guide.service.impl;

import com.murdock.books.spring.shell.guide.service.CalculateService;
import org.springframework.stereotype.Service;

/**
 * @author weipeng2k 2019年08月09日 下午12:51:49
 */
@Service("calculateService")
public class CalculateServiceImpl implements CalculateService {
    @Override
    public double add(double x, double y) {
        return x + y;
    }
}
