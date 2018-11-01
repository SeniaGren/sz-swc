package com.xm.swc.dao;


import com.xm.swc.pojo.po.Portfoliopage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PortfolioPageCustmerMapper {
     //增
    int insertPortfolioPage(@Param("portfolioId") String profolioId, @Param("portfolioName") String portfolioName, @Param("portfolioimgs") String portfolioimgs,@Param("portfolioOccupation") String portfolioOccupation);
    // 删
    int delectPortfolioPage(@Param("portfolioId") String profolioId);
    // 改
    int updatePortfolioPage(@Param("portfolioId") String profolioId, @Param("portfolioName") String portfolioName, @Param("portfolioimgs") String portfolioimgs,@Param("portfolioOccupation") String portfolioOccupation);
    // 查所有
    List<Portfoliopage> selectPortfolioPage();
}
