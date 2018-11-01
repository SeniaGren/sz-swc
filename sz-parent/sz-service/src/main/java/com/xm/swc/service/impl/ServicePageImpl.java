package com.xm.swc.service.impl;

import com.xm.swc.dao.ServicePageCustmerMapper;
import com.xm.swc.pojo.po.Servicepage;
import com.xm.swc.service.interf.ServicePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicePageImpl implements ServicePage {
    @Autowired
    private ServicePageCustmerMapper servicePageCustmerMapper;
    @Override
    public int insertServicePage(String serviceId, String serviceName, String serviceContent, String serviceIcon) {
        return servicePageCustmerMapper.insertServicePage(serviceId,serviceName,serviceContent,serviceIcon);
    }

    @Override
    public int delectServicePage(String serviceId) {
        return servicePageCustmerMapper.delectServicePage(serviceId);
    }

    @Override
    public int updateServicePage(String serviceId, String serviceName, String serviceContent, String serviceIcon) {
        return servicePageCustmerMapper.updateServicePage(serviceId,serviceName,serviceContent,serviceIcon);
    }

    @Override
    public List<Servicepage> selectServicePage() {
        return servicePageCustmerMapper.selectServicePage();
    }
}
