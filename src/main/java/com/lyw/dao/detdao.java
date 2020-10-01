package com.lyw.dao;

import com.lyw.po.Json;

import java.util.List;

/**
 * @outhor LiYouWei
 * @create 2020/10/1-11:14
 */
public interface detdao {
    /**
     * 查询全部
     * @return
     */
    List<Json> selectAll();

    /**
     * 增加
     * @param json
     * @return
     */
    int insert (Json json);

}
