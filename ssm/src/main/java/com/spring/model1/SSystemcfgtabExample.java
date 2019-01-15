package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SSystemcfgtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public SSystemcfgtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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
     * This class corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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

        public Criteria andCfgidIsNull() {
            addCriterion("CFGID is null");
            return (Criteria) this;
        }

        public Criteria andCfgidIsNotNull() {
            addCriterion("CFGID is not null");
            return (Criteria) this;
        }

        public Criteria andCfgidEqualTo(Long value) {
            addCriterion("CFGID =", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidNotEqualTo(Long value) {
            addCriterion("CFGID <>", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidGreaterThan(Long value) {
            addCriterion("CFGID >", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidGreaterThanOrEqualTo(Long value) {
            addCriterion("CFGID >=", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidLessThan(Long value) {
            addCriterion("CFGID <", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidLessThanOrEqualTo(Long value) {
            addCriterion("CFGID <=", value, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidIn(List<Long> values) {
            addCriterion("CFGID in", values, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidNotIn(List<Long> values) {
            addCriterion("CFGID not in", values, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidBetween(Long value1, Long value2) {
            addCriterion("CFGID between", value1, value2, "cfgid");
            return (Criteria) this;
        }

        public Criteria andCfgidNotBetween(Long value1, Long value2) {
            addCriterion("CFGID not between", value1, value2, "cfgid");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNull() {
            addCriterion("SYSTEMID is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("SYSTEMID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(Object value) {
            addCriterion("SYSTEMID =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(Object value) {
            addCriterion("SYSTEMID <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(Object value) {
            addCriterion("SYSTEMID >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(Object value) {
            addCriterion("SYSTEMID >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(Object value) {
            addCriterion("SYSTEMID <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(Object value) {
            addCriterion("SYSTEMID <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<Object> values) {
            addCriterion("SYSTEMID in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<Object> values) {
            addCriterion("SYSTEMID not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(Object value1, Object value2) {
            addCriterion("SYSTEMID between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(Object value1, Object value2) {
            addCriterion("SYSTEMID not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNull() {
            addCriterion("MODULEID is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("MODULEID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(Object value) {
            addCriterion("MODULEID =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(Object value) {
            addCriterion("MODULEID <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(Object value) {
            addCriterion("MODULEID >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(Object value) {
            addCriterion("MODULEID >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(Object value) {
            addCriterion("MODULEID <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(Object value) {
            addCriterion("MODULEID <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<Object> values) {
            addCriterion("MODULEID in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<Object> values) {
            addCriterion("MODULEID not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(Object value1, Object value2) {
            addCriterion("MODULEID between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(Object value1, Object value2) {
            addCriterion("MODULEID not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Object value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Object value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Object value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Object value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Object value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Object value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Object> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Object> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Object value1, Object value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Object value1, Object value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("USED is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("USED is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Short value) {
            addCriterion("USED =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Short value) {
            addCriterion("USED <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Short value) {
            addCriterion("USED >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Short value) {
            addCriterion("USED >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Short value) {
            addCriterion("USED <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Short value) {
            addCriterion("USED <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Short> values) {
            addCriterion("USED in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Short> values) {
            addCriterion("USED not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Short value1, Short value2) {
            addCriterion("USED between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Short value1, Short value2) {
            addCriterion("USED not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andNametextIsNull() {
            addCriterion("NAMETEXT is null");
            return (Criteria) this;
        }

        public Criteria andNametextIsNotNull() {
            addCriterion("NAMETEXT is not null");
            return (Criteria) this;
        }

        public Criteria andNametextEqualTo(Object value) {
            addCriterion("NAMETEXT =", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextNotEqualTo(Object value) {
            addCriterion("NAMETEXT <>", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextGreaterThan(Object value) {
            addCriterion("NAMETEXT >", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextGreaterThanOrEqualTo(Object value) {
            addCriterion("NAMETEXT >=", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextLessThan(Object value) {
            addCriterion("NAMETEXT <", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextLessThanOrEqualTo(Object value) {
            addCriterion("NAMETEXT <=", value, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextIn(List<Object> values) {
            addCriterion("NAMETEXT in", values, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextNotIn(List<Object> values) {
            addCriterion("NAMETEXT not in", values, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextBetween(Object value1, Object value2) {
            addCriterion("NAMETEXT between", value1, value2, "nametext");
            return (Criteria) this;
        }

        public Criteria andNametextNotBetween(Object value1, Object value2) {
            addCriterion("NAMETEXT not between", value1, value2, "nametext");
            return (Criteria) this;
        }

        public Criteria andValuetextIsNull() {
            addCriterion("VALUETEXT is null");
            return (Criteria) this;
        }

        public Criteria andValuetextIsNotNull() {
            addCriterion("VALUETEXT is not null");
            return (Criteria) this;
        }

        public Criteria andValuetextEqualTo(Object value) {
            addCriterion("VALUETEXT =", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextNotEqualTo(Object value) {
            addCriterion("VALUETEXT <>", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextGreaterThan(Object value) {
            addCriterion("VALUETEXT >", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextGreaterThanOrEqualTo(Object value) {
            addCriterion("VALUETEXT >=", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextLessThan(Object value) {
            addCriterion("VALUETEXT <", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextLessThanOrEqualTo(Object value) {
            addCriterion("VALUETEXT <=", value, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextIn(List<Object> values) {
            addCriterion("VALUETEXT in", values, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextNotIn(List<Object> values) {
            addCriterion("VALUETEXT not in", values, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextBetween(Object value1, Object value2) {
            addCriterion("VALUETEXT between", value1, value2, "valuetext");
            return (Criteria) this;
        }

        public Criteria andValuetextNotBetween(Object value1, Object value2) {
            addCriterion("VALUETEXT not between", value1, value2, "valuetext");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("ORDERBY is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("ORDERBY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(Short value) {
            addCriterion("ORDERBY =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(Short value) {
            addCriterion("ORDERBY <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(Short value) {
            addCriterion("ORDERBY >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDERBY >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(Short value) {
            addCriterion("ORDERBY <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(Short value) {
            addCriterion("ORDERBY <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<Short> values) {
            addCriterion("ORDERBY in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<Short> values) {
            addCriterion("ORDERBY not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(Short value1, Short value2) {
            addCriterion("ORDERBY between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(Short value1, Short value2) {
            addCriterion("ORDERBY not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andDicttypeIsNull() {
            addCriterion("DICTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDicttypeIsNotNull() {
            addCriterion("DICTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDicttypeEqualTo(Object value) {
            addCriterion("DICTTYPE =", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeNotEqualTo(Object value) {
            addCriterion("DICTTYPE <>", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeGreaterThan(Object value) {
            addCriterion("DICTTYPE >", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeGreaterThanOrEqualTo(Object value) {
            addCriterion("DICTTYPE >=", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeLessThan(Object value) {
            addCriterion("DICTTYPE <", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeLessThanOrEqualTo(Object value) {
            addCriterion("DICTTYPE <=", value, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeIn(List<Object> values) {
            addCriterion("DICTTYPE in", values, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeNotIn(List<Object> values) {
            addCriterion("DICTTYPE not in", values, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeBetween(Object value1, Object value2) {
            addCriterion("DICTTYPE between", value1, value2, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDicttypeNotBetween(Object value1, Object value2) {
            addCriterion("DICTTYPE not between", value1, value2, "dicttype");
            return (Criteria) this;
        }

        public Criteria andDictkeyIsNull() {
            addCriterion("DICTKEY is null");
            return (Criteria) this;
        }

        public Criteria andDictkeyIsNotNull() {
            addCriterion("DICTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andDictkeyEqualTo(Object value) {
            addCriterion("DICTKEY =", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyNotEqualTo(Object value) {
            addCriterion("DICTKEY <>", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyGreaterThan(Object value) {
            addCriterion("DICTKEY >", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyGreaterThanOrEqualTo(Object value) {
            addCriterion("DICTKEY >=", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyLessThan(Object value) {
            addCriterion("DICTKEY <", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyLessThanOrEqualTo(Object value) {
            addCriterion("DICTKEY <=", value, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyIn(List<Object> values) {
            addCriterion("DICTKEY in", values, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyNotIn(List<Object> values) {
            addCriterion("DICTKEY not in", values, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyBetween(Object value1, Object value2) {
            addCriterion("DICTKEY between", value1, value2, "dictkey");
            return (Criteria) this;
        }

        public Criteria andDictkeyNotBetween(Object value1, Object value2) {
            addCriterion("DICTKEY not between", value1, value2, "dictkey");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("MODIFYTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("MODIFYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("MODIFYTIME =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("MODIFYTIME <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("MODIFYTIME >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("MODIFYTIME <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFYTIME <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("MODIFYTIME in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("MODIFYTIME not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFYTIME not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIsNull() {
            addCriterion("RECORDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIsNotNull() {
            addCriterion("RECORDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeEqualTo(Object value) {
            addCriterion("RECORDTYPE =", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotEqualTo(Object value) {
            addCriterion("RECORDTYPE <>", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThan(Object value) {
            addCriterion("RECORDTYPE >", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThanOrEqualTo(Object value) {
            addCriterion("RECORDTYPE >=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThan(Object value) {
            addCriterion("RECORDTYPE <", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThanOrEqualTo(Object value) {
            addCriterion("RECORDTYPE <=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIn(List<Object> values) {
            addCriterion("RECORDTYPE in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotIn(List<Object> values) {
            addCriterion("RECORDTYPE not in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeBetween(Object value1, Object value2) {
            addCriterion("RECORDTYPE between", value1, value2, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotBetween(Object value1, Object value2) {
            addCriterion("RECORDTYPE not between", value1, value2, "recordtype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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
     * This class corresponds to the database table ONLINEQC.S_SYSTEMCFGTAB
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