package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Demo {
    @Test
    public void demo01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        List<Items> list = itemsDao.findAll();
        System.out.println(list);
    }
    @Test
    public void demo02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao = context.getBean(ItemsDao.class);//通过反射创建接口的代理对象
        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.insert(items);
    }
}
