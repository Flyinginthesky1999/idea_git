package com.jxlg.service.impl;

import com.jxlg.dao.ItemsDao;
import com.jxlg.daomain.Items;
import com.jxlg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

   @Autowired
    private ItemsDao itemsDao;

    public Items FindById(Integer id) {
        return itemsDao.FindById(id);
    }
}
