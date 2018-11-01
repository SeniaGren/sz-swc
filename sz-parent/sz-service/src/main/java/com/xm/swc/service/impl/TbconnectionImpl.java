package com.xm.swc.service.impl;

import com.xm.swc.dao.TbconnectionCustmerMapper;
import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.service.interf.Tbconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbconnectionImpl implements Tbconnection {
    @Autowired
    private TbconnectionCustmerMapper tbconnectionCustmerMapper;
    @Override
    public int insertTbconnection(String connectId, String qqNumber, String wechatNumber, String weiBoNumber, String mailNumber, String telephone) {
        return tbconnectionCustmerMapper.insertTbconnection(connectId,qqNumber,wechatNumber,weiBoNumber,mailNumber,telephone);
    }

    @Override
    public int delectTbconnection(String connectId) {
        return tbconnectionCustmerMapper.delectTbconnection(connectId);
    }

    @Override
    public int updateTbconnection(String connectId, String qqNumber, String wechatNumber, String weiBoNumber, String mailNumber, String telephone) {
        return tbconnectionCustmerMapper.updateTbconnection(connectId,qqNumber,wechatNumber,weiBoNumber,mailNumber,telephone);
    }

    @Override
    public List<com.xm.swc.pojo.po.Tbconnection> selectTbconnection() {
        return tbconnectionCustmerMapper.selectTbconnection();
    }
}
