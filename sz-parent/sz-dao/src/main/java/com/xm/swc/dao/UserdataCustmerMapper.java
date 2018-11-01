package com.xm.swc.dao;

import com.xm.swc.pojo.po.Userdata;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserdataCustmerMapper  {
    List<Userdata> selectUser(@Param("uname") String uname,@Param("upassword") String upassword);

    int updateUser(@Param("uid")String uid,@Param("uname") String uname,@Param("upassword") String upassword);

    int delectUser(@Param("uid")String uid);

    int insertUser(@Param("uid")String uid,@Param("uname") String uname,@Param("upassword") String upassword);

    List<Userdata> selectAll();

}
