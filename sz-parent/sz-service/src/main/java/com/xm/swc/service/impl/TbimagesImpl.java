package com.xm.swc.service.impl;

import com.xm.swc.dao.TbimageCustmerMapper;
import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Tbimage;
import com.xm.swc.service.interf.Tbimages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbimagesImpl implements Tbimages {
    @Autowired
    private TbimageCustmerMapper tbimageCustmerMapper;
    @Override
    public int insertTbimage(String imgId, String imgUrl, String imgUid) {
        return tbimageCustmerMapper.insertTbimage(imgId,imgUrl,imgUid);
    }

    @Override
    public int delectTbimage(String imgId) {
        return tbimageCustmerMapper.delectTbimage(imgId);
    }

    @Override
    public int updateTbimage(String imgId, String imgUrl, String imgUid) {
        return tbimageCustmerMapper.updateTbimage(imgId,imgUrl,imgUid);
    }

    @Override
    public List<Tbimage> selectTbimage() {
        return tbimageCustmerMapper.selectTbimage();
    }
}
