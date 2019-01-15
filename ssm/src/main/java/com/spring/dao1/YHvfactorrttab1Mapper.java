package com.spring.dao1;

import com.spring.model1.YHvfactorrttab1;
import com.spring.model1.YHvfactorrttab1Example;
import com.spring.model1.YHvfactorrttab1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorrttab1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YHvfactorrttab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YHvfactorrttab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorrttab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YHvfactorrttab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YHvfactorrttab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YHvfactorrttab1> selectByExample(YHvfactorrttab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YHvfactorrttab1 selectByPrimaryKey(YHvfactorrttab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorrttab1 record, @Param("example") YHvfactorrttab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorrttab1 record, @Param("example") YHvfactorrttab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorrttab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YHvfactorrttab1 record);
}