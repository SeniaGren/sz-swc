package com.xm.swc.dao;

import com.xm.swc.pojo.po.Indexpage;
import com.xm.swc.pojo.po.Tbimage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbimageCustmerMapper {
//    Tbimage页面的增加  imgId, imgUrl, imgUid
    int insertTbimage(@Param("imgId") String imgId, @Param("imgUrl") String imgUrl, @Param("imgUid") String imgUid);
//    Tbimage页面的删除
    int delectTbimage(@Param("imgId") String imgId);
//    Tbimage页面的修改
    int updateTbimage(@Param("imgId") String imgId, @Param("imgUrl") String imgUrl, @Param("imgUid") String imgUid);
//    Tbimage页面的查找
    List<Tbimage> selectTbimage();
}
