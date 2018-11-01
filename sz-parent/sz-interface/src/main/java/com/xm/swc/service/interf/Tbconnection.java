package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Pricingpage;

import java.util.List;

public interface Tbconnection {
    //增  qqNumber, wechatNumber, weiBoNumber, mailNumber, telephone,
    int insertTbconnection(String connectId, String qqNumber,
                            String wechatNumber, String weiBoNumber,  String mailNumber ,  String telephone);
    // 删
    int delectTbconnection(String connectId);
    // 改
    int updateTbconnection(String connectId, String qqNumber,
                           String wechatNumber, String weiBoNumber,  String mailNumber ,  String telephone);
    // 查所有
    List<com.xm.swc.pojo.po.Tbconnection> selectTbconnection();
}
