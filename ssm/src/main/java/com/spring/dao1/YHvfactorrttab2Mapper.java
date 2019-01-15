package com.spring.dao1;

import com.spring.model1.YHvfactorrttab2;
import com.spring.model1.YHvfactorrttab2Example;
import com.spring.model1.YHvfactorrttab2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorrttab2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    long countByExample(YHvfactorrttab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByExample(YHvfactorrttab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorrttab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insert(YHvfactorrttab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int insertSelective(YHvfactorrttab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    List<YHvfactorrttab2> selectByExample(YHvfactorrttab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    YHvfactorrttab2 selectByPrimaryKey(YHvfactorrttab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorrttab2 record, @Param("example") YHvfactorrttab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorrttab2 record, @Param("example") YHvfactorrttab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorrttab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORRTTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:06 CST 2019
     */
    int updateByPrimaryKey(YHvfactorrttab2 record);
}