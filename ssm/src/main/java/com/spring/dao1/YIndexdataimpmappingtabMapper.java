package com.spring.dao1;

import com.spring.model1.YIndexdataimpmappingtab;
import com.spring.model1.YIndexdataimpmappingtabExample;
import com.spring.model1.YIndexdataimpmappingtabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YIndexdataimpmappingtabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    long countByExample(YIndexdataimpmappingtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByExample(YIndexdataimpmappingtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int deleteByPrimaryKey(YIndexdataimpmappingtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insert(YIndexdataimpmappingtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int insertSelective(YIndexdataimpmappingtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    List<YIndexdataimpmappingtab> selectByExample(YIndexdataimpmappingtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    YIndexdataimpmappingtab selectByPrimaryKey(YIndexdataimpmappingtabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") YIndexdataimpmappingtab record, @Param("example") YIndexdataimpmappingtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByExample(@Param("record") YIndexdataimpmappingtab record, @Param("example") YIndexdataimpmappingtabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKeySelective(YIndexdataimpmappingtab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_INDEXDATAIMPMAPPINGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    int updateByPrimaryKey(YIndexdataimpmappingtab record);
}