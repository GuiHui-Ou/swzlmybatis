package com.ou.swzlmybatis.service;


import com.ou.swzlmybatis.entity.dto.GoodsDTO;
import com.ou.swzlmybatis.entity.po.Goods;

import java.util.List;

/**
 * @author leo
 */
public interface IGoodsService {

    /**
     * 插入Goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * 查询所有或根据goods Name模糊查询
     * @param goodsName
     * @return
     */
    List<Goods> queryGoods(String goodsName);


    /**
     * 删除Goods
     * @param goodsId
     * @return
     */
    boolean deleteGoods(Integer goodsId);

    /**
     * 更新goods
     * @param goods
     * @return
     */
    boolean updateGoods(Goods goods);


    /**
     * 根据id查找
     * @param goodsId
     * @return
     */
    Goods queryById(Integer goodsId);
}
