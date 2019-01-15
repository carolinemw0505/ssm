package com.spring.dao1;

import com.spring.model1.YCindexthresholddaytab0;
import com.spring.model1.YCindexthresholddaytab0Example;
import com.spring.model1.YCindexthresholddaytab0Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YCindexthresholddaytab0Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(YCindexthresholddaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(YCindexthresholddaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(YCindexthresholddaytab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(YCindexthresholddaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(YCindexthresholddaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<YCindexthresholddaytab0> selectByExample(YCindexthresholddaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    YCindexthresholddaytab0 selectByPrimaryKey(YCindexthresholddaytab0Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") YCindexthresholddaytab0 record, @Param("example") YCindexthresholddaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") YCindexthresholddaytab0 record, @Param("example") YCindexthresholddaytab0Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(YCindexthresholddaytab0 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDDAYTAB0
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(YCindexthresholddaytab0 record);
}