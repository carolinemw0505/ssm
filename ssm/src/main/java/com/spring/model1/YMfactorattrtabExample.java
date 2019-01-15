package com.spring.model1;

import java.util.ArrayList;
import java.util.List;

public class YMfactorattrtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public YMfactorattrtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
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
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
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

        public Criteria andFactoridIsNull() {
            addCriterion("FACTORID is null");
            return (Criteria) this;
        }

        public Criteria andFactoridIsNotNull() {
            addCriterion("FACTORID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoridEqualTo(String value) {
            addCriterion("FACTORID =", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotEqualTo(String value) {
            addCriterion("FACTORID <>", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridGreaterThan(String value) {
            addCriterion("FACTORID >", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORID >=", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridLessThan(String value) {
            addCriterion("FACTORID <", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridLessThanOrEqualTo(String value) {
            addCriterion("FACTORID <=", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridLike(String value) {
            addCriterion("FACTORID like", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotLike(String value) {
            addCriterion("FACTORID not like", value, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridIn(List<String> values) {
            addCriterion("FACTORID in", values, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotIn(List<String> values) {
            addCriterion("FACTORID not in", values, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridBetween(String value1, String value2) {
            addCriterion("FACTORID between", value1, value2, "factorid");
            return (Criteria) this;
        }

        public Criteria andFactoridNotBetween(String value1, String value2) {
            addCriterion("FACTORID not between", value1, value2, "factorid");
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

        public Criteria andAttrtypeIsNull() {
            addCriterion("ATTRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttrtypeIsNotNull() {
            addCriterion("ATTRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrtypeEqualTo(String value) {
            addCriterion("ATTRTYPE =", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotEqualTo(String value) {
            addCriterion("ATTRTYPE <>", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeGreaterThan(String value) {
            addCriterion("ATTRTYPE >", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRTYPE >=", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeLessThan(String value) {
            addCriterion("ATTRTYPE <", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeLessThanOrEqualTo(String value) {
            addCriterion("ATTRTYPE <=", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeLike(String value) {
            addCriterion("ATTRTYPE like", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotLike(String value) {
            addCriterion("ATTRTYPE not like", value, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeIn(List<String> values) {
            addCriterion("ATTRTYPE in", values, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotIn(List<String> values) {
            addCriterion("ATTRTYPE not in", values, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeBetween(String value1, String value2) {
            addCriterion("ATTRTYPE between", value1, value2, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrtypeNotBetween(String value1, String value2) {
            addCriterion("ATTRTYPE not between", value1, value2, "attrtype");
            return (Criteria) this;
        }

        public Criteria andAttrvalIsNull() {
            addCriterion("ATTRVAL is null");
            return (Criteria) this;
        }

        public Criteria andAttrvalIsNotNull() {
            addCriterion("ATTRVAL is not null");
            return (Criteria) this;
        }

        public Criteria andAttrvalEqualTo(String value) {
            addCriterion("ATTRVAL =", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalNotEqualTo(String value) {
            addCriterion("ATTRVAL <>", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalGreaterThan(String value) {
            addCriterion("ATTRVAL >", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRVAL >=", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalLessThan(String value) {
            addCriterion("ATTRVAL <", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalLessThanOrEqualTo(String value) {
            addCriterion("ATTRVAL <=", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalLike(String value) {
            addCriterion("ATTRVAL like", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalNotLike(String value) {
            addCriterion("ATTRVAL not like", value, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalIn(List<String> values) {
            addCriterion("ATTRVAL in", values, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalNotIn(List<String> values) {
            addCriterion("ATTRVAL not in", values, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalBetween(String value1, String value2) {
            addCriterion("ATTRVAL between", value1, value2, "attrval");
            return (Criteria) this;
        }

        public Criteria andAttrvalNotBetween(String value1, String value2) {
            addCriterion("ATTRVAL not between", value1, value2, "attrval");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:07 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_MFACTORATTRTAB
     *
     * @mbg.generated Tue Jan 08 16:40:07 CST 2019
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