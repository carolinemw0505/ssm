package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YRggeneralgrouptabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YRggeneralgrouptabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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
     * This class corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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

        public Criteria andDestsysidIsNull() {
            addCriterion("DESTSYSID is null");
            return (Criteria) this;
        }

        public Criteria andDestsysidIsNotNull() {
            addCriterion("DESTSYSID is not null");
            return (Criteria) this;
        }

        public Criteria andDestsysidEqualTo(String value) {
            addCriterion("DESTSYSID =", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidNotEqualTo(String value) {
            addCriterion("DESTSYSID <>", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidGreaterThan(String value) {
            addCriterion("DESTSYSID >", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidGreaterThanOrEqualTo(String value) {
            addCriterion("DESTSYSID >=", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidLessThan(String value) {
            addCriterion("DESTSYSID <", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidLessThanOrEqualTo(String value) {
            addCriterion("DESTSYSID <=", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidLike(String value) {
            addCriterion("DESTSYSID like", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidNotLike(String value) {
            addCriterion("DESTSYSID not like", value, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidIn(List<String> values) {
            addCriterion("DESTSYSID in", values, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidNotIn(List<String> values) {
            addCriterion("DESTSYSID not in", values, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidBetween(String value1, String value2) {
            addCriterion("DESTSYSID between", value1, value2, "destsysid");
            return (Criteria) this;
        }

        public Criteria andDestsysidNotBetween(String value1, String value2) {
            addCriterion("DESTSYSID not between", value1, value2, "destsysid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidIsNull() {
            addCriterion("GROUPDBID is null");
            return (Criteria) this;
        }

        public Criteria andGroupdbidIsNotNull() {
            addCriterion("GROUPDBID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupdbidEqualTo(String value) {
            addCriterion("GROUPDBID =", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidNotEqualTo(String value) {
            addCriterion("GROUPDBID <>", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidGreaterThan(String value) {
            addCriterion("GROUPDBID >", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPDBID >=", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidLessThan(String value) {
            addCriterion("GROUPDBID <", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidLessThanOrEqualTo(String value) {
            addCriterion("GROUPDBID <=", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidLike(String value) {
            addCriterion("GROUPDBID like", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidNotLike(String value) {
            addCriterion("GROUPDBID not like", value, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidIn(List<String> values) {
            addCriterion("GROUPDBID in", values, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidNotIn(List<String> values) {
            addCriterion("GROUPDBID not in", values, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidBetween(String value1, String value2) {
            addCriterion("GROUPDBID between", value1, value2, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupdbidNotBetween(String value1, String value2) {
            addCriterion("GROUPDBID not between", value1, value2, "groupdbid");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GROUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GROUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GROUPNAME =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GROUPNAME <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GROUPNAME >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPNAME >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GROUPNAME <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GROUPNAME <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GROUPNAME like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GROUPNAME not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GROUPNAME in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GROUPNAME not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GROUPNAME between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GROUPNAME not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupaliasIsNull() {
            addCriterion("GROUPALIAS is null");
            return (Criteria) this;
        }

        public Criteria andGroupaliasIsNotNull() {
            addCriterion("GROUPALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andGroupaliasEqualTo(String value) {
            addCriterion("GROUPALIAS =", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasNotEqualTo(String value) {
            addCriterion("GROUPALIAS <>", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasGreaterThan(String value) {
            addCriterion("GROUPALIAS >", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPALIAS >=", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasLessThan(String value) {
            addCriterion("GROUPALIAS <", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasLessThanOrEqualTo(String value) {
            addCriterion("GROUPALIAS <=", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasLike(String value) {
            addCriterion("GROUPALIAS like", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasNotLike(String value) {
            addCriterion("GROUPALIAS not like", value, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasIn(List<String> values) {
            addCriterion("GROUPALIAS in", values, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasNotIn(List<String> values) {
            addCriterion("GROUPALIAS not in", values, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasBetween(String value1, String value2) {
            addCriterion("GROUPALIAS between", value1, value2, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGroupaliasNotBetween(String value1, String value2) {
            addCriterion("GROUPALIAS not between", value1, value2, "groupalias");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeIsNull() {
            addCriterion("LASTCHANGETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeIsNotNull() {
            addCriterion("LASTCHANGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeEqualTo(Date value) {
            addCriterion("LASTCHANGETIME =", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeNotEqualTo(Date value) {
            addCriterion("LASTCHANGETIME <>", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeGreaterThan(Date value) {
            addCriterion("LASTCHANGETIME >", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTCHANGETIME >=", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeLessThan(Date value) {
            addCriterion("LASTCHANGETIME <", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTCHANGETIME <=", value, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeIn(List<Date> values) {
            addCriterion("LASTCHANGETIME in", values, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeNotIn(List<Date> values) {
            addCriterion("LASTCHANGETIME not in", values, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeBetween(Date value1, Date value2) {
            addCriterion("LASTCHANGETIME between", value1, value2, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andLastchangetimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTCHANGETIME not between", value1, value2, "lastchangetime");
            return (Criteria) this;
        }

        public Criteria andReserver1IsNull() {
            addCriterion("RESERVER1 is null");
            return (Criteria) this;
        }

        public Criteria andReserver1IsNotNull() {
            addCriterion("RESERVER1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserver1EqualTo(String value) {
            addCriterion("RESERVER1 =", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1NotEqualTo(String value) {
            addCriterion("RESERVER1 <>", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1GreaterThan(String value) {
            addCriterion("RESERVER1 >", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVER1 >=", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1LessThan(String value) {
            addCriterion("RESERVER1 <", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1LessThanOrEqualTo(String value) {
            addCriterion("RESERVER1 <=", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1Like(String value) {
            addCriterion("RESERVER1 like", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1NotLike(String value) {
            addCriterion("RESERVER1 not like", value, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1In(List<String> values) {
            addCriterion("RESERVER1 in", values, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1NotIn(List<String> values) {
            addCriterion("RESERVER1 not in", values, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1Between(String value1, String value2) {
            addCriterion("RESERVER1 between", value1, value2, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver1NotBetween(String value1, String value2) {
            addCriterion("RESERVER1 not between", value1, value2, "reserver1");
            return (Criteria) this;
        }

        public Criteria andReserver2IsNull() {
            addCriterion("RESERVER2 is null");
            return (Criteria) this;
        }

        public Criteria andReserver2IsNotNull() {
            addCriterion("RESERVER2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserver2EqualTo(String value) {
            addCriterion("RESERVER2 =", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2NotEqualTo(String value) {
            addCriterion("RESERVER2 <>", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2GreaterThan(String value) {
            addCriterion("RESERVER2 >", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVER2 >=", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2LessThan(String value) {
            addCriterion("RESERVER2 <", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2LessThanOrEqualTo(String value) {
            addCriterion("RESERVER2 <=", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2Like(String value) {
            addCriterion("RESERVER2 like", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2NotLike(String value) {
            addCriterion("RESERVER2 not like", value, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2In(List<String> values) {
            addCriterion("RESERVER2 in", values, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2NotIn(List<String> values) {
            addCriterion("RESERVER2 not in", values, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2Between(String value1, String value2) {
            addCriterion("RESERVER2 between", value1, value2, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver2NotBetween(String value1, String value2) {
            addCriterion("RESERVER2 not between", value1, value2, "reserver2");
            return (Criteria) this;
        }

        public Criteria andReserver3IsNull() {
            addCriterion("RESERVER3 is null");
            return (Criteria) this;
        }

        public Criteria andReserver3IsNotNull() {
            addCriterion("RESERVER3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserver3EqualTo(String value) {
            addCriterion("RESERVER3 =", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotEqualTo(String value) {
            addCriterion("RESERVER3 <>", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3GreaterThan(String value) {
            addCriterion("RESERVER3 >", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVER3 >=", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3LessThan(String value) {
            addCriterion("RESERVER3 <", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3LessThanOrEqualTo(String value) {
            addCriterion("RESERVER3 <=", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3Like(String value) {
            addCriterion("RESERVER3 like", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotLike(String value) {
            addCriterion("RESERVER3 not like", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3In(List<String> values) {
            addCriterion("RESERVER3 in", values, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotIn(List<String> values) {
            addCriterion("RESERVER3 not in", values, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3Between(String value1, String value2) {
            addCriterion("RESERVER3 between", value1, value2, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotBetween(String value1, String value2) {
            addCriterion("RESERVER3 not between", value1, value2, "reserver3");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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
     * This class corresponds to the database table ONLINEQC.Y_RGGENERALGROUPTAB
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