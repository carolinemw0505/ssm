package com.spring.dao1;

import com.spring.model1.YMindexinfotab;
import com.spring.model1.YMindexinfotabExample;
import com.spring.model1.YMindexinfotabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMindexinfotabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YMindexinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YMindexinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YMindexinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YMindexinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YMindexinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YMindexinfotab> selectByExample(YMindexinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YMindexinfotab selectByPrimaryKey(YMindexinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YMindexinfotab record, @Param("example") YMindexinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YMindexinfotab record, @Param("example") YMindexinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YMindexinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MINDEXINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YMindexinfotab record);
}