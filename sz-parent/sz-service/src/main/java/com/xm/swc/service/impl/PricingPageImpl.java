package com.xm.swc.service.impl;

import com.xm.swc.dao.PricingPageCustmerMapper;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.service.interf.PricingPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PricingPageImpl implements PricingPage {
    @Autowired
    private PricingPageCustmerMapper pricingPageCustmerMapper;
    @Override
    public int insertPricingPage(String pricingId, String pricingName, String pricingContent, String pricingPrice, String pricingSelect) {
        return pricingPageCustmerMapper.insertPricingPage(pricingId,pricingName,pricingContent,pricingPrice,pricingSelect);
    }

    @Override
    public int delectPricingPage(String pricingId) {
        return pricingPageCustmerMapper.delectPricingPage(pricingId);
    }

    @Override
    public int updatePricingPage(String pricingId, String pricingName, String pricingContent, String pricingPrice, String pricingSelect) {
        return pricingPageCustmerMapper.updatePricingPage(pricingId,pricingName,pricingContent,pricingPrice,pricingSelect);
    }

    @Override
    public List<Pricingpage> selectPricingPage() {
        return pricingPageCustmerMapper.selectPricingPage();
    }
}
