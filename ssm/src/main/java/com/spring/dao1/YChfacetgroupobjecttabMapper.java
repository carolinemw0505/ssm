package com.spring.dao1;

import com.spring.model1.YChfacetgroupobjecttab;
import com.spring.model1.YChfacetgroupobjecttabExample;
import com.spring.model1.YChfacetgroupobjecttabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YChfacetgroupobjecttabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    long countByExample(YChfacetgroupobjecttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByExample(YChfacetgroupobjecttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int deleteByPrimaryKey(YChfacetgroupobjecttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insert(YChfacetgroupobjecttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int insertSelective(YChfacetgroupobjecttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    List<YChfacetgroupobjecttab> selectByExample(YChfacetgroupobjecttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    YChfacetgroupobjecttab selectByPrimaryKey(YChfacetgroupobjecttabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") YChfacetgroupobjecttab record, @Param("example") YChfacetgroupobjecttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByExample(@Param("record") YChfacetgroupobjecttab record, @Param("example") YChfacetgroupobjecttabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKeySelective(YChfacetgroupobjecttab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CHFACETGROUPOBJECTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    int updateByPrimaryKey(YChfacetgroupobjecttab record);
}