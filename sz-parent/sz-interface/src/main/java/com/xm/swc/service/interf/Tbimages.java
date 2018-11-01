package com.xm.swc.service.interf;

import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Tbimage;

import java.util.List;

public interface Tbimages {
    //    Tbimage页面的增加  imgId, imgUrl, imgUid
    int insertTbimage( String imgId, String imgUrl,  String imgUid);
    //    Tbimage页面的删除
    int delectTbimage( String imgId);
    //    Tbimage页面的修改
    int updateTbimage( String imgId, String imgUrl,  String imgUid);
    //    Tbimage页面的查找
    List<Tbimage> selectTbimage();
}
