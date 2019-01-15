package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YHvindextargetthsschtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YHvindextargetthsschtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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

        public Criteria andTgIsNull() {
            addCriterion("TG is null");
            return (Criteria) this;
        }

        public Criteria andTgIsNotNull() {
            addCriterion("TG is not null");
            return (Criteria) this;
        }

        public Criteria andTgEqualTo(String value) {
            addCriterion("TG =", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotEqualTo(String value) {
            addCriterion("TG <>", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgGreaterThan(String value) {
            addCriterion("TG >", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgGreaterThanOrEqualTo(String value) {
            addCriterion("TG >=", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLessThan(String value) {
            addCriterion("TG <", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLessThanOrEqualTo(String value) {
            addCriterion("TG <=", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgLike(String value) {
            addCriterion("TG like", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotLike(String value) {
            addCriterion("TG not like", value, "tg");
            return (Criteria) this;
        }

        public Criteria andTgIn(List<String> values) {
            addCriterion("TG in", values, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotIn(List<String> values) {
            addCriterion("TG not in", values, "tg");
            return (Criteria) this;
        }

        public Criteria andTgBetween(String value1, String value2) {
            addCriterion("TG between", value1, value2, "tg");
            return (Criteria) this;
        }

        public Criteria andTgNotBetween(String value1, String value2) {
            addCriterion("TG not between", value1, value2, "tg");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeIsNull() {
            addCriterion("LASTDATATIME is null");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeIsNotNull() {
            addCriterion("LASTDATATIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeEqualTo(Date value) {
            addCriterion("LASTDATATIME =", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeNotEqualTo(Date value) {
            addCriterion("LASTDATATIME <>", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeGreaterThan(Date value) {
            addCriterion("LASTDATATIME >", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTDATATIME >=", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeLessThan(Date value) {
            addCriterion("LASTDATATIME <", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTDATATIME <=", value, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeIn(List<Date> values) {
            addCriterion("LASTDATATIME in", values, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeNotIn(List<Date> values) {
            addCriterion("LASTDATATIME not in", values, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeBetween(Date value1, Date value2) {
            addCriterion("LASTDATATIME between", value1, value2, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastdatatimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTDATATIME not between", value1, value2, "lastdatatime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeIsNull() {
            addCriterion("LASTBEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeIsNotNull() {
            addCriterion("LASTBEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeEqualTo(Date value) {
            addCriterion("LASTBEGINTIME =", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeNotEqualTo(Date value) {
            addCriterion("LASTBEGINTIME <>", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeGreaterThan(Date value) {
            addCriterion("LASTBEGINTIME >", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTBEGINTIME >=", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeLessThan(Date value) {
            addCriterion("LASTBEGINTIME <", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTBEGINTIME <=", value, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeIn(List<Date> values) {
            addCriterion("LASTBEGINTIME in", values, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeNotIn(List<Date> values) {
            addCriterion("LASTBEGINTIME not in", values, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeBetween(Date value1, Date value2) {
            addCriterion("LASTBEGINTIME between", value1, value2, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastbegintimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTBEGINTIME not between", value1, value2, "lastbegintime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeIsNull() {
            addCriterion("LASTENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastendtimeIsNotNull() {
            addCriterion("LASTENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastendtimeEqualTo(Date value) {
            addCriterion("LASTENDTIME =", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeNotEqualTo(Date value) {
            addCriterion("LASTENDTIME <>", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeGreaterThan(Date value) {
            addCriterion("LASTENDTIME >", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTENDTIME >=", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeLessThan(Date value) {
            addCriterion("LASTENDTIME <", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTENDTIME <=", value, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeIn(List<Date> values) {
            addCriterion("LASTENDTIME in", values, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeNotIn(List<Date> values) {
            addCriterion("LASTENDTIME not in", values, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeBetween(Date value1, Date value2) {
            addCriterion("LASTENDTIME between", value1, value2, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastendtimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTENDTIME not between", value1, value2, "lastendtime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeIsNull() {
            addCriterion("LASTLIMITTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeIsNotNull() {
            addCriterion("LASTLIMITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeEqualTo(Date value) {
            addCriterion("LASTLIMITTIME =", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeNotEqualTo(Date value) {
            addCriterion("LASTLIMITTIME <>", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeGreaterThan(Date value) {
            addCriterion("LASTLIMITTIME >", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTLIMITTIME >=", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeLessThan(Date value) {
            addCriterion("LASTLIMITTIME <", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTLIMITTIME <=", value, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeIn(List<Date> values) {
            addCriterion("LASTLIMITTIME in", values, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeNotIn(List<Date> values) {
            addCriterion("LASTLIMITTIME not in", values, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeBetween(Date value1, Date value2) {
            addCriterion("LASTLIMITTIME between", value1, value2, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andLastlimittimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTLIMITTIME not between", value1, value2, "lastlimittime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeIsNull() {
            addCriterion("NEXTDATATIME is null");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeIsNotNull() {
            addCriterion("NEXTDATATIME is not null");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeEqualTo(Date value) {
            addCriterion("NEXTDATATIME =", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeNotEqualTo(Date value) {
            addCriterion("NEXTDATATIME <>", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeGreaterThan(Date value) {
            addCriterion("NEXTDATATIME >", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NEXTDATATIME >=", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeLessThan(Date value) {
            addCriterion("NEXTDATATIME <", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeLessThanOrEqualTo(Date value) {
            addCriterion("NEXTDATATIME <=", value, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeIn(List<Date> values) {
            addCriterion("NEXTDATATIME in", values, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeNotIn(List<Date> values) {
            addCriterion("NEXTDATATIME not in", values, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeBetween(Date value1, Date value2) {
            addCriterion("NEXTDATATIME between", value1, value2, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andNextdatatimeNotBetween(Date value1, Date value2) {
            addCriterion("NEXTDATATIME not between", value1, value2, "nextdatatime");
            return (Criteria) this;
        }

        public Criteria andRetryIsNull() {
            addCriterion("RETRY is null");
            return (Criteria) this;
        }

        public Criteria andRetryIsNotNull() {
            addCriterion("RETRY is not null");
            return (Criteria) this;
        }

        public Criteria andRetryEqualTo(Long value) {
            addCriterion("RETRY =", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotEqualTo(Long value) {
            addCriterion("RETRY <>", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThan(Long value) {
            addCriterion("RETRY >", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryGreaterThanOrEqualTo(Long value) {
            addCriterion("RETRY >=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThan(Long value) {
            addCriterion("RETRY <", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryLessThanOrEqualTo(Long value) {
            addCriterion("RETRY <=", value, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryIn(List<Long> values) {
            addCriterion("RETRY in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotIn(List<Long> values) {
            addCriterion("RETRY not in", values, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryBetween(Long value1, Long value2) {
            addCriterion("RETRY between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andRetryNotBetween(Long value1, Long value2) {
            addCriterion("RETRY not between", value1, value2, "retry");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNull() {
            addCriterion("ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("ERRORMSG =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("ERRORMSG <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("ERRORMSG >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMSG >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("ERRORMSG <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("ERRORMSG <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("ERRORMSG like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("ERRORMSG not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("ERRORMSG in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("ERRORMSG not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("ERRORMSG between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("ERRORMSG not between", value1, value2, "errormsg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_HVINDEXTARGETTHSSCHTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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