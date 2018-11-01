package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Portfoliopage;

import java.util.List;

public interface PortfolioPage {
    //增
    int insertPortfolioPage( String profolioId, String portfolioName, String portfolioimgs, String portfolioOccupation);
    // 删
    int delectPortfolioPage(String profolioId);
    // 改
    int updatePortfolioPage(String profolioId, String portfolioName,String portfolioimgs, String portfolioOccupation);
    // 查所有
    List<Portfoliopage> selectPortfolioPage();
}
