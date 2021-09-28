package com.ou.swzlmybatis.mapper;

import com.ou.swzlmybatis.entity.dto.GoodsDTO;
import com.ou.swzlmybatis.entity.po.Goods;
import com.ou.swzlmybatis.entity.request.GoodsRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author leo
 */
@Mapper
@Repository
public interface GoodsMapper  {


    /**
     * 插入Goods
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);


    /**
     * 查询所有或根据goods Name模糊查询
     * @param goodsName
     * @return
     */
    List<Goods> queryGoods(String goodsName);


    Goods queryById(Integer goodsId);
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
}
