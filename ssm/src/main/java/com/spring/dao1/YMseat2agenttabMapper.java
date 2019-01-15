package com.spring.dao1;

import com.spring.model1.YMseat2agenttab;
import com.spring.model1.YMseat2agenttabExample;
import com.spring.model1.YMseat2agenttabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMseat2agenttabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YMseat2agenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YMseat2agenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YMseat2agenttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YMseat2agenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YMseat2agenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YMseat2agenttab> selectByExample(YMseat2agenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YMseat2agenttab selectByPrimaryKey(YMseat2agenttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YMseat2agenttab record, @Param("example") YMseat2agenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YMseat2agenttab record, @Param("example") YMseat2agenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YMseat2agenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YMseat2agenttab record);
}