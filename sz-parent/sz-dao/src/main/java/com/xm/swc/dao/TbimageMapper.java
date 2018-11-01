package com.xm.swc.dao;

import com.xm.swc.pojo.po.Tbimage;
import com.xm.swc.pojo.po.TbimageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbimageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int countByExample(TbimageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int deleteByExample(TbimageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insert(Tbimage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insertSelective(Tbimage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    List<Tbimage> selectByExample(TbimageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") Tbimage record, @Param("example") TbimageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbimage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExample(@Param("record") Tbimage record, @Param("example") TbimageExample example);
}