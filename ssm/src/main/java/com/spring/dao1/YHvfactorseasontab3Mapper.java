package com.spring.dao1;

import com.spring.model1.YHvfactorseasontab3;
import com.spring.model1.YHvfactorseasontab3Example;
import com.spring.model1.YHvfactorseasontab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvfactorseasontab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvfactorseasontab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvfactorseasontab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvfactorseasontab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvfactorseasontab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvfactorseasontab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvfactorseasontab3> selectByExample(YHvfactorseasontab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvfactorseasontab3 selectByPrimaryKey(YHvfactorseasontab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvfactorseasontab3 record, @Param("example") YHvfactorseasontab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvfactorseasontab3 record, @Param("example") YHvfactorseasontab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvfactorseasontab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVFACTORSEASONTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvfactorseasontab3 record);
}