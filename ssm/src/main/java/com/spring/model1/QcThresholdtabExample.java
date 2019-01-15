package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QcThresholdtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public QcThresholdtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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
     * This class corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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

        public Criteria andTeamidIsNull() {
            addCriterion("TEAMID is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("TEAMID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(String value) {
            addCriterion("TEAMID =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(String value) {
            addCriterion("TEAMID <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(String value) {
            addCriterion("TEAMID >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(String value) {
            addCriterion("TEAMID >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(String value) {
            addCriterion("TEAMID <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(String value) {
            addCriterion("TEAMID <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLike(String value) {
            addCriterion("TEAMID like", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotLike(String value) {
            addCriterion("TEAMID not like", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<String> values) {
            addCriterion("TEAMID in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<String> values) {
            addCriterion("TEAMID not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(String value1, String value2) {
            addCriterion("TEAMID between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(String value1, String value2) {
            addCriterion("TEAMID not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andIndexidIsNull() {
            addCriterion("INDEXID is null");
            return (Criteria) this;
        }

        public Criteria andIndexidIsNotNull() {
            addCriterion("INDEXID is not null");
            return (Criteria) this;
        }

        public Criteria andIndexidEqualTo(String value) {
            addCriterion("INDEXID =", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotEqualTo(String value) {
            addCriterion("INDEXID <>", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThan(String value) {
            addCriterion("INDEXID >", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThanOrEqualTo(String value) {
            addCriterion("INDEXID >=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThan(String value) {
            addCriterion("INDEXID <", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThanOrEqualTo(String value) {
            addCriterion("INDEXID <=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLike(String value) {
            addCriterion("INDEXID like", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotLike(String value) {
            addCriterion("INDEXID not like", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidIn(List<String> values) {
            addCriterion("INDEXID in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotIn(List<String> values) {
            addCriterion("INDEXID not in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidBetween(String value1, String value2) {
            addCriterion("INDEXID between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotBetween(String value1, String value2) {
            addCriterion("INDEXID not between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("THRESHOLD is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("THRESHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(BigDecimal value) {
            addCriterion("THRESHOLD =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLD <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(BigDecimal value) {
            addCriterion("THRESHOLD >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLD >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(BigDecimal value) {
            addCriterion("THRESHOLD <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLD <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<BigDecimal> values) {
            addCriterion("THRESHOLD in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLD not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLD between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLD not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureIsNull() {
            addCriterion("INDEXFEATURE is null");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureIsNotNull() {
            addCriterion("INDEXFEATURE is not null");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureEqualTo(String value) {
            addCriterion("INDEXFEATURE =", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureNotEqualTo(String value) {
            addCriterion("INDEXFEATURE <>", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureGreaterThan(String value) {
            addCriterion("INDEXFEATURE >", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureGreaterThanOrEqualTo(String value) {
            addCriterion("INDEXFEATURE >=", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureLessThan(String value) {
            addCriterion("INDEXFEATURE <", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureLessThanOrEqualTo(String value) {
            addCriterion("INDEXFEATURE <=", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureLike(String value) {
            addCriterion("INDEXFEATURE like", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureNotLike(String value) {
            addCriterion("INDEXFEATURE not like", value, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureIn(List<String> values) {
            addCriterion("INDEXFEATURE in", values, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureNotIn(List<String> values) {
            addCriterion("INDEXFEATURE not in", values, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureBetween(String value1, String value2) {
            addCriterion("INDEXFEATURE between", value1, value2, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andIndexfeatureNotBetween(String value1, String value2) {
            addCriterion("INDEXFEATURE not between", value1, value2, "indexfeature");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridIsNull() {
            addCriterion("LASTOPERATINGUSERID is null");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridIsNotNull() {
            addCriterion("LASTOPERATINGUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridEqualTo(String value) {
            addCriterion("LASTOPERATINGUSERID =", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridNotEqualTo(String value) {
            addCriterion("LASTOPERATINGUSERID <>", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridGreaterThan(String value) {
            addCriterion("LASTOPERATINGUSERID >", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPERATINGUSERID >=", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridLessThan(String value) {
            addCriterion("LASTOPERATINGUSERID <", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridLessThanOrEqualTo(String value) {
            addCriterion("LASTOPERATINGUSERID <=", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridLike(String value) {
            addCriterion("LASTOPERATINGUSERID like", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridNotLike(String value) {
            addCriterion("LASTOPERATINGUSERID not like", value, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridIn(List<String> values) {
            addCriterion("LASTOPERATINGUSERID in", values, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridNotIn(List<String> values) {
            addCriterion("LASTOPERATINGUSERID not in", values, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridBetween(String value1, String value2) {
            addCriterion("LASTOPERATINGUSERID between", value1, value2, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatinguseridNotBetween(String value1, String value2) {
            addCriterion("LASTOPERATINGUSERID not between", value1, value2, "lastoperatinguserid");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeIsNull() {
            addCriterion("LASTOPERATINGUSERTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeIsNotNull() {
            addCriterion("LASTOPERATINGUSERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeEqualTo(Date value) {
            addCriterion("LASTOPERATINGUSERTIME =", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeNotEqualTo(Date value) {
            addCriterion("LASTOPERATINGUSERTIME <>", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeGreaterThan(Date value) {
            addCriterion("LASTOPERATINGUSERTIME >", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOPERATINGUSERTIME >=", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeLessThan(Date value) {
            addCriterion("LASTOPERATINGUSERTIME <", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTOPERATINGUSERTIME <=", value, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeIn(List<Date> values) {
            addCriterion("LASTOPERATINGUSERTIME in", values, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeNotIn(List<Date> values) {
            addCriterion("LASTOPERATINGUSERTIME not in", values, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeBetween(Date value1, Date value2) {
            addCriterion("LASTOPERATINGUSERTIME between", value1, value2, "lastoperatingusertime");
            return (Criteria) this;
        }

        public Criteria andLastoperatingusertimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTOPERATINGUSERTIME not between", value1, value2, "lastoperatingusertime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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
     * This class corresponds to the database table ONLINEQC.QC_THRESHOLDTAB
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