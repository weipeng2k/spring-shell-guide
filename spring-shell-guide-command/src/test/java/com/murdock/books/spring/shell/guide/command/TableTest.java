package com.murdock.books.spring.shell.guide.command;

import org.junit.Test;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.Table;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;
import org.springframework.shell.table.TableModelBuilder;

/**
 * @author weipeng2k 2019年07月29日 下午20:08:59
 */
public class TableTest {

    @Test
    public void create() {
        TableModelBuilder<String> tableModelBuilder = new TableModelBuilder<>();
        tableModelBuilder.addRow().addValue("A").addValue("dadfaf").addValue("123123");
        tableModelBuilder.addRow().addValue("A").addValue("dadfaf").addValue("123123");
        tableModelBuilder.addRow().addValue("A").addValue("dadfaf").addValue("123123");
        TableModel tableModel = tableModelBuilder.build();

        TableBuilder tableBuilder = new TableBuilder(tableModel);
        tableBuilder.addFullBorder(BorderStyle.oldschool).addHeaderBorder(BorderStyle.oldschool);

        Table build = tableBuilder.build();
        String render = build.render(200);

        System.out.println(render);
    }
}
