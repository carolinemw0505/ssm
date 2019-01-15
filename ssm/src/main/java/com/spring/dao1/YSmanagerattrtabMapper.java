package com.spring.dao1;

import com.spring.model1.YSmanagerattrtab;
import com.spring.model1.YSmanagerattrtabExample;
import com.spring.model1.YSmanagerattrtabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YSmanagerattrtabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YSmanagerattrtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YSmanagerattrtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YSmanagerattrtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YSmanagerattrtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YSmanagerattrtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YSmanagerattrtab> selectByExample(YSmanagerattrtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YSmanagerattrtab selectByPrimaryKey(YSmanagerattrtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YSmanagerattrtab record, @Param("example") YSmanagerattrtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YSmanagerattrtab record, @Param("example") YSmanagerattrtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YSmanagerattrtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YSmanagerattrtab record);
}