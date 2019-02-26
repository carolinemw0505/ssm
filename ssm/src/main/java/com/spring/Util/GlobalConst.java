package com.spring.util;

public class GlobalConst {
    //返回值标识码
    public static String success="success";
    public static String error="error";
    public static int successCode=0;
    public static int errorCode=1;

    //指标值类型
    public static String[] indexType={
            "queryCustomerClient",
            "queryAgentProblemAndRemaind",
            "queryCustomerProblemMonitor",
            "queryGroupProblemMonitorTable",
            "queryClientMonitorProblemTable",
            "queryBussinessQualityTable",
            "queryClientMonitorProblemCompareTable",
            "queryGroupMonitorProblemCompareTable",
            "queryClientSkillMatchTable",
            "queryGroupLeaderMonitorTable",
            "queryBussinessHandleDetailTable",
            "queryBussinessPopStatisticTable"
    };

    //索引类型
    public static String[] indexNames={
            "customer_client_data",
            "agent_problem_remaind_data",
            "customer_problem_monitor_data",
            "group_problem_monitor_data",
            "client_monitor_problem_data",
            "bussiness_quality_data",
            "client_monitor_problem_compare_data",
            "group_monitor_problem_compare_data",
            "client_skill_match_data",
            "group_leader_monitor_data",
            "bussiness_handle_detail_data",
            "bussiness_pop_statistic_data"
    };


}
