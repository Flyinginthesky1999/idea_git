package com.jxlg.test;

import com.jxlg.daomain.Items;
import com.jxlg.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void FindById()
    {

        //获取spring容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/jxlg/dao/ApplicationContext.xml");
        //dao测试
        //从容器中拿取所需要的代理对象
        //ItemsDao itemsDao=ac.getBean(ItemsDao.class);
        //调用方法
     //Items items=itemsDao.FindById(1);
        //System.out.println(items.getName());

        //service测试
        ItemsService itemsService=ac.getBean(ItemsService.class);
        Items items=itemsService.FindById(1);
        System.out.println(items.getName());

    }
}
