package com.jxlg.controlller;

import com.jxlg.daomain.Items;
import com.jxlg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class itemscontroller {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findDetail")
    public  String findDetail(Model model)
    {
        Items items=itemsService.FindById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
