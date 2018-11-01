package com.xm.swc.dao;

import com.xm.swc.pojo.po.Aboutpage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AboutPageCustmerMapper {
     //增
    int insertAboutPage(@Param("aboutId")String aboutId, @Param("aboutName") String aboutName, @Param("aboutContent") String aboutContent);
    // 删
    int delectAboutPage(@Param("aboutId")String aboutId);
    // 改
    int updateAboutPage(@Param("aboutId")String aboutId, @Param("aboutName") String aboutName, @Param("aboutContent") String aboutContent);
    // 查所有
    List<Aboutpage> selectAboutPage();
}
