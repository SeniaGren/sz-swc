package com.xm.swc.service.impl;

import com.xm.swc.dao.AboutPageCustmerMapper;
import com.xm.swc.pojo.po.Aboutpage;
import com.xm.swc.service.interf.AboutPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutPageImpl implements AboutPage {
    @Autowired
    private AboutPageCustmerMapper aboutPageCustmerMapper;
    @Override
    public int insertAboutPage(String aboutId, String aboutName, String aboutContent) {
        return aboutPageCustmerMapper.insertAboutPage(aboutId,aboutName,aboutContent);
    }

    @Override
    public int delectAboutPage(String aboutId) {
        return aboutPageCustmerMapper.delectAboutPage(aboutId);
    }

    @Override
    public int updateAboutPage(String aboutId, String aboutName, String aboutContent) {
        return aboutPageCustmerMapper.updateAboutPage(aboutId,aboutName,aboutContent);
    }

    @Override
    public List<Aboutpage> selectAboutPage() {
        return aboutPageCustmerMapper.selectAboutPage();
    }
}
