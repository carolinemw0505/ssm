package com.spring.model1;

import java.util.ArrayList;
import java.util.List;

public class YScenestatusalarmindexobjtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public YScenestatusalarmindexobjtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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

        public Criteria andConfigidIsNull() {
            addCriterion("CONFIGID is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("CONFIGID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(Long value) {
            addCriterion("CONFIGID =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(Long value) {
            addCriterion("CONFIGID <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(Long value) {
            addCriterion("CONFIGID >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(Long value) {
            addCriterion("CONFIGID >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(Long value) {
            addCriterion("CONFIGID <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(Long value) {
            addCriterion("CONFIGID <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<Long> values) {
            addCriterion("CONFIGID in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<Long> values) {
            addCriterion("CONFIGID not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(Long value1, Long value2) {
            addCriterion("CONFIGID between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(Long value1, Long value2) {
            addCriterion("CONFIGID not between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andAttrnameIsNull() {
            addCriterion("ATTRNAME is null");
            return (Criteria) this;
        }

        public Criteria andAttrnameIsNotNull() {
            addCriterion("ATTRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttrnameEqualTo(String value) {
            addCriterion("ATTRNAME =", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotEqualTo(String value) {
            addCriterion("ATTRNAME <>", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameGreaterThan(String value) {
            addCriterion("ATTRNAME >", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRNAME >=", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLessThan(String value) {
            addCriterion("ATTRNAME <", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLessThanOrEqualTo(String value) {
            addCriterion("ATTRNAME <=", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameLike(String value) {
            addCriterion("ATTRNAME like", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotLike(String value) {
            addCriterion("ATTRNAME not like", value, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameIn(List<String> values) {
            addCriterion("ATTRNAME in", values, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotIn(List<String> values) {
            addCriterion("ATTRNAME not in", values, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameBetween(String value1, String value2) {
            addCriterion("ATTRNAME between", value1, value2, "attrname");
            return (Criteria) this;
        }

        public Criteria andAttrnameNotBetween(String value1, String value2) {
            addCriterion("ATTRNAME not between", value1, value2, "attrname");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNull() {
            addCriterion("OBJECTID is null");
            return (Criteria) this;
        }

        public Criteria andObjectidIsNotNull() {
            addCriterion("OBJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidEqualTo(String value) {
            addCriterion("OBJECTID =", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotEqualTo(String value) {
            addCriterion("OBJECTID <>", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThan(String value) {
            addCriterion("OBJECTID >", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTID >=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThan(String value) {
            addCriterion("OBJECTID <", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLessThanOrEqualTo(String value) {
            addCriterion("OBJECTID <=", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidLike(String value) {
            addCriterion("OBJECTID like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotLike(String value) {
            addCriterion("OBJECTID not like", value, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidIn(List<String> values) {
            addCriterion("OBJECTID in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotIn(List<String> values) {
            addCriterion("OBJECTID not in", values, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidBetween(String value1, String value2) {
            addCriterion("OBJECTID between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjectidNotBetween(String value1, String value2) {
            addCriterion("OBJECTID not between", value1, value2, "objectid");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIsNull() {
            addCriterion("OBJECTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIsNotNull() {
            addCriterion("OBJECTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeEqualTo(String value) {
            addCriterion("OBJECTTYPE =", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotEqualTo(String value) {
            addCriterion("OBJECTTYPE <>", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThan(String value) {
            addCriterion("OBJECTTYPE >", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTTYPE >=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThan(String value) {
            addCriterion("OBJECTTYPE <", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECTTYPE <=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLike(String value) {
            addCriterion("OBJECTTYPE like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotLike(String value) {
            addCriterion("OBJECTTYPE not like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIn(List<String> values) {
            addCriterion("OBJECTTYPE in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotIn(List<String> values) {
            addCriterion("OBJECTTYPE not in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeBetween(String value1, String value2) {
            addCriterion("OBJECTTYPE between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotBetween(String value1, String value2) {
            addCriterion("OBJECTTYPE not between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Long value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Long value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Long value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Long value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Long value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Long value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Long> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Long> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Long value1, Long value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Long value1, Long value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andRemark0IsNull() {
            addCriterion("REMARK0 is null");
            return (Criteria) this;
        }

        public Criteria andRemark0IsNotNull() {
            addCriterion("REMARK0 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark0EqualTo(String value) {
            addCriterion("REMARK0 =", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0NotEqualTo(String value) {
            addCriterion("REMARK0 <>", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0GreaterThan(String value) {
            addCriterion("REMARK0 >", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK0 >=", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0LessThan(String value) {
            addCriterion("REMARK0 <", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0LessThanOrEqualTo(String value) {
            addCriterion("REMARK0 <=", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0Like(String value) {
            addCriterion("REMARK0 like", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0NotLike(String value) {
            addCriterion("REMARK0 not like", value, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0In(List<String> values) {
            addCriterion("REMARK0 in", values, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0NotIn(List<String> values) {
            addCriterion("REMARK0 not in", values, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0Between(String value1, String value2) {
            addCriterion("REMARK0 between", value1, value2, "remark0");
            return (Criteria) this;
        }

        public Criteria andRemark0NotBetween(String value1, String value2) {
            addCriterion("REMARK0 not between", value1, value2, "remark0");
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

        public Criteria andDnIsNull() {
            addCriterion("DN is null");
            return (Criteria) this;
        }

        public Criteria andDnIsNotNull() {
            addCriterion("DN is not null");
            return (Criteria) this;
        }

        public Criteria andDnEqualTo(String value) {
            addCriterion("DN =", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotEqualTo(String value) {
            addCriterion("DN <>", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThan(String value) {
            addCriterion("DN >", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThanOrEqualTo(String value) {
            addCriterion("DN >=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThan(String value) {
            addCriterion("DN <", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThanOrEqualTo(String value) {
            addCriterion("DN <=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLike(String value) {
            addCriterion("DN like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotLike(String value) {
            addCriterion("DN not like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnIn(List<String> values) {
            addCriterion("DN in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotIn(List<String> values) {
            addCriterion("DN not in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnBetween(String value1, String value2) {
            addCriterion("DN between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotBetween(String value1, String value2) {
            addCriterion("DN not between", value1, value2, "dn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SCENESTATUSALARMINDEXOBJTAB
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