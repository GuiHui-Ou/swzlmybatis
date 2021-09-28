package com.ou.swzlmybatis.controller;


import com.ou.swzlmybatis.common.BaseController;
import com.ou.swzlmybatis.common.Result;
import com.ou.swzlmybatis.entity.po.Goods;
import com.ou.swzlmybatis.entity.request.GoodsRequest;
import com.ou.swzlmybatis.service.IGoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * @author leo
 */
@RestController
@RequestMapping("/goods")
@Api(tags = "失物信息")
public class GoodsController extends BaseController {

    @Autowired
    IGoodsService goodsService;

    @RequestMapping(value = "/insert" ,method = RequestMethod.POST)
    public Result insertGoods(@RequestBody Goods goods){
        goodsService.insertGoods(goods);
        return Result.OK();
    }

    @GetMapping("/query")
    public Result<List<Goods>> query(@RequestBody GoodsRequest goodsRequest){
        List<Goods> goods= goodsService.queryGoods(goodsRequest.getGoodsName());
        return Result.OK(goods);
    }

    @PostMapping("/delete")
    public Result deleteGoods(@RequestBody GoodsRequest goodsRequest){
       Boolean res = goodsService.deleteGoods(goodsRequest.getGoodsId());
        return res ? Result.OK() : Result.error("删除失败");
    }

    @PostMapping("/update")
    public Result updateGoods(@RequestBody Goods goods){
        Boolean res = goodsService.updateGoods(goods);
        return res ? Result.OK() : Result.error("更新失败");
    }
}
