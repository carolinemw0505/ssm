package com.spring.dao1;

import com.spring.model1.YHvindexseasontab2;
import com.spring.model1.YHvindexseasontab2Example;
import com.spring.model1.YHvindexseasontab2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvindexseasontab2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvindexseasontab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvindexseasontab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvindexseasontab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvindexseasontab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvindexseasontab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvindexseasontab2> selectByExample(YHvindexseasontab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvindexseasontab2 selectByPrimaryKey(YHvindexseasontab2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvindexseasontab2 record, @Param("example") YHvindexseasontab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvindexseasontab2 record, @Param("example") YHvindexseasontab2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvindexseasontab2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXSEASONTAB2
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvindexseasontab2 record);
}