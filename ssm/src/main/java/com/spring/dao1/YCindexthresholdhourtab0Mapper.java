package com.spring.dao1;

import com.spring.model1.YCindexthresholdhourtab0;
import com.spring.model1.YCindexthresholdhourtab0Example;
import com.spring.model1.YCindexthresholdhourtab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCindexthresholdhourtab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YCindexthresholdhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YCindexthresholdhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YCindexthresholdhourtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YCindexthresholdhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YCindexthresholdhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YCindexthresholdhourtab0> selectByExample(YCindexthresholdhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YCindexthresholdhourtab0 selectByPrimaryKey(YCindexthresholdhourtab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YCindexthresholdhourtab0 record, @Param("example") YCindexthresholdhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YCindexthresholdhourtab0 record, @Param("example") YCindexthresholdhourtab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YCindexthresholdhourtab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDHOURTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YCindexthresholdhourtab0 record);
}