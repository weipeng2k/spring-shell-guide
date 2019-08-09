package com.murdock.books.spring.shell.guide.command.system;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

/**
 * @author weipeng2k 2019年07月29日 下午19:59:53
 */
@Component
public class CustomPromptProvider implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("spring-shell-guide:>", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }
}
