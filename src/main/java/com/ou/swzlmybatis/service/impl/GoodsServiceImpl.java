package com.ou.swzlmybatis.service.impl;

import com.ou.swzlmybatis.entity.po.Goods;
import com.ou.swzlmybatis.mapper.GoodsMapper;
import com.ou.swzlmybatis.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author leo
 */
@Service
public class GoodsServiceImpl implements IGoodsService {


    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public boolean insertGoods(Goods goods) {
        goodsMapper.insertGoods(goods);
        return true;
    }

    @Override
    public List<Goods> queryGoods(String goodsName) {
        if (goodsName != null ){
            return goodsMapper.queryGoods(goodsName);
        }
        return goodsMapper.queryGoods(null);
    }

    @Override
    public boolean deleteGoods(Integer goodsId) {
        if (goodsId != null){
            return goodsMapper.deleteGoods(goodsId);
        }
        return false;
    }

    @Override
    public boolean updateGoods(Goods goods) {
        Goods goodsList = goodsMapper.queryById(goods.getGoodsId());
        if (goods.getGoodsId() != null && goodsList != null){
            return goodsMapper.updateGoods(goods);
        }
        return false;
    }

    @Override
    public Goods queryById(Integer goodsId) {
        if(goodsId != null){
            return goodsMapper.queryById(goodsId);
        }
        return null;
    }
}
