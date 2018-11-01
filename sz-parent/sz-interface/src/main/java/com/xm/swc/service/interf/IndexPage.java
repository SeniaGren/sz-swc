package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Indexpage;

import java.util.List;

public interface IndexPage {
    //    index页面的增加
    int insertIndexPage(Integer indexId, String indexName, String IndexContent);
    //    index页面的删除
    int delectIndexPage(Integer indexId);
    //    index页面的修改
    int updateIndexPage(Integer indexId,  String indexName,  String IndexContent);
    //    index页面的查找
    List<Indexpage> selectIndexPage();
}
