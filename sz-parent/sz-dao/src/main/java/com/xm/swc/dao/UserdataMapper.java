package com.xm.swc.dao;

import com.xm.swc.pojo.po.Userdata;
import com.xm.swc.pojo.po.UserdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int countByExample(UserdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int deleteByExample(UserdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insert(Userdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insertSelective(Userdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    List<Userdata> selectByExample(UserdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") Userdata record, @Param("example") UserdataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdata
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExample(@Param("record") Userdata record, @Param("example") UserdataExample example);
}