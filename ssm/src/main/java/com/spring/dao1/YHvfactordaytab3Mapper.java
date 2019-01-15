package com.spring.dao1;

import com.spring.model1.YHvfactordaytab3;
import com.spring.model1.YHvfactordaytab3Example;
import com.spring.model1.YHvfactordaytab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactordaytab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    long countByExample(YHvfactordaytab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByExample(YHvfactordaytab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByPrimaryKey(YHvfactordaytab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insert(YHvfactordaytab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insertSelective(YHvfactordaytab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    List<YHvfactordaytab3> selectByExample(YHvfactordaytab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    YHvfactordaytab3 selectByPrimaryKey(YHvfactordaytab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactordaytab3 record, @Param("example") YHvfactordaytab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExample(@Param("record") YHvfactordaytab3 record, @Param("example") YHvfactordaytab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactordaytab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORDAYTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKey(YHvfactordaytab3 record);
}