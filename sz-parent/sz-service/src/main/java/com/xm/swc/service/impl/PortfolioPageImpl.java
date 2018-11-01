package com.xm.swc.service.impl;

import com.xm.swc.dao.PortfolioPageCustmerMapper;
import com.xm.swc.pojo.po.Portfoliopage;
import com.xm.swc.service.interf.PortfolioPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.KeyStore;
import java.util.List;
@Service
public class PortfolioPageImpl implements PortfolioPage  {
    @Autowired
    private PortfolioPageCustmerMapper portfolioPageCustmerMapper;
    @Override
    public int insertPortfolioPage(String profolioId, String portfolioName, String portfolioimgs, String portfolioOccupation) {
        return portfolioPageCustmerMapper.insertPortfolioPage(profolioId,portfolioName,portfolioimgs,portfolioOccupation);
    }

    @Override
    public int delectPortfolioPage(String profolioId) {
        return portfolioPageCustmerMapper.delectPortfolioPage(profolioId);
    }

    @Override
    public int updatePortfolioPage(String profolioId, String portfolioName, String portfolioimgs, String portfolioOccupation) {
        return portfolioPageCustmerMapper.updatePortfolioPage(profolioId,portfolioName,portfolioimgs,portfolioOccupation);
    }

    @Override
    public List<Portfoliopage> selectPortfolioPage() {
        return portfolioPageCustmerMapper.selectPortfolioPage();
    }
}
