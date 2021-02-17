package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
   void insert (Items items);
}
