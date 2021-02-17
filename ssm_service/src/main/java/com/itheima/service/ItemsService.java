package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /***
     * 增加商品
     * @param items
     * @return
     */
    void insert(Items items);
}
