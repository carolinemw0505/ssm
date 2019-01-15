package com.spring.dao1;

import com.spring.model1.YAgagentgrouptab;
import com.spring.model1.YAgagentgrouptabExample;
import com.spring.model1.YAgagentgrouptabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAgagentgrouptabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YAgagentgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YAgagentgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YAgagentgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YAgagentgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YAgagentgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YAgagentgrouptab> selectByExample(YAgagentgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YAgagentgrouptab selectByPrimaryKey(YAgagentgrouptabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YAgagentgrouptab record, @Param("example") YAgagentgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YAgagentgrouptab record, @Param("example") YAgagentgrouptabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YAgagentgrouptab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YAgagentgrouptab record);
}