package com.spring.dao1;

import com.spring.model1.YSmanagerfacetab;
import com.spring.model1.YSmanagerfacetabExample;
import com.spring.model1.YSmanagerfacetabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YSmanagerfacetabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YSmanagerfacetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YSmanagerfacetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YSmanagerfacetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YSmanagerfacetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YSmanagerfacetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YSmanagerfacetab> selectByExample(YSmanagerfacetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YSmanagerfacetab selectByPrimaryKey(YSmanagerfacetabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YSmanagerfacetab record, @Param("example") YSmanagerfacetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YSmanagerfacetab record, @Param("example") YSmanagerfacetabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YSmanagerfacetab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERFACETAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YSmanagerfacetab record);
}