package com.xm.swc.dao;

import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.IndexpageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexpageMapper {
    int countByExample(IndexpageExample example);

    int deleteByExample(IndexpageExample example);

    int deleteByPrimaryKey(Integer indexid);

    int insert(Indexpage record);

    int insertSelective(Indexpage record);

    List<Indexpage> selectByExample(IndexpageExample example);

    Indexpage selectByPrimaryKey(Integer indexid);

    int updateByExampleSelective(@Param("record") Indexpage record, @Param("example") IndexpageExample example);

    int updateByExample(@Param("record") Indexpage record, @Param("example") IndexpageExample example);

    int updateByPrimaryKeySelective(Indexpage record);

    int updateByPrimaryKey(Indexpage record);
}