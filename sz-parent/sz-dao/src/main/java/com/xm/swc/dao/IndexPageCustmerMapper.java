package com.xm.swc.dao;

import com.xm.swc.pojo.po.Indexpage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexPageCustmerMapper {
//    index页面的增加
    int insertIndexPage(@Param("indexId")Integer indexId, @Param("indexName") String indexName, @Param("indexContent") String indexContent);
//    index页面的删除
    int delectIndexPage(@Param("indexId")Integer indexId);
//    index页面的修改
    int updateIndexPage(@Param("indexId")Integer indexId, @Param("indexName") String indexName, @Param("indexContent") String indexContent);
////    index页面的查找
    List<Indexpage> selectIndexPage();
}
