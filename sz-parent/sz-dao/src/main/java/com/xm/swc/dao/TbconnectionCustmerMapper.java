package com.xm.swc.dao;


import com.xm.swc.pojo.po.Pricingpage;
import com.xm.swc.pojo.po.Tbconnection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbconnectionCustmerMapper {
     //增  qqNumber, wechatNumber, weiBoNumber, mailNumber, telephone,
    int insertTbconnection(@Param("connectId") String connectId, @Param("qqNumber") String qqNumber,
                          @Param("wechatNumber") String wechatNumber, @Param("weiBoNumber") String weiBoNumber, @Param("mailNumber") String mailNumber , @Param("telephone") String telephone);
    // 删
    int delectTbconnection(@Param("connectId") String connectId);
    // 改
    int updateTbconnection(@Param("connectId") String connectId, @Param("qqNumber") String qqNumber,
                           @Param("wechatNumber") String wechatNumber, @Param("weiBoNumber") String weiBoNumber, @Param("mailNumber") String mailNumber , @Param("telephone") String telephone);
    // 查所有
    List<com.xm.swc.pojo.po.Tbconnection> selectTbconnection();
}
