package com.spring.dao1;

import com.spring.model1.YAgagenttab;
import com.spring.model1.YAgagenttabExample;
import com.spring.model1.YAgagenttabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAgagenttabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YAgagenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YAgagenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YAgagenttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YAgagenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YAgagenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YAgagenttab> selectByExample(YAgagenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YAgagenttab selectByPrimaryKey(YAgagenttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YAgagenttab record, @Param("example") YAgagenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YAgagenttab record, @Param("example") YAgagenttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YAgagenttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YAgagenttab record);
}