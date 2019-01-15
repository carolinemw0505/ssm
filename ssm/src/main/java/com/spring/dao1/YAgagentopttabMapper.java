package com.spring.dao1;

import com.spring.model1.YAgagentopttab;
import com.spring.model1.YAgagentopttabExample;
import com.spring.model1.YAgagentopttabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YAgagentopttabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YAgagentopttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YAgagentopttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YAgagentopttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YAgagentopttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YAgagentopttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YAgagentopttab> selectByExample(YAgagentopttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YAgagentopttab selectByPrimaryKey(YAgagentopttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YAgagentopttab record, @Param("example") YAgagentopttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YAgagentopttab record, @Param("example") YAgagentopttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YAgagentopttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_AGAGENTOPTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YAgagentopttab record);
}