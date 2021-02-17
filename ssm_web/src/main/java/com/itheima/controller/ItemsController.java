package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Items> list = itemsService.findAll();
        model.addAttribute("list", list);
        return "items";
    }

    @RequestMapping("/insert")
    public String insert(Items items) {
        itemsService.insert(items);
        return "redirect:/findAll";
    }

}
