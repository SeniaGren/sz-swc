package com.xm.swc.dao;

import com.xm.swc.pojo.po.Aboutpage;
import com.xm.swc.pojo.po.AboutpageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AboutpageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int countByExample(AboutpageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int deleteByExample(AboutpageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insert(Aboutpage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int insertSelective(Aboutpage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    List<Aboutpage> selectByExample(AboutpageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") Aboutpage record, @Param("example") AboutpageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aboutpage
     *
     * @mbggenerated Mon Oct 08 12:35:29 CST 2018
     */
    int updateByExample(@Param("record") Aboutpage record, @Param("example") AboutpageExample example);
}