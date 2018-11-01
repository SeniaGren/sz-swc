package com.xm.swc.dao;


import com.xm.swc.pojo.po.Servicepage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicePageCustmerMapper {
     //增 serviceId, serviceName, serviceContent, serviceIcon
    int insertServicePage(@Param("serviceId") String serviceId, @Param("serviceName") String serviceName, @Param("serviceContent") String serviceContent, @Param("serviceIcon") String serviceIcon);
    // 删
    int delectServicePage(@Param("serviceId") String serviceId);
    // 改
    int updateServicePage(@Param("serviceId") String serviceId, @Param("serviceName") String serviceName, @Param("serviceContent") String serviceContent, @Param("serviceIcon") String serviceIcon);
    // 查所有
    List<Servicepage> selectServicePage();
}
