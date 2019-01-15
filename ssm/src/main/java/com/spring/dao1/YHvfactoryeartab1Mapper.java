package com.spring.dao1;

import com.spring.model1.YHvfactoryeartab1;
import com.spring.model1.YHvfactoryeartab1Example;
import com.spring.model1.YHvfactoryeartab1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactoryeartab1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    long countByExample(YHvfactoryeartab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByExample(YHvfactoryeartab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByPrimaryKey(YHvfactoryeartab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insert(YHvfactoryeartab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insertSelective(YHvfactoryeartab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    List<YHvfactoryeartab1> selectByExample(YHvfactoryeartab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    YHvfactoryeartab1 selectByPrimaryKey(YHvfactoryeartab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactoryeartab1 record, @Param("example") YHvfactoryeartab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExample(@Param("record") YHvfactoryeartab1 record, @Param("example") YHvfactoryeartab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactoryeartab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORYEARTAB1
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKey(YHvfactoryeartab1 record);
}