package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YSmanagerattrtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YSmanagerattrtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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

        public Criteria andAttrvalueIsNull() {
            addCriterion("ATTRVALUE is null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueIsNotNull() {
            addCriterion("ATTRVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrvalueEqualTo(String value) {
            addCriterion("ATTRVALUE =", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotEqualTo(String value) {
            addCriterion("ATTRVALUE <>", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueGreaterThan(String value) {
            addCriterion("ATTRVALUE >", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRVALUE >=", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLessThan(String value) {
            addCriterion("ATTRVALUE <", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLessThanOrEqualTo(String value) {
            addCriterion("ATTRVALUE <=", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueLike(String value) {
            addCriterion("ATTRVALUE like", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotLike(String value) {
            addCriterion("ATTRVALUE not like", value, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueIn(List<String> values) {
            addCriterion("ATTRVALUE in", values, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotIn(List<String> values) {
            addCriterion("ATTRVALUE not in", values, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueBetween(String value1, String value2) {
            addCriterion("ATTRVALUE between", value1, value2, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrvalueNotBetween(String value1, String value2) {
            addCriterion("ATTRVALUE not between", value1, value2, "attrvalue");
            return (Criteria) this;
        }

        public Criteria andAttrtypeIsNull() {
            addCriterion("ATTRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttrtypeIsNotNull() {
            addCriterion("ATTRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrtypeEqualTo(BigDecimal value) {
            addCriterion("ATTRTYPE =", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotEqualTo(BigDecimal value) {
            addCriterion("ATTRTYPE <>", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeGreaterThan(BigDecimal value) {
            addCriterion("ATTRTYPE >", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ATTRTYPE >=", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeLessThan(BigDecimal value) {
            addCriterion("ATTRTYPE <", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ATTRTYPE <=", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeIn(List<BigDecimal> values) {
            addCriterion("ATTRTYPE in", values, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotIn(List<BigDecimal> values) {
            addCriterion("ATTRTYPE not in", values, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATTRTYPE between", value1, value2, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATTRTYPE not between", value1, value2, "attrtype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERATTRTAB
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