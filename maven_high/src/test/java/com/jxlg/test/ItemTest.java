package com.jxlg.test;

import dao.ItemsDao;
import com.sun.tools.javac.jvm.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemTest {

    public void FindById()
    {

        //获取spring容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿取所需要的代理对象
        ItemsDao itemsDao=ac.getBean(ItemsDao.class);
        //调用方法
        Items items=itemsDao.FindById(1);
        System.out.println(items);
    }

}
