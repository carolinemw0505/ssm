package com.spring.dao1;

import com.spring.model1.YHvindexyeartab3;
import com.spring.model1.YHvindexyeartab3Example;
import com.spring.model1.YHvindexyeartab3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YHvindexyeartab3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    long countByExample(YHvindexyeartab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByExample(YHvindexyeartab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int deleteByPrimaryKey(YHvindexyeartab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insert(YHvindexyeartab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int insertSelective(YHvindexyeartab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    List<YHvindexyeartab3> selectByExample(YHvindexyeartab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    YHvindexyeartab3 selectByPrimaryKey(YHvindexyeartab3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") YHvindexyeartab3 record, @Param("example") YHvindexyeartab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByExample(@Param("record") YHvindexyeartab3 record, @Param("example") YHvindexyeartab3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKeySelective(YHvindexyeartab3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXYEARTAB3
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    int updateByPrimaryKey(YHvindexyeartab3 record);
}