package com.spring.dao1;

import com.spring.model1.YMseatpointtab;
import com.spring.model1.YMseatpointtabExample;
import com.spring.model1.YMseatpointtabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMseatpointtabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YMseatpointtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YMseatpointtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YMseatpointtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YMseatpointtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YMseatpointtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YMseatpointtab> selectByExample(YMseatpointtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YMseatpointtab selectByPrimaryKey(YMseatpointtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YMseatpointtab record, @Param("example") YMseatpointtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YMseatpointtab record, @Param("example") YMseatpointtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YMseatpointtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEATPOINTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YMseatpointtab record);
}