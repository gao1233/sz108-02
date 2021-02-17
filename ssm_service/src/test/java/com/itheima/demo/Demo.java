package com.itheima.demo;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {
    @Test
    public void demo01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = context.getBean(ItemsService.class);
        List<Items> list = itemsService.findAll();
        System.out.println(list);
    }
}
