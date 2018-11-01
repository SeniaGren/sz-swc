package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Pricingpage;

import java.util.List;

public interface PricingPage {
    //增  pricingId, pricingName, pricingContent, pricingPrice, pricingSelect
    int insertPricingPage( String pricingId, String pricingName,
                          String pricingContent,  String pricingPrice,String pricingSelect);
    // 删
    int delectPricingPage( String pricingId);
    // 改
    int updatePricingPage(String pricingId, String pricingName,
                          String pricingContent,  String pricingPrice,  String pricingSelect);
    // 查所有
    List<Pricingpage> selectPricingPage();
}
