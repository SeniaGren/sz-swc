package com.xm.swc.dao;


import com.xm.swc.pojo.po.Pricingpage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PricingPageCustmerMapper {
     //增  pricingId, pricingName, pricingContent, pricingPrice, pricingSelect
    int insertPricingPage(@Param("pricingId") String pricingId, @Param("pricingName") String pricingName,
                          @Param("pricingContent") String pricingContent, @Param("pricingPrice") String pricingPrice, @Param("pricingSelect") String pricingSelect);
    // 删
    int delectPricingPage(@Param("pricingId") String pricingId);
    // 改
    int updatePricingPage(@Param("pricingId") String pricingId, @Param("pricingName") String pricingName,
                          @Param("pricingContent") String pricingContent, @Param("pricingPrice") String pricingPrice, @Param("pricingSelect") String pricingSelect);
    // 查所有
    List<Pricingpage> selectPricingPage();
}
