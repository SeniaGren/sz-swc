package com.xm.swc.service.impl;

import com.xm.swc.dao.IndexPageCustmerMapper;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.service.interf.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexPageImpl implements IndexPage {
    @Autowired
    private IndexPageCustmerMapper indexpageCustmerMapper;
    @Override
    public int insertIndexPage(Integer indexId, String indexName, String IndexContent) {
        return indexpageCustmerMapper.insertIndexPage(indexId,indexName,IndexContent);
    }

    @Override
    public int delectIndexPage(Integer indexId) {
        return indexpageCustmerMapper.delectIndexPage(indexId);
    }

    @Override
    public int updateIndexPage(Integer indexId, String indexName, String IndexContent) {
        return indexpageCustmerMapper.updateIndexPage(indexId,indexName,IndexContent);
    }

    @Override
    public List<Indexpage> selectIndexPage() {
        return indexpageCustmerMapper.selectIndexPage();
    }
}
