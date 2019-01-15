package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QcQualitypersontabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public QcQualitypersontabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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
     * This class corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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

        public Criteria andQualitypersonidIsNull() {
            addCriterion("QUALITYPERSONID is null");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidIsNotNull() {
            addCriterion("QUALITYPERSONID is not null");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidEqualTo(String value) {
            addCriterion("QUALITYPERSONID =", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidNotEqualTo(String value) {
            addCriterion("QUALITYPERSONID <>", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidGreaterThan(String value) {
            addCriterion("QUALITYPERSONID >", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITYPERSONID >=", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidLessThan(String value) {
            addCriterion("QUALITYPERSONID <", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidLessThanOrEqualTo(String value) {
            addCriterion("QUALITYPERSONID <=", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidLike(String value) {
            addCriterion("QUALITYPERSONID like", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidNotLike(String value) {
            addCriterion("QUALITYPERSONID not like", value, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidIn(List<String> values) {
            addCriterion("QUALITYPERSONID in", values, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidNotIn(List<String> values) {
            addCriterion("QUALITYPERSONID not in", values, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidBetween(String value1, String value2) {
            addCriterion("QUALITYPERSONID between", value1, value2, "qualitypersonid");
            return (Criteria) this;
        }

        public Criteria andQualitypersonidNotBetween(String value1, String value2) {
            addCriterion("QUALITYPERSONID not between", value1, value2, "qualitypersonid");
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

        public Criteria andQualitypersonnameIsNull() {
            addCriterion("QUALITYPERSONNAME is null");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameIsNotNull() {
            addCriterion("QUALITYPERSONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameEqualTo(String value) {
            addCriterion("QUALITYPERSONNAME =", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameNotEqualTo(String value) {
            addCriterion("QUALITYPERSONNAME <>", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameGreaterThan(String value) {
            addCriterion("QUALITYPERSONNAME >", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITYPERSONNAME >=", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameLessThan(String value) {
            addCriterion("QUALITYPERSONNAME <", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameLessThanOrEqualTo(String value) {
            addCriterion("QUALITYPERSONNAME <=", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameLike(String value) {
            addCriterion("QUALITYPERSONNAME like", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameNotLike(String value) {
            addCriterion("QUALITYPERSONNAME not like", value, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameIn(List<String> values) {
            addCriterion("QUALITYPERSONNAME in", values, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameNotIn(List<String> values) {
            addCriterion("QUALITYPERSONNAME not in", values, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameBetween(String value1, String value2) {
            addCriterion("QUALITYPERSONNAME between", value1, value2, "qualitypersonname");
            return (Criteria) this;
        }

        public Criteria andQualitypersonnameNotBetween(String value1, String value2) {
            addCriterion("QUALITYPERSONNAME not between", value1, value2, "qualitypersonname");
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

        public Criteria andTeamnameIsNull() {
            addCriterion("TEAMNAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("TEAMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("TEAMNAME =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("TEAMNAME <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("TEAMNAME >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAMNAME >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("TEAMNAME <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("TEAMNAME <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("TEAMNAME like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("TEAMNAME not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("TEAMNAME in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("TEAMNAME not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("TEAMNAME between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("TEAMNAME not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNull() {
            addCriterion("AGENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("AGENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("AGENTNAME =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("AGENTNAME <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("AGENTNAME >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTNAME >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("AGENTNAME <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("AGENTNAME <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("AGENTNAME like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("AGENTNAME not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("AGENTNAME in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("AGENTNAME not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("AGENTNAME between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("AGENTNAME not between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameIsNull() {
            addCriterion("MGRNICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameIsNotNull() {
            addCriterion("MGRNICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameEqualTo(String value) {
            addCriterion("MGRNICKNAME =", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameNotEqualTo(String value) {
            addCriterion("MGRNICKNAME <>", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameGreaterThan(String value) {
            addCriterion("MGRNICKNAME >", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("MGRNICKNAME >=", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameLessThan(String value) {
            addCriterion("MGRNICKNAME <", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameLessThanOrEqualTo(String value) {
            addCriterion("MGRNICKNAME <=", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameLike(String value) {
            addCriterion("MGRNICKNAME like", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameNotLike(String value) {
            addCriterion("MGRNICKNAME not like", value, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameIn(List<String> values) {
            addCriterion("MGRNICKNAME in", values, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameNotIn(List<String> values) {
            addCriterion("MGRNICKNAME not in", values, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameBetween(String value1, String value2) {
            addCriterion("MGRNICKNAME between", value1, value2, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andMgrnicknameNotBetween(String value1, String value2) {
            addCriterion("MGRNICKNAME not between", value1, value2, "mgrnickname");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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
     * This class corresponds to the database table ONLINEQC.QC_QUALITYPERSONTAB
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