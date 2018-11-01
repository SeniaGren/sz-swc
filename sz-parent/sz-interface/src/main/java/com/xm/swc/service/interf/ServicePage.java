package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Servicepage;

import java.util.List;

public interface ServicePage {
    //增 serviceId, serviceName, serviceContent, serviceIcon
    int insertServicePage( String serviceId,  String serviceName, String serviceContent,  String serviceIcon);
    // 删
    int delectServicePage( String serviceId);
    // 改
    int updateServicePage( String serviceId,  String serviceName,  String serviceContent, String serviceIcon);
    // 查所有
    List<Servicepage> selectServicePage();
}
