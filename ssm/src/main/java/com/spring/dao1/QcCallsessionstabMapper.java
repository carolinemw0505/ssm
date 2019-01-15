package com.spring.dao1;

import com.spring.model1.QcCallsessionstab;
import com.spring.model1.QcCallsessionstabExample;
import com.spring.model1.QcCallsessionstabKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCallsessionstabMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    long countByExample(QcCallsessionstabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByExample(QcCallsessionstabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int deleteByPrimaryKey(QcCallsessionstabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insert(QcCallsessionstab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int insertSelective(QcCallsessionstab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    List<QcCallsessionstab> selectByExample(QcCallsessionstabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    QcCallsessionstab selectByPrimaryKey(QcCallsessionstabKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") QcCallsessionstab record, @Param("example") QcCallsessionstabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByExample(@Param("record") QcCallsessionstab record, @Param("example") QcCallsessionstabExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKeySelective(QcCallsessionstab record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_CALLSESSIONSTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    int updateByPrimaryKey(QcCallsessionstab record);
}