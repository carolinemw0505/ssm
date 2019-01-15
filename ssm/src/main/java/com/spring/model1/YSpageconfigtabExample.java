package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YSpageconfigtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YSpageconfigtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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

        public Criteria andMgridIsNull() {
            addCriterion("MGRID is null");
            return (Criteria) this;
        }

        public Criteria andMgridIsNotNull() {
            addCriterion("MGRID is not null");
            return (Criteria) this;
        }

        public Criteria andMgridEqualTo(BigDecimal value) {
            addCriterion("MGRID =", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotEqualTo(BigDecimal value) {
            addCriterion("MGRID <>", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridGreaterThan(BigDecimal value) {
            addCriterion("MGRID >", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MGRID >=", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridLessThan(BigDecimal value) {
            addCriterion("MGRID <", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MGRID <=", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridIn(List<BigDecimal> values) {
            addCriterion("MGRID in", values, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotIn(List<BigDecimal> values) {
            addCriterion("MGRID not in", values, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MGRID between", value1, value2, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MGRID not between", value1, value2, "mgrid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidIsNull() {
            addCriterion("ORGTREEID is null");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidIsNotNull() {
            addCriterion("ORGTREEID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidEqualTo(Long value) {
            addCriterion("ORGTREEID =", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidNotEqualTo(Long value) {
            addCriterion("ORGTREEID <>", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidGreaterThan(Long value) {
            addCriterion("ORGTREEID >", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGTREEID >=", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidLessThan(Long value) {
            addCriterion("ORGTREEID <", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidLessThanOrEqualTo(Long value) {
            addCriterion("ORGTREEID <=", value, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidIn(List<Long> values) {
            addCriterion("ORGTREEID in", values, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidNotIn(List<Long> values) {
            addCriterion("ORGTREEID not in", values, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidBetween(Long value1, Long value2) {
            addCriterion("ORGTREEID between", value1, value2, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreeidNotBetween(Long value1, Long value2) {
            addCriterion("ORGTREEID not between", value1, value2, "orgtreeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidIsNull() {
            addCriterion("ORGTREENODEID is null");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidIsNotNull() {
            addCriterion("ORGTREENODEID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidEqualTo(Long value) {
            addCriterion("ORGTREENODEID =", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidNotEqualTo(Long value) {
            addCriterion("ORGTREENODEID <>", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidGreaterThan(Long value) {
            addCriterion("ORGTREENODEID >", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORGTREENODEID >=", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidLessThan(Long value) {
            addCriterion("ORGTREENODEID <", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidLessThanOrEqualTo(Long value) {
            addCriterion("ORGTREENODEID <=", value, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidIn(List<Long> values) {
            addCriterion("ORGTREENODEID in", values, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidNotIn(List<Long> values) {
            addCriterion("ORGTREENODEID not in", values, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidBetween(Long value1, Long value2) {
            addCriterion("ORGTREENODEID between", value1, value2, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andOrgtreenodeidNotBetween(Long value1, Long value2) {
            addCriterion("ORGTREENODEID not between", value1, value2, "orgtreenodeid");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("PAGEID is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Long value) {
            addCriterion("PAGEID =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Long value) {
            addCriterion("PAGEID <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Long value) {
            addCriterion("PAGEID >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Long value) {
            addCriterion("PAGEID >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Long value) {
            addCriterion("PAGEID <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Long value) {
            addCriterion("PAGEID <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Long> values) {
            addCriterion("PAGEID in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Long> values) {
            addCriterion("PAGEID not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Long value1, Long value2) {
            addCriterion("PAGEID between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Long value1, Long value2) {
            addCriterion("PAGEID not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Long value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Long value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Long value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Long value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Long value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Long value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Long> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Long> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Long value1, Long value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Long value1, Long value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("PARAMS =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("PARAMS <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("PARAMS >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("PARAMS <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("PARAMS <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("PARAMS like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("PARAMS not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("PARAMS in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("PARAMS not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("PARAMS between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("PARAMS not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("REMARK3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("REMARK3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("REMARK3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("REMARK3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("REMARK3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("REMARK3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("REMARK3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("REMARK3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("REMARK3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("REMARK3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("REMARK3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SPAGECONFIGTAB
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