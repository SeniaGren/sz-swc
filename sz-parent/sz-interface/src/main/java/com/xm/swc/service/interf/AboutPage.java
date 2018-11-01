package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Aboutpage;

import java.util.List;

public interface AboutPage {
    //增
    int insertAboutPage(String aboutId,  String aboutName,  String aboutContent);
    // 删
    int delectAboutPage(String aboutId);
    // 改
    int updateAboutPage(String aboutId, String aboutName, String aboutContent);
    // 查所有
    List<Aboutpage> selectAboutPage();
}
