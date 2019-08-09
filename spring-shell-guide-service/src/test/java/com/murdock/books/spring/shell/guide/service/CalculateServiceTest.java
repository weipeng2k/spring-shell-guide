package com.murdock.books.spring.shell.guide.service;

import com.murdock.books.spring.shell.guide.service.impl.CalculateServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author weipeng2k 2019年08月09日 下午12:52:41
 */
@ContextConfiguration(classes = CalculateServiceTest.Config.class)
@RunWith(SpringRunner.class)
public class CalculateServiceTest {

    @Autowired
    private CalculateService calculateService;

    @Test
    public void add() {
        double add = calculateService.add(1, 2);
        assertTrue(add >= 3);
    }

    @Configuration
    static class Config {
        @Bean
        CalculateService calculateService() {
            return new CalculateServiceImpl();
        }
    }
}