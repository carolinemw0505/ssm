package com.spring.dao3;

import java.util.List;
import java.util.Map;

public interface QcCorpustabMapper {

    /**
     * 中银客户监控问题明细表
     * @return
     */
    List<Map<String,Object>> queryCustomerClient();

    /**
     *中银客户员工监控问题和提醒问题表
     * @return
     */
    List<Map<String,Object>> queryAgentProblemAndRemaind();

    /**
     * 客户问题监控统计表
     * @return
     */
    List<Map<String,Object>> queryCustomerProblemMonitor();

    /**
     * 测试服务
     * @return
     */
    List<Map<String,Object>> queryTest();

    /**
     * 组问题趋势监控统计表
     * @return
     */
    List<Map<String,Object>> queryGroupProblemMonitorTable();

    /**
     * 员工监控问题统计表
     * @return
     */
    List<Map<String,Object>> queryClientMonitorProblemTable();

    /**
     * 业务量统计表
     * @return
     */
    List<Map<String,Object>> queryBussinessQualityTable();

    /**
     * 员工监控问题对比统计表
     * @return
     */
    List<Map<String,Object>> queryClientMonitorProblemCompareTable();

    /**
     * 组监控问题对比问题表
     * @return
     */
    List<Map<String,Object>> queryGroupMonitorProblemCompareTable();

    /**
     * 员工技能匹配统计表
     * @return
     */
    List<Map<String,Object>> queryClientSkillMatchTable();

    /**
     * 组长业务处理监控表
     * @return
     */
    List<Map<String,Object>> queryGroupLeaderMonitorTable();

    /**
     * 组长业务处理明细表
     * @return
     */
    List<Map<String,Object>> queryBussinessHandleDetailTable();


    /**
     *业务类型弹屏统计表
     * @return
     */
    List<Map<String,Object>> queryBussinessPopStatisticTable();
 }