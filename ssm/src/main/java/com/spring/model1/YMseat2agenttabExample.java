package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YMseat2agenttabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public YMseat2agenttabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TENANTID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TENANTID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(String value) {
            addCriterion("TENANTID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(String value) {
            addCriterion("TENANTID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(String value) {
            addCriterion("TENANTID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(String value) {
            addCriterion("TENANTID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(String value) {
            addCriterion("TENANTID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(String value) {
            addCriterion("TENANTID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLike(String value) {
            addCriterion("TENANTID like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotLike(String value) {
            addCriterion("TENANTID not like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<String> values) {
            addCriterion("TENANTID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<String> values) {
            addCriterion("TENANTID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(String value1, String value2) {
            addCriterion("TENANTID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(String value1, String value2) {
            addCriterion("TENANTID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("NODEID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NODEID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(Long value) {
            addCriterion("NODEID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(Long value) {
            addCriterion("NODEID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(Long value) {
            addCriterion("NODEID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(Long value) {
            addCriterion("NODEID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(Long value) {
            addCriterion("NODEID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(Long value) {
            addCriterion("NODEID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<Long> values) {
            addCriterion("NODEID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<Long> values) {
            addCriterion("NODEID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(Long value1, Long value2) {
            addCriterion("NODEID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(Long value1, Long value2) {
            addCriterion("NODEID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNull() {
            addCriterion("SEATID is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("SEATID is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(String value) {
            addCriterion("SEATID =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(String value) {
            addCriterion("SEATID <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(String value) {
            addCriterion("SEATID >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(String value) {
            addCriterion("SEATID >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(String value) {
            addCriterion("SEATID <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(String value) {
            addCriterion("SEATID <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLike(String value) {
            addCriterion("SEATID like", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotLike(String value) {
            addCriterion("SEATID not like", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<String> values) {
            addCriterion("SEATID in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<String> values) {
            addCriterion("SEATID not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(String value1, String value2) {
            addCriterion("SEATID between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(String value1, String value2) {
            addCriterion("SEATID not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andUserumIsNull() {
            addCriterion("USERUM is null");
            return (Criteria) this;
        }

        public Criteria andUserumIsNotNull() {
            addCriterion("USERUM is not null");
            return (Criteria) this;
        }

        public Criteria andUserumEqualTo(String value) {
            addCriterion("USERUM =", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumNotEqualTo(String value) {
            addCriterion("USERUM <>", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumGreaterThan(String value) {
            addCriterion("USERUM >", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumGreaterThanOrEqualTo(String value) {
            addCriterion("USERUM >=", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumLessThan(String value) {
            addCriterion("USERUM <", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumLessThanOrEqualTo(String value) {
            addCriterion("USERUM <=", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumLike(String value) {
            addCriterion("USERUM like", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumNotLike(String value) {
            addCriterion("USERUM not like", value, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumIn(List<String> values) {
            addCriterion("USERUM in", values, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumNotIn(List<String> values) {
            addCriterion("USERUM not in", values, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumBetween(String value1, String value2) {
            addCriterion("USERUM between", value1, value2, "userum");
            return (Criteria) this;
        }

        public Criteria andUserumNotBetween(String value1, String value2) {
            addCriterion("USERUM not between", value1, value2, "userum");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("AGENTID is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("AGENTID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(String value) {
            addCriterion("AGENTID =", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(String value) {
            addCriterion("AGENTID <>", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(String value) {
            addCriterion("AGENTID >", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTID >=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(String value) {
            addCriterion("AGENTID <", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(String value) {
            addCriterion("AGENTID <=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLike(String value) {
            addCriterion("AGENTID like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotLike(String value) {
            addCriterion("AGENTID not like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<String> values) {
            addCriterion("AGENTID in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<String> values) {
            addCriterion("AGENTID not in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(String value1, String value2) {
            addCriterion("AGENTID between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(String value1, String value2) {
            addCriterion("AGENTID not between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("LOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("LOGINTIME =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("LOGINTIME <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("LOGINTIME >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("LOGINTIME <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGINTIME <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("LOGINTIME in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("LOGINTIME not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGINTIME not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNull() {
            addCriterion("LOGOUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIsNotNull() {
            addCriterion("LOGOUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogouttimeEqualTo(Date value) {
            addCriterion("LOGOUTTIME =", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotEqualTo(Date value) {
            addCriterion("LOGOUTTIME <>", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThan(Date value) {
            addCriterion("LOGOUTTIME >", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGOUTTIME >=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThan(Date value) {
            addCriterion("LOGOUTTIME <", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGOUTTIME <=", value, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeIn(List<Date> values) {
            addCriterion("LOGOUTTIME in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotIn(List<Date> values) {
            addCriterion("LOGOUTTIME not in", values, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeBetween(Date value1, Date value2) {
            addCriterion("LOGOUTTIME between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andLogouttimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGOUTTIME not between", value1, value2, "logouttime");
            return (Criteria) this;
        }

        public Criteria andHelpstatusIsNull() {
            addCriterion("HELPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andHelpstatusIsNotNull() {
            addCriterion("HELPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHelpstatusEqualTo(String value) {
            addCriterion("HELPSTATUS =", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusNotEqualTo(String value) {
            addCriterion("HELPSTATUS <>", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusGreaterThan(String value) {
            addCriterion("HELPSTATUS >", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("HELPSTATUS >=", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusLessThan(String value) {
            addCriterion("HELPSTATUS <", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusLessThanOrEqualTo(String value) {
            addCriterion("HELPSTATUS <=", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusLike(String value) {
            addCriterion("HELPSTATUS like", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusNotLike(String value) {
            addCriterion("HELPSTATUS not like", value, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusIn(List<String> values) {
            addCriterion("HELPSTATUS in", values, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusNotIn(List<String> values) {
            addCriterion("HELPSTATUS not in", values, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusBetween(String value1, String value2) {
            addCriterion("HELPSTATUS between", value1, value2, "helpstatus");
            return (Criteria) this;
        }

        public Criteria andHelpstatusNotBetween(String value1, String value2) {
            addCriterion("HELPSTATUS not between", value1, value2, "helpstatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:10 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MSEAT2AGENTTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}