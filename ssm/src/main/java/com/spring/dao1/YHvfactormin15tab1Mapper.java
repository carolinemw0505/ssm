package com.spring.dao1;

import com.spring.model1.YHvfactormin15tab1;
import com.spring.model1.YHvfactormin15tab1Example;
import com.spring.model1.YHvfactormin15tab1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactormin15tab1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvfactormin15tab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvfactormin15tab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvfactormin15tab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvfactormin15tab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvfactormin15tab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvfactormin15tab1> selectByExample(YHvfactormin15tab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvfactormin15tab1 selectByPrimaryKey(YHvfactormin15tab1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactormin15tab1 record, @Param("example") YHvfactormin15tab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvfactormin15tab1 record, @Param("example") YHvfactormin15tab1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactormin15tab1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORMIN15TAB1
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvfactormin15tab1 record);
}