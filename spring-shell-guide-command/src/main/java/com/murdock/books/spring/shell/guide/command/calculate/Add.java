package com.murdock.books.spring.shell.guide.command.calculate;

import com.murdock.books.spring.shell.guide.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author weipeng2k 2019年08月09日 下午12:54:44
 */
@ShellComponent
public class Add {

    @Autowired
    private CalculateService calculateService;

    @ShellMethod("add x y")
    public String add(double x, double y) {
        double add = calculateService.add(x, y);
        return String.valueOf(add);
    }
}
