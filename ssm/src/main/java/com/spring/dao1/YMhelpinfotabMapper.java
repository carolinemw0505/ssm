package com.spring.dao1;

import com.spring.model1.YMhelpinfotab;
import com.spring.model1.YMhelpinfotabExample;
import com.spring.model1.YMhelpinfotabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YMhelpinfotabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YMhelpinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YMhelpinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YMhelpinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YMhelpinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YMhelpinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YMhelpinfotab> selectByExample(YMhelpinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YMhelpinfotab selectByPrimaryKey(YMhelpinfotabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YMhelpinfotab record, @Param("example") YMhelpinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YMhelpinfotab record, @Param("example") YMhelpinfotabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YMhelpinfotab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MHELPINFOTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YMhelpinfotab record);
}